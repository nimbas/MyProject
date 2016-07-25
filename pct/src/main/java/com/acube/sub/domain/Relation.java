package com.acube.sub.domain;

import java.io.Serializable;
import java.util.Date;

import com.acube.common.domain.BaseDomain;

public class Relation extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 506689390475929121L;
	private String custRelsSeqno;
	private Customer relsTrgtCustomer;
	private RelationshipType relationshipType;
	private Date valdStrtDt;
	private Date valdEndDt;
	private String valdSttsApplCd;
	private String custNo;
	private String relsKdDrctCd;
	private String relationshipTargetCustomerNo;
	private String relationshipTargetCustomerName;
	private String custDvCode;
	
	public String getCustRelsSeqno() {
		return custRelsSeqno;
	}
	public void setCustRelsSeqno(String custRelsSeqno) {
		this.custRelsSeqno = custRelsSeqno;
	}
	public Customer getRelsTrgtCustomer() {
		return relsTrgtCustomer;
	}
	public void setRelsTrgtCustomer(Customer relsTrgtCustomer) {
		this.relsTrgtCustomer = relsTrgtCustomer;
	}
	public Date getValdStrtDt() {
		return valdStrtDt;
	}
	public void setValdStrtDt(Date valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}
	public Date getValdEndDt() {
		return valdEndDt;
	}
	public void setValdEndDt(Date valdEndDt) {
		this.valdEndDt = valdEndDt;
	}
	public String getValdSttsApplCd() {
		return valdSttsApplCd;
	}
	public void setValdSttsApplCd(String valdSttsApplCd) {
		this.valdSttsApplCd = valdSttsApplCd;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getRelsKdDrctCd() {
		return relsKdDrctCd;
	}
	public void setRelsKdDrctCd(String relsKdDrctCd) {
		this.relsKdDrctCd = relsKdDrctCd;
	}
	public RelationshipType getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(RelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}
	public String getRelationshipTargetCustomerNo() {
		return relationshipTargetCustomerNo;
	}
	public void setRelationshipTargetCustomerNo(String relationshipTargetCustomerNo) {
		this.relationshipTargetCustomerNo = relationshipTargetCustomerNo;
	}
	public String getRelationshipTargetCustomerName() {
		return relationshipTargetCustomerName;
	}
	public void setRelationshipTargetCustomerName(
			String relationshipTargetCustomerName) {
		this.relationshipTargetCustomerName = relationshipTargetCustomerName;
	}
	public String getCustDvCode() {
		return custDvCode;
	}
	public void setCustDvCode(String custDvCode) {
		this.custDvCode = custDvCode;
	}
	@Override
	public String toString() {
		return "Relation [custRelsSeqno=" + custRelsSeqno
				+ ", relsTrgtCustomer=" + relsTrgtCustomer
				+ ", relationshipType=" + relationshipType + ", valdStrtDt="
				+ valdStrtDt + ", valdEndDt=" + valdEndDt + ", valdSttsApplCd="
				+ valdSttsApplCd + ", custNo=" + custNo + ", relsKdDrctCd="
				+ relsKdDrctCd + ", relationshipTargetCustomerNo="
				+ relationshipTargetCustomerNo
				+ ", relationshipTargetCustomerName="
				+ relationshipTargetCustomerName + ", custDvCode=" + custDvCode
				+ "]";
	}

}
