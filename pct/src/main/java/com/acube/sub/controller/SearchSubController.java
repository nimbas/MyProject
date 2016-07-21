package com.acube.sub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.security.service.SecurityService;
import com.acube.sub.domain.DepositGroup;
import com.acube.sub.domain.EntrContractBill;
import com.acube.sub.domain.EntrDevice;
import com.acube.sub.domain.EntrProduct;
import com.acube.sub.domain.SearchCustEntrVO;
import com.acube.sub.service.SearchCodeService;
import com.acube.sub.service.SubscriberService;

@Controller
public class SearchSubController {
	
	@Autowired SubscriberService subscriberService;
	@Autowired SearchCodeService searchCodeService;
	@Autowired SecurityService securityService;
	
	@RequestMapping(value="/searchSub", method={RequestMethod.GET})
	public String goSearchSub(Model model){
		
		model.addAttribute("serviceDomain",searchCodeService.getServiceDomain());

		return "subscriber/searchsubs/list";
	}
	
/*	@RequestMapping(value="/subscribe/cutomerInfo", method={RequestMethod.POST})
	@ResponseBody public Model customerInfo(@RequestBody EntrContractBill entrcontract, Model model){
		
		model.addAttribute("as2809",subscriberService.getCustInfo(entrcontract.getEntrNo()));
		
		return model;
	}*/
	@RequestMapping(value="/subscribe/cutomerInfo", method={RequestMethod.POST})
	@ResponseBody public EntrContractBill customerInfo(@RequestBody EntrContractBill entrcontract, Model model){
		 EntrContractBill vo = null;
		 
		 vo = subscriberService.getCustInfo(entrcontract.getEntrNo());
		
		return vo;
	}
	
	@RequestMapping(value="/subscribe/custList",method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<SearchCustEntrVO> getCustAndEntrList(SearchFilter searchFilter){

		return subscriberService.getCustAndEntrList(searchFilter, new Pagination(searchFilter.getPage(),searchFilter.getRows()));
	}
	
	@RequestMapping(value="/subscibe/deviceList", method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<EntrDevice> getDeviceList(SearchFilter searchFilter){
		
		return subscriberService.getDeviceList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	@RequestMapping(value="/subscribe/productList", method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<EntrProduct> getProductList(SearchFilter searchFilter){
		return subscriberService.getProductByEntrNoList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	@RequestMapping(value="/subscribe/depositList", method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<DepositGroup> getDepositList(SearchFilter searchFilter){
		return subscriberService.getDepositThresholdByEntrNo(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
}
