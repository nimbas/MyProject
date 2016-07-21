package com.acube.sub.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.util.CmnDateUtils;
import com.acube.security.service.SecurityService;
import com.acube.sub.domain.MemoKind;
import com.acube.sub.domain.OperatorInfo;
import com.acube.sub.service.WorkHistoryDialogService;


@Controller
public class WorkHistoryDialogController {
	
	private static Logger logger = LoggerFactory.getLogger(WorkHistoryDialogController.class);
	
	@Autowired private WorkHistoryDialogService workHistoryDialogService;
	@Autowired private SecurityService securityService;
	
	@RequestMapping(value="/subscriber/listDialog", method = RequestMethod.GET)
	public String retrieveMemo(Model model
			                 , @RequestParam String entrNo
			                 , @RequestParam String selectOp
			                 , @RequestParam String custNo){
        
		Date curDate = new Date();
		model.addAttribute("strtDttm" , CmnDateUtils.addMonth(curDate, -1));
		model.addAttribute("endDttm"  , CmnDateUtils.addMonth(curDate, 0));
		model.addAttribute("selectOp" , selectOp);
		model.addAttribute("entrNo"   , entrNo);
		model.addAttribute("custNo"   , custNo);
		
		return "/subscriber/searchsubs/listDialog";
	}
	
	@RequestMapping(value="/subscriber/operatorDialog", method = RequestMethod.GET)
	public String retrieveOperator(Model model){
        
		return "/subscriber/searchsubs/operatorDialog";
	}
	
	@RequestMapping(value="/subscriber/newDialog", method = RequestMethod.GET)
	public String retrieveNew(Model model
			                , @RequestParam String forCBEntrNo
			                , @RequestParam String forSysMemo){
        
		model.addAttribute("forCBEntrNo", forCBEntrNo);
		model.addAttribute("forSysMemo" , forSysMemo);
		
		return "/subscriber/searchsubs/newDialog";
	}
	
	@RequestMapping(value="/subscriber/getSelectCategory", method=RequestMethod.GET)
	public @ResponseBody Map<String, List<MemoKind>> getSelectCategory(MemoKind memoKind) {
		
		Map<String, List<MemoKind>> MemoMap = new HashMap<String, List<MemoKind>>();
		
		List<MemoKind> resultData = (List<MemoKind>) workHistoryDialogService.getSelectCategory(memoKind);
		MemoMap.put("list", resultData);
		return   MemoMap;
	}
	
	@RequestMapping(value="/subscriber/getCbProductNo", method=RequestMethod.GET)
	public @ResponseBody Map<String, List<MemoKind>> getCbProductNo(@RequestParam("entrNo") String entrNo) {
		
		Map<String, List<MemoKind>> MemoMap = new HashMap<String, List<MemoKind>>();
		
		List<MemoKind> resultData = (List<MemoKind>) workHistoryDialogService.getCbProductNo(entrNo);
		MemoMap.put("list", resultData);
		return   MemoMap;
	}
	
	@RequestMapping(value="/subscribe/WorkHistory/OperatorSelect",method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<OperatorInfo> getOperatorInfo(SearchFilter searchFilter, HttpSession session){
		
		String sessionId = securityService.getCurrentUser().getLoginId();

		searchFilter.putFilterMap("sessionId", sessionId);
		
		return workHistoryDialogService.getOperatorInfo(searchFilter, new Pagination(searchFilter.getPage(),searchFilter.getRows()));
	}
	
	@RequestMapping(value="/subscribe/WorkHistory/retrieveWorkHistory",method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<MemoKind> getWorkHistoryInfo(SearchFilter searchFilter){
		
		return workHistoryDialogService.getWorkHistoryInfo(searchFilter, new Pagination(searchFilter.getPage(),searchFilter.getRows()));
	}
	
	@RequestMapping(value="/subscriber/insertUserMemo",method={RequestMethod.POST})
	@ResponseBody public void insertUserMemo( @RequestParam String productNo
			                                , @RequestParam String sysMemo
			                                , @RequestParam String userComment
			                                ,               HttpSession session){
		
		String sessionId = securityService.getCurrentUser().getLoginId();
		
		MemoKind memo = new MemoKind();
		
		memo.setProdNo(productNo);
		memo.setSysMemo(sysMemo);
		memo.setUserMemo(userComment);
		
		workHistoryDialogService.insertUserMemo( sessionId, memo );
	}
}