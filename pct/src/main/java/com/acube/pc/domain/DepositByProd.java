package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class DepositByProd {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String prodCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DEPOSIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal deposit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.HIGH_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal highThreshold;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date valdStrtDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.LOW_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal lowThreshold;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.MID_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal midThreshold;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal treatment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_END_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date valdEndDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysCreationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysUpdateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String operatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String applicationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String dlServiceCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Short dlUpdateStamp;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.PROD_CD
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getProdCd() {
		return prodCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.PROD_CD
	 * @param prodCd  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DEPOSIT
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.DEPOSIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getDeposit() {
		return deposit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DEPOSIT
	 * @param deposit  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.DEPOSIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.HIGH_THRESHOLD
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.HIGH_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getHighThreshold() {
		return highThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.HIGH_THRESHOLD
	 * @param highThreshold  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.HIGH_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setHighThreshold(BigDecimal highThreshold) {
		this.highThreshold = highThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_STRT_DT
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getValdStrtDt() {
		return valdStrtDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_STRT_DT
	 * @param valdStrtDt  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setValdStrtDt(Date valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.LOW_THRESHOLD
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.LOW_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getLowThreshold() {
		return lowThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.LOW_THRESHOLD
	 * @param lowThreshold  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.LOW_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setLowThreshold(BigDecimal lowThreshold) {
		this.lowThreshold = lowThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.MID_THRESHOLD
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.MID_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getMidThreshold() {
		return midThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.MID_THRESHOLD
	 * @param midThreshold  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.MID_THRESHOLD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setMidThreshold(BigDecimal midThreshold) {
		this.midThreshold = midThreshold;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.TREATMENT
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getTreatment() {
		return treatment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.TREATMENT
	 * @param treatment  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setTreatment(BigDecimal treatment) {
		this.treatment = treatment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_END_DT
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_END_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getValdEndDt() {
		return valdEndDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_END_DT
	 * @param valdEndDt  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.VALD_END_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setValdEndDt(Date valdEndDt) {
		this.valdEndDt = valdEndDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_CREATION_DATE
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysCreationDate() {
		return sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_CREATION_DATE
	 * @param sysCreationDate  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_UPDATE_DATE
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysUpdateDate() {
		return sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_UPDATE_DATE
	 * @param sysUpdateDate  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.OPERATOR_ID
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.OPERATOR_ID
	 * @param operatorId  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.APPLICATION_ID
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.APPLICATION_ID
	 * @param applicationId  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_SERVICE_CODE
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getDlServiceCode() {
		return dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_SERVICE_CODE
	 * @param dlServiceCode  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_UPDATE_STAMP
	 * @return  the value of ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Short getDlUpdateStamp() {
		return dlUpdateStamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_UPDATE_STAMP
	 * @param dlUpdateStamp  the value for ABACUS.ABA_PD_DEPOSIT_BY_PROD.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlUpdateStamp(Short dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}
}