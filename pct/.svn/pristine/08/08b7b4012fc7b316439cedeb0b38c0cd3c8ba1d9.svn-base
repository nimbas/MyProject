package com.acube.pvs.domain;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsProvParamSeq extends BaseDomain implements Serializable{
   /*  */
	private static final long serialVersionUID = -1414789914114041228L;
	private String cmd;
    private String neId;
    private String ftrCd;
    private String reqRspInd;
    private String paramId;
    private String multiLevelInd;
    private int  paramLevel;
    private String parentParamId;
    private Short paramSeqNo;
    private String userDefValue;
    private String mandatoryFlag;
    private String defLabel;
    private String defValue;
    private String isRes;
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getNeId() {
		return neId;
	}
	public void setNeId(String neId) {
		this.neId = neId;
	}
	public String getFtrCd() {
		return ftrCd;
	}
	public void setFtrCd(String ftrCd) {
		this.ftrCd = ftrCd;
	}
	public String getReqRspInd() {
		return reqRspInd;
	}
	public void setReqRspInd(String reqRspInd) {
		this.reqRspInd = reqRspInd;
	}
	public String getParamId() {
		return paramId;
	}
	public void setParamId(String paramId) {
		this.paramId = paramId;
	}
	public String getMultiLevelInd() {
		return multiLevelInd;
	}
	public void setMultiLevelInd(String multiLevelInd) {
		this.multiLevelInd = multiLevelInd;
	}
	public int  getParamLevel() {
		return paramLevel;
	}
	public void setParamLevel(int  paramLevel) {
		this.paramLevel = paramLevel;
	}
	public String getParentParamId() {
		return parentParamId;
	}
	public void setParentParamId(String parentParamId) {
		this.parentParamId = parentParamId;
	}
	public Short getParamSeqNo() {
		return paramSeqNo;
	}
	public void setParamSeqNo(Short paramSeqNo) {
		this.paramSeqNo = paramSeqNo;
	}
	public String getUserDefValue() {
		return userDefValue;
	}
	public void setUserDefValue(String userDefValue) {
		this.userDefValue = userDefValue;
	}
	public String getMandatoryFlag() {
		return mandatoryFlag;
	}
	public void setMandatoryFlag(String mandatoryFlag) {
		this.mandatoryFlag = mandatoryFlag;
	}
	public String getDefLabel() {
		return defLabel;
	}
	public void setDefLabel(String defLabel) {
		this.defLabel = defLabel;
	}
	public String getDefValue() {
		return defValue;
	}
	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}
	public String getIsRes() {
		return isRes;
	}
	public void setIsRes(String isRes) {
		this.isRes = isRes;
	}
	
	@Override
	public String toString() {
		return "PsProvParamSeq [cmd=" + cmd + ", neId=" + neId + ", ftrCd=" + ftrCd + ", reqRspInd=" + reqRspInd + ", paramId=" + paramId + ", multiLevelInd=" + multiLevelInd + ", paramLevel=" + paramLevel + ", parentParamId=" + parentParamId + ", paramSeqNo=" + paramSeqNo + ", userDefValue="
				+ userDefValue + ", mandatoryFlag=" + mandatoryFlag + ", defLabel=" + defLabel + ", defValue=" + defValue + ", isRes=" + isRes + "]";
	}
	public PsProvParamSeq validateExcelInfo(){
		
		if(StringUtils.isEmpty(this.cmd)){
			throw new AcubeException("Command is null");
		}
		if(StringUtils.isEmpty(this.neId)){
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(this.ftrCd)){
			throw new AcubeException("Feature Code is null");
		}
		if(StringUtils.isEmpty(this.reqRspInd)){
			throw new AcubeException("Input/Output is null");
		}
		if(!(this.reqRspInd.equals("I") || this.reqRspInd.equals("O"))){
			throw new AcubeException("Input/Output value is [I/O]");
		}
		if(StringUtils.isEmpty(this.multiLevelInd)){
			throw new AcubeException("Multi Level Ind is null");
		}
		if(StringUtils.isEmpty(this.paramLevel)){
			throw new AcubeException("Parameter Level is null");
		}
		if(StringUtils.isEmpty(this.paramSeqNo)){
			throw new AcubeException("Parameter Seq No is null");
		}
		if(StringUtils.isEmpty(this.mandatoryFlag)){
			throw new AcubeException("Mandatory Flag is null");
		}
		if(!(this.mandatoryFlag.equals("Y") || this.mandatoryFlag.equals("N"))){
			throw new AcubeException("Mandatory Flag value is [Y/N]");
		}
		return this; 
	}

}