package com.acube.sub.domain;

public class RelationshipType {
	private String relsType;
	private String custRelsDivisionCd;
	private String relTypeName;
	private String forwardRelCode;
	private String backwardRelCode;
	private String customerType;
	private String relsCustomerType;
	private String relsNodeDivisionCd;
	private String custRelsSeqNo;
	
	
	public String getRelsType() {
		return relsType;
	}
	public void setRelsType(String relsType) {
		this.relsType = relsType;
	}
	public String getCustRelsDivisionCd() {
		return custRelsDivisionCd;
	}
	public void setCustRelsDivisionCd(String custRelsDivisionCd) {
		this.custRelsDivisionCd = custRelsDivisionCd;
	}
	public String getRelTypeName() {
		return relTypeName;
	}
	public void setRelTypeName(String relTypeName) {
		this.relTypeName = relTypeName;
	}
	public String getForwardRelCode() {
		return forwardRelCode;
	}
	public void setForwardRelCode(String forwardRelCode) {
		this.forwardRelCode = forwardRelCode;
	}
	public String getBackwardRelCode() {
		return backwardRelCode;
	}
	public void setBackwardRelCode(String backwardRelCode) {
		this.backwardRelCode = backwardRelCode;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getRelsCustomerType() {
		return relsCustomerType;
	}
	public void setRelsCustomerType(String relsCustomerType) {
		this.relsCustomerType = relsCustomerType;
	}
	public String getRelsNodeDivisionCd() {
		return relsNodeDivisionCd;
	}
	public void setRelsNodeDivisionCd(String relsNodeDivisionCd) {
		this.relsNodeDivisionCd = relsNodeDivisionCd;
	}
	public String getCustRelsSeqNo() {
		return custRelsSeqNo;
	}
	public void setCustRelsSeqNo(String custRelsSeqNo) {
		this.custRelsSeqNo = custRelsSeqNo;
	}
	@Override
	public String toString() {
		return "RelationshipType [relsType=" + relsType
				+ ", custRelsDivisionCd=" + custRelsDivisionCd
				+ ", relTypeName=" + relTypeName + ", forwardRelCode="
				+ forwardRelCode + ", backwardRelCode=" + backwardRelCode
				+ ", customerType=" + customerType + ", relsCustomerType="
				+ relsCustomerType + ", relsNodeDivisionCd="
				+ relsNodeDivisionCd + ", custRelsSeqNo=" + custRelsSeqNo + "]";
	}

}
