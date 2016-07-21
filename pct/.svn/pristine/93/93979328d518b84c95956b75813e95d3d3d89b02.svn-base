package com.acube.sub.service;

import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.MemoKind;
import com.acube.sub.domain.OperatorInfo;

public interface WorkHistoryDialogService {

	public List<MemoKind> getSelectCategory(MemoKind memoKind);
	
	public List<MemoKind> getCbProductNo(String entrNo);
	
	public JQueryGrid<OperatorInfo> getOperatorInfo(SearchFilter searchFilter, Pagination pagination);
	
	public JQueryGrid<MemoKind> getWorkHistoryInfo(SearchFilter searchFilter, Pagination pagination);
	
	public void insertUserMemo( String sessionId, MemoKind memo );
	
}
