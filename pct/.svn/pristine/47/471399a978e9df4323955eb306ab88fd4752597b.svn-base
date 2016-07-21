package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsProvMap;

public interface MapService {

	//전체 Provision Map 정의 조회
	JQueryGrid<PsProvMap> getProvMapDefs(SearchFilter searchFilter, Pagination pagination);
	
	void processProvMapDef(PsProvMap provMap);
	
	//Provision Map 정의 등록
	int addProvMapDef(PsProvMap provMap);
		
	//Provision Map 정의 삭제
	int deleteProvMapDef(PsProvMap provMap);
	
	//전체 Provision Map Target 조회
	JQueryGrid<PsProvMap> getProvTrgtMaps(SearchFilter searchFilter);
	
	//Provision Map Target 등록
	int processProvTrgtMap(PsProvMap provMap);
		
	int addProvTrgtMap(PsProvMap provMap); 
	
	//target param list 조회
	JQueryGrid<PsParamMap>getProvTargetParameterMaps(SearchFilter searchFilter, Pagination pagination);
	
	//source param list 조회
	JQueryGrid<PsParamMap>getProvSourceParameterMaps(SearchFilter searchFilter, Pagination pagination);
	
	//param map 등록
	int processParamMap(PsProvMap provMap);
	
	int addParamMap(PsParamMap paramMap);
	
	//Exception Flow list
	JQueryGrid<PsProvMap> getExceptionFlow(SearchFilter searchFilter);

	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processMapParameterForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);

	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processSourceCmdForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);

	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processTargetCmdForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);
}
