package com.acube.sub.domain;

import com.acube.common.domain.BaseDomain;

public class RelationshipMembers extends BaseDomain {
	private String custRelationshipSeqNo;
	private String relationshipType;
	private String relationsTargetCustNo;
	private String custName;
	private String custRegister;
	private String custNo;
	private String custRegisterDate;
	private String relationshipTypeList;
	private String relationshipTypeValue;
	private String keyId;
	private String custType;
	private String relsCustType;
	private String custRelsDvCd;
	private String relsKdDrctCd;
	private String valdStrtDt;
	private String valdEndDt;
	private String valdSttsApplCd;
	private String sysCreationData;
	private String createdBy;
	private String lastUpdatedBy;
	private String dlServiceCode;
	private String relationshipTypeListValue;

	public String getCustRegisterDate() {
		return custRegisterDate;
	}
	public void setCustRegisterDate(String custRegisterDate) {
		this.custRegisterDate = custRegisterDate;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public String getRelationsTargetCustNo() {
		return relationsTargetCustNo;
	}
	public void setRelationsTargetCustNo(String relationsTargetCustNo) {
		this.relationsTargetCustNo = relationsTargetCustNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustRegister() {
		return custRegister;
	}
	public void setCustRegister(String custRegister) {
		this.custRegister = custRegister;
	}
	public String getCustRelationshipSeqNo() {
		return custRelationshipSeqNo;
	}
	public void setCustRelationshipSeqNo(String custRelationshipSeqNo) {
		this.custRelationshipSeqNo = custRelationshipSeqNo;
	}
	public String getRelationshipTypeList() {
		return relationshipTypeList;
	}
	public void setRelationshipTypeList(String relationshipTypeList) {
		this.relationshipTypeList = relationshipTypeList;
	}
	public String getKeyId() {
		return keyId;
	}
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	public String getRelationshipTypeValue() {
		return relationshipTypeValue;
	}
	public void setRelationshipTypeValue(String relationshipTypeValue) {
		this.relationshipTypeValue = relationshipTypeValue;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getRelsCustType() {
		return relsCustType;
	}
	public void setRelsCustType(String relsCustType) {
		this.relsCustType = relsCustType;
	}
	public String getCustRelsDvCd() {
		return custRelsDvCd;
	}
	public void setCustRelsDvCd(String custRelsDvCd) {
		this.custRelsDvCd = custRelsDvCd;
	}
	public String getRelsKdDrctCd() {
		return relsKdDrctCd;
	}
	public void setRelsKdDrctCd(String relsKdDrctCd) {
		this.relsKdDrctCd = relsKdDrctCd;
	}
	public String getValdStrtDt() {
		return valdStrtDt;
	}
	public void setValdStrtDt(String valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}
	public String getValdEndDt() {
		return valdEndDt;
	}
	public void setValdEndDt(String valdEndDt) {
		this.valdEndDt = valdEndDt;
	}
	public String getValdSttsApplCd() {
		return valdSttsApplCd;
	}
	public void setValdSttsApplCd(String valdSttsApplCd) {
		this.valdSttsApplCd = valdSttsApplCd;
	}
	public String getSysCreationData() {
		return sysCreationData;
	}
	public void setSysCreationData(String sysCreationData) {
		this.sysCreationData = sysCreationData;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public String getDlServiceCode() {
		return dlServiceCode;
	}
	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}
	public String getRelationshipTypeListValue() {
		return relationshipTypeListValue;
	}
	public void setRelationshipTypeListValue(String relationshipTypeListValue) {
		this.relationshipTypeListValue = relationshipTypeListValue;
	}
	@Override
	public String toString() {
		return "RelationshipMembers ["
				+ "custRelationshipSeqNo="+ custRelationshipSeqNo 
				+ ", relationshipType="+ relationshipType 
				+ ", relationsTargetCustNo="+ relationsTargetCustNo 
				+ ", custName=" + custName
				+ ", custRegister=" + custRegister 
				+ ", custNo=" + custNo
				+ ", custRegisterDate=" + custRegisterDate
				+ ", relationshipTypeList=" + relationshipTypeList
				+ ", relationshipTypeValue=" + relationshipTypeValue
				+ ", keyId=" + keyId 
				+ ", custType=" + custType
				+ ", relsCustType=" + relsCustType 
				+ ", custRelsDvCd="	+ custRelsDvCd 
				+ ", relsKdDrctCd=" + relsKdDrctCd
				+ ", valdStrtDt=" + valdStrtDt 
				+ ", valdEndDt=" + valdEndDt
				+ ", valdSttsApplCd=" + valdSttsApplCd 
				+ ", sysCreationData="+ sysCreationData
				+ ", createdBy=" + createdBy 
				+ ", lastUpdatedBy="+ lastUpdatedBy 
				+ ", dlServiceCode=" + dlServiceCode
				+ ", relationshipTypeListValue=" + relationshipTypeListValue
				+ "]";
	}

}
