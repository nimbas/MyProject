package com.acube.sub.cust.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.acube.security.service.SecurityService;
import com.acube.sub.domain.CsAddress;
import com.acube.sub.domain.Customer;
import com.acube.sub.repository.ContactRepository;
import com.acube.sub.repository.CsAddressRepository;
import com.acube.sub.repository.CustomerRepository;

public class CsAddressServiceImpl implements CsAddressService {

	@Autowired SecurityService securityService;
	@Autowired CustomerRepository customerRepository;
	@Autowired ContactRepository contactRepository;
	@Autowired CsAddressRepository csAddressRepository;
	/**
	* {@inheritDoc}
	*/
	@Override
	public List<CsAddress> getCustomerAddressList(Customer customer) {
		if(customer != null && !"-1".equals(customer.getCustNo()) ){
			return csAddressRepository.getCustomerAddressList(customer.getCustNo());
		}else{
			return null;
		}
	}
	@Override
	public CsAddress getCustomerAddress(Customer customer) {
		System.out.println("M: came in service imple");
//		if(customer != null && !"-1".equals(customer.getCustNo()) ){
			
			return csAddressRepository.getCustomerAddress(customer.getCustNo());
//			return csAddressRepository.getCustomerAddress(customer.getCustNo());
//		}else{
//			return null;
//		}
	}

}
