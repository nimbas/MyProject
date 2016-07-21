package com.acube.common.service.code;

import java.util.List;
import java.util.Map;

import com.acube.common.domain.code.LookupCode;

public interface CodeCacheManager {
	public Map<String, List<LookupCode>> getCachedCodeList();
	public void reloadCachedAllData(String cacheName);
	public List<LookupCode> appendCache(String cacheName, LookupCode lookupCode);
	public void updateCache(String cacheName, LookupCode lookupCode);
	public void removeCache(String cacheName, LookupCode lookupCode);
	
}
