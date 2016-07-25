package com.acube.common.mapper.code;

import java.util.List;

import com.acube.common.domain.code.LookupCode;
import com.acube.sub.domain.Code;


public interface CodeRepository {
	public LookupCode getCode(LookupCode lookupCode);
	public List<LookupCode> getCodeTypeList(String language);
	public List<LookupCode> getCodeList(LookupCode lookupCode);
	public List<LookupCode> getAllCodeList();
	
	/**
	 * 
	 * Create by JG
	 */
	public List<LookupCode> getAllCodeMgtList();
	public List<LookupCode> getSingleCodeMgtData(LookupCode lookupCode);
	public List<LookupCode> getAllCodeMgtListforTreeView(String language);
	
	public List<LookupCode> getCodeGroupMgtData(String language);
	
	public int addSingleCodeMgtData(LookupCode lookupCode);
	public int updateSingleCodeMgtData(LookupCode lookupCode);
	public int deleteCodeMgtData(LookupCode lookupCode);
	
}