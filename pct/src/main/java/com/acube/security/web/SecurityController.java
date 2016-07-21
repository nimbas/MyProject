package com.acube.security.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.util.WebUtils;

import com.acube.common.domain.CountryLocale;
import com.acube.security.service.MenuService;

@Controller
public class SecurityController {

	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

	@Autowired
	MenuService menuService;

	@Resource
	private LocaleResolver localeResolver;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest request) {

		logger.debug("=================it's home=================");
		List<CountryLocale> locales = new ArrayList<CountryLocale>();

		// 몽골은 abailableLocales에 없음..
		CountryLocale countryLocale = new CountryLocale(new Locale("mn", "MN"));
		locales.add(countryLocale);

		// 사용가능한 locales
		for (Locale locale : Locale.getAvailableLocales()) {
			if (locale.getCountry().isEmpty() == false) {
				countryLocale = new CountryLocale(locale);
				locales.add(countryLocale);
			}
		}

		Locale curLocale = (Locale) WebUtils.getSessionAttribute(request, LOCALE_SESSION_ATTRIBUTE_NAME);
		// 세션에 설정된 locale이 있는 경우
		if (curLocale != null) {
			countryLocale = new CountryLocale(curLocale);
		} else { // 설정된 locale 이 없는 경우 xml상 디폴트 locale get
			Locale locale = localeResolver.resolveLocale(request);
			countryLocale = new CountryLocale(locale);
		}
		model.addAttribute("curLocale", countryLocale);
		model.addAttribute("locales", locales);
		model.addAttribute("menu", menuService.getCurrentMenu());

		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {

		logger.debug("=================it's login=================");

		return "login";
	}

	@RequestMapping(value = "/loginfailed")
	public String loginfailed(ModelMap model) {

		logger.debug("=================it's loginfailed=================");

		model.addAttribute("failed", "true");
		return "login";
	}

	@RequestMapping(value = "/logout")
	public String logout() {

		logger.debug("=================it's logout=================");

		return "login";
	}

	@RequestMapping(value = "/locale", method = RequestMethod.GET)
	public String locale(Model model, HttpServletRequest request) {
		return "redirect:/";
	}

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu() {

		logger.debug("=================it's fa=================");

		return "menu/menu";
	}

}
