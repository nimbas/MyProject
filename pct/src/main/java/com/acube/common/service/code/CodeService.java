package com.acube.common.service.code;
import java.util.List;
import java.util.Map;

import com.acube.common.domain.code.LookupCode;

public interface CodeService {
	
	public Map<String, List<LookupCode>> cacheCodeData(); //캐시된 코드 목록 
	public LookupCode getCodeNameFromCache(LookupCode lookupCode); //캐시된 코드에서 코드 가져오기
	public List<LookupCode> getCodeListFromCache(LookupCode lookupCode);//캐시된 코드에서 코드목록 가져오기
	public List<LookupCode> getCodeList(LookupCode lookupCode);
}