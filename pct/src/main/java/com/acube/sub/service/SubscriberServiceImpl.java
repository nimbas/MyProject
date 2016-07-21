package com.acube.sub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.DepositGroup;
import com.acube.sub.domain.EntrContractBill;
import com.acube.sub.domain.EntrDevice;
import com.acube.sub.domain.EntrProduct;
import com.acube.sub.domain.SearchCustEntrVO;
import com.acube.sub.repository.SubscriberServiceRepository;

@Service
public class SubscriberServiceImpl implements SubscriberService {
	
	@Autowired SubscriberServiceRepository subScriberServiceRepository;
	
/*	@Override
	public int getCustAndEntrListCount(SearchFilter searchFilter) {
		return 0;
	}*/

	@Override
	public EntrContractBill getCustInfo(String searchEntrNo) {
		// TODO Auto-generated method stub
		EntrContractBill vo = null;
		vo = subScriberServiceRepository.getContractBillInfo(searchEntrNo);
		return vo;
	}

	@Override
	public String getCustNo(String searchEntrNo) {
		String custNo = subScriberServiceRepository.getCustNo(searchEntrNo);
		return custNo;
	}

	@Override
	public JQueryGrid<SearchCustEntrVO> getCustAndEntrList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<SearchCustEntrVO>(pagination, subScriberServiceRepository.getCustAndEntrList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<EntrDevice> getDeviceList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stubs
		return new JQueryGrid<EntrDevice>(pagination, subScriberServiceRepository.getDeviceList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<EntrProduct> getProductByEntrNoList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<EntrProduct>(pagination, subScriberServiceRepository.getProductByEntrNoList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<DepositGroup> getDepositThresholdByEntrNo(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<DepositGroup>(pagination, subScriberServiceRepository.getDepositThresholdByEntrNo(searchFilter, pagination));
	}

}
