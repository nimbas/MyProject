package com.acube.sub.repository;

import java.util.List;

import com.acube.sub.domain.Code;

public interface SearchCodeRepository {
	public List<Code> getServiceDomain();
	
	
	//address combobox
	public List<Code> getCityCode(Code code);
	public List<Code> getDistrictCode(Code code);
	public List<Code> getSubDistrictCode(Code code);
	public List<Code> getBuildingCode(Code code);
	public List<Code> getEntranceCode(Code code);

}
