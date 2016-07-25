package com.acube.security.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.mbg.CoSecurityElements;
import com.acube.security.service.MenuService;
import com.acube.security.service.ObjectService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
public class ObjectController {

	private static final Logger logger = LoggerFactory.getLogger(ObjectController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

	@Autowired
	MenuService menuService;
	@Autowired
	ObjectService objectService;

	@RequestMapping(value = "objects", method = { RequestMethod.GET })
	public String goObjectMgmt(Model model) {
		return "security/objectMgmt";
	}
	
	@RequestMapping(value = "/tree/menu", method = { RequestMethod.GET })
	public String goAuthorityForm(Model model) {
		return "security/menuTree";
	}

	@RequestMapping(value = "objectTree", method = RequestMethod.GET)
	@ResponseBody
	public String getObjectTree() {

		List<JsTree> jsTree = objectService.getAllElementsTree();

		Gson g = new Gson();

		return g.toJson(jsTree);

	}

	@RequestMapping(value = "/object/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getObjectInfo(@PathVariable int id) {

		CoSecurityElements cse = objectService.getElementById(id);

		Gson g = new GsonBuilder().serializeNulls().create();

		return g.toJson(cse);

	}

	@RequestMapping(value = "/object", method = RequestMethod.DELETE)
	@ResponseBody
	public Result deleteObjectInfo(@RequestParam("id") String id) {

		objectService.deleteObjectInfo(id);

		return new Result(ResultCode.SUCCESS, "삭제되었습니다.");

	}

	@RequestMapping(value = "/object", method = RequestMethod.PUT)
	@ResponseBody
	public Result updateObjectInfo(@RequestBody CoSecurityElements obj) {

		objectService.updateObjectInfo(obj);

		return new Result(ResultCode.SUCCESS, "저장되었습니다.");

	}

	@RequestMapping(value = "/object", method = RequestMethod.POST)
	@ResponseBody
	public int insertObjectInfo(@RequestBody CoSecurityElements obj) {

		int key = objectService.insertObjectInfo(obj);

		return key;
	}

}
