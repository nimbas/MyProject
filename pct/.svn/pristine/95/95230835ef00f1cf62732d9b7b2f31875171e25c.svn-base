package com.acube.pvs.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsProvMap extends BaseDomain implements Serializable{
    /*  */
	private static final long serialVersionUID = -5496797371083873591L;
	private String srcNeId;
    private String srcCmd;
    private String srcFtrCd;
    private int  provOrder;
    private String trgtNeId;
    private String trgtCmd;
    private String trgtFtrCd;
    private String errorContinueFlag;
    private String rollbackOrBranch;
    private String rolebackNeCmd;
    private String exceptionFlowId;
    private List<PsProvMap> provMaps; 
    private List<PsParamMap> paramMaps; 
    
	public String getSrcNeId() {
		return srcNeId;
	}
	public void setSrcNeId(String srcNeId) {
		this.srcNeId = srcNeId;
	}
	public String getSrcCmd() {
		return srcCmd;
	}
	public void setSrcCmd(String srcCmd) {
		this.srcCmd = srcCmd;
	}
	public String getSrcFtrCd() {
		return srcFtrCd;
	}
	public void setSrcFtrCd(String srcFtrCd) {
		this.srcFtrCd = srcFtrCd;
	}
	public int  getProvOrder() {
		return provOrder;
	}
	public void setProvOrder(int  provOrder) {
		this.provOrder = provOrder;
	}
	public String getTrgtNeId() {
		return trgtNeId;
	}
	public void setTrgtNeId(String trgtNeId) {
		this.trgtNeId = trgtNeId;
	}
	public String getTrgtCmd() {
		return trgtCmd;
	}
	public void setTrgtCmd(String trgtCmd) {
		this.trgtCmd = trgtCmd;
	}
	public String getTrgtFtrCd() {
		return trgtFtrCd;
	}
	public void setTrgtFtrCd(String trgtFtrCd) {
		this.trgtFtrCd = trgtFtrCd;
	}
	public String getErrorContinueFlag() {
		return errorContinueFlag;
	}
	public void setErrorContinueFlag(String errorContinueFlag) {
		this.errorContinueFlag = errorContinueFlag;
	}
	public String getRollbackOrBranch() {
		return rollbackOrBranch;
	}
	public void setRollbackOrBranch(String rollbackOrBranch) {
		this.rollbackOrBranch = rollbackOrBranch;
	}
	public String getRolebackNeCmd() {
		return rolebackNeCmd;
	}
	public void setRolebackNeCmd(String rolebackNeCmd) {
		this.rolebackNeCmd = rolebackNeCmd;
	}
	public String getExceptionFlowId() {
		return exceptionFlowId;
	}
	public void setExceptionFlowId(String exceptionFlowId) {
		this.exceptionFlowId = exceptionFlowId;
	}
	public List<PsProvMap> getProvMaps() {
		return provMaps;
	}
	public void setProvMaps(List<PsProvMap> provMaps) {
		this.provMaps = provMaps;
	}
	public List<PsParamMap> getParamMaps() {
		return paramMaps;
	}
	public void setParamMaps(List<PsParamMap> paramMaps) {
		this.paramMaps = paramMaps;
	}
	
	@Override
	public String toString() {
		return "PsProvMap [srcNeId=" + srcNeId + ", srcCmd=" + srcCmd + ", srcFtrCd=" + srcFtrCd + ", provOrder=" + provOrder + ", trgtNeId=" + trgtNeId + ", trgtCmd=" + trgtCmd + ", trgtFtrCd=" + trgtFtrCd + ", errorContinueFlag=" + errorContinueFlag + ", rollbackOrBranch=" + rollbackOrBranch
				+ ", rolebackNeCmd=" + rolebackNeCmd + ", exceptionFlowId=" + exceptionFlowId + "]";
	}
	public PsProvMap validateExcelInfo(){
			
		if(StringUtils.isEmpty(srcCmd)){
			throw new AcubeException("Source Command is null");
		}
		if(StringUtils.isEmpty(srcNeId)){
			throw new AcubeException("Source NE ID is null");
		}
		if(StringUtils.isEmpty(srcFtrCd)){
			throw new AcubeException("Source Feature Code is null");
		}
		if(StringUtils.isEmpty(provOrder)){
			throw new AcubeException("Order No is null");
		}
		if(StringUtils.isEmpty(trgtCmd)){
			throw new AcubeException("Target Command is null");
		}
		if(StringUtils.isEmpty(trgtNeId)){
			throw new AcubeException("Target NE ID is null");
		}
		if(StringUtils.isEmpty(trgtFtrCd)){
			throw new AcubeException("Target Feature Code is null");
		}
		if(StringUtils.isEmpty(errorContinueFlag)){
			throw new AcubeException("Error Continue Flag is null");
		}
		if(!(this.errorContinueFlag.equals("Y") || this.errorContinueFlag.equals("N"))){
			throw new AcubeException("Error Continue Flag is [Y/N]");
		}
		if(StringUtils.isEmpty(rollbackOrBranch)){
			throw new AcubeException("ROLLBACK OR BRANCH is null");
		}
		if(!(this.rollbackOrBranch.equals("N") || this.rollbackOrBranch.equals("R") || this.rollbackOrBranch.equals("E"))){
			throw new AcubeException("ROLLBACK OR BRANCH value is [N/R/E]");
		}
		if(this.rollbackOrBranch.equals("R") && StringUtils.isEmpty(rolebackNeCmd)){
			throw new AcubeException("if [ROLLBACK OR BRANCH] value is R, Rollback Ne Command is necessary!");
		}
		if(this.rollbackOrBranch.equals("E") && StringUtils.isEmpty(exceptionFlowId)){
			throw new AcubeException("if [ROLLBACK OR BRANCH] value is E, Exception Flow is necessary!");
		}
		return this; 
	}
	
	
}