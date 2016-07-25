package com.acube.pvs.domain;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsProvFtr extends BaseDomain implements Serializable{
    
    /*  */
	private static final long serialVersionUID = 8369208170520426655L;
	private String ftrCd;
    private String svcDomain;
    private String neId;
    private String srcTrgtInd;
    private String isUserDefine;
    private String isBssProv;
    private int    maxParamCnt;
    private String descr;
    private String commonUseFlag;
    private String isSuspend;
    private String provNeId;
    private int    ftrPrty;
    private String ftrKdCd;
    private String prodCd;//엑셀 임포트용
    private PsProd prod ;
    private PsProvNeInfo provNeInfo;
    private String aplyFlag ;
	public String getFtrCd() {
		return ftrCd;
	}
	public void setFtrCd(String ftrCd) {
		this.ftrCd = ftrCd;
	}
	public String getSvcDomain() {
		return svcDomain;
	}
	public void setSvcDomain(String svcDomain) {
		this.svcDomain = svcDomain;
	}
	public String getNeId() {
		return neId;
	}
	public void setNeId(String neId) {
		this.neId = neId;
	}
	public String getSrcTrgtInd() {
		return srcTrgtInd;
	}
	public void setSrcTrgtInd(String srcTrgtInd) {
		this.srcTrgtInd = srcTrgtInd;
	}
	public String getIsUserDefine() {
		return isUserDefine;
	}
	public void setIsUserDefine(String isUserDefine) {
		this.isUserDefine = isUserDefine;
	}
	public String getIsBssProv() {
		return isBssProv;
	}
	public void setIsBssProv(String isBssProv) {
		this.isBssProv = isBssProv;
	}
	public int getMaxParamCnt() {
		return maxParamCnt;
	}
	public void setMaxParamCnt(int maxParamCnt) {
		this.maxParamCnt = maxParamCnt;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public String getCommonUseFlag() {
		return commonUseFlag;
	}
	public void setCommonUseFlag(String commonUseFlag) {
		this.commonUseFlag = commonUseFlag;
	}
	public String getIsSuspend() {
		return isSuspend;
	}
	public void setIsSuspend(String isSuspend) {
		this.isSuspend = isSuspend;
	}
	public String getProvNeId() {
		return provNeId;
	}
	public void setProvNeId(String provNeId) {
		this.provNeId = provNeId;
	}
	public int getFtrPrty() {
		return ftrPrty;
	}
	public void setFtrPrty(int ftrPrty) {
		this.ftrPrty = ftrPrty;
	}
	public String getFtrKdCd() {
		return ftrKdCd;
	}
	public void setFtrKdCd(String ftrKdCd) {
		this.ftrKdCd = ftrKdCd;
	}
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public PsProd getProd() {
		return prod;
	}
	public void setProd(PsProd prod) {
		this.prod = prod;
	}
	public PsProvNeInfo getProvNeInfo() {
		return provNeInfo;
	}
	public void setProvNeInfo(PsProvNeInfo provNeInfo) {
		this.provNeInfo = provNeInfo;
	}
	public String isAplyFlag() {
		return aplyFlag;
	}
	public void setAplyFlag(String aplyFlag) {
		this.aplyFlag = aplyFlag;
	}
	@Override
	public String toString() {
		return "PsProvFtr [ftrCd=" + ftrCd + ", svcDomain=" + svcDomain + ", neId=" + neId + ", srcTrgtInd=" + srcTrgtInd + ", isUserDefine=" + isUserDefine + ", isBssProv=" + isBssProv + ", maxParamCnt=" + maxParamCnt + ", descr=" + descr + ", commonUseFlag=" + commonUseFlag + ", isSuspend="
				+ isSuspend + ", provNeId=" + provNeId + ", ftrPrty=" + ftrPrty + ", ftrKdCd=" + ftrKdCd + ", prod=" + prod + ", provNeInfo=" + provNeInfo + ", aplyFlag=" + aplyFlag + "]";
	}
	
	public PsProvFtr validateExcelInfo(){
		if(StringUtils.isEmpty(this.ftrCd)){
			throw new AcubeException("Feature Code is null");
		}
		if(StringUtils.isEmpty(this.neId)){
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(this.svcDomain)){
			throw new AcubeException("Service Domain is null");
		}
		if(StringUtils.isEmpty(this.srcTrgtInd)){
			throw new AcubeException("Target/Source is null");
		}
		return this; 
	}
}