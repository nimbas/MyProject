package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsProvNeInfo;


public interface NeService {
	
	//전체 NE정보 조회
	JQueryGrid<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter, Pagination pagination);
	JQueryGrid<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter);
	
	//NE Info 상세 조회
	PsProvNeInfo getProvNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 등록
	int addProvNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 수정
	int updateProveNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 삭제
	int deleteProveNeInfo(PsProvNeInfo provNeInfo);
	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processNeForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);
	
}
