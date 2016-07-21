package com.acube.sub.repository;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.DepositGroup;
import com.acube.sub.domain.EntrContractBill;
import com.acube.sub.domain.EntrDevice;
import com.acube.sub.domain.EntrProduct;
import com.acube.sub.domain.SearchCustEntrVO;


public interface SubscriberServiceRepository {
	// count
	// public int getCustAndEntrListCount(SearchFilter  searchFilter);
	
	// customer info
	public EntrContractBill getContractBillInfo(String searchEntrNo);
	
	public String getCustNo(String searchEntrNo);
	
	public List<SearchCustEntrVO> getCustAndEntrList(SearchFilter searchFilter, Pagination pagination);
	
	public List<SearchCustEntrVO> getCustAndEntrList(SearchFilter searchFilter);
	
	public List<EntrDevice> getDeviceList(SearchFilter searchFilter, Pagination pagination);
	
	public List<EntrProduct> getProductByEntrNoList(SearchFilter searchFilter, Pagination pagination);
	
	public List<DepositGroup> getDepositThresholdByEntrNo(SearchFilter searchFilter, Pagination pagination);

}
