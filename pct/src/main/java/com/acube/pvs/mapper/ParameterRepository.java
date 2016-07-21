package com.acube.pvs.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pc.domain.ProvEnum;
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.domain.PsProvEnum;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.domain.PsProvParamInfo;
import com.acube.pvs.domain.PsProvParamSeq;

public interface ParameterRepository {

	/**
	 * 전체 Parameter 조회
	 * 
	 * @param searchFilter
	 * @param pagination
	 * @return
	 */
	List<PsProvParamInfo> getProvParamInfos(SearchFilter searchFilter, Pagination pagination);

	/**
	 * Parameter Info 상세 조회
	 * 
	 * @param provNeInfo
	 * @return
	 */
	PsProvParamInfo getProvParamInfo(PsProvNeInfo provNeInfo);

	/**
	 * Parameter 등록
	 * 
	 * @param provParamInfo
	 * @return
	 */
	int addProvParamInfo(PsProvParamInfo provParamInfo);

	/**
	 * Parameter 수정
	 * 
	 * @param provParamInfo
	 * @return
	 */
	int updateProvParamInfo(PsProvParamInfo provParamInfo);

	/**
	 * Parameter 삭제
	 * 
	 * @param provParamInfo
	 * @return
	 */
	int deleteProvParamInfo(PsProvParamInfo provParamInfo);

	/**
	 * Parameter Enum 조회
	 * @param searchFilter
	 * @return
	 */
	List<PsProvEnum> getProvParamEnums(PsProvEnum provEnum);
	
	/**
	 * 관련 Enum 항목 등록
	 * 
	 * @param provParamInfo
	 * @return
	 */
	int addParamEnum(PsProvEnum provEnum);

	/**
	 * 관련 Enum 항목 수정
	 * 
	 * @param provParamInfo
	 * @return
	 */
	int updateParamEnum(PsProvEnum provEnum);
	
	/**
	 * 관련 Enum 항목 일괄삭제
	 * @param provParamSeq
	 * @return
	 */
	int deleteBatchEnum(PsProvParamInfo provParamInfo);
	
	/**
	 * 관련 Enum 항목 삭제
	 * @param provParamSeq
	 * @return
	 */
	int deleteParamEnum(PsProvEnum provEnum);
	
	/**
	 * 전체 Parameter Seq 조회
	 * 
	 * @param searchFilter
	 * @param pagination
	 * @return
	 */
	List<PsProvParamSeq> getProvParamSeqs(SearchFilter searchFilter);

	/**
	 * Parameter Seq 조회
	 * 
	 * @param provParamSeq
	 * @return
	 */
	PsProvParamSeq getProvParamSeq(PsProvParamSeq provParamSeq);

	/**
	 * Parameter Seq 등록
	 * 
	 * @param provParamSeq
	 * @return
	 */
	int addProvParamSeq(PsProvParamSeq provParamSeq);

	/**
	 * Parameter 수정
	 * 
	 * @param provParamSeq
	 * @return
	 */
	int updateProvParamSeq(PsProvParamSeq provParamSeq);

	/**
	 * Parameter 삭제
	 * 
	 * @param provParamSeq
	 * @return
	 */
	int deleteProvParamSeq(PsProvParamSeq provParamSeq);
	
	/**
	 * Command 관련 parameter 일괄 삭제
	 * @param provCmd
	 * @return
	 */
	int deleteBatchProvParamSeq(PsProvCmd provCmd);
	
	
}
