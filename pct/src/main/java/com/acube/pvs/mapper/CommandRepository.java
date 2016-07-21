package com.acube.pvs.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsProvCmd;


public interface CommandRepository {
		
	//전체 Command 조회
	List<PsProvCmd> getProvCommands(SearchFilter searchFilter, Pagination pagination);
	List<PsProvCmd> getProvCommands(SearchFilter searchFilter);
	
	//Command 상세 조회
	PsProvCmd getProvCommand(PsProvCmd provCmd);
	
	//Command 등록
	int addProvCommand(PsProvCmd provCmd);
	
	//Command 수정
	int updateProvCommand(PsProvCmd provCmd);
	
	//Command 삭제
	int deleteProvCommand(PsProvCmd provCmd);
	
}
