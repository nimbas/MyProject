package com.acube.pvs.web.op;
 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsCsMessage;
import com.acube.pvs.domain.PsNeMessage;
import com.acube.pvs.service.op.ProvReqService;
import com.acube.security.service.SecurityService;
 
@Controller
@RequestMapping
public class ProvReqController {
	
	private final static Logger logger = LoggerFactory.getLogger(ProvReqController.class);
	
	@Autowired ProvReqService 	provReqService;
	@Autowired LogicalDateService 	dateService;
	@Autowired SecurityService 	securityService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//날짜 데이타가 값이 입력이 안되는 경우 '' 를 Date 변환시 에러가 나는 문제 처리.
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	/**
	 * list 화면 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/op/provReq/list"}, method={RequestMethod.GET})
	public String moveToProvReq(Model model, SearchFilter searchFilter){
	   		
		Date curDate = dateService.getCurrentDate();
		model.addAttribute("curDate", curDate);
		model.addAttribute("prevDate", DateUtils.addMonths(curDate, -3) );

		return "pvs/op/provReqList";
	}

	/**
	 * list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/op/provReq/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<PsCsMessage> makeListAndPagination( SearchFilter searchFilter) {
		return provReqService.searchListAsLimit(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}

	/**
	 * 서브 lsit 조회
	 * @param pvReqSeqNo
	 * @return
	 */
	@RequestMapping(value={"/op/provReq/subList"}, method={RequestMethod.GET})
	@ResponseBody public JQueryGrid<PsNeMessage>  getProvSubList(String pvReqSeqNo){
		if(!"0".equals(pvReqSeqNo)){
			return provReqService.getSubNeReqList(pvReqSeqNo);
		}
		return new JQueryGrid<PsNeMessage>();
	}
	
	
	@RequestMapping(value={"/op/provReq/modification"}, method={RequestMethod.GET})
	public String provModificationForm(PsNeMessage message){
		return "pvs/op/provModification";
	}
	@RequestMapping(value={"/op/provReq/modification"}, method={RequestMethod.POST})
	@ResponseBody public Result provModification(PsNeMessage message){
		message.setOperatorId(securityService.getCurrentUser().getUserId());
		message.setApplicationId("provModification");
		provReqService.updateNeMessage(message);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value={"/op/provReq/neReprocessing"}, method={RequestMethod.POST})
	@ResponseBody public Result provNeReprocessing(PsNeMessage message){
		message.setOperatorId(securityService.getCurrentUser().getUserId());
		message.setApplicationId("provModification");
		provReqService.reprocessReqToPvServerUsingHTTP(message);
		return new Result(ResultCode.SUCCESS);
	}
 }