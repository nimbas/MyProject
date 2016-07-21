package com.acube.security.web;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.service.co.LogicalDateService;
import com.acube.security.domain.CoAuthCode;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;
import com.acube.security.service.AuthorityService;
import com.acube.security.service.SecurityService;

@Controller
public class AuthorityController {

	private static final Logger logger = LoggerFactory.getLogger(AuthorityController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

	@Autowired
	AuthorityService authorityService;
	@Autowired
	SecurityService securityService ;
	@Autowired
	LogicalDateService dateService;

	@RequestMapping(value = "/authorities", method = { RequestMethod.GET })
	public String goAuthorityMgmt(Model model) {

		return "security/authorityMgmt";
	}

	@RequestMapping(value = "/authority/search", method = { RequestMethod.GET })
	@ResponseBody
	public JQueryGrid<CoAuthCode> getAuthorityList(SearchFilter searchFilter) {
		return authorityService.getAuthorities(searchFilter);
	}
	
	@RequestMapping(value = "/authority", method = { RequestMethod.GET })
	public String goAuthorityForm(Model model) {
		return "security/authorityForm";
	}
	
	@RequestMapping(value = "/authority/{authId}", method = { RequestMethod.POST })
	@ResponseBody
	public Result addAuthority(CoAuthCode authCode) {
		authCode.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addAuthority");
		authorityService.addAuthority(authCode);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/authority/{authId}", method = { RequestMethod.DELETE })
	@ResponseBody
	public Result deleteAuthority(CoAuthCode authCode) {
		authCode.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addAuthority");
		authorityService.deleteAuthority(authCode);
		return new Result(ResultCode.SUCCESS);
	}
	
	
	@RequestMapping(value = "/authorities", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addAuthority(@RequestBody List<ProfileElement> authCodes) {
		User user = securityService.getCurrentUser();
		user.setWorkDate(dateService.getCurrentDate());
		user.setApplicationId("processProfile");		
		authorityService.addAuthorityByProfile(authCodes, user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/authorities", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result delAuthority(@RequestBody List<ProfileElement> authCodes) {
		User user = securityService.getCurrentUser();
		user.setWorkDate(dateService.getCurrentDate());
		user.setApplicationId("processProfile");		
		authorityService.deleteAuthorityByProfile(authCodes, user);
		return new Result(ResultCode.SUCCESS);
	}
}
