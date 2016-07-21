package com.acube.pvs.service.monitor;

import java.math.BigDecimal;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.mapper.mbg.PsUiAlarmConfMapper;

@Transactional
public class TransactionTest extends AbstractApplicationContextTest {

	private static final Logger logger = LoggerFactory.getLogger(TransactionTest.class);

	@Resource(name="psUiAlarmConfMapper")
	PsUiAlarmConfMapper psUiAlarmConfMapper;

	//@Test
	public void saveAndErrorRollback() throws Exception {
		
		PsUiAlarmConf a = new PsUiAlarmConf();
		a.setId("6");
		a.setStatus("test");
		a.setMin(new BigDecimal(4));
		a.setMax(new BigDecimal(5));
		a.setColor("co");
		
		psUiAlarmConfMapper.insert(a);
		
		psUiAlarmConfMapper.insert(a);
		
		//throw new Exception("user test");
		
	}


}
