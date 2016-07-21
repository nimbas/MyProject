package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.common.util.ResourceUtil;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.mapper.NeRepository;

@Service
@Transactional
public class NeServiceImpl implements NeService {

	@Autowired
	NeRepository neRepository;
	@Autowired
	ExcelService excelService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsProvNeInfo>(pagination, neRepository.getProvNeInfos(searchFilter, pagination));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvNeInfo> getProvNeInfos(SearchFilter searchFilter) {
		return new JQueryGrid<PsProvNeInfo>(neRepository.getProvNeInfos(searchFilter));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PsProvNeInfo getProvNeInfo(PsProvNeInfo provNeInfo) {
		return neRepository.getProvNeInfo(provNeInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int addProvNeInfo(PsProvNeInfo provNeInfo) {
		int ret = 0;
		try {
			ret = neRepository.addProvNeInfo(provNeInfo);
		} catch (DuplicateKeyException e) {
			throw new AcubeException("pvs.ne.key.duplicate");
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateProveNeInfo(PsProvNeInfo provNeInfo) {
		return neRepository.updateProveNeInfo(provNeInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteProveNeInfo(PsProvNeInfo provNeInfo) {
		int delCnt = neRepository.deleteProveNeInfo(provNeInfo);
		if (delCnt == 0) {
			throw new AcubeException("pvs.ne.not.delete");
		}
		return delCnt;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void processNeForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "NetworkElement", PsProvNeInfo.class);
		list.addAll(objList);
		
		for (Object obj : list) {
			if (obj instanceof PsProvNeInfo) {
				PsProvNeInfo domain = (PsProvNeInfo) obj;
				domain.setBaseInfo(workDate, operatorId, appId);
				try {
					this.addProvNeInfo(domain.validateExcelInfo());
				} catch (AcubeException e) {
					String messageId = e.getMessage();
					String message = messageId;
					if(messageId.equals("pvs.ne.key.duplicate")){
						message = ResourceUtil.getMessage(messageId);
						domain.setResult(new Result(ResultCode.FAIL, message));
					}
					throw new AcubeException(messageId, message);
				}				
			}
		}
	}
}
