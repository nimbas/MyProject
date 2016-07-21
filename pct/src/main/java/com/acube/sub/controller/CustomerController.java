package com.acube.sub.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.exception.AcubeException;
import com.acube.common.service.code.CodeService;
import com.acube.security.service.SecurityService;
import com.acube.sub.domain.Contact;
import com.acube.sub.domain.CustAttribute;
import com.acube.sub.domain.Customer;
import com.acube.sub.domain.Entrance;
import com.acube.sub.domain.Member;
import com.acube.sub.service.ContactService;
import com.acube.sub.service.CustomerService;
import com.acube.sub.service.MemberService;


@Controller
public class CustomerController {
	
	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired private CustomerService customerService ;
	@Autowired private SecurityService securityService;
	@Autowired private CodeService codeService;
	@Autowired private MemberService memberSevice;
	@Autowired private ContactService contactService;
	
	@SuppressWarnings("null")
	@RequestMapping(value="/cs/getCustomerGradeFromCust", method = RequestMethod.POST)
	@ResponseBody public Entrance getCustomerGradeFromCust(Entrance entrance , Model model){
		Entrance result = null;
		try {
			
			if( entrance != null){
				result = customerService.getCustomerGradeFromCust(entrance);
				if(result == null){
					result = new Entrance();
				}
			}
			
		} catch (AcubeException me) {
			logger.error("[getCustomerGradeFromCust] " + me.toString(), me);
		} catch (Exception e) {
			logger.error("[csCccs010getCustomerGradeFromCustActivity] " + e.toString(), e);
		} finally{
			if (logger.isDebugEnabled()) {
				logger.debug("[getCustomerGradeFromCust] END");
			}
		}
		return result;
	 }
	
	// 가입자 정보 변경
	@RequestMapping(value="/subscriber/customerChangeDialog", method={RequestMethod.GET})
	public String customerChange(Model model,@RequestParam String custNo, @RequestParam String custrnmNo, @ModelAttribute Customer customer){
		
		String operatorId = securityService.getCurrentUser().getLoginId();
		String marketCode = memberSevice.getMarketCode(operatorId);
		
		List<Contact> contact = contactService.getCustomerContactList(custNo);
		
		customer.setMarketCode(marketCode);
		
		model.addAttribute("contact", contact);
		model.addAttribute("customer", customerService.getCustomer(customer));
		model.addAttribute("custrnmNo", custrnmNo);
		
		System.out.println("parkTest="+customer.toString());
		
/*// 		customer.setMarketCode(member.getMarketCode());
		if(!"-1".equals(custNo) || !StringUtils.isEmpty(customer.getCustRnmNo())){
			Customer customer2 = customerService.getCustomer(customer);
			if(customer2 == null){
				customer.setCustAttributes(customerService.getCustomerAttributeParamList(member.getLang()));
				model.addAttribute("customer", customer);
				model.addAttribute("custAttr", "false");
			}else{
				customer2.setOperator(member);
				List<CustAttribute> custAttributes = customerService.getCustomerAttributeList(customer2);
				model.addAttribute("custAttr", "true");
				if(custAttributes == null || custAttributes.size() == 0){
					custAttributes = customerService.getCustomerAttributeParamList(member.getLang());
					model.addAttribute("custAttr", "false");
				}
				customer2.setCustAttributes(custAttributes);
				
				model.addAttribute("customer", customer2);
				
				int count = 0 ;
				//상담에서 고객신규로 들오 오는 경우 custNo가 있어도 custRnmNo가 없다.. 
				if(customer2.getCustRnmNo()!=null){
					count = customerService.getBlackListCheckCount(customer2.getCustRnmNo()) ;	
				}
				model.addAttribute("blackListYn", count > 0 ? 'Y' : 'N');
			
				if (StringUtils.isEmpty(customer2.getCustRnmNo())){
					model.addAttribute("existSSN","false");
				}else{
					model.addAttribute("existSSN","true");
				}
			}
		}else{
			customer.setCustAttributes(customerService.getCustomerAttributeParamList(member.getLang()));
			model.addAttribute("customer", customer);
			model.addAttribute("custAttr", "false");
		}		
		return "dialog.cs.cust.csCust001";*/
		
		
		return "subscriber/cust/customerUpdate";
	}
	
	
}