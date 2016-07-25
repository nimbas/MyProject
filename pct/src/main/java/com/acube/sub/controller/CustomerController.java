package com.acube.sub.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.w3c.dom.ls.LSInput;

import com.acube.common.exception.AcubeException;
import com.acube.common.service.code.CodeService;
import com.acube.security.service.SecurityService;
import com.acube.sub.cust.service.CsAddressService;
import com.acube.sub.domain.Code;
import com.acube.sub.domain.Contact;
import com.acube.sub.domain.CsAddress;
import com.acube.sub.domain.Customer;
import com.acube.sub.domain.Entrance;
import com.acube.sub.service.ContactService;
import com.acube.sub.service.CustomerService;
import com.acube.sub.service.MemberService;
import com.acube.sub.service.SearchCodeService;


@Controller
public class CustomerController {
	
	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired private CustomerService customerService ;
	@Autowired private SecurityService securityService;
	@Autowired private CodeService codeService;
	@Autowired private MemberService memberSevice;
	@Autowired private ContactService contactService;
	@Autowired private CsAddressService csAddressService;
	@Autowired private SearchCodeService searchCodeService;
	
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
		List<CsAddress> csAddress = csAddressService.getCustomerAddressList(customer);
		
		customer.setMarketCode(marketCode);
		
		model.addAttribute("csAddress", csAddress);
		model.addAttribute("contact", contact);
		model.addAttribute("customer", customerService.getCustomer(customer));
		model.addAttribute("custrnmNo", custrnmNo);
		
		System.out.println("parkTest="+customer.toString());
		
		return "subscriber/cust/customerUpdate";
	}
	
	
	@RequestMapping(value="/contact/addInfo", method={RequestMethod.POST})
	@ResponseBody public List<Contact> addContactInfo(@RequestBody Contact contact){
		
		String operatorId = securityService.getCurrentUser().getLoginId();
		
		contact.setOperatorId(operatorId);
		
		contactService.addContact(contact);
		
		List<Contact> contact2 = contactService.getCustomerContactList(contact.getCustNo());
		
		
		return contact2;
	}
	
	@RequestMapping(value="/contact/updateInfo", method={RequestMethod.PUT})
	@ResponseBody public List<Contact> updateContactInfo(@RequestBody Contact contact){
		String operatorId = securityService.getCurrentUser().getLoginId();
		
		contact.setOperatorId(operatorId);
		
		contactService.updateContact(contact);
		
		List<Contact> contact2 = contactService.getCustomerContactList(contact.getCustNo());
		
		return contact2;
	}
	
	@RequestMapping(value="/contact/deleteInfo", method={RequestMethod.DELETE})
	@ResponseBody public List<Contact> deleteContactInfo(@RequestBody Contact contact){
		
		contactService.deleteContact(contact.getContactSeq());
		
		List<Contact> contact2 = contactService.getCustomerContactList(contact.getCustNo());
		
		return contact2;
	}
	
	
	/**
	 *  주소 검색 Dialog
	 */
	@RequestMapping(value="/search/addressDialogSearch", method={RequestMethod.GET})
	public String addressSearchForm(Model model){
		
		Code code = new Code();
		
		model.addAttribute("cityCode",searchCodeService.getCityCode(code));
		
		return "subscriber/cust/addrSearch";
	}
	
	@RequestMapping(value="/address/cityChange", method={RequestMethod.POST})
	@ResponseBody public List<Code> getSearchDistrict(@RequestBody Code code){
		
		System.out.println("upCodeIdPark::"+code.getUpCodeId());
		
		List<Code> districtCdoe = searchCodeService.getDistrictCode(code);
		
		return districtCdoe;
	}
	
}