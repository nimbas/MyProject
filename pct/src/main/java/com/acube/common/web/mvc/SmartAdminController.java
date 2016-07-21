package com.acube.common.web.mvc;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.acube.security.service.MenuService;
import com.acube.security.service.OrgService;
import com.acube.security.service.ProfileService;

/**
 * <pre>
 * com.abacus.pc.web.mvc 
 *    |_ HomeController.java
 * 
 * comment:General mvc controller
 * </pre>
 * 
 * @date : 2014. 11. 6. 오후 2:17:52
 * @version :
 * @author : ChoiKangYou
 */
@Controller
public class SmartAdminController {

	private static final Logger logger = LoggerFactory.getLogger(SmartAdminController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";
	@Autowired
	MenuService menuService;

	@Autowired
	OrgService orgnizationService;

	@Autowired
	ProfileService securityService;

	@Resource
	private LocaleResolver localeResolver;

	
	@RequestMapping(value = "{system}/dashboard", method = { RequestMethod.GET })
	public String goDashBoard(@PathVariable String system) {
		logger.debug("===================it's pvs/dashboard==================");
		return system + "/dashboard";
	}

	@RequestMapping(value = "/ajax/{htmlName}.html", method = RequestMethod.GET)
	public String baseContent(@PathVariable String htmlName) {

		logger.debug("=================it's fa=================");

		return "ajax/" + htmlName;
	}

	@RequestMapping(value = "/ajax/{subFolder}/{htmlName}.html", method = RequestMethod.GET)
	public String modalContent(@PathVariable String subFolder, @PathVariable String htmlName) {

		logger.debug("=================it's fa=================");

		return "ajax/" + subFolder + "/" + htmlName;
	}

}
