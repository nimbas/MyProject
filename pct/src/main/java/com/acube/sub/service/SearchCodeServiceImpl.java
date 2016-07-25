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

	@Override
	public List<Code> getCityCode(Code code) {
		// TODO Auto-generated method stub
		return searchCodeRepository.getCityCode(code);
	}

	@Override
	public List<Code> getDistrictCode(Code code) {
		// TODO Auto-generated method stub
		return searchCodeRepository.getDistrictCode(code);
	}

	@Override
	public List<Code> getSubDistrictCode(Code code) {
		// TODO Auto-generated method stub
		return searchCodeRepository.getSubDistrictCode(code);
	}

	@Override
	public List<Code> getBuildingCode(Code code) {
		// TODO Auto-generated method stub
		return searchCodeRepository.getBuildingCode(code);
	}

	@Override
	public List<Code> getEntranceCode(Code code) {
		// TODO Auto-generated method stub
		return searchCodeRepository.getEntranceCode(code);
	}

}
