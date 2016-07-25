package com.acube.pvs.domain.monitor;

public class PvsProcess {
	
	private String hostName;
	private String name;
	private String processName;
	private String status;
	private String operatorId;
	private String dateTime;
	private String startCmd;
	private String stopCmd;
	private String statusDt;
	private String errorMsg;  // just-error
	
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getStartCmd() {
		return startCmd;
	}
	public void setStartCmd(String startCmd) {
		this.startCmd = startCmd;
	}
	public String getStopCmd() {
		return stopCmd;
	}
	public void setStopCmd(String stopCmd) {
		this.stopCmd = stopCmd;
	}
	public String getStatusDt() {
		return statusDt;
	}
	public void setStatusDt(String statusDt) {
		this.statusDt = statusDt;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	@Override
	public String toString() {
		return "PvsProcess [hostName=" + hostName + ", name=" + name
				+ ", processName=" + processName + ", status=" + status
				+ ", operatorId=" + operatorId + ", dateTime=" + dateTime
				+ ", startCmd=" + startCmd + ", stopCmd=" + stopCmd
				+ ", statusDt=" + statusDt + ", errorMsg=" + errorMsg + "]";
	}
}
