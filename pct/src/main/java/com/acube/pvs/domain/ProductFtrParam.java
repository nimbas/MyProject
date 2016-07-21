package com.acube.pvs.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class ProductFtrParam extends BaseDomain implements Serializable, Cloneable{
private static final long serialVersionUID = 8906738555609464072L;
	

	private String provFtrCd; 
	private String pvParamId;  
	private String userDefValue;
	private String paramSeqNo;
	private String manatoryFlag;
	private String paramType;
	private String neId;
	private String defValue;
	private String descr;
	public String getProvFtrCd() {
		return provFtrCd;
	}
	public void setProvFtrCd(String provFtrCd) {
		this.provFtrCd = provFtrCd;
	}
	public String getPvParamId() {
		return pvParamId;
	}
	public void setPvParamId(String pvParamId) {
		this.pvParamId = pvParamId;
	}
	public String getUserDefValue() {
		return userDefValue;
	}
	public void setUserDefValue(String userDefValue) {
		this.userDefValue = userDefValue;
	}
	public String getParamSeqNo() {
		return paramSeqNo;
	}
	public void setParamSeqNo(String paramSeqNo) {
		this.paramSeqNo = paramSeqNo;
	}
	public String getManatoryFlag() {
		return manatoryFlag;
	}
	public void setManatoryFlag(String manatoryFlag) {
		this.manatoryFlag = manatoryFlag;
	}
	public String getParamType() {
		return paramType;
	}
	public void setParamType(String paramType) {
		this.paramType = paramType;
	}
	public String getNeId() {
		return neId;
	}
	public void setNeId(String neId) {
		this.neId = neId;
	}
	public String getDefValue() {
		return defValue;
	}
	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
}
