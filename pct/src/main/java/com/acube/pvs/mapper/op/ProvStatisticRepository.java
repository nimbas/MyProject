package com.acube.pvs.mapper.op;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.common.domain.code.LookupCode;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.statistics.ProvNeStatistic;
import com.acube.pvs.domain.statistics.ProvStatistic;

public interface ProvStatisticRepository {

	// Grid-List Data
	public List<ProvStatistic> getCsMsgStatistic(SearchFilter searchFilter);

	public List<ProvNeStatistic> getNeMsgStatistic(SearchFilter searchFilter);

	public List<ProvStatistic> getCsMsgDataForChart(SearchFilter searchFilter);

	public List<ProvStatistic> getNeMsgDataForChart(SearchFilter searchFilter);

	public List<ProvStatistic> getCurrentCsStatistic(@Param(value = "curDate") Date curDate);

	public List<ProvStatistic> getCurrentMsgDataForChart(@Param(value = "curDate") Date curDate);

	public List<PsCsMessage> getCurrentErrorMessage(@Param(value = "curDate") Date curDate, @Param(value = "eventCd") String eventCd);

	public List<LookupCode> getNeCodeList();

}
