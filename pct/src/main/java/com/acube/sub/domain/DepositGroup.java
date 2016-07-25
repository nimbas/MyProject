package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class DepositGroup extends BaseDomain implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -6716747398185468665L;
	private String prodCd ;
	private String depositSetId ;
	private String depositId ;
	private String custDvCd ;
	private String ftrCd ;
	private String ftrName ;
	// private List<Deposit> deposits ;
	// private Deposit baseDeposit ;
	
	
	private String prodName;
	private String deposit;
	private String threshold;
	private String entrNo;
	
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public String getDepositSetId() {
		return depositSetId;
	}
	public void setDepositSetId(String depositSetId) {
		this.depositSetId = depositSetId;
	}
	public String getDepositId() {
		return depositId;
	}
	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}
	public String getCustDvCd() {
		return custDvCd;
	}
	public void setCustDvCd(String custDvCd) {
		this.custDvCd = custDvCd;
	}
	public String getFtrCd() {
		return ftrCd;
	}
	public void setFtrCd(String ftrCd) {
		this.ftrCd = ftrCd;
	}
	public String getFtrName() {
		return ftrName;
	}
	public void setFtrName(String ftrName) {
		this.ftrName = ftrName;
	}
	/*public List<Deposit> getDeposits() {
		return deposits;
	}
	public void setDeposits(List<Deposit> deposits) {
		this.deposits = deposits;
	}
	public Deposit getBaseDeposit() {
		return baseDeposit;
	}
	public void setBaseDeposit(Deposit baseDeposit) {
		this.baseDeposit = baseDeposit;
	}*/
	public String getProdName() {
		return prodName;
	}
	public String getDeposit() {
		return deposit;
	}
	public String getThreshold() {
		return threshold;
	}
	public String getEntrNo() {
		return entrNo;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	
	@Override
	public String toString() {
		return "DepositGroup [prodCd=" + prodCd + ", depositSetId=" + depositSetId + ", depositId=" + depositId
				+ ", custDvCd=" + custDvCd + ", ftrCd=" + ftrCd + ", ftrName=" + ftrName + ", prodName=" + prodName
				+ ", deposit=" + deposit + ", threshold=" + threshold + ", entrNo=" + entrNo + "]";
	}
	

}
