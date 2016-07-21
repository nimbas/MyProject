package com.acube.common.service.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.code.LookupCode;
import com.acube.common.mapper.code.CodeRepository;


@Service
@Transactional
public class CodeServiceImpl implements CodeService {
	
	private static final Logger logger = LoggerFactory.getLogger(CodeServiceImpl.class);
	@Autowired CodeRepository codeRepository;
	@Autowired CodeCacheManager codeCacheManager;
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public Map<String, List<LookupCode>> cacheCodeData() {
		// 기본 코드에 대해 캐싱 수행
		Map<String, List<LookupCode>> cacheCode = new HashMap<String, List<LookupCode>>();
		
		/*List<LookupCode> codeTypeList = codeRepository.getCodeTypeList("en");
		List<LookupCode> lookupCodes = codeRepository.getAllCodeList();
		
		for (LookupCode lookupCode : codeTypeList) {
			
			//모든 코드를 한번에 가져와서 필터링. 
			cacheCode.put(lookupCode.getCodeGroup(), getCurCodeList(lookupCodes, lookupCode.getCodeGroup())) ;

			//코드그룹을 매번 db에서 조회하여 캐시 할때
			//lookupCode.setLanguage("ALL");
			//cacheCode.put(lookupCode.getCodeGroup(), codeRepository.getCodeList(lookupCode)); 
		}*/
		return cacheCode ;
	}
	
		
	/**
	* {@inheritDoc}
	*/
	@Override
	public LookupCode getCodeNameFromCache(LookupCode lookupCode) {
		List<LookupCode> codeList = codeCacheManager.getCachedCodeList().get(lookupCode.getCodeGroup());
		if(codeList != null){
			for (LookupCode code : codeList) {
				if(lookupCode.getCode().equals(code.getCode()) && lookupCode.getLanguage().equals(code.getLanguage())){
					return code;
				}
			}
		}else{
			codeList = codeCacheManager.appendCache("codeList", lookupCode);
			for (LookupCode code : codeList) {
				if(lookupCode.getCode().equals(code.getCode()) && lookupCode.getLanguage().equals(code.getLanguage())){
					return code;
				}
			}
		}
		return null;
	}
	
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public List<LookupCode> getCodeListFromCache(LookupCode lookupCode) {
		List<LookupCode> codeList = codeCacheManager.getCachedCodeList().get(lookupCode.getCodeGroup());
		List<LookupCode> retCodeList = new ArrayList<LookupCode>();
		if(codeList != null){
			for (LookupCode code : codeList) {
				if(lookupCode.getLanguage().equals(code.getLanguage())){
					retCodeList.add(code);
				}
			}
			return retCodeList;
		}else{
			codeList = codeCacheManager.appendCache("codeList", lookupCode);
			for (LookupCode code : codeList) {
				if(lookupCode.getLanguage().equals(code.getLanguage())){
					retCodeList.add(code);
				}
			}
			return retCodeList;
		}
		//return null;
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public List<LookupCode> getCodeList(LookupCode lookupCode) {
		return codeRepository.getCodeList(lookupCode);
	}
}

