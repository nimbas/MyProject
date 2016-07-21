package com.acube.pvs.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class PsCsMessage extends BaseDomain implements Serializable{
	/*  */
	private static final long serialVersionUID = 429129816785448056L;
	private String pvReqSeqNo;
	private String eventCd;
	private String eventName;
	private String entrNo;
	private String casId;
	private String macAddress;
	private String stbModel;
	private String statusCd;
	private String statusName;
	private String message;
	private String reqDt;

	private String returnDt;
	private String resultNe;
	private String resultCode;
	private String resultMsg;
	private String errorContinueFlag;
	public String getPvReqSeqNo() {
		return pvReqSeqNo;
	}
	public void setPvReqSeqNo(String pvReqSeqNo) {
		this.pvReqSeqNo = pvReqSeqNo;
	}
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getCasId() {
		return casId;
	}
	public void setCasId(String casId) {
		this.casId = casId;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getStbModel() {
		return stbModel;
	}
	public void setStbModel(String stbModel) {
		this.stbModel = stbModel;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getReqDt() {
		return reqDt;
	}
	public void setReqDt(String reqDt) {
		this.reqDt = reqDt;
	}
	public String getReturnDt() {
		return returnDt;
	}
	public void setReturnDt(String returnDt) {
		this.returnDt = returnDt;
	}
	public String getResultNe() {
		return resultNe;
	}
	public void setResultNe(String resultNe) {
		this.resultNe = resultNe;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getErrorContinueFlag() {
		return errorContinueFlag;
	}
	public void setErrorContinueFlag(String errorContinueFlag) {
		this.errorContinueFlag = errorContinueFlag;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	
}