package com.acube.pvs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.domain.PvsCode;
import com.acube.pvs.domain.reference.ParamInfo;

public interface CodeListDao {

	public List<PvsCode> getCodeByGrpName(@Param("codeGrpStr") String codeGrpStr);

	public List<PvsCode> getNeListBox();

	// public List<PvsCode> getAllNeListBox();

	public List<PvsCode> getSvcDomain();

	public List<PvsCode> getProdListBox();

	public List<PvsCode> getCsParamId();

	public List<PvsCode> getProvFtrCd(String paramString);

	public List<PvsCode> getReqEventCd();

	public List<PvsCode> getParamIdListBox();

	public List<PvsCode> getRelatedCode(ParamInfo paramParamInfo);

	public List<PvsCode> getParameterConfigurationSetList();

	// for provmap only
	public List<PvsCode> getProvMapEventCd();

	// for Alarm config...
	public List<PsUiAlarmConf> getAlarmConfGrid(SearchFilter search);

}
