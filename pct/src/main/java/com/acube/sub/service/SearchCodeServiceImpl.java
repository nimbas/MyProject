package com.acube.sub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.sub.domain.Code;
import com.acube.sub.repository.SearchCodeRepository;

@Service
@Transactional
public class SearchCodeServiceImpl implements SearchCodeService{
	
	@Autowired SearchCodeRepository searchCodeRepository;

	@Override
	public List<Code> getServiceDomain() {
		
		return searchCodeRepository.getServiceDomain();
	}

}
