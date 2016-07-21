package com.acube.sub.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.security.service.SecurityService;
import com.acube.sub.domain.CosInfoTree;
import com.acube.sub.repository.CosInfoRepository;

@Service
@Transactional
public class CosInfoServiceImpl implements CosInfoService {
	
	private static final Logger logger = LoggerFactory.getLogger(CosInfoService.class);
	
	@Autowired CosInfoRepository cosInfoRepository;
	@Autowired SecurityService securityService;

	@Override
	public List<CosInfoTree> getCosInfoTree(){
		return cosInfoRepository.getCosInfoTree();
	}
}