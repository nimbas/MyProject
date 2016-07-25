/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.service.co;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.acube.common.mapper.co.LogicalDateRepository;

/**
 *
 * @author YangByeongSub
 * @since
 *
 */
@Service
public class LogicalDateServiceImpl implements LogicalDateService{
	@Autowired LogicalDateRepository logicalDateRepository;

	/**
	* {@inheritDoc}
	*/
	@Override
	public Date getCurrentDate() {
		return logicalDateRepository.getCurrentDate();
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getCurrentDateFormat() {
		return getCurrentDateFormat(null);
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public String getCurrentDateFormat(String pattern) {
		if(StringUtils.isEmpty(pattern )){
			pattern = "yyyy-MM-dd HH:mm:ss";
		}
		Date date = logicalDateRepository.getCurrentDate();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern) ;
		return sdf.format(date);
	}
}
