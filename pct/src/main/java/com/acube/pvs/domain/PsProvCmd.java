package com.acube.pvs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;

public class PsProvCmd extends BaseDomain implements Serializable{
    
    /*  */
	private static final long serialVersionUID = -301827841524838009L;
	private String cmd;
    private String neId;
    private String sendRecvInd;
    private String syncAsyncInd;
    private String actionCd;
    private String descr;
    private List<PsProvParamSeq> provParamSeqs; 
    private PsProvNeInfo provNeInfo;
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
	public String getSendRecvInd() {
		return sendRecvInd;
	}
	public void setSendRecvInd(String sendRecvInd) {
		this.sendRecvInd = sendRecvInd;
	}
	public String getSyncAsyncInd() {
		return syncAsyncInd;
	}
	public void setSyncAsyncInd(String syncAsyncInd) {
		this.syncAsyncInd = syncAsyncInd;
	}
	public String getActionCd() {
		return actionCd;
	}
	public void setActionCd(String actionCd) {
		this.actionCd = actionCd;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public List<PsProvParamSeq> getProvParamSeqs() {
		return provParamSeqs;
	}
	public void setProvParamSeqs(List<PsProvParamSeq> provParamSeqs) {
		this.provParamSeqs = provParamSeqs;
	}
	public PsProvNeInfo getProvNeInfo() {
		return provNeInfo;
	}
	public void setProvNeInfo(PsProvNeInfo provNeInfo) {
		this.provNeInfo = provNeInfo;
	}
	
	public PsProvCmd validateExcelInfo(){
		
		if(StringUtils.isEmpty(this.neId)){
			throw new AcubeException("NE ID is null");
		}
		if(StringUtils.isEmpty(this.cmd)){
			throw new AcubeException("Command is null");
		}
		if(StringUtils.isEmpty(this.sendRecvInd)){
			throw new AcubeException("Send/Recevie is null");
		}
		if(StringUtils.isEmpty(this.syncAsyncInd)){
			throw new AcubeException("Synch/Asynch is null");
		}
		if(StringUtils.isEmpty(this.actionCd)){
			throw new AcubeException("Action Code is null");
		}
		return this; 
	}
}