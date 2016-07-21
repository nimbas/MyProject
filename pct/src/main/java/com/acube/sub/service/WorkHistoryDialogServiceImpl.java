package com.acube.sub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.sub.domain.EntrInfo;
import com.acube.sub.domain.MemoKind;
import com.acube.sub.domain.OperatorInfo;
import com.acube.sub.repository.EntrInfoRepository;
import com.acube.sub.repository.WorkHistoryDialogRepository;

@Service
public class WorkHistoryDialogServiceImpl implements WorkHistoryDialogService {
	
	@Autowired WorkHistoryDialogRepository workHistoryDialogRepository;
	@Autowired EntrInfoRepository entrInfoRepository;

	@Override
	public List<MemoKind> getSelectCategory(MemoKind memoKind) {

			return  workHistoryDialogRepository.getSelectCategory(memoKind);
			
	}
	
	@Override
	public List<MemoKind> getCbProductNo(String entrNo) {

			return  workHistoryDialogRepository.getCbProductNo(entrNo);
			
	}
	
	@Override
	public JQueryGrid<OperatorInfo> getOperatorInfo(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<OperatorInfo>(pagination, workHistoryDialogRepository.getOperatorInfo(searchFilter, pagination));
	}
	
	@Override
	public JQueryGrid<MemoKind> getWorkHistoryInfo(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<MemoKind>(pagination, workHistoryDialogRepository.getWorkHistoryInfo(searchFilter, pagination));
	}
	
	@Override
	public void insertUserMemo( String sessionId, MemoKind memo ){
		EntrInfo entr = entrInfoRepository.getEntrInfo(memo.getProdNo());
	}
}
