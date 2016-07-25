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
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.mapper.CommandRepository;
import com.acube.pvs.mapper.ParameterRepository;

@Service
@Transactional
public class CommandServiceImpl implements CommandService {

	@Autowired
	CommandRepository commandRepository;
	
	@Autowired
	ParameterRepository parameterRepository;
	
	@Autowired
	ExcelService excelService;
	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvCmd> getProvCommands(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsProvCmd>(pagination, commandRepository.getProvCommands(searchFilter, pagination));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvCmd> getProvCommands(SearchFilter searchFilter) {
		return new JQueryGrid<PsProvCmd>(commandRepository.getProvCommands(searchFilter));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PsProvCmd getProvCommand(PsProvCmd provCmd) {
		return commandRepository.getProvCommand(provCmd);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int addProvCommand(PsProvCmd provCmd) {
		return commandRepository.addProvCommand(provCmd);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateProvCommand(PsProvCmd provCmd) {
		return commandRepository.updateProvCommand(provCmd);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteProvCommand(PsProvCmd provCmd) {
		int ret = commandRepository.deleteProvCommand(provCmd);
		if (ret == 0) {
			throw new AcubeException("pvs.cmd.not.delete");
		}
		//command 삭제시 맵핑되어 있는 param_seq도 함께 지운다.
		ret += parameterRepository.deleteBatchProvParamSeq(provCmd);
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void processCommandForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "Command", PsProvCmd.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsProvCmd) {
				PsProvCmd domain = (PsProvCmd) obj;
				try {
					domain.setBaseInfo(workDate, operatorId, appId);
					domain.validateExcelInfo();
					
					//TODO : Ne check
					this.addProvCommand(domain); 
					
				} catch (DuplicateKeyException e) {
					domain.setResult(new Result(ResultCode.FAIL, "Duplicated Key!"));
					throw new AcubeException(e.toString());
				} catch (AcubeException e) {
					domain.setResult(new Result(ResultCode.FAIL, e.getMessage()));
					throw e;
				} 
			}
		}
	}
}
