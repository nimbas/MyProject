package com.acube.sub.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.ArrayUtils;

import com.acube.common.domain.BaseDomain;
import com.acube.sub.handler.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Customer extends BaseDomain implements Serializable, Cloneable {
	private static final long serialVersionUID = -1134589839092290240L;
	private String custNo;
	private String marketCode;
	private String custDvCode;
	private String custKindCode;
	private String custName;
	private String custName1;
	private String custName2;
	private String custRnmNo;
	private String emailAddr;
	private String bizRegNo;
	private String bizCompName;
	private String bizReptName;
	private String groupCompName;
	private String bizCode;
	private String bizKindName;
	private String bizName;
	private boolean exceptVat;
	private String corpLevel;
	private String sexCode;
	private String hobyCode;
	private String birthDate;
	private String occupationCode;
	private String registAgentCode;  // <== firstAgentCode
	private String custRgstr;  // <== firstAgentCode
	private Date registDate;
	private Date entranceDate;
	private String phoneNo;
	private String ip77PhoneNo;
	private String businessType;
	private String dscpt;
	
		
	//20121217추가
	private String contactPerson;
	private String foundedDate;
	private String employeeCnt;
	private String introducer;
	private String position;
	private String authNo;
	private String authCode;
	private String templateCode               ; //templateCode 대표번호여부
	private String templateName               ; //templateName
	
	private EntrancePassword entrancePassword;
	private List<Contact> contacts;
	private List<CsAddress> addresses;
	private List<EntrancePassword> entrancePasswords;
	private List<Relation> relations;
	private List<Entrance> entrances;
	private List<RelationshipType> relationType;
	private List<RelationshipMembers> relationshipMembers;
	private List<CustomerFile> customerFiles;
	private CsAddress baseAddress;
	private Contact baseContact;
	private Contact baseEmail;
	
	
	private String searchKey;
	private String searchValue;
	private Relation relation ;
	private String orgUpCustNo;
	
	private List<CustAttribute> custAttributes;
	
	@JsonIgnore public List<RelationshipType> getRelationType() {
		return relationType;
	}
	public void setRelationType(List<RelationshipType> relationType) {
		this.relationType = relationType;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getMarketCode() {
		return marketCode;
	}
	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}
	public String getCustDvCode() {
		return custDvCode;
	}
	public void setCustDvCode(String custDvCode) {
		this.custDvCode = custDvCode;
	}
	public String getCustKindCode() {
		return custKindCode;
	}
	public void setCustKindCode(String custKindCode) {
		this.custKindCode = custKindCode;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustName1() {
		return custName1;
	}
	public void setCustName1(String custName1) {
		this.custName1 = custName1;
	}
	public String getCustName2() {
		return custName2;
	}
	public void setCustName2(String custName2) {
		this.custName2 = custName2;
	}
	public String getCustRnmNo() {
		return custRnmNo;
	}
	public void setCustRnmNo(String custRnmNo) {
		this.custRnmNo = custRnmNo;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getBizRegNo() {
		return bizRegNo;
	}
	public void setBizRegNo(String bizRegNo) {
		this.bizRegNo = bizRegNo;
	}
	public String getBizCompName() {
		return bizCompName;
	}
	public void setBizCompName(String bizCompName) {
		this.bizCompName = bizCompName;
	}
	public String getBizReptName() {
		return bizReptName;
	}
	public void setBizReptName(String bizReptName) {
		this.bizReptName = bizReptName;
	}
	public String getGroupCompName() {
		return groupCompName;
	}
	public void setGroupCompName(String groupCompName) {
		this.groupCompName = groupCompName;
	}
	public String getBizCode() {
		return bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizKindName() {
		return bizKindName;
	}
	public void setBizKindName(String bizKindName) {
		this.bizKindName = bizKindName;
	}
	public String getBizName() {
		return bizName;
	}
	public void setBizName(String bizName) {
		this.bizName = bizName;
	}
	public boolean isExceptVat() {
		return exceptVat;
	}
	public void setExceptVat(boolean exceptVat) {
		this.exceptVat = exceptVat;
	}
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public String getHobyCode() {
		return hobyCode;
	}
	public void setHobyCode(String hobyCode) {
		this.hobyCode = hobyCode;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getOccupationCode() {
		return occupationCode;
	}
	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}
	public String getRegistAgentCode() {
		return registAgentCode;
	}
	public void setRegistAgentCode(String registAgentCode) {
		this.registAgentCode = registAgentCode;
	}
	public String getCustRgstr() {
		return custRgstr;
	}
	public void setCustRgstr(String custRgstr) {
		this.custRgstr = custRgstr;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getIp77PhoneNo() {
		return ip77PhoneNo;
	}
	public void setIp77PhoneNo(String ip77PhoneNo) {
		this.ip77PhoneNo = ip77PhoneNo;
	}
	@JsonSerialize(using = CustomDateSerializer.class)
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	@JsonSerialize(using = CustomDateSerializer.class) public Date getEntranceDate() {
		return entranceDate;
	}
	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public List<CsAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<CsAddress> addresses) {
		this.addresses = addresses;
	}
	
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	
	public String getFoundedDate() {
		return foundedDate;
	}
	public void setFoundedDate(String foundedDate) {
		this.foundedDate = foundedDate;
	}
	
	public String getEmployeeCnt() {
		return employeeCnt;
	}
	public void setEmployeeCnt(String employeeCnt) {
		this.employeeCnt = employeeCnt;
	}
	public String getIntroducer() {
		return introducer;
	}
	public void setIntroducer(String introducer) {
		this.introducer = introducer;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public String getAuthNo() {
		return authNo;
	}
	public void setAuthNo(String authNo) {
		this.authNo = authNo;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	@JsonIgnore public List<EntrancePassword> getEntrancePasswords() {
		return entrancePasswords;
	}
	public void setEntrancePasswords(List<EntrancePassword> entrancePasswords) {
		this.entrancePasswords = entrancePasswords;
	}
	public EntrancePassword getEntrancePassword() {
		return entrancePassword;
	}
	public void setEntrancePassword(EntrancePassword entrancePassword) {
		this.entrancePassword = entrancePassword;
	}
	@JsonIgnore public List<Relation> getRelations() {
		return relations;
	}
	public void setRelations(List<Relation> relations) {
		this.relations = relations;
	}
	@JsonIgnore public List<Entrance> getEntrances() {
		return entrances;
	}
	public void setEntrances(List<Entrance> entrances) {
		this.entrances = entrances;
	}
	@JsonIgnore public CsAddress getBaseAddress() {
		if(this.addresses != null && this.addresses.size()>0){
			for(CsAddress address : this.addresses){
				if(address.isBaseAddr()){
					this.baseAddress = address ;
					return address ;
				}
			}
		}
		return null;
	}
	@JsonIgnore public Contact getBaseContact() {
		if(this.contacts != null && this.contacts.size()>0){
			for(Contact contact : this.contacts){
				if(contact.getContactTypeCode().equals("1") &&  contact.isBaseContact()){
					this.baseContact = contact ;
					return contact ;
				}
			}
		}
		return null;
	}
	@JsonIgnore public Contact getBaseEmail() {
		if(this.contacts != null && this.contacts.size()>0){
			for(Contact contact : this.contacts){
				if(contact.getContactTypeCode().equals("2") &&  contact.isBaseContact()){
					this.baseContact = contact ;
					return contact ;
				}
			}
		}
		return null;
	}
	public Customer clone(){
		try {
			return (Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			return null ;
		}
	}
	@JsonIgnore public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	@JsonIgnore public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
	@JsonIgnore public Relation getRelation() {
		return relation;
	}
	public void setRelation(Relation relation) {
		this.relation = relation;
	}
	@JsonIgnore public String getOrgUpCustNo() {
		return orgUpCustNo;
	}
	public void setOrgUpCustNo(String orgUpCustNo) {
		this.orgUpCustNo = orgUpCustNo;
	}
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getDscpt() {
		return dscpt;
	}
	public void setDscpt(String dscpt) {
		this.dscpt = dscpt;
	}
	public List<CustAttribute> getCustAttributes() {
		return custAttributes;
	}
	public void setCustAttributes(List<CustAttribute> custAttributes) {
		this.custAttributes = custAttributes;
	}
	
	public String getCorpLevel() {
		return corpLevel;
	}
	public void setCorpLevel(String corpLevel) {
		this.corpLevel = corpLevel;
	}
	@JsonIgnore public List<RelationshipMembers> getRelationshipMembers() {
		return relationshipMembers;
	}
	public void setRelationshipMembers(List<RelationshipMembers> relationshipMembers) {
		this.relationshipMembers = relationshipMembers;
	}
	@JsonIgnore public List<CustomerFile> getCustomerFiles() {
		return customerFiles;
	}
	public void setCustomerFiles(List<CustomerFile> customerFiles) {
		this.customerFiles = customerFiles;
	}
	
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", marketCode=" + marketCode
				+ ", custDvCode=" + custDvCode + ", custKindCode="
				+ custKindCode + ", custName=" + custName + ", custName1="
				+ custName1 + ", custName2=" + custName2 + ", custRnmNo="
				+ custRnmNo + ", emailAddr=" + emailAddr + ", bizRegNo="
				+ bizRegNo + ", bizCompName=" + bizCompName + ", bizReptName="
				+ bizReptName + ", groupCompName=" + groupCompName
				+ ", bizCode=" + bizCode + ", bizKindName=" + bizKindName
				+ ", bizName=" + bizName + ", exceptVat=" + exceptVat +", corpLevel=" + corpLevel
				+ ", sexCode=" + sexCode + ", hobyCode=" + hobyCode
				+ ", birthDate=" + birthDate + ", occupationCode="
				+ occupationCode + ", registAgentCode=" + registAgentCode
				+ ", custRgstr=" + custRgstr + ", registDate=" + registDate
				+ ", entranceDate=" + entranceDate + ", contactPerson="
				+ contactPerson + ", foundedDate=" + foundedDate
				+ ", employeeCnt=" + employeeCnt + ", introducer=" + introducer
				+ ", position=" + position + ", authNo=" + authNo
				+ ", authCode=" + authCode + ", entrancePassword="
				+ entrancePassword + ", contacts=" + ArrayUtils.toString(contacts) + ", addresses="
				+ ArrayUtils.toString(addresses) + ", entrancePasswords=" + ArrayUtils.toString(entrancePasswords)
				+ ", relations=" + ArrayUtils.toString(relations) + ", entrances=" + entrances
				+ ", relationType=" + relationType + ", relationshipMembers="
				+ relationshipMembers + ", customerFiles=" + ArrayUtils.toString(customerFiles)
				+ ", baseAddress=" + baseAddress + ", baseContact="
				+ baseContact + ", baseEmail=" + baseEmail + ", searchKey="
				+ searchKey + ", searchValue=" + searchValue + ", relation="
				+ relation + ", orgUpCustNo=" + orgUpCustNo
				+ ", custAttributes=" + custAttributes + "]";
	}

}
