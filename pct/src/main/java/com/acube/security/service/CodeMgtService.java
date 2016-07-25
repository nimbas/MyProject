package com.acube.security.service;

import java.util.List;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.code.LookupCode;

public interface CodeMgtService {
	public List<LookupCode> getAllCodeList();
	public List<LookupCode> getSingleCodeData(LookupCode lookupCode);
	public List<JsTree> getAllCodeListforTreeView(String language);
	
	public void addSingleCodeData(LookupCode lookupCode);
	public void updateSingleCodeData(LookupCode lookupCode);
	public void deleteCodeData(LookupCode lookupCode);
}
