package com.acube.pvs.service.op;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.common.util.WebServiceUtil;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.PsNeMessage;
import com.acube.pvs.mapper.op.ProvReqRepository;

@Service
@Transactional
public class ProvReqServiceImpl implements ProvReqService {

	@Autowired ProvReqRepository provReqRepository;
	@Value("#{pvsProp['vertualIp.reprocessUrl']}") String REPROCESS_URL;

	/**
	* {@inheritDoc}
	*/
	public JQueryGrid<PsCsMessage> searchListAsLimit(SearchFilter searchFilter, Pagination pagination){
		return new JQueryGrid<PsCsMessage>(pagination, provReqRepository.provReqSearchListAsLimit(searchFilter, pagination));
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsNeMessage> getSubNeReqList(String pvReqSeqNo) {
		return new JQueryGrid<PsNeMessage>(provReqRepository.getSubNeReqList(pvReqSeqNo));
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public int updateNeMessage(PsNeMessage psNeMessage) {
		return provReqRepository.updateNeMessage(psNeMessage);
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public JSONArray reprocessReqToPvServerUsingHTTP(PsNeMessage psNeMessage) {
		
		Map<String, Object> res = WebServiceUtil.postJson(REPROCESS_URL, makeReprocessParam(psNeMessage) );
		
		if(!res.get("status").equals(2) || StringUtils.isEmpty((String) res.get("response"))) {
			throw new AcubeException("Unexpected Error Occured. please see the log for more details.");
		}
		// {"reprocess": {"201404211745001234560000000071": [{ "seq_no": "2", "result_desc" : "SUCCESS", "result_system" : "PMS", "result_cd" : "0" }]}}
		// { "reprocess" : { "result_desc" : "NO OBJECT", "result_system" : "PMS", "result_cd" : "10501" } }
		
		//return (String) res.get("response");
		
		JSONObject resJson = (JSONObject)JSONValue.parse((String)res.get("response")); //JSONObject.fromObject(res.get("response"));//response text를 json 객체화..
		JSONObject resBody = (JSONObject) resJson.get("reprocess");
		
		if(resBody.containsKey("result_cd")) {
			throw new AcubeException("Error occured::[result_cd="+resBody.get("result_cd")+", result_desc="+resBody.get("result_desc")+"]");
		}
		
		//it will be return as [{ "seq_no": "2", "result_desc" : "SUCCESS", "result_system" : "PMS", "result_cd" : "0" }]
		return (JSONArray) resBody.get(psNeMessage.getPvReqSeqNo()); 
	}
	
	public String makeReprocessParam(PsNeMessage psNeMessage) {
		String pv_req_seq_no = psNeMessage.getPvReqSeqNo();
		String ne_seqno = String.valueOf(psNeMessage.getNeSeqno());
	
		if(StringUtils.isEmpty(pv_req_seq_no)) {
			throw new AcubeException("pvReqSeqno is mandatory.");
		}
		
		// 1) req_id 만 지정하는 경우
		//      {"reprocess": {"201404211745001234560000000071": []}}
		// 2) seq_no 하나만 지정할 경우
		//  	{"reprocess": {"201404211745001234560000000071": [{"seq_no": "2"}]}}
		// 3) seq_no 여러개를 한꺼번에 지정할 경우
		// 		{"reprocess": {"201404211745001234560000000071": [{"seq_no": "1"}, {"seq_no": "2"}, {"seq_no": "3"}]}}
		
		JSONObject reprocess        = new JSONObject();
		JSONObject reprocessBody    = new JSONObject();
				
		
		if(StringUtils.isNotEmpty(ne_seqno)) {
			
			List<PsNeMessage> neList = provReqRepository.getNeSeqnoForReprocess(psNeMessage);
		
			if(neList == null) {
				throw new AcubeException(pv_req_seq_no+" does not have NE Message an error status.");
			}
			
			List<Map<String, String>> seqNoList = new ArrayList<Map<String, String>>();
			
			for(PsNeMessage provNeReq : neList) {
				
				if(provNeReq.getStatusCd().equals("E")) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("seq_no", String.valueOf(provNeReq.getNeSeqno()));
					seqNoList.add(map);
				} else if(provNeReq.getStatusCd().equals("S")) {
					throw new AcubeException("Not allowed :: This request was already completed successfully.");
				} else {
					throw new AcubeException("Not allowed :: This request is waiting or processing.");
				}
			}
			
			reprocessBody.put(pv_req_seq_no, seqNoList);
		} else {
			reprocessBody.put(pv_req_seq_no, new ArrayList<Map<String, String>>());
		}
		reprocess.put("reprocess", reprocessBody);		
		return reprocess.toString();
	}
}
