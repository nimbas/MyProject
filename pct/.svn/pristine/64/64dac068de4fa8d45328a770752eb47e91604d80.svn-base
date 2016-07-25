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
import com.acube.common.domain.WorkType;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.common.util.ResourceUtil;
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.domain.PsProvEnum;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.domain.PsProvParamInfo;
import com.acube.pvs.domain.PsProvParamSeq;
import com.acube.pvs.mapper.ParameterRepository;

@Service
@Transactional
public class ParameterServiceImpl implements ParameterService {

	@Autowired
	ParameterRepository parameterRepository;
	@Autowired
	ExcelService excelService;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvParamInfo> getProvParamInfos(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsProvParamInfo>(pagination, parameterRepository.getProvParamInfos(searchFilter, pagination));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PsProvParamInfo getProvParamInfo(PsProvNeInfo provNeInfo) {
		return parameterRepository.getProvParamInfo(provNeInfo);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int addProvParamInfo(PsProvParamInfo provParamInfo) {
		int ret;
		try {
			ret = parameterRepository.addProvParamInfo(provParamInfo);
		} catch (DuplicateKeyException e) {
			e.printStackTrace();
			throw new AcubeException("pvs.param.key.duplicate");
		}
		if (provParamInfo.getProvEnums() != null) {
			for (PsProvEnum provEnum : provParamInfo.getProvEnums()) {
				try {
					parameterRepository.addParamEnum(provEnum);
				} catch (DuplicateKeyException e) {
					throw new AcubeException("pvs.param_enum.key.duplicate");
				}
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateProvParamInfo(PsProvParamInfo provParamInfo) {
		int ret = 0;
		if (provParamInfo.getWorkType() == WorkType.UPDATE) {
			ret = parameterRepository.updateProvParamInfo(provParamInfo);
		}
		if (provParamInfo.getProvEnums() != null) {
			for (PsProvEnum provEnum : provParamInfo.getProvEnums()) {
				provEnum.setBaseInfo(provParamInfo.getSysCreationDate(), provParamInfo.getOperatorId(), provParamInfo.getApplicationId());
				if (provEnum.getWorkType() == WorkType.CREATE) {
					parameterRepository.addParamEnum(provEnum);
				} else if (provEnum.getWorkType() == WorkType.UPDATE) {
					parameterRepository.updateParamEnum(provEnum);
				} else if (provEnum.getWorkType() == WorkType.DELETE) {
					parameterRepository.deleteParamEnum(provEnum);
				}
			}
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int deleteProvParamInfo(PsProvParamInfo provParamInfo) {
		int ret = 0;
		if (provParamInfo.getWorkType() == WorkType.DELETE) {
			ret = parameterRepository.deleteProvParamInfo(provParamInfo);
			parameterRepository.deleteBatchEnum(provParamInfo);
		}
		return ret;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvEnum> getProvParamEnums(PsProvEnum provEnum) {
		return new JQueryGrid<PsProvEnum>(parameterRepository.getProvParamEnums(provEnum));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<PsProvParamSeq> getProvParamSeqs(SearchFilter searchFilter) {
		return new JQueryGrid<PsProvParamSeq>(parameterRepository.getProvParamSeqs(searchFilter));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PsProvParamSeq getProvParamSeq(PsProvParamSeq provParamSeq) {
		return parameterRepository.getProvParamSeq(provParamSeq);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int processProvCommandParameter(PsProvCmd provCmd) {
		List<PsProvParamSeq> provParamSeqs = provCmd.getProvParamSeqs();
		int ret = 0;
		if (provParamSeqs != null) {
			for (PsProvParamSeq provParamSeq : provParamSeqs) {
				provParamSeq.setBaseInfo(provCmd.getSysCreationDate(), provParamSeq.getOperatorId(), provParamSeq.getApplicationId());
				if (provParamSeq.getWorkType() == WorkType.CREATE) {
					ret += parameterRepository.addProvParamSeq(provParamSeq);
				} else if (provParamSeq.getWorkType() == WorkType.UPDATE) {
					ret += parameterRepository.updateProvParamSeq(provParamSeq);
				} else if (provParamSeq.getWorkType() == WorkType.DELETE) {
					ret += parameterRepository.deleteProvParamSeq(provParamSeq);
				}
			}
		}
		return ret;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public int addProvParamSeq(PsProvParamSeq provParamSeq) {
		return parameterRepository.addProvParamSeq(provParamSeq);
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public void processCmdParamForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "CommandParameter", PsProvParamSeq.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsProvParamSeq) {
				PsProvParamSeq domain = (PsProvParamSeq) obj;
				try {

					domain.setBaseInfo(workDate, operatorId, appId);
					domain.validateExcelInfo();
					
					//TODO : Ne check
					//TODO : ftrCd check
					this.addProvParamSeq(domain);
				} catch (DuplicateKeyException e) {
					domain.setResult(new Result(ResultCode.FAIL, "Duplicated Key!"));
					throw new AcubeException(e.toString());
				} catch (AcubeException e) {
					String messageId = e.getMessage();
					String message = messageId;
					domain.setResult(new Result(ResultCode.FAIL, message));
					if(messageId.equals("pvs.param.key.duplicate") || messageId.equals("pvs.param_enum.key.duplicate")){
						message = ResourceUtil.getMessage(messageId);
						domain.setResult(new Result(ResultCode.FAIL, message));
					}
					throw new AcubeException(messageId, message);
				}
			}
		}
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void processParameterForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "Parameter", PsProvParamInfo.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsProvParamInfo) {
				PsProvParamInfo domain = (PsProvParamInfo) obj;
				
				try {
					domain.setBaseInfo(workDate, operatorId, appId);
					domain.validateExcelInfo();
					
					//TODO : Ne check
					this.addProvParamInfo(domain); 
				} catch (AcubeException e) {
					String messageId = e.getMessage();
					String message = messageId;
					domain.setResult(new Result(ResultCode.FAIL, message));
					if(messageId.equals("pvs.param.key.duplicate") || messageId.equals("pvs.param_enum.key.duplicate")){
						message = ResourceUtil.getMessage(messageId);
						domain.setResult(new Result(ResultCode.FAIL, message));
					}
					throw new AcubeException(messageId, message);
				}
			}
		}
	}
}
