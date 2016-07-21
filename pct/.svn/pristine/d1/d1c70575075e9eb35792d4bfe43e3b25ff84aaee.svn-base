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
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.mbg.SeSecurityProfileInfo;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsProd;
import com.acube.pvs.service.ProdFeatureService;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;
import com.acube.security.service.ProfileService;
import com.acube.security.service.SecurityService;

@Controller
public class ProfileController {

	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
	@Autowired
	ProfileService profileService;
	@Autowired
	SecurityService securityService;
	@Autowired
	LogicalDateService dateService;
	@Autowired
	ProdFeatureService prodFeatureService;

	@RequestMapping(value = "/profiles", method = { RequestMethod.GET })
	public String goProfileMgmt(Model model) {
		return "security/profileMgmt";
	}

	/**
	 * 프로파일 목록 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/profiles/search", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<SeSecurityProfileInfo> getProfiles(SearchFilter searchFilter) {
		return profileService.getProfiles(searchFilter);
	}
	
	/**
	 * 프로파일 등록/수정/삭제처리
	 * 
	 * @param profiles
	 * @return
	 */
	@RequestMapping(value = "/profiles", method = RequestMethod.POST, consumes = { "application/json" })
	@ResponseBody
	public Result processProfile(@RequestBody List<SeSecurityProfileInfo> profiles) {
		User user = securityService.getCurrentUser();
		user.setWorkDate(dateService.getCurrentDate());
		user.setApplicationId("processProfile");
		profileService.processProfile(profiles, user);

		return new Result(ResultCode.SUCCESS);

	}

	/**
	 * Security or Mask authority
	 * 
	 * @param option
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/profile/authorities/{option}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<ProfileElement> getProfileAuthorities(@PathVariable String option, SearchFilter searchFilter) {
		if ("available".equals(option)) {
			return profileService.getAvailableAuthorities(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		} else if ("selected".equals(option)) {
			return profileService.getSelectedAuthorities(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}
		return new JQueryGrid<ProfileElement>();
	}

	/**
	 * Menu or Object
	 * 
	 * @param option
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/profile/objects/{option}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<ProfileElement> getProfileObjects(@PathVariable String option, SearchFilter searchFilter) {
		if ("available".equals(option)) {
			return profileService.getAvailableObjects(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		} else if ("selected".equals(option)) {
			return profileService.getSelectedObjects(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}
		return new JQueryGrid<ProfileElement>();
	}

	/**
	 * 선택된 메뉴 하위 메뉴 전부 조회
	 * 
	 * @param menuId
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/profile/menu/{menuId}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<ProfileElement> getProfileMenuTrees(@PathVariable String menuId, SearchFilter searchFilter) {
		return profileService.getAvailableTreeMenu(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}

	// Sale or Discount channel
	@RequestMapping(value = "/profile/channels/{option}", method = RequestMethod.POST)
	@ResponseBody
	public JQueryGrid<ProfileElement> getProfileChannels(@PathVariable String option, SearchFilter searchFilter) {
		if ("available".equals(option)) {
			return profileService.getAvailableChannels(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		} else if ("selected".equals(option)) {
			return profileService.getSelectedChannels(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}
		return new JQueryGrid<ProfileElement>();
	}

	@RequestMapping(value = "/profileElements", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addProfileElements(@RequestBody List<ProfileElement> profileElements) {
		User user = securityService.getCurrentUser();
		user.setWorkDate(dateService.getCurrentDate());
		user.setApplicationId("addProfileElements");
		profileService.addProfileElements(profileElements, user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/profileElements", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteProfileElements(@RequestBody List<ProfileElement> profileElements) {
		User user = securityService.getCurrentUser();
		user.setWorkDate(dateService.getCurrentDate());
		user.setApplicationId("processProfile");
		profileService.deleteProfileElements(profileElements, user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/profile/channel/product", method = { RequestMethod.GET })
	public String goProfileChannelProduct(Model model) {
		return "security/chnl-product";
	}

	/*@RequestMapping(value = "/profile/channel/product", method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsProd> getProfileChannelProduct(SearchFilter searchFilter) {
		// return prodFeatureService.getProductsByChannel(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}*/
}
