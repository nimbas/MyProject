package com.acube.sub.repository;

import java.util.List;

import com.acube.sub.domain.CsAddress;

public interface CsAddressRepository {
	public int addCsAddress(CsAddress csAddress);	
	public int updateCsAddress(CsAddress csAddress);	
	public int deleteCsAddress(String addrSeq);
	public int deleteAllAddress(String custNo);
	public List<CsAddress> getCustomerAddressList(String custNo);
	public CsAddress getCustomerAddress(String custNo);
	

}
