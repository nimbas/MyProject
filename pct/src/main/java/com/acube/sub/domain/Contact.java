package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.WorkType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Contact extends BaseDomain implements Serializable{
	private static final long serialVersionUID = 1498488935596141521L;
	private String contactSeq;
	private String contactTypeCode;
	private String telDivCode;	
	private String relationDivCode;	
	private String cntctInfo1  ;
	private String cntctInfo2  ;
	private String cntctInfo3  ;
	private String cntctFullNm ;
	private String relsPersonName ;
	private boolean baseContact;
	private Customer customer;
	private WorkType workType = WorkType.CREATE; //C, U, D
	public String getContactSeq() {
		return contactSeq;
	}
	public void setContactSeq(String contactSeq) {
		this.contactSeq = contactSeq;
	}
	public String getTelDivCode() {
		return telDivCode;
	}
	
	public String getRelationDivCode() {
		return relationDivCode;
	}
	public void setRelationDivCode(String relationDivCode) {
		this.relationDivCode = relationDivCode;
	}
	public void setTelDivCode(String telDivCode) {
		this.telDivCode = telDivCode;
	}
	public String getContactTypeCode() {
		return contactTypeCode;
	}
	public void setContactTypeCode(String contactTypeCode) {
		this.contactTypeCode = contactTypeCode;
	}
	public String getCntctInfo1() {
		return cntctInfo1;
	}
	public void setCntctInfo1(String cntctInfo1) {
		this.cntctInfo1 = cntctInfo1;
	}
	public String getCntctInfo2() {
		return cntctInfo2;
	}
	public void setCntctInfo2(String cntctInfo2) {
		this.cntctInfo2 = cntctInfo2;
	}
	public String getCntctInfo3() {
		return cntctInfo3;
	}
	public void setCntctInfo3(String cntctInfo3) {
		this.cntctInfo3 = cntctInfo3;
	}
	public String getCntctFullNm() {
		return cntctFullNm;
	}
	public void setCntctFullNm(String cntctFullNm) {
		this.cntctFullNm = cntctFullNm;
	}
	public boolean isBaseContact() {
		return baseContact;
	}
	public void setBaseContact(boolean baseContact) {
		this.baseContact = baseContact;
	}
	@JsonIgnore public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@JsonIgnore public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	public String getRelsPersonName() {
		return relsPersonName;
	}
	public void setRelsPersonName(String relsPersonName) {
		this.relsPersonName = relsPersonName;
	}
	@Override
	public String toString() {
		return "Contact [contactSeq=" + contactSeq + ", contactTypeCode="
				+ contactTypeCode + ", telDivCode=" + telDivCode
				+ ", relationDivCode=" + relationDivCode + ", cntctInfo1="
				+ cntctInfo1 + ", cntctInfo2=" + cntctInfo2 + ", cntctInfo3="
				+ cntctInfo3 + ", cntctFullNm=" + cntctFullNm
				+ ", baseContact=" + baseContact + ", customer=" + customer
				+ ", workType=" + workType + "]";
	}

}
