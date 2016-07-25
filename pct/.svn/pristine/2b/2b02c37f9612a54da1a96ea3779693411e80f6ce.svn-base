package com.acube.pvs.service.op;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.common.domain.code.LookupCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.statistics.ProvNeStatistic;
import com.acube.pvs.domain.statistics.ProvStatistic;
import com.acube.pvs.mapper.op.ProvStatisticRepository;

@Service
public class ProvStatisticServiceImpl implements ProvStatisticService {

	private final static Logger logger = LoggerFactory.getLogger(ProvStatisticServiceImpl.class);

	@Autowired
	private ProvStatisticRepository provStatisticRepository;

	@Override
	public List<ProvStatistic> getCsStatistic(SearchFilter searchFilter) {
		return provStatisticRepository.getCsMsgStatistic(searchFilter);
	}

	@Override
	public List<ProvNeStatistic> getNeStatistic(SearchFilter searchFilter) {
		return provStatisticRepository.getNeMsgStatistic(searchFilter);
	}

	@Override
	public List<ProvStatistic> getCsMsgDataForChart(SearchFilter searchFilter) {
		List<ProvStatistic> retList = new ArrayList<ProvStatistic>(); 
		List<ProvStatistic> list = provStatisticRepository.getCsMsgDataForChart(searchFilter);
		
		String condition = (String)searchFilter.getFilterMap().get("condition");
		if(!"3".equals(condition)){
			for(int i=0; i < 24; i++){
				ProvStatistic tmpChartData = existData(list, i); 
				if(tmpChartData != null){
					retList.add(tmpChartData);
				}else{
					retList.add(new ProvStatistic(StringUtils.leftPad(String.valueOf(i),2,"0"), 0,0,0,0));		
				}
			}
		}else{
			for(int i=0; i < 60; i=i+5){
				ProvStatistic tmpChartData = existData(list, i); 
				if(tmpChartData != null){
					retList.add(tmpChartData);
				}else{
					retList.add(new ProvStatistic(StringUtils.leftPad(String.valueOf(i),2,"0"), 0,0,0,0));		
				}
			}
		}
		return retList;
	}
	
	private ProvStatistic existData(List<ProvStatistic> list, int idx){
		for(ProvStatistic provStatistic : list){
			
			if(provStatistic.getReqDate().equals(StringUtils.leftPad(String.valueOf(idx), 2,"0"))){
				return provStatistic;
			}					
		}
		return null ;
	}
	@Override
	public List<ProvStatistic> getNeMsgDataForChart(SearchFilter searchFilter) {
		List<ProvStatistic> retList = new ArrayList<ProvStatistic>(); 
		List<ProvStatistic> list = provStatisticRepository.getNeMsgDataForChart(searchFilter);
		String condition = (String)searchFilter.getFilterMap().get("condition");
		
		if(!"3".equals(condition)){
			for(int i=0; i < 24; i++){
				ProvStatistic tmpChartData = existData(list, i); 
				if(tmpChartData != null){
					retList.add(tmpChartData);
				}else{
					retList.add(new ProvStatistic(StringUtils.leftPad(String.valueOf(i),2,"0"), 0,0,0,0));		
				}
			}
		}else{
			for(int i=0; i < 60; i=i+5){
				ProvStatistic tmpChartData = existData(list, i); 
				if(tmpChartData != null){
					retList.add(tmpChartData);
				}else{
					retList.add(new ProvStatistic(StringUtils.leftPad(String.valueOf(i),2,"0"), 0,0,0,0));		
				}
			}
		}
		return retList;
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public List<LookupCode> getNeCodeList() {
		return provStatisticRepository.getNeCodeList();
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<ProvStatistic> getCurrentCsStatistic(Date curDate) {
		return provStatisticRepository.getCurrentCsStatistic(curDate);
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<ProvStatistic> getCurrentMsgDataForChart(Date curDate) {
		return provStatisticRepository.getCurrentMsgDataForChart(curDate);
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsCsMessage> getCurrentErrorMessage(Date curDate, String eventCd) {
		
		return new JQueryGrid<PsCsMessage>(provStatisticRepository.getCurrentErrorMessage(curDate, eventCd));
	}

}
