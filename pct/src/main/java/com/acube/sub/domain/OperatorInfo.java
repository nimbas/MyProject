package com.acube.sub.domain;

import java.io.Serializable;
import java.util.Date;

import com.acube.common.domain.BaseDomain;

public class OperatorInfo extends BaseDomain implements Serializable {

	private static final long serialVersionUID = -86662265821317635L;
	
	private String marketCode;
	private String userId;
	private String loginId;
	private String dlrCd;
	private String userName;
	private String userName2;
	private String usergroup;   
	private String password;
	private String oldPassword;
	private String maxAdjustAmt;
	private String effectiveDate8;
	private String expirationDate8;
	private String emailAddress;
	private String birthday;
	private String age;
	private String userLevel;
	private String gender;
	private String zipCode;
	private String userMerryYn;
	private String homeTelno;
	private String workTelno;
	private String mobileTelno;
	private String workDate;
	private String userStatus;
	private String saleFlag;
	private String constFlag;
	private String installFlag;
	private String asFlag;
	private String removeFlag;
	private String vilgAbvAddr;
	private String vilgBlwAddr;
	private String ipAddress;
	private String oldIpAddress;
	private String ipScanYn;
	private String description;
	private String status;
	private String emailId;
	private String opEmailDomain;
	private String marketName;
	private String dlrNm;
	private String userlevelNm;
	
	public String getMarketCode() {
		return marketCode;
	}
	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getDlrCd() {
		return dlrCd;
	}
	public void setDlrCd(String dlrCd) {
		this.dlrCd = dlrCd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName2() {
		return userName2;
	}
	public void setUserName2(String userName2) {
		this.userName2 = userName2;
	}
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	public String getMaxAdjustAmt() {
		return maxAdjustAmt;
	}
	public void setMaxAdjustAmt(String maxAdjustAmt) {
		this.maxAdjustAmt = maxAdjustAmt;
	}
	public String getEffectiveDate8() {
		return effectiveDate8;
	}
	public void setEffectiveDate8(String effectiveDate8) {
		this.effectiveDate8 = effectiveDate8;
	}
	public String getExpirationDate8() {
		return expirationDate8;
	}
	public void setExpirationDate8(String expirationDate8) {
		this.expirationDate8 = expirationDate8;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getUserMerryYn() {
		return userMerryYn;
	}
	public void setUserMerryYn(String userMerryYn) {
		this.userMerryYn = userMerryYn;
	}
	public String getHomeTelno() {
		return homeTelno;
	}
	public void setHomeTelno(String homeTelno) {
		this.homeTelno = homeTelno;
	}
	public String getWorkTelno() {
		return workTelno;
	}
	public void setWorkTelno(String workTelno) {
		this.workTelno = workTelno;
	}
	public String getMobileTelno() {
		return mobileTelno;
	}
	public void setMobileTelno(String mobileTelno) {
		this.mobileTelno = mobileTelno;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public String getSaleFlag() {
		return saleFlag;
	}
	public void setSaleFlag(String saleFlag) {
		this.saleFlag = saleFlag;
	}
	public String getConstFlag() {
		return constFlag;
	}
	public void setConstFlag(String constFlag) {
		this.constFlag = constFlag;
	}
	public String getInstallFlag() {
		return installFlag;
	}
	public void setInstallFlag(String installFlag) {
		this.installFlag = installFlag;
	}
	public String getAsFlag() {
		return asFlag;
	}
	public void setAsFlag(String asFlag) {
		this.asFlag = asFlag;
	}
	public String getRemoveFlag() {
		return removeFlag;
	}
	public void setRemoveFlag(String removeFlag) {
		this.removeFlag = removeFlag;
	}
	public String getVilgAbvAddr() {
		return vilgAbvAddr;
	}
	public void setVilgAbvAddr(String vilgAbvAddr) {
		this.vilgAbvAddr = vilgAbvAddr;
	}
	public String getVilgBlwAddr() {
		return vilgBlwAddr;
	}
	public void setVilgBlwAddr(String vilgBlwAddr) {
		this.vilgBlwAddr = vilgBlwAddr;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getOldIpAddress() {
		return oldIpAddress;
	}
	public void setOldIpAddress(String oldIpAddress) {
		this.oldIpAddress = oldIpAddress;
	}
	public String getIpScanYn() {
		return ipScanYn;
	}
	public void setIpScanYn(String ipScanYn) {
		this.ipScanYn = ipScanYn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getOpEmailDomain() {
		return opEmailDomain;
	}
	public void setOpEmailDomain(String opEmailDomain) {
		this.opEmailDomain = opEmailDomain;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getDlrNm() {
		return dlrNm;
	}
	public void setDlrNm(String dlrNm) {
		this.dlrNm = dlrNm;
	}
	public String getUserlevelNm() {
		return userlevelNm;
	}
	public void setUserlevelNm(String userlevelNm) {
		this.userlevelNm = userlevelNm;
	}
	@Override
	public String toString() {
		return "OperatorInfo ["
				+ "marketCode="         +  marketCode 
				+ ", userId="           +  userId 
				+ ", loginId="          +  loginId 
				+ ", dlrCd="            +  dlrCd 
				+ ", userName="         +  userName 
				+ ", userName2="        +  userName2 
				+ ", usergroup="        +  usergroup
				+ ", password="         +  password 
				+ ", oldPassword="      +  oldPassword 
				+ ", maxAdjustAmt="     +  maxAdjustAmt
				+ ", effectiveDate8="   +  effectiveDate8 
				+ ", expirationDate8="  +  expirationDate8 
				+ ", emailAddress="     +  emailAddress 
				+ ", birthday="         +  birthday
				+ ", age="              +  age 
				+ ", userLevel="        +  userLevel 
				+ ", gender="           +  gender 
				+ ", zipCode="          +  zipCode 
				+ ", userMerryYn="      +  userMerryYn 
				+ ", homeTelno="        +  homeTelno
				+ ", workTelno="        +  workTelno 
				+ ", mobileTelno="      +  mobileTelno 
				+ ", workDate="         +  workDate
				+ ", userStatus="       +  userStatus 
				+ ", saleFlag="         +  saleFlag
				+ ", constFlag="        +  constFlag
				+ ", installFlag="      +  installFlag
				+ ", asFlag="           +  asFlag 
				+ ", removeFlag="       +  removeFlag
				+ ", vilgAbvAddr="      +  vilgAbvAddr
				+ ", vilgBlwAddr="      +  vilgBlwAddr
				+ ", ipAddress="        +  ipAddress
				+ ", oldIpAddress="     +  oldIpAddress 
				+ ", ipScanYn="         +  ipScanYn
				+ ", description="      +  description
				+ ", status="           +  status 
				+ ", emailId="          +  emailId 
				+ ", opEmailDomain="    +  opEmailDomain 
				+ ", marketName="       +  marketName 
				+ ", dlrNm="            +  dlrNm
				+ ", userlevelNm="      +  userlevelNm + "]";
	}
	
	
	
	
}
