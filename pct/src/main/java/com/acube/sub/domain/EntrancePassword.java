package com.acube.sub.domain;

import java.io.Serializable;
import java.util.Date;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.WorkType;
import com.acube.common.util.AcubeUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class EntrancePassword extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 400789833344820573L;
	private String entranceSeq;
	private Customer customer;
	private String entranceNo;
	private String userId;
	private String password;
	private Date passwordValidDate;
	private String relsCustType;
	
	private String custPwdHint;
	private String custPwdQueCd;
	private WorkType workType = WorkType.CREATE; //C, U, D
	
	
	public String getCustPwdHint() {
		return custPwdHint;
	}
	public void setCustPwdHint(String custPwdHint) {
		this.custPwdHint = custPwdHint;
	}
	public String getCustPwdQueCd() {
		return custPwdQueCd;
	}
	public void setCustPwdQueCd(String custPwdQueCd) {
		this.custPwdQueCd = custPwdQueCd;
	}
	public String getRelsCustType() {
		return relsCustType;
	}
	public void setRelsCustType(String relsCustType) {
		this.relsCustType = relsCustType;
	}
	public String getEntranceSeq() {
		return entranceSeq;
	}
	public void setEntranceSeq(String entranceSeq) {
		this.entranceSeq = entranceSeq;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getEntranceNo() {
		return entranceNo;
	}
	public void setEntranceNo(String entranceNo) {
		this.entranceNo = entranceNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getPasswordValidDate() {
		return passwordValidDate;
	}
	public void setPasswordValidDate(Date passwordValidDate) {
		this.passwordValidDate = passwordValidDate;
	}
	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}
	
	@JsonIgnore //json으로 컨버팅시에 이부분에서 오류발생하여 처리함.
	public String getPasswordBySHA512(){
		
		return AcubeUtil.getPasswordBySHA512(this.password);
	}
	
	@Override
	public String toString() {
		return "EntrancePassword [entranceSeq=" + entranceSeq + ", customer="
				+ customer + ", entranceNo=" + entranceNo + ", userId="
				+ userId + ", password=" + password + ", passwordValidDate="
				+ passwordValidDate + ", relsCustType=" + relsCustType
				+ ", custPwdHint=" + custPwdHint + ", custPwdQueCd="
				+ custPwdQueCd + ", workType=" + workType + "]";
	}

}
