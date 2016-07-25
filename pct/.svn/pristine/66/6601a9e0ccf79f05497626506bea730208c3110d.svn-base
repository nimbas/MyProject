package com.acube.pvs.domain;

import java.io.Serializable;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsParamMap extends BaseDomain implements Serializable{
    /*  */
	private static final long serialVersionUID = 5542577653824071334L;
	private String ne;
    private String cmd;
    private String ftrCd;
    private String fromNe;
    private String fromCmd;
    private String fromFtrCd;
    private String fromCmdIoInd;
    private String fromParamId;
    private String toNe;
    private String toCmd;
    private String toFtrCd;
    private String toCmdIoInd;
    private String toParamId;
    private String defValue;
    private PsProvParamSeq paramSeq; 
	public String getNe() {
		return ne;
	}
	public void setNe(String ne) {
		this.ne = ne;
	}
	public String getCmd() {
		return cmd;
	}
	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	public String getFtrCd() {
		return ftrCd;
	}
	public void setFtrCd(String ftrCd) {
		this.ftrCd = ftrCd;
	}
	public String getFromNe() {
		return fromNe;
	}
	public void setFromNe(String fromNe) {
		this.fromNe = fromNe;
	}
	public String getFromCmd() {
		return fromCmd;
	}
	public void setFromCmd(String fromCmd) {
		this.fromCmd = fromCmd;
	}
	public String getFromFtrCd() {
		return fromFtrCd;
	}
	public void setFromFtrCd(String fromFtrCd) {
		this.fromFtrCd = fromFtrCd;
	}
	public String getFromCmdIoInd() {
		return fromCmdIoInd;
	}
	public void setFromCmdIoInd(String fromCmdIoInd) {
		this.fromCmdIoInd = fromCmdIoInd;
	}
	public String getFromParamId() {
		return fromParamId;
	}
	public void setFromParamId(String fromParamId) {
		this.fromParamId = fromParamId;
	}
	public String getToNe() {
		return toNe;
	}
	public void setToNe(String toNe) {
		this.toNe = toNe;
	}
	public String getToCmd() {
		return toCmd;
	}
	public void setToCmd(String toCmd) {
		this.toCmd = toCmd;
	}
	public String getToFtrCd() {
		return toFtrCd;
	}
	public void setToFtrCd(String toFtrCd) {
		this.toFtrCd = toFtrCd;
	}
	public String getToCmdIoInd() {
		return toCmdIoInd;
	}
	public void setToCmdIoInd(String toCmdIoInd) {
		this.toCmdIoInd = toCmdIoInd;
	}
	public String getToParamId() {
		return toParamId;
	}
	public void setToParamId(String toParamId) {
		this.toParamId = toParamId;
	}
	public String getDefValue() {
		return defValue;
	}
	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}
	public PsProvParamSeq getParamSeq() {
		return paramSeq;
	}
	public void setParamSeq(PsProvParamSeq paramSeq) {
		this.paramSeq = paramSeq;
	}
	@Override
	public String toString() {
		return "PsParamMap [ne=" + ne + ", cmd=" + cmd + ", ftrCd=" + ftrCd + ", fromNe=" + fromNe + ", fromCmd=" + fromCmd + ", fromFtrCd=" + fromFtrCd + ", fromCmdIoInd=" + fromCmdIoInd + ", fromParamId=" + fromParamId + ", toNe=" + toNe + ", toCmd=" + toCmd + ", toFtrCd=" + toFtrCd
				+ ", toCmdIoInd=" + toCmdIoInd + ", toParamId=" + toParamId + ", defValue=" + defValue + ", paramSeq=" + paramSeq + "]";
	}
	public PsParamMap validateExcelInfo(){
		
		if(StringUtils.isEmpty(cmd)){
			throw new AcubeException("Command is null");
		}
		if(StringUtils.isEmpty(ne)){
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(ftrCd)){
			throw new AcubeException("Feature Code is null");
		}
		if(StringUtils.isEmpty(fromCmd)){
			throw new AcubeException("Source Command is null");
		}
		if(StringUtils.isEmpty(fromNe)){
			throw new AcubeException("Source NE ID is null");
		}
		if(StringUtils.isEmpty(fromFtrCd)){
			throw new AcubeException("Source Feature Code is null");
		}
		if(StringUtils.isEmpty(fromParamId)){
			throw new AcubeException("Source Param ID is null");
		}
		if(StringUtils.isEmpty(fromCmdIoInd)){
			throw new AcubeException("Source Input/Output is null");
		}
		if(!(this.fromCmdIoInd.equals("I") || this.fromCmdIoInd.equals("O"))){
			throw new AcubeException("Source Input/Output is [I/O]");
		}
		if(StringUtils.isEmpty(toCmd)){
			throw new AcubeException("Target Command is null");
		}
		if(StringUtils.isEmpty(toNe)){
			throw new AcubeException("Target NE ID is null");
		}
		if(StringUtils.isEmpty(toFtrCd)){
			throw new AcubeException("Target Feature Code is null");
		}
		if(StringUtils.isEmpty(toCmdIoInd)){
			throw new AcubeException("Target Input/Output is null");
		}
		if(!(this.toCmdIoInd.equals("I") || this.toCmdIoInd.equals("O"))){
			throw new AcubeException("Target Input/Output is [I/O]");
		}
		if(StringUtils.isEmpty(toParamId)){
			throw new AcubeException("Target Param ID is null");
		}
		return this;
	}
	
}