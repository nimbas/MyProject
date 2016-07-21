package com.acube.pvs.domain;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.exception.AcubeException;

public class PsProvNeInfo extends BaseDomain implements Serializable{
    
    /*  */
	private static final long serialVersionUID = 346299186946905827L;
	private String neId;
    private String svcDomain;
    private String srcTrgtInd;
    private String ipAddr;
    private int portNo;
    private String scndIpAddr;
    private int scndPortNo;
    private String userId;
    private String passwd;
    private String mgmtBand;
	public String getNeId() {
		return neId;
	}
	public void setNeId(String neId) {
		this.neId = neId;
	}
	public String getSvcDomain() {
		return svcDomain;
	}
	public void setSvcDomain(String svcDomain) {
		this.svcDomain = svcDomain;
	}
	public String getSrcTrgtInd() {
		return srcTrgtInd;
	}
	public void setSrcTrgtInd(String srcTrgtInd) {
		this.srcTrgtInd = srcTrgtInd;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public int getPortNo() {
		return portNo;
	}
	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}
	public String getScndIpAddr() {
		return scndIpAddr;
	}
	public void setScndIpAddr(String scndIpAddr) {
		this.scndIpAddr = scndIpAddr;
	}
	public int getScndPortNo() {
		return scndPortNo;
	}
	public void setScndPortNo(int scndPortNo) {
		this.scndPortNo = scndPortNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMgmtBand() {
		return mgmtBand;
	}
	public void setMgmtBand(String mgmtBand) {
		this.mgmtBand = mgmtBand;
	}
	@Override
	public String toString() {
		return "PsProvNeInfo [neId=" + neId + ", svcDomain=" + svcDomain + ", srcTrgtInd=" + srcTrgtInd + ", ipAddr=" + ipAddr + ", portNo=" + portNo + ", scndIpAddr=" + scndIpAddr + ", scndPortNo=" + scndPortNo + ", userId=" + userId + ", passwd=" + passwd + ", mgmtBand=" + mgmtBand + "]";
	}
	public PsProvNeInfo validateExcelInfo(){
		if(StringUtils.isEmpty(this.neId)){
			super.setResult(new Result(ResultCode.FAIL, "NE ID is null"));
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(this.svcDomain)){
			super.setResult(new Result(ResultCode.FAIL, "Service Domain is null"));
			throw new AcubeException("Service Domain is null");
		}
		if(StringUtils.isEmpty(this.srcTrgtInd)){
			super.setResult(new Result(ResultCode.FAIL, "Target/Source is null"));
			throw new AcubeException("Target/Source is null");
		}
		super.setResult(new Result(ResultCode.SUCCESS));
		return this; 
	}     
}