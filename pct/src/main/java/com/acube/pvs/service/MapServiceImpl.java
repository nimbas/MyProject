package com.acube.pvs.service;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.WorkType;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsProvMap;
import com.acube.pvs.mapper.MapRepository;

@Service
@Transactional
public class MapServiceImpl implements MapService {

	@Autowired
	MapRepository mapRepository ;
	@Autowired
	ExcelService excelService;
	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsProvMap> getProvMapDefs(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsProvMap>(pagination, mapRepository.getProvMapDefs(searchFilter, pagination));
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public void processProvMapDef(PsProvMap provMap) {
		
		for(PsProvMap map : provMap.getProvMaps()){			
			map.setBaseInfo(provMap.getSysCreationDate(), provMap.getOperatorId(), provMap.getApplicationId());
			if(map.getWorkType() == WorkType.CREATE){
				this.addProvMapDef(map);
			}else if(map.getWorkType() == WorkType.DELETE){
				this.deleteProvMapDef(map);
			}
		}
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public int addProvMapDef(PsProvMap provMap) {
		int ret = 0;
		try {
			ret = mapRepository.addProvMapDef(provMap);
		} catch (DuplicateKeyException e) {
			e.printStackTrace();
			throw new AcubeException("pvs.map.key.duplicate");
		}
		return ret ;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public int deleteProvMapDef(PsProvMap provMap) {
		int ret = 0 ;
		PsParamMap paramMap = new PsParamMap();
		paramMap.setNe(provMap.getSrcNeId());
		paramMap.setCmd(provMap.getSrcCmd());
		paramMap.setFtrCd(provMap.getSrcFtrCd());
		paramMap.setBaseInfo(provMap.getSysCreationDate(), provMap.getOperatorId(), provMap.getApplicationId());
		ret = mapRepository.deleteParamMapBySource(paramMap);//delete parameter map
		if(ret > 0){
			throw new AcubeException("pvs.map.not.delete.by.param");
		}
		ret = mapRepository.deleteProvTrgtMapBySource(provMap);//delete target command
		if(ret > 0){
			throw new AcubeException("pvs.map.not.delete.by.target");
		}
		ret = mapRepository.deleteProvMapDef(provMap); // delete source command
		return ret ;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsProvMap> getProvTrgtMaps(SearchFilter searchFilter) {
		return new JQueryGrid<PsProvMap>(mapRepository.getProvTrgtMaps(searchFilter));
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public int processProvTrgtMap(PsProvMap provMapOrg) {
		List<PsProvMap> provMaps = provMapOrg.getProvMaps();
		int ret = 0;
		if(provMaps != null)
		for(PsProvMap provMap : provMaps){
			provMap.setBaseInfo(provMapOrg.getSysCreationDate(), provMapOrg.getOperatorId(), provMapOrg.getApplicationId());
			if(provMap.getWorkType() == WorkType.CREATE){
				try {
					if(provMap.getSrcNeId().equals(provMap.getTrgtNeId()) 
							&& provMap.getSrcCmd().equals(provMap.getTrgtCmd()) 
							&& provMap.getSrcFtrCd().equals(provMap.getTrgtFtrCd())){
						throw new AcubeException("pvs.map.src.trgt.equals");
					}
					ret += mapRepository.addProvTrgtMap(provMap); //prov map trgt 등록
				} catch (DuplicateKeyException e) {
					e.printStackTrace();
					throw new AcubeException("pvs.map.trgt.key.duplicate");
				}
				
			}else if(provMap.getWorkType() == WorkType.UPDATE){
				if(provMap.getSrcNeId().equals(provMap.getTrgtNeId()) 
						&& provMap.getSrcCmd().equals(provMap.getTrgtCmd()) 
						&& provMap.getSrcFtrCd().equals(provMap.getTrgtFtrCd())){
					throw new AcubeException("pvs.map.src.trgt.equals");
				}
				ret += mapRepository.updateProvTrgtMap(provMap);//prov map trgt 수정
			}else if(provMap.getWorkType() == WorkType.DELETE){
				PsParamMap paramMap = new PsParamMap();
				paramMap.setNe(provMap.getSrcNeId());
				paramMap.setCmd(provMap.getSrcCmd());
				paramMap.setFtrCd(provMap.getSrcFtrCd());
				ret = mapRepository.deleteParamMapByTrgt(paramMap);//관련 param map 삭제
				if(ret > 0){
					throw new AcubeException("pvs.map.not.delete.by.param");
				}
				ret = mapRepository.deleteProvTrgtMap(provMap);//prov map trgt삭제
			}			
		}
		return ret ;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsParamMap> getProvTargetParameterMaps(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsParamMap>(pagination, mapRepository.getProvParameterMaps(searchFilter, pagination));
	}

	
	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsParamMap> getProvSourceParameterMaps(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<PsParamMap>(pagination, mapRepository.getProvParameterMapsBySource(searchFilter, pagination));
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public int processParamMap(PsProvMap provMap) {
		List<PsParamMap> paramMaps = provMap.getParamMaps();
		int ret = 0;
		if(paramMaps != null)
		for(PsParamMap paramMap : paramMaps){
			paramMap.setBaseInfo(provMap.getSysCreationDate(), provMap.getOperatorId(), provMap.getApplicationId());
			if(paramMap.getWorkType() == WorkType.CREATE){
				ret += mapRepository.addParamMap(paramMap);//관련 param map 등록
			}else if(paramMap.getWorkType() == WorkType.UPDATE){
				ret += mapRepository.updateParamMap(paramMap);//관련 param map 수정
			}else if(paramMap.getWorkType() == WorkType.DELETE){
				ret += mapRepository.deleteParamMap(paramMap);//관련 param map 삭제
			}			
		}
		return ret ;
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<PsProvMap> getExceptionFlow(SearchFilter searchFilter) {
		return new JQueryGrid<PsProvMap>(mapRepository.getExceptionFlow(searchFilter));
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public int addProvTrgtMap(PsProvMap provMap) {
		return mapRepository.addProvTrgtMap(provMap);
	}


	/**
	* {@inheritDoc}
	*/
	@Override
	public int addParamMap(PsParamMap paramMap) {
		return mapRepository.addParamMap(paramMap);
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public void processSourceCmdForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "SourceCommad", PsProvMap.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsProvMap) {
				PsProvMap domain = (PsProvMap) obj;
				
				try {
					
					domain.setBaseInfo(workDate, operatorId, appId);

					if(StringUtils.isEmpty(domain.getSrcCmd())){
						throw new AcubeException("Command is null");
					}
					if(StringUtils.isEmpty(domain.getSrcNeId())){
						throw new AcubeException("NE ID is null");
					}
					if(StringUtils.isEmpty(domain.getSrcFtrCd())){
						throw new AcubeException("Feature Code is null");
					}
					
					//TODO : Cmd check
					//TODO : Ne check
					//TODO : ftrCd check
					this.addProvMapDef(domain);
					
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
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void processTargetCmdForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "TargetCommand", PsProvMap.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsProvMap) {
				PsProvMap domain = (PsProvMap) obj;
				
				try {
					domain.setBaseInfo(workDate, operatorId, appId);
					domain.validateExcelInfo();
					
					//TODO : src/trgtCmd check
					//TODO : src/trgtNe check
					//TODO : src/trgtFtrCd check
					//TODO : rollback ne command check
					//TODO : exception flow check
					this.addProvTrgtMap(domain);
					
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
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void processMapParameterForExcel(List<Object> list, File excelFile, Date workDate, String operatorId, String appId) {
		List<Object> objList = excelService.processExcel(excelFile, "ParameterMap", PsParamMap.class);
		list.addAll(objList);
		for (Object obj : list) {
			if (obj instanceof PsParamMap) {
				PsParamMap domain = (PsParamMap) obj;
				try {
					domain.setBaseInfo(workDate, operatorId, appId);
					domain.validateExcelInfo();
					//TODO : src/trgtCmd check
					//TODO : src/trgtNe check
					//TODO : src/trgtFtrCd check
					//TODO : toParamId,fromParamId check
					
					this.addParamMap(domain);
					
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
