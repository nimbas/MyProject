package com.acube.sub.repository;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.Counsel;



public interface CounselRepository {
	public List<Counsel> getCounselList(SearchFilter searchFilter, Pagination pagination) ;
	
	public int addCounselInfo(Counsel counsel) ;	
	public int addCounselCustInfo(Counsel counsel) ;	

}
