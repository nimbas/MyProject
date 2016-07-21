package com.acube.pvs.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.service.CommandService;
import com.acube.security.service.SecurityService;

@Controller
@RequestMapping
public class CommandController {

	private final static Logger logger = LoggerFactory.getLogger(CommandController.class);

	@Autowired
	CommandService commandService;
	@Autowired
	LogicalDateService dateService;
	@Autowired
	SecurityService securityService;

	/**
	 * command list 화면
	 * 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/commands" }, method = { RequestMethod.GET })
	public String moveToCommandList(Model model) {
		return "pvs/command/list";
	}

	/**
	 * command list 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/command/search" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsProvCmd> searchCommands(SearchFilter searchFilter) {
		if(searchFilter.getRows() >0){
			return commandService.getProvCommands(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}else{
			return commandService.getProvCommands(searchFilter);
		}
	}

	/**
	 * command 조회/수정/등록화면
	 * 
	 * @param provCmd
	 * @return
	 */
	@RequestMapping(value = { "/command/{cmd}" }, method = { RequestMethod.GET })
	public String commandForm(PsProvCmd provCmd) {
		return "pvs/command/form";
	}

	/**
	 * command정보 등록
	 * 
	 * @param provCmd
	 * @return
	 */
	@RequestMapping(value = { "/command/{cmd}" }, method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addCommand(@RequestBody PsProvCmd provCmd) {
		provCmd.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addCommand");
		commandService.addProvCommand(provCmd);
		return new Result(ResultCode.SUCCESS);
	}

	/**
	 * command정보 수정
	 * 
	 * @param provCmd
	 * @return
	 */
	@RequestMapping(value = { "/command/{cmd}" }, method = { RequestMethod.PUT }, consumes = { "application/json" })
	@ResponseBody
	public Result updateCommand(@RequestBody PsProvCmd provCmd) {
		provCmd.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateCommand");
		commandService.updateProvCommand(provCmd);
		return new Result(ResultCode.SUCCESS);
	}

	/**
	 * command정보 삭제
	 * 
	 * @param provCmd
	 * @return
	 */
	@RequestMapping(value = { "/command/{cmd}" }, method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteCommand(@RequestBody PsProvCmd provCmd) {
		provCmd.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteCommand");
		commandService.deleteProvCommand(provCmd);
		return new Result(ResultCode.SUCCESS);
	}
}