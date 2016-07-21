package com.acube.sub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.Counsel;
import com.acube.sub.service.CounselService;

@Controller
public class CounselController {
	private static Logger logger = LoggerFactory.getLogger(CounselController.class);
	
	@Autowired CounselService counselService;
	
	@RequestMapping(value="/search/counseList", method={RequestMethod.POST})
	@ResponseBody public  JQueryGrid<Counsel> getCounselList(SearchFilter searchFilter){
		
		return counselService.getCounselList(searchFilter, new Pagination(searchFilter.getPage(),searchFilter.getRows()));
	}
	
	@RequestMapping(value="/cs/csCccs000", method = RequestMethod.POST )
	@ResponseBody public Model registCounselInfo(@RequestBody Counsel counsel ,Model model ){
		if (logger.isDebugEnabled()) {
			logger.debug("[registCounselInfo] BEGIN");
		}
		
		try {
				counselService.registCounselInfo(counsel);
				model.addAttribute("RESULT", "SUCCESS");	
				model.addAttribute("counselId",counsel.getCounselId());
			}  catch (AcubeException me) {
				logger.error("[registCounselInfo] " + me.toString(), me);
				model.addAttribute("RESULT", "FAIL");
				model.addAttribute("MESSAGE", me.getMessage());
			} catch (Exception e) {
				logger.error("[registCounselInfo] " + e.toString(), e);
				model.addAttribute("RESULT", "FAIL");
				model.addAttribute("MESSAGE", "err.500");
			} finally{
				if (logger.isDebugEnabled()) {
					logger.debug("[registCounselInfo] END");
				}
			}
			return model ;
	}

}
