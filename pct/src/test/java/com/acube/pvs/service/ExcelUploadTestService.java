/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.pvs.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.common.domain.WorkType;
import com.acube.common.exception.AcubeException;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsProd;
import com.acube.pvs.domain.PsProvCmd;
import com.acube.pvs.domain.PsProvFtr;
import com.acube.pvs.domain.PsProvMap;
import com.acube.pvs.domain.PsProvNeInfo;
import com.acube.pvs.domain.PsProvParamInfo;
import com.acube.pvs.domain.PsProvParamSeq;

/**
 *
 * @author YangByeongSub
 * @since
 *
 */
@Transactional
public class ExcelUploadTestService extends AbstractApplicationContextTest {
	@Autowired
	LogicalDateService dateService;
	@Autowired
	ExcelService excelService;
	@Autowired
	NeService neService;
	@Autowired
	ProdFeatureService featureService;
	@Autowired
	ParameterService parameterService;
	@Autowired
	CommandService commandService;
	@Autowired
	MapService mapService;

	
	/**
	 * Ne 등록 테스트
	 */
	//@Test
	public void processNeRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "ne", PsProvNeInfo.class);
		for (Object obj : list) {
			if (obj instanceof PsProvNeInfo) {
				PsProvNeInfo provNeInfo = (PsProvNeInfo) obj;
				provNeInfo.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processNeRegistTest");
				System.out.println(provNeInfo.toString());
				neService.addProvNeInfo(provNeInfo.validateExcelInfo());
			}
		}
	}

	/**
	 * Feature 등록 테스트
	 */
	//@Test
	public void processFeatureRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "feature", PsProvFtr.class);
		for (Object obj : list) {
			if (obj instanceof PsProvFtr) {
				PsProvFtr domain = (PsProvFtr) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processFeatureRegistTest");
				System.out.println(domain.toString());
				featureService.addProvFeatur(domain.validateExcelInfo());
			}
		}
	}
	
	/**
	 * Product 별 Feature 등록 테스트
	 */
	//@Test
	public void processProdFeatureRegistTest() {
		
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "prodFeature", PsProvFtr.class);
		String prodCd = null ;
		List<PsProvFtr> ftrs = new ArrayList<PsProvFtr>();
		
		for (int i =0 ; i<list.size();i++) {
			Object obj = list.get(i);
			if (obj instanceof PsProvFtr) {
				PsProvFtr domain = (PsProvFtr) obj;
				domain.setWorkType(WorkType.CREATE);
				
				System.out.println(domain.toString());
				
				if(prodCd != null && !prodCd.equals(domain.getProdCd())){
					PsProd prod = new PsProd();
					prod.setProdCd(prodCd);
					prod.setFeatures(ftrs);
					prod.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processProdFeatureRegistTest");
					
					//TODO : product validation
					featureService.addProvFeatureByProduct(prod);
					
					ftrs = new ArrayList<PsProvFtr>();
					prod.setFeatures(ftrs);
					ftrs.add(domain);
					prodCd = domain.getProdCd();
					
					//마지막건이면 저장한다.
					if(i == list.size()-1){
						prod.setProdCd(prodCd);
						
						//TODO : product validation
						featureService.addProvFeatureByProduct(prod);
					}
				}else{
					
					ftrs.add(domain);
					prodCd = domain.getProdCd();
					
					//마지막건이면 저장한다.
					if(i == list.size()-1){
						PsProd prod = new PsProd();
						prod.setProdCd(prodCd);
						prod.setFeatures(ftrs);
						prod.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processProdFeatureRegistTest");
						
						//TODO : product validation
						featureService.addProvFeatureByProduct(prod);
						
					}
				}
			}
		}		
	}
	
	/**
	 * Parameter 등록 테스트
	 */
	//@Test
	public void processParameterRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "parameter", PsProvParamInfo.class);
		for (Object obj : list) {
			if (obj instanceof PsProvParamInfo) {
				PsProvParamInfo domain = (PsProvParamInfo) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processParameterRegistTest");
				domain.validateExcelInfo();
				System.out.println(domain.toString());
				
				//TODO : Ne check
				parameterService.addProvParamInfo(domain); 				
			}
		}
	}
	
	/**
	 * Command 등록 테스트
	 */
	//@Test
	public void processCommandRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "command", PsProvCmd.class);
		for (Object obj : list) {
			if (obj instanceof PsProvCmd) {
				PsProvCmd domain = (PsProvCmd) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processCommandRegistTest");
				domain.validateExcelInfo();
				System.out.println(domain.toString());
				
				//TODO : Ne check
				commandService.addProvCommand(domain); 				
			}
		}
	}
	
	/*
	 * Command Parameter 등록테스트
	 */
	//@Test
	public void processCmdParamRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "cmdParameter", PsProvParamSeq.class);
		for (Object obj : list) {
			if (obj instanceof PsProvParamSeq) {
				PsProvParamSeq domain = (PsProvParamSeq) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processCommandRegistTest");
				domain.validateExcelInfo();
				System.out.println(domain.toString());
				
				//TODO : Ne check
				//TODO : ftrCd check
				parameterService.addProvParamSeq(domain);
			}
		}
	}
	
	/*
	 * Source Command 등록테스트
	 */
	//@Test
	public void processSourceCmdRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "sourceCmd", PsProvMap.class);
		for (Object obj : list) {
			if (obj instanceof PsProvMap) {
				PsProvMap domain = (PsProvMap) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processSourceCmdRegistTest");

				if(StringUtils.isEmpty(domain.getSrcCmd())){
					throw new AcubeException("Command is null");
				}
				if(StringUtils.isEmpty(domain.getSrcNeId())){
					throw new AcubeException("NE ID is null");
				}
				if(StringUtils.isEmpty(domain.getSrcFtrCd())){
					throw new AcubeException("Feature Code is null");
				}
				System.out.println(domain.toString());
				
				//TODO : Cmd check
				//TODO : Ne check
				//TODO : ftrCd check
				mapService.addProvMapDef(domain);
			}
		}
	}
	
	/*
	 * Target Command 등록테스트
	 */
	//@Test
	public void processTargetCmdRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "targetCmd", PsProvMap.class);
		for (Object obj : list) {
			if (obj instanceof PsProvMap) {
				PsProvMap domain = (PsProvMap) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processSourceCmdRegistTest");

				domain.validateExcelInfo();
				System.out.println(domain.toString());
				
				//TODO : src/trgtCmd check
				//TODO : src/trgtNe check
				//TODO : src/trgtFtrCd check
				//TODO : rollback ne command check
				//TODO : exception flow check
				mapService.addProvTrgtMap(domain);
			}
		}
	}
	
	//@Test
	/*
	 * Parameter Map 등록테스트
	 */
	public void processMapParameterRegistTest() {
		List<Object> list = excelService.processExcel(new File("C:/Users/heaven/Desktop/pvsUploadSample.xlsx"), "mapParameter", PsParamMap.class);
		for (Object obj : list) {
			if (obj instanceof PsParamMap) {
				PsParamMap domain = (PsParamMap) obj;
				domain.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processMapParameterRegistTest");

				domain.validateExcelInfo();
				System.out.println(domain.toString());
				
				//TODO : src/trgtCmd check
				//TODO : src/trgtNe check
				//TODO : src/trgtFtrCd check
				//TODO : toParamId,fromParamId check
				
				mapService.addParamMap(domain);
			}
		}
	}
}
