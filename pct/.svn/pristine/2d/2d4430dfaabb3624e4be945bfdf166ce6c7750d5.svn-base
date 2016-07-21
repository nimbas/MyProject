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

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.JsTree;
import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.service.co.LogicalDateService;
import com.acube.security.domain.DealerMaster;
import com.acube.security.domain.User;
import com.acube.security.service.DealerService;
import com.acube.security.service.MenuService;
import com.acube.security.service.OrgService;
import com.acube.security.service.SecurityService;
import com.acube.security.service.UserService;
import com.google.gson.Gson;

@Controller
public class OrgController {

	private static final Logger logger = LoggerFactory.getLogger(OrgController.class);

	public static final String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

	@Autowired
	MenuService menuService;
	@Autowired
	SecurityService securityService;
	@Autowired
	LogicalDateService dateService;
	@Autowired
	DealerService dealerService;
	@Autowired
	OrgService orgService;

	@Autowired
	UserService userService;

	@RequestMapping(value = "/organization", method = { RequestMethod.GET })
	public String goUserMgmt(Model model) {
		model.addAttribute("curDate", dateService.getCurrentDate());
		model.addAttribute("groupList", orgService.getGroupList());
		return "security/orgMgmt";
	}

	@RequestMapping(value = "/orgTree", method = { RequestMethod.GET })
	public String goOrgSelectForm(Model model) {
		return "security/orgTree";
	}

	@RequestMapping(value = "/orgTree", method = RequestMethod.POST)
	@ResponseBody
	public String getObjectTree(@RequestParam(required = false, defaultValue = "") String id, @RequestParam(required = false, defaultValue = "") String groupSeq
			, @RequestParam(required = false, defaultValue = "true") boolean includeUsers) {
		List<JsTree> jsTree = orgService.getOrgTree(id, groupSeq, includeUsers);
		Gson g = new Gson();
		return g.toJson(jsTree);
	}

	@RequestMapping(value = "/user/{userId}", method = { RequestMethod.GET })
	@ResponseBody
	public User getUserInfo(Model model, @PathVariable String userId) {
		return userService.getUserByUserId(userId);
	}

	@RequestMapping(value = "/dealer/{dlrCd}", method = { RequestMethod.GET })
	@ResponseBody
	public DealerMaster getDealerInfo(@PathVariable String dlrCd, DealerMaster dealer) {

		return dealerService.getDealerMaster(dealer);
	}

	@RequestMapping(value = "/dealer/{dlrCd}", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addDealerMaster(@RequestBody DealerMaster dealer) {

		dealer.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addDealerMaster");
		dealerService.addDealerMaster(dealer);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/dealer/{dlrCd}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	@ResponseBody
	public Result updateDealerMaster(@RequestBody DealerMaster dealer) {

		dealer.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateDealerMaster");
		dealerService.updateDealerMaster(dealer);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/dealer/{dlrCd}", method = { RequestMethod.DELETE })
	@ResponseBody
	public Result deleteDealerMaster(DealerMaster dealer) {

		dealer.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteDealerMaster");
		dealerService.deleteDealerMaster(dealer);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/dealers", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteDealers(@RequestBody List<DealerMaster> dealers) {
		DealerMaster base = new DealerMaster();
		base.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteUsers");
		dealerService.deleteDealerMasters(base, dealers);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/dealer/move", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result moveDealerMaster(@RequestBody DealerMaster dealer) {
		dealer.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "moveDealerMaster");
		dealerService.moveDealerMaster(dealer);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/user/{userId}", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result addUser(@RequestBody User user) {

		user.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addUser");
		userService.addUser(user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/user/{userId}", method = { RequestMethod.PUT }, consumes = { "application/json" })
	@ResponseBody
	public Result updateUser(@RequestBody User user) {

		user.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "updateUser");
		userService.updateUser(user);
		return new Result(ResultCode.SUCCESS);
	}

	@RequestMapping(value = "/user/{userId}", method = { RequestMethod.DELETE })
	@ResponseBody
	public Result deleteUser(User user) {

		user.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteUser");
		userService.deleteUser(user);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/users", method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteUsers(@RequestBody List<User> users) {
		User base = new User();
		base.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "deleteUsers");
		userService.deleteUsers(base, users);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = "/user/move/{dlrCd}", method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result moveUser(DealerMaster dealerMaster, @RequestBody List<User> users) {
		dealerMaster.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "moveUser");
		userService.moveUsers(dealerMaster, users);
		return new Result(ResultCode.SUCCESS);
	}
	
	
	@RequestMapping(value = "/checkUserId/{userId}", method = { RequestMethod.POST })
	@ResponseBody
	public Result checkUserId(@PathVariable String userId, User user) {
		if(userService.getCheckLoginID(user)==0){
			return new Result(ResultCode.SUCCESS);
		}else{
			return new Result(ResultCode.FAIL);
		}
	}
	
	
	@RequestMapping(value = "/user/availableIp", method = { RequestMethod.GET })
	public String getAvailableIP(Model model) {
		return "security/iplist";
	}
	
	@RequestMapping(value = "/user/{dlrCd}/availableIp", method = { RequestMethod.POST })
	@ResponseBody
	public List<User> getAvailableIP(@PathVariable String dlrCd, Model model, User user) {
		return userService.getAvailableIp(user);
	}
}
