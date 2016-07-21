package com.acube.pvs.service.op;

import org.json.simple.JSONArray;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.PsNeMessage;

public interface ProvReqService {
  
	/**
	 * 목록 조회
	 * @param searchFilter
	 * @param pagination
	 * @return
	 */
	public JQueryGrid<PsCsMessage> searchListAsLimit(SearchFilter searchFilter, Pagination pagination);
	
	/**
	 * 서브목록조회
	 * @param pvReqSeqNo
	 * @return
	 */
	public JQueryGrid<PsNeMessage> getSubNeReqList(String pvReqSeqNo);
	
	public int updateNeMessage(PsNeMessage psNeMessage);
	
	public JSONArray reprocessReqToPvServerUsingHTTP(PsNeMessage psNeMessage);
	
	/*
	public String makeReprocessParam(String pvReqSeqNo, String csOrNe); */
}
