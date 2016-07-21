package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsProvCmd;

public interface CommandService {

	// 전체 Command 조회
	JQueryGrid<PsProvCmd> getProvCommands(SearchFilter searchFilter, Pagination pagination);
	JQueryGrid<PsProvCmd> getProvCommands(SearchFilter searchFilter);

	// Command 상세 조회
	PsProvCmd getProvCommand(PsProvCmd provCmd);

	// Command 등록
	int addProvCommand(PsProvCmd provCmd);

	// Command 수정
	int updateProvCommand(PsProvCmd provCmd);

	// Command 삭제
	int deleteProvCommand(PsProvCmd provCmd);
	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processCommandForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);
	
}
