package com.acube.pvs.web;
 
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.domain.PsProvEnum;
import com.acube.pvs.domain.PsProvParamInfo;
import com.acube.pvs.domain.PsProvParamSeq;
import com.acube.pvs.service.ParameterService;
import com.acube.security.service.SecurityService;
 
@Controller
@RequestMapping
public class ParameterController {
	
	private final static Logger logger = LoggerFactory.getLogger(ParameterController.class);
	
	@Autowired ParameterService 	parameterService;
	@Autowired LogicalDateService 	dateService;
	@Autowired SecurityService 	securityService;
	
	
	/**
	 * parameter list 화면 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/params"}, method={RequestMethod.GET})
	public String moveToParamInfoList(Model model){
		return "pvs/param/list";
	}

	/**
	 * parameter list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/param/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<PsProvParamInfo> searchParameter(@RequestParam(required=false) String neId, SearchFilter searchFilter) {
		if(StringUtils.isEmpty(neId) || !"x".equals(neId)){
			return parameterService.getProvParamInfos(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));			
		}
		return new JQueryGrid<PsProvParamInfo>();
	}
	
	/**
	 * parameter 정보 등록
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/param/{pvParamId}"}, method={RequestMethod.POST}, consumes={"application/json"})
	@ResponseBody public Result addParamInfo(@RequestBody PsProvParamInfo provParamInfo){
		provParamInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addParamInfo");
		parameterService.addProvParamInfo(provParamInfo);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * parameter 정보 수정
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/param/{pvParamId}"}, method={RequestMethod.PUT}, consumes={"application/json"})
	@ResponseBody public Result updateParamInfo(@RequestBody PsProvParamInfo provParamInfo){
		provParamInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateParamInfo");
		parameterService.updateProvParamInfo(provParamInfo);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * parameter 정보 삭제
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/param/{pvParamId}"}, method={RequestMethod.DELETE}, consumes={"application/json"})
	@ResponseBody public Result deleteParamInfo(@RequestBody PsProvParamInfo provParamInfo){
		provParamInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteParamInfo");
		parameterService.deleteProvParamInfo(provParamInfo);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * parameter enum list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/param/enum/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<PsProvEnum> searchParamEnum(PsProvEnum provEnum) {
		return parameterService.getProvParamEnums(provEnum);
	}
	

	/**
	 * command input/output parameter 정보 등록
	 * @param provCmd
	 * @return
	 */
	@RequestMapping(value={"/paramseq/{cmd}"}, method={RequestMethod.POST}, consumes={"application/json"})
	@ResponseBody public Result processCommandParam(@RequestBody PsProvCmd provCmd){
		provCmd.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "processCommandParam");
		parameterService.processProvCommandParameter(provCmd);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * parameter seq list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/paramseq/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<PsProvParamSeq> searchParameterSeq(@RequestParam String cmd, SearchFilter searchFilter) {
		if(StringUtils.isNotEmpty(cmd) && !"0".equals(cmd)){
			return parameterService.getProvParamSeqs(searchFilter);			
		}
		return new JQueryGrid<PsProvParamSeq>();
	}
 }