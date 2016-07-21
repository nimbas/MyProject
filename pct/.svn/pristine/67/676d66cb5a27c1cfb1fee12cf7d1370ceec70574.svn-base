package com.acube.common.web.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.acube.common.domain.ResultCode;
import com.acube.common.domain.code.LookupCode;
import com.acube.common.exception.AcubeException;
import com.acube.common.service.code.CodeCacheManager;
import com.acube.common.service.code.CodeService;

@Controller
public class CodeController {

	private static final Logger logger = LoggerFactory
			.getLogger(CodeController.class);
	@Autowired CodeService codeService;
	

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		// 날짜 데이타가 값이 입력이 안되는 경우 '' 를 Date 변환시 에러가 나는 문제 처리.
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		dateFormat.setLenient(false);

		// true passed to CustomDateEditor constructor means convert empty
		// String to null
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}

	@RequestMapping(value = "/code/codeList", method = RequestMethod.POST, consumes = { "application/json" })
	@ResponseBody
	public Map<String, List<LookupCode>> getCodeList(Model model,
			HttpServletRequest request, HttpSession httpSession,
			@RequestBody LookupCode[] codes) {
		if (logger.isDebugEnabled()) {
			logger.debug("[getCodeName] BEGIN");
		}
		Map<String, List<LookupCode>> lookupCodes = new HashMap<String, List<LookupCode>>();
		try {

			// 세션에 저장된 locale 정보를 조회
			Locale locale = (Locale) httpSession
					.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
			String language = "";
			// 세션에 저장된 정보가 있는 경우.
			if (locale != null) {
				language = locale.getLanguage();

			} else {// 세션에 저장된 정보가 없는 경우, 디폴트 설정
				language = request.getLocale().getLanguage();
			}

			for (LookupCode code : codes) {
				code.setLanguage(language);
				lookupCodes.put(code.getCodeGroup(),
						codeService.getCodeListFromCache(code));
			}

		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("[getCodeName] " + e.toString(), e);
			}
			throw new AcubeException("err.500", e.toString());
		} finally {
			if (logger.isDebugEnabled()) {
				logger.debug("[getCodeName] END");
			}
		}
		return lookupCodes;
	}
}
