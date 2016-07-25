package com.acube.sub.repository;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.MemoKind;
import com.acube.sub.domain.OperatorInfo;


public interface WorkHistoryDialogRepository {

	public List<MemoKind> getSelectCategory(MemoKind memoKind);
	
	public List<MemoKind> getCbProductNo(String entrNo);
	
	public List<OperatorInfo> getOperatorInfo(SearchFilter searchFilter, Pagination pagination);
	
	public List<MemoKind> getWorkHistoryInfo(SearchFilter searchFilter, Pagination pagination);

}
