package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.domain.PsProvEnum;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.domain.PsProvParamInfo;
import com.acube.pvs.domain.PsProvParamSeq;

public interface ParameterService {

	/**
	 * 전체 Parameter 조회
	 * 
	 * @param searchFilter
	 * @param pagination
	 * @return
	 */
	JQueryGrid<PsProvParamInfo> getProvParamInfos(SearchFilter searchFilter, Pagination pagination);

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
	 * Parameter Enum 목록 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	JQueryGrid<PsProvEnum> getProvParamEnums(PsProvEnum provEnum);

	/**
	 * 전체 Parameter Seq 조회
	 * 
	 * @param searchFilter
	 * @param pagination
	 * @return
	 */
	JQueryGrid<PsProvParamSeq> getProvParamSeqs(SearchFilter searchFilter);

	/**
	 * Parameter Seq 조회
	 * 
	 * @param provParamSeq
	 * @return
	 */
	PsProvParamSeq getProvParamSeq(PsProvParamSeq provParamSeq);

	/**
	 * Command의 input/output parameter 등록
	 * 
	 * @param provCmd
	 * @return
	 */
	int processProvCommandParameter(PsProvCmd provCmd);
	
	/**
	 * command paramter add
	 * @param provParamSeq
	 * @return
	 */
	int addProvParamSeq(PsProvParamSeq provParamSeq);

	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processCmdParamForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);

	/**
	 * @param list TODO
	 * @param excelFile
	 * @param workDate
	 * @param operatorId
	 * @param appId
	 */
	void processParameterForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId);

}
