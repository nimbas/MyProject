package com.acube.sub.cust.service;

import java.util.List;

import com.acube.sub.domain.CsAddress;
import com.acube.sub.domain.Customer;

public interface CsAddressService {
	
	public List<CsAddress> getCustomerAddressList(Customer customer);
	public CsAddress getCustomerAddress(Customer customer);

}
