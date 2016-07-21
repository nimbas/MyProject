package com.acube.sub.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.service.code.CodeCacheManager;
import com.acube.sub.domain.Customer;
import com.acube.sub.domain.CustomerFile;
import com.acube.sub.domain.Entrance;
import com.acube.sub.repository.ContactRepository;
import com.acube.sub.repository.CsAddressRepository;
import com.acube.sub.repository.CustomerRepository;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired CustomerRepository customerRepository;
	@Autowired CodeCacheManager codeCacheManager;
	@Autowired CsAddressRepository csAddressRepository;
	@Autowired ContactRepository contactRepository;
	
	private static Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);	

	//2013.03.20 grade ?���? 조회
	@Override
	public Entrance getCustomerGradeFromCust(Entrance entrance) {
		return customerRepository.getCustomerGradeFromCust(entrance);
	}
	
	@Override
	public Customer getCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return getCustomer(customer, true);
	}

	@Override
	public Customer getCustomer(Customer customer, boolean needAddInfo) {
		customer = customerRepository.getCustomer(customer);
		
		if(customer != null && needAddInfo){
			customer.setAddresses(csAddressRepository.getCustomerAddressList(customer.getCustNo()));
			customer.setContacts(contactRepository.getCustomerContactList(customer.getCustNo()));
			customer.setEntrancePassword(customerRepository.getEntrancePassword(customer.getCustNo()));
			customer.setEntrancePasswords(customerRepository.getEntrancePasswordList(customer.getCustNo()));	
			CustomerFile customerFile = new CustomerFile();
			customerFile.setCustNo(customer.getCustNo());
			customerFile.setFileDvCd("1");//고객관련 파일만.
			customer.setCustomerFiles(customerRepository.getCustomerFileList(customerFile));
		}
		
		return customer;
	}
	
}