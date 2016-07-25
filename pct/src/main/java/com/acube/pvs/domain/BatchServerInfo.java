package com.acube.pvs.domain;

import java.io.Serializable;

public class BatchServerInfo implements Serializable {

	private static final long serialVersionUID = -2836073479881192047L;
	
	
	private String svrIp; // remote machine IP
	private String svrId; // ID
	private String svrPw; // PASSWORD
	
	public BatchServerInfo() {
		super();
	}
	
	public BatchServerInfo(String svrIp, String svrId, String svrPw) {
		super();
		this.svrIp = svrIp;
		this.svrId = svrId;
		this.svrPw = svrPw;
	}
	public String getSvrIp() {
		return svrIp;
	}
	public void setSvrIp(String svrIp) {
		this.svrIp = svrIp;
	}
	public String getSvrId() {
		return svrId;
	}
	public void setSvrId(String svrId) {
		this.svrId = svrId;
	}
	public String getSvrPw() {
		return svrPw;
	}
	public void setSvrPw(String svrPw) {
		this.svrPw = svrPw;
	}
	
} 

