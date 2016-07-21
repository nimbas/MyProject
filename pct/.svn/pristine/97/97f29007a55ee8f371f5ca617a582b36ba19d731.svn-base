package com.acube.security.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.code.LookupCode;
import com.acube.security.service.CodeMgtService;
import com.google.gson.Gson;

@Controller
public class CodeMgtController {
	
	private static final Logger logger = LoggerFactory.getLogger(ObjectController.class);
	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";
	
	@Autowired
	CodeMgtService codeService;
	
	@Autowired
	WebApplicationContext webContext;
	
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
	
	@RequestMapping(value = "codemgmt", method = { RequestMethod.GET })
	public String goCodeMgmt(Model model) {
		return "security/codeMgmt";
	}
	
	@RequestMapping(value = "/code/allList", method = RequestMethod.GET)
	@ResponseBody
	public String getallListData() {
		List<LookupCode> jsonAllList = codeService.getAllCodeList();
		Gson g = new Gson();
		return g.toJson(jsonAllList);
	}
	
	@RequestMapping(value = "/code/allList/tree", method = RequestMethod.GET)
	@ResponseBody
	public String getallListDataforTreeView(HttpServletRequest request, HttpSession httpSession) {
		
		// 세션에 저장된 locale 정보를 조회
		Locale locale = (Locale) httpSession.getAttribute(SessionLocaleResolver.LOCALE_SESSION_ATTRIBUTE_NAME);
		String language = "";
		// 세션에 저장된 정보가 있는 경우.
		if (locale != null) {
			language = locale.getLanguage();
		} else {// 세션에 저장된 정보가 없는 경우, 디폴트 설정
			language = request.getLocale().getLanguage();
		}
		
		List<JsTree> jsTree = codeService.getAllCodeListforTreeView(language);
		
		Gson g = new Gson();
		return g.toJson(jsTree);
	}
	
	@RequestMapping(value = "/code/single/{codeGroup}/{codeId}", method = RequestMethod.GET)
	@ResponseBody
	public String getSingleData(@PathVariable String codeGroup, @PathVariable String codeId, HttpServletRequest request, HttpSession httpSession) {
		LookupCode lookupCode = new LookupCode();
		
		lookupCode.setCodeGroup(codeGroup);
		lookupCode.setCode(codeId);
		
		List<LookupCode> jsonSingleDatas = codeService.getSingleCodeData(lookupCode);
		
		Gson g = new Gson();
		return g.toJson(jsonSingleDatas);		
	}
	
	@RequestMapping(value = "/code/single", method = RequestMethod.POST, consumes = { "application/json" })
	@ResponseBody
	public Result insertSingleData(@RequestBody List<LookupCode> addCodeDatas) {		
		Date nowDate = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		for(LookupCode addCodeData : addCodeDatas){
			if(addCodeData.getStartDateActive_js() != ""){
				try {
					addCodeData.setStartDateActive(transFormat.parse(addCodeData.getStartDateActive_js()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if(addCodeData.getEndDateActive_js() != ""){
				try {
					addCodeData.setEndDateActive(transFormat.parse(addCodeData.getEndDateActive_js()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			
			addCodeData.setCreationDate(nowDate);
			addCodeData.setLastUpdateDate(nowDate);
			codeService.addSingleCodeData(addCodeData);
		}
		
		
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/code/single", method = RequestMethod.PUT, consumes = { "application/json" })
	@ResponseBody
	public Result updateSingleData(@RequestBody List<LookupCode> updateCodeDatas) {
		
		Date nowDate = new Date();
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		for(LookupCode updateCodeData : updateCodeDatas){
			if(updateCodeData.getStartDateActive_js() != ""){
				try {
					updateCodeData.setStartDateActive(transFormat.parse(updateCodeData.getStartDateActive_js()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			if(updateCodeData.getEndDateActive_js() != ""){
				try {
					updateCodeData.setEndDateActive(transFormat.parse(updateCodeData.getEndDateActive_js()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
			
			if(updateCodeData.getUpdateStatus().equals("ADD")){
				updateCodeData.setCreationDate(nowDate);
				updateCodeData.setLastUpdateDate(nowDate);
				codeService.addSingleCodeData(updateCodeData);
			}else if(updateCodeData.getUpdateStatus().equals("UPDATE")){
				updateCodeData.setLastUpdateDate(nowDate);
				codeService.updateSingleCodeData(updateCodeData);
			}else if(updateCodeData.getUpdateStatus().equals("DELETE")){
				codeService.deleteCodeData(updateCodeData);
			}
		}
		
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/code/single/{codeGroup}/{codeId}", method = RequestMethod.DELETE)
	@ResponseBody
	public Result deleteSingleData(@PathVariable String codeGroup, @PathVariable String codeId) {
		LookupCode lookupCode = new LookupCode();
		lookupCode.setCodeGroup(codeGroup);
		lookupCode.setCode(codeId);		
		codeService.deleteCodeData(lookupCode);
		return new Result(ResultCode.SUCCESS);		
	}
	
	@RequestMapping(value = "/code/group/{codeGroup}", method = RequestMethod.DELETE)
	@ResponseBody
	public Result deleteGroupData(@PathVariable String codeGroup) {
		LookupCode lookupCode = new LookupCode();
		lookupCode.setCodeGroup(codeGroup);		
		codeService.deleteCodeData(lookupCode);
		return new Result(ResultCode.SUCCESS);		
	}
}
