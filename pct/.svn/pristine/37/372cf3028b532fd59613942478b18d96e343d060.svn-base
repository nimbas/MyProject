package com.acube.pvs.service.op;

import java.util.Date;
import java.util.List;

import com.acube.common.domain.code.LookupCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.statistics.ProvNeStatistic;
import com.acube.pvs.domain.statistics.ProvStatistic;

public interface ProvStatisticService {

	public List<ProvStatistic> getCsStatistic(SearchFilter searchFilter);

	public List<ProvNeStatistic> getNeStatistic(SearchFilter searchFilter);

	public List<ProvStatistic> getCsMsgDataForChart(SearchFilter searchFilter);

	public List<ProvStatistic> getNeMsgDataForChart(SearchFilter searchFilter);

	public List<LookupCode> getNeCodeList();

	public List<ProvStatistic> getCurrentCsStatistic(Date curDate);

	public List<ProvStatistic> getCurrentMsgDataForChart(Date curDate);

	public JQueryGrid<PsCsMessage> getCurrentErrorMessage(Date curDate, String eventCd);
}