package com.acube.pvs.web.mvc.monitor;
 
import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsProvFtr;
import com.acube.pvs.service.ProdFeatureService;

public class ProvFeatureTest extends AbstractApplicationContextTest {
	
	private final static Logger logger = LoggerFactory.getLogger(ProvFeatureTest.class);
	
	@Autowired ProdFeatureService 	prodFeatureService;
	@Autowired LogicalDateService 	dateService;
	
	//@Test
	public void addFeature(){
		Date workDate = dateService.getCurrentDate() ;
		PsProvFtr provFtr = new PsProvFtr();
		provFtr.setFtrCd("testCd");
		provFtr.setDescr("description");
		provFtr.setNeId("testNeId");
		provFtr.setSrcTrgtInd("S");
		provFtr.setSvcDomain("2");
		provFtr.setBaseInfo(workDate, "bsyang", "processFeature");
		provFtr.setAplyFlag("1");
		provFtr.setCommonUseFlag("1");
		provFtr.setFtrKdCd("ddd");
		provFtr.setFtrPrty(1);
		provFtr.setIsBssProv("1");
		provFtr.setIsSuspend("1");
		provFtr.setIsUserDefine("1");
		provFtr.setProvNeId("111");
		prodFeatureService.addProvFeatur(provFtr);
	}
	
	public void deleteFeature(){
		PsProvFtr provFtr = new PsProvFtr();
		provFtr.setFtrCd("testCd");
		provFtr.setDescr("description");
		provFtr.setNeId("testNeId");
		provFtr.setSrcTrgtInd("S");
		provFtr.setSvcDomain("2");
		provFtr.setBaseInfo(dateService.getCurrentDate(), "bsyang", "processFeature");
		int result = prodFeatureService.deleteProvFeatur(provFtr);
	}
 }