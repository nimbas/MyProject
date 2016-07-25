package com.acube.sub.service;


import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.Counsel;
import com.acube.sub.domain.CounselInfo;

public interface CounselService {
	public JQueryGrid<Counsel> getCounselList(SearchFilter searchFilter, Pagination pagination) ;
	
	public int registCounselInfo(Counsel counsel) ;

}
