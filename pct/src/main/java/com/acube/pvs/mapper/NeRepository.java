package com.acube.pvs.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsProvNeInfo;


public interface NeRepository {
		
	//전체 NE정보 조회
	List<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter, Pagination pagination);
	List<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter);
	
	//NE Info 상세 조회
	PsProvNeInfo getProvNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 등록
	int addProvNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 수정
	int updateProveNeInfo(PsProvNeInfo provNeInfo);
	
	//NE 삭제
	int deleteProveNeInfo(PsProvNeInfo provNeInfo);
	
}
