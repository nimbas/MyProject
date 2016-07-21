package com.acube.pvs.web.op;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.statistics.ProvNeStatistic;
import com.acube.pvs.domain.statistics.ProvStatistic;
import com.acube.pvs.service.op.ProvStatisticService;

@Controller
public class ProvStatisticController {

	@Autowired
	ProvStatisticService provStatisticService;
	@Autowired
	LogicalDateService dateService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//날짜 데이타가 값이 입력이 안되는 경우 '' 를 Date 변환시 에러가 나는 문제 처리.
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	/**
	 * 통계 조회 페이지
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/op/statistic" }, method = { RequestMethod.GET })
	public String linkprovStatistic(Model model) {

		Date curDate = dateService.getCurrentDate();
		model.addAttribute("neCodeList", provStatisticService.getNeCodeList());
		model.addAttribute("curDate", curDate);
		model.addAttribute("prevDate", DateUtils.addMonths(curDate, -3));
		return "pvs/op/provStatistics";
	}

	@RequestMapping(value = { "/op/statistic/cs" }, method = { RequestMethod.POST })
	@ResponseBody
	public List<ProvStatistic> getprovStatList(SearchFilter searchFilter) {
		return provStatisticService.getCsStatistic(searchFilter);
	}

	@RequestMapping(value = { "/op/statistic/ne" }, method = { RequestMethod.POST })
	@ResponseBody
	public List<ProvNeStatistic> getprovNeStatList(SearchFilter searchFilter) {
		return provStatisticService.getNeStatistic(searchFilter);
	}

	@RequestMapping(value = { "/op/statistic/cs/chart" }, method = { RequestMethod.POST })
	@ResponseBody
	public List<ProvStatistic> getCsChart(SearchFilter searchFilter) {
		return provStatisticService.getCsMsgDataForChart(searchFilter);
	}

	@RequestMapping(value = { "/op/statistic/ne/chart" }, method = { RequestMethod.POST })
	@ResponseBody
	public List<ProvStatistic> getNeChart(SearchFilter searchFilter) {
		return provStatisticService.getNeMsgDataForChart(searchFilter);
	}

	@RequestMapping(value = { "/op/statistic/current" }, method = { RequestMethod.GET })
	public String openCurrentStatus(Model model) {
		String curDate = dateService.getCurrentDateFormat();
		model.addAttribute("curDate", curDate);
		return "pvs/op/provCurrentStatistics";
	}
	
	@RequestMapping(value = { "/op/statistic/current" }, method = { RequestMethod.POST })
	@ResponseBody public List<ProvStatistic> currentStatistics(@RequestParam(required=false) Date curDate) {
		if(curDate == null){
			curDate = dateService.getCurrentDate();
		}
		return provStatisticService.getCurrentCsStatistic(curDate);
	}

	@RequestMapping(value = { "/op/statistic/current/chart" }, method = { RequestMethod.POST })
	@ResponseBody public List<ProvStatistic> currentStatisticsChart(@RequestParam(required=false) Date curDate) {
		if(curDate == null){
			curDate = dateService.getCurrentDate();
		}
		return provStatisticService.getCurrentMsgDataForChart(curDate);
	}

	@RequestMapping(value = { "/op/statistic/current/message" }, method = { RequestMethod.POST })
	@ResponseBody public JQueryGrid<PsCsMessage> getCsMsgCurrentError(@RequestParam(required=false) Date curDate, String eventCd) {
		if(StringUtils.isNotEmpty(eventCd)){
			if(curDate == null){
				curDate = dateService.getCurrentDate();
			}
			return provStatisticService.getCurrentErrorMessage(curDate, eventCd);
		}else{
			return new JQueryGrid<PsCsMessage>();
		}
	}

}