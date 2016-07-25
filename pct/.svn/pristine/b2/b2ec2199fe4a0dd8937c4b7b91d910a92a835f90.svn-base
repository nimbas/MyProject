package com.acube.pvs.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsProvMap;


public interface MapRepository {
		
	//전체 Provision Map 정의 조회
	List<PsProvMap> getProvMapDefs(SearchFilter searchFilter, Pagination pagination);
	
	//Provision Map 정의 등록
	int addProvMapDef(PsProvMap provMap);
		
	//Provision Map 정의 삭제
	int deleteProvMapDef(PsProvMap provMap);
	
	//전체 Provision Map 조회
	List<PsProvMap> getProvTrgtMaps(SearchFilter searchFilter);
	
	//Exception Flow list
	List<PsProvMap> getExceptionFlow(SearchFilter searchFilter);
	
	//Provision Map 등록
	int addProvTrgtMap(PsProvMap provMap);
	
	//Provision Map 수정
	int updateProvTrgtMap(PsProvMap provMap);
		
	//Provision Map 삭제
	int deleteProvTrgtMap(PsProvMap provMap);
	
	int deleteProvTrgtMapBySource(PsProvMap provMap);
	
	//param map list 조회
	List<PsParamMap>getProvParameterMaps(SearchFilter searchFilter, Pagination pagination);
	List<PsParamMap>getProvParameterMapsBySource(SearchFilter searchFilter, Pagination pagination);
	
	//param map 등록
	int addParamMap(PsParamMap paramMap);
	
	//param map 수정
	int updateParamMap(PsParamMap paramMap);
	
	//param map 삭제
	int deleteParamMap(PsParamMap paramMap);
	
	//target command별 param map 삭제
	int deleteParamMapByTrgt(PsParamMap paramMap);
	
	//source command별 param map 삭제
	int deleteParamMapBySource(PsParamMap paramMap);
}
