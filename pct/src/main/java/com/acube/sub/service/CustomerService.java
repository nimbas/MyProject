package com.acube.sub.service;
import com.acube.sub.domain.Customer;
import com.acube.sub.domain.Entrance;

public interface CustomerService {
	
    //2013.03.20 grade 조회 추�?
	public Entrance getCustomerGradeFromCust(Entrance entrance) ;
	
	public Customer getCustomer(Customer customer);
	
	public Customer getCustomer(Customer customer, boolean needAddInfo);

	
}