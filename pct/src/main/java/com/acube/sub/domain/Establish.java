package com.acube.sub.domain;

import java.io.Serializable;
import java.util.List;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.WorkType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Establish extends BaseDomain implements Serializable {
private static final long serialVersionUID = 4467227071616081232L;
	
	private String estbAddrNo        ;
	private String custAddrSeqno     ;
	private String addrNum           ;
	private String addrDvCd          ;
	private String custVilgAbvAddr   ;
	private String custVilgBlwAddr   ;
	private String fullAddr          ;
	private String tap               ;
	private String cell              ;
	private WorkType workType		 ;
	
	private String doorCode		 ;
	private String mduIp		 ;
	private String mduPort		 ;
	private String cindex		 ;
	
	public String getCindex() {
		return cindex;
	}
	public void setCindex(String cindex) {
		this.cindex = cindex;
	}
	private List<Entrance> entrances ;
	
	
	public String getEstbAddrNo() {
		return estbAddrNo;
	}
	public void setEstbAddrNo(String estbAddrNo) {
		this.estbAddrNo = estbAddrNo;
	}
	public String getCustAddrSeqno() {
		return custAddrSeqno;
	}
	public void setCustAddrSeqno(String custAddrSeqno) {
		this.custAddrSeqno = custAddrSeqno;
	}
	public String getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(String addrNum) {
		this.addrNum = addrNum;
	}
	public String getAddrDvCd() {
		return addrDvCd;
	}
	public void setAddrDvCd(String addrDvCd) {
		this.addrDvCd = addrDvCd;
	}
	public String getCustVilgAbvAddr() {
		return custVilgAbvAddr;
	}
	public void setCustVilgAbvAddr(String custVilgAbvAddr) {
		this.custVilgAbvAddr = custVilgAbvAddr;
	}
	public String getCustVilgBlwAddr() {
		return custVilgBlwAddr;
	}
	public void setCustVilgBlwAddr(String custVilgBlwAddr) {
		this.custVilgBlwAddr = custVilgBlwAddr;
	}
	public String getFullAddr() {
		return fullAddr;
	}
	public void setFullAddr(String fullAddr) {
		this.fullAddr = fullAddr;
	}
	public String getTap() {
		return tap;
	}
	public void setTap(String tap) {
		this.tap = tap;
	}
	public String getCell() {
		return cell;
	}
	public void setCell(String cell) {
		this.cell = cell;
	}
	@JsonIgnore public List<Entrance> getEntrances() {
		return entrances;
	}
	public void setEntrances(List<Entrance> entrances) {
		this.entrances = entrances;
	}
	@JsonIgnore public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	public String getDoorCode() {
		return doorCode;
	}
	public void setDoorCode(String doorCode) {
		this.doorCode = doorCode;
	}
	public String getMduIp() {
		return mduIp;
	}
	public void setMduIp(String mduIp) {
		this.mduIp = mduIp;
	}
	public String getMduPort() {
		return mduPort;
	}
	public void setMduPort(String mduPort) {
		this.mduPort = mduPort;
	}

}
