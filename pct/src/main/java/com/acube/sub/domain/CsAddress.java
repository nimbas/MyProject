package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.WorkType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CsAddress extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 4050439264438738276L;
	private String custNo;
	private String addrSeq;
	private String addrNum;
	private String addrDvCode;
	private String vilageAboveAddr;
	private String vilageBelowAddr;
	private String fullAddress;
	private boolean baseAddr;
	private WorkType workType = WorkType.CREATE; //C, U, D
	private Customer customer;
	
	private String doorCode;
	private Establish establish ;
	public Establish getEstablish(){
		Establish establish = new Establish();
		establish.setAddrNum(String.valueOf(addrNum));
		establish.setCustVilgAbvAddr(vilageAboveAddr);
		establish.setCustVilgBlwAddr(vilageBelowAddr);
		establish.setDoorCode(doorCode);
		return establish ; 
	}
	
	public void setEstablish(Establish establish) {
		this.establish = establish;
	}
	
	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getAddrSeq() {
		return addrSeq;
	}
	public void setAddrSeq(String addrSeq) {
		this.addrSeq = addrSeq;
	}
	public String getAddrNum() {
		return addrNum;
	}
	public void setAddrNum(String addrNum) {
		this.addrNum = addrNum;
	}
	@JsonIgnore public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getAddrDvCode() {
		return addrDvCode;
	}
	public void setAddrDvCode(String addrDvCode) {
		this.addrDvCode = addrDvCode;
	}
	public String getVilageAboveAddr() {
		return vilageAboveAddr;
	}
	public void setVilageAboveAddr(String vilageAboveAddr) {
		this.vilageAboveAddr = vilageAboveAddr;
	}
	public String getVilageBelowAddr() {
		return vilageBelowAddr;
	}
	public void setVilageBelowAddr(String vilageBelowAddr) {
		this.vilageBelowAddr = vilageBelowAddr;
	}
	public String getFullAddress() {
		return fullAddress;
	}
	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	public boolean isBaseAddr() {
		return baseAddr;
	}
	public void setBaseAddr(boolean baseAddr) {
		this.baseAddr = baseAddr;
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
	@Override
	public String toString() {
		return "CsAddress [addrSeq=" + addrSeq + ", addrNum=" + addrNum
				+ ", addrDvCode=" + addrDvCode + ", vilageAboveAddr="
				+ vilageAboveAddr + ", vilageBelowAddr=" + vilageBelowAddr
				+ ", fullAddress=" + fullAddress + ", baseAddr=" + baseAddr
				+ ", workType=" + workType + ", customer=" + customer
				+ ", doorCode=" + doorCode + "]";
	}

}
