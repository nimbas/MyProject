package com.acube.pvs.mapper.op;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.PsNeMessage;


public interface ProvReqRepository {
	
	public List<PsCsMessage> provReqSearchListAsLimit(SearchFilter searchFilter, Pagination pagination);
	public List<PsNeMessage> getSubNeReqList(@Param("pvReqSeqNo") String pvReqSeqNo);
	public int updateNeMessage(PsNeMessage psNeMessage);
	public List<PsNeMessage> getNeSeqnoForReprocess(PsNeMessage psNeMessage);
/*	public List<ProvNeReq> getNeReqMsg(String pv_req_seq_no);
	
*/
}
