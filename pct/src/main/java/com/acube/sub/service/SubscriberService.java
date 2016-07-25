package com.acube.sub.service;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.DepositGroup;
import com.acube.sub.domain.EntrContractBill;
import com.acube.sub.domain.EntrDevice;
import com.acube.sub.domain.EntrProduct;
import com.acube.sub.domain.SearchCustEntrVO;

public interface SubscriberService {
	// count
	// public int getCustAndEntrListCount(SearchFilter  searchFilter);
	
	// customer Info
	public EntrContractBill getCustInfo(String searchEntrNo);
	
	// custNo
	public String getCustNo(String searchEntrNo);
	
	public JQueryGrid<SearchCustEntrVO> getCustAndEntrList(SearchFilter searchFilter, Pagination pagination);
	
	public JQueryGrid<EntrDevice> getDeviceList(SearchFilter searchFilter, Pagination pagination);
	
	public JQueryGrid<EntrProduct> getProductByEntrNoList(SearchFilter searchFilter, Pagination pagination);
	
	public JQueryGrid<DepositGroup> getDepositThresholdByEntrNo(SearchFilter searchFilter, Pagination pagination);

}
