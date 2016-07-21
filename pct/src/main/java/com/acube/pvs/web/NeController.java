package com.acube.pvs.web;
 
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.service.NeService;
import com.acube.security.service.SecurityService;
 
@Controller
@RequestMapping
public class NeController {
	
	private final static Logger logger = LoggerFactory.getLogger(NeController.class);
	
	@Autowired NeService 	neService;
	@Autowired LogicalDateService 	dateService;
	@Autowired SecurityService 	securityService;
	
	
	/**
	 * ne list 화면 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/neInfos{mode}"}, method={RequestMethod.GET})
	public String moveToNeInfoList(@PathVariable String mode, Model model){
		if(StringUtils.isNotEmpty(mode)){
			mode = mode.replace("/", "");
		}
		return "pvs/ne/list" + mode;
	}

	/**
	 * ne list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/neInfo/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<PsProvNeInfo> searchNeInfo(SearchFilter searchFilter) {
		if(searchFilter.getRows() > 0){
			return neService.getProvNeInfos(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}else{
			return neService.getProvNeInfos(searchFilter);
		}
	}

	/**
	 * ne 조회/수정/등록화면
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/neInfo/{ftrCd}"}, method={RequestMethod.GET})
	public String neInfoForm(PsProvNeInfo provNeInfo){
		return "pvs/ne/form";
	}
	
	/**
	 * ne정보 등록
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/neInfo/{neId}"}, method={RequestMethod.POST}, consumes={"application/json"})
	@ResponseBody public Result addNeInfo(@RequestBody PsProvNeInfo provNeInfo){
		provNeInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addNeInfo");
		neService.addProvNeInfo(provNeInfo);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * ne 정보 수정
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/neInfo/{neId}"}, method={RequestMethod.PUT}, consumes={"application/json"})
	@ResponseBody public Result updateNeInfo(@RequestBody PsProvNeInfo provNeInfo){
		provNeInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateNeInfo");
		neService.updateProveNeInfo(provNeInfo);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * ne 정보 삭제
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value={"/neInfo/{neId}"}, method={RequestMethod.DELETE}, consumes={"application/json"})
	@ResponseBody public Result deleteNeInfo(@RequestBody PsProvNeInfo provNeInfo){
		provNeInfo.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteNeInfo");
		neService.deleteProveNeInfo(provNeInfo);
		return new Result(ResultCode.SUCCESS);
	}
 }