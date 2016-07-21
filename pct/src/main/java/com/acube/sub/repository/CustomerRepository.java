package com.acube.sub.repository;

import java.util.List;


import com.acube.common.domain.code.LookupCode;
import com.acube.sub.domain.Customer;
import com.acube.sub.domain.CustomerFile;
import com.acube.sub.domain.Entrance;
import com.acube.sub.domain.EntrancePassword;

public interface CustomerRepository {
	
	public Entrance getCustomerGradeFromCust(Entrance entrance) ;
	
	public List<LookupCode> appendCache(String cacheName, LookupCode lookupCode);
	
	public Customer getCustomer(Customer customer);
	
	public EntrancePassword getEntrancePassword(String custNo);
	public List<EntrancePassword> getEntrancePasswordList(String custNo);
	public List<CustomerFile> getCustomerFileList(CustomerFile customerFile);
	
}