package com.acube.security.web;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.mbg.RvDlrMstr;
import com.acube.common.domain.mbg.RvDlrMstrKey;
import com.acube.common.domain.mbg.SeSecurityProfileInfo;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.mapper.mbg.RvDlrMstrMapper;
import com.acube.common.service.co.LogicalDateService;
import com.acube.security.domain.Group;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;
import com.acube.security.service.MenuService;
import com.acube.security.service.OrgService;
import com.acube.security.service.ProfileService;
import com.acube.security.service.SecurityService;
import com.google.gson.Gson;

@Controller
public class GroupController {

	private static final Logger logger = LoggerFactory.getLogger(GroupController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

	@Autowired
	MenuService menuService;
	@Autowired
	RvDlrMstrMapper rvDlrMstrMapper;
	@Autowired
	OrgService orgService;
	@Autowired
	SecurityService securityService;
	@Autowired
	LogicalDateService dateService;
	@Autowired
	ProfileService profileService;


	@RequestMapping(value = "/groupTree", method = RequestMethod.GET)
	@ResponseBody
	public String getGroupTree(@RequestParam(required=false, defaultValue="") String id) {
		List<JsTree> jsTree = orgService.getAllGroupTree(id);
		Gson g = new Gson();
		String ret = g.toJson(jsTree) ;
		return ret ;

	}


	@RequestMapping(value = "/orgInfoByCode", method = RequestMethod.GET)
	@ResponseBody
	public RvDlrMstr orgInfoByCode(String code) {
		RvDlrMstrKey key = new RvDlrMstrKey();
		key.setDlrCd(code);
		return rvDlrMstrMapper.selectByPrimaryKey(key);

	}
	
	/**
	 * 사용자 그룹 추가
	 * @param group
	 * @return
	 */
	@RequestMapping(value = "/group/{groupSeq}", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addAuthorityGroup(@RequestBody Group group) {
		
		User user = securityService.getCurrentUser();
		group.setBaseInfo(dateService.getCurrentDate(), user.getUserId(), "addAuthorityGroup");
		group.setMarketCode(user.getMarketCode());
		orgService.addAuthGroup(group);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * 사용자그룹 수정
	 * @param group
	 * @return
	 */
	@RequestMapping(value = "/group/{groupSeq}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	@ResponseBody
	public Result updateAuthorityGroup(@RequestBody Group group) {
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateAuthorityGroup");
		orgService.updateAuthGroup(group);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * 사용자 그릅 삭제
	 * @param group
	 * @return
	 */
	@RequestMapping(value = "/group/{groupSeq}", method = { RequestMethod.DELETE })
	@ResponseBody
	public Result deleteAuthorityGroup(Group group) {
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteAuthorityGroup");
		orgService.deleteAuthGroup(group);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * 사용자 그룹 소속 사용자 목록
	 * @param groupSeq
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/group/user/{groupSeq}", method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<User> getUsersByGroup(@PathVariable String groupSeq, SearchFilter searchFilter) {
		if(!"0".equals(groupSeq)){
			return orgService.getUserByGroup(searchFilter);	
		}
		return new JQueryGrid<User>();
	}
	
	/**
	 * 사용자 그룹 소속 사용자 등록
	 * @param groupSeq
	 * @param groupList
	 * @return
	 */
	@RequestMapping(value = "/group/user/{groupSeq}/{appendWithSubDealer}", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addGroupUserLink(@PathVariable long groupSeq, @PathVariable String appendWithSubDealer, @RequestBody List<HashMap<String, String>> groupList) {
		Group group = new Group();
		group.setGroupSeq(groupSeq);
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addGroupUserLink");
		orgService.processAuthGroupUserLink(appendWithSubDealer, group, groupList);
		return new Result(ResultCode.SUCCESS);
	}
	
	/**
	 * 사용자 그룹의 개별 사용자 삭제
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/group/user/{groupSeq}", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteGroupUserLink(@PathVariable long groupSeq, @RequestBody Group group) {
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteGroupUserLink");
		orgService.deleteAuthGroupUserLink(group);
		return new Result(ResultCode.SUCCESS);
	}

	
	/**
	 * 전체 or 선택된 프로파일 목록 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/group/profile_{groupSeq}/{option}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<SeSecurityProfileInfo> getSelectedProfiles(@PathVariable String groupSeq, @PathVariable String option, SearchFilter searchFilter) {
		if(!"0".equals(groupSeq)){
			if ("available".equals(option)) {
				return profileService.getAvailableProfiles(searchFilter);
			} else if ("selected".equals(option)) {
				return profileService.getSelectedProfiles(searchFilter);
			}
		}
		return new JQueryGrid<SeSecurityProfileInfo>();
	}

	@RequestMapping(value = "/group/profileElements/{groupSeq}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<ProfileElement> getAllProfileElements(@PathVariable String groupSeq, SearchFilter searchFilter) {
		if(!"0".equals(groupSeq)){
			return profileService.getAllProfileElements(searchFilter);
		}
		return new JQueryGrid<ProfileElement>();
	}

	
	@RequestMapping(value = "/group/profile", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addGroupProfile(@RequestBody Group group) {
		
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addGroupProfile");
		profileService.addProfileLink(group);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/group/profile", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteGroupProfile(@RequestBody Group group) {
		
		group.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteGroupProfile");
		profileService.deleteProfileLink(group);
		return new Result(ResultCode.SUCCESS);
	}
}
