package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ProdDeposit {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.DEPOSIT_SET_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String depositSetId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String prodCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal treatment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.GRACE_PERIOD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Short gracePeriod;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysCreationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysUpdateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String operatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String applicationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String dlServiceCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Short dlUpdateStamp;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DEPOSIT_SET_ID
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.DEPOSIT_SET_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getDepositSetId() {
		return depositSetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DEPOSIT_SET_ID
	 * @param depositSetId  the value for ABACUS.ABA_PD_PROD_DEPOSIT.DEPOSIT_SET_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDepositSetId(String depositSetId) {
		this.depositSetId = depositSetId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.PROD_CD
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getProdCd() {
		return prodCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.PROD_CD
	 * @param prodCd  the value for ABACUS.ABA_PD_PROD_DEPOSIT.PROD_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.TREATMENT
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getTreatment() {
		return treatment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.TREATMENT
	 * @param treatment  the value for ABACUS.ABA_PD_PROD_DEPOSIT.TREATMENT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setTreatment(BigDecimal treatment) {
		this.treatment = treatment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.GRACE_PERIOD
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.GRACE_PERIOD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Short getGracePeriod() {
		return gracePeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.GRACE_PERIOD
	 * @param gracePeriod  the value for ABACUS.ABA_PD_PROD_DEPOSIT.GRACE_PERIOD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setGracePeriod(Short gracePeriod) {
		this.gracePeriod = gracePeriod;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_CREATION_DATE
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysCreationDate() {
		return sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_CREATION_DATE
	 * @param sysCreationDate  the value for ABACUS.ABA_PD_PROD_DEPOSIT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_UPDATE_DATE
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysUpdateDate() {
		return sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.SYS_UPDATE_DATE
	 * @param sysUpdateDate  the value for ABACUS.ABA_PD_PROD_DEPOSIT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.OPERATOR_ID
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.OPERATOR_ID
	 * @param operatorId  the value for ABACUS.ABA_PD_PROD_DEPOSIT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.APPLICATION_ID
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.APPLICATION_ID
	 * @param applicationId  the value for ABACUS.ABA_PD_PROD_DEPOSIT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_SERVICE_CODE
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getDlServiceCode() {
		return dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_SERVICE_CODE
	 * @param dlServiceCode  the value for ABACUS.ABA_PD_PROD_DEPOSIT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_UPDATE_STAMP
	 * @return  the value of ABACUS.ABA_PD_PROD_DEPOSIT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Short getDlUpdateStamp() {
		return dlUpdateStamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_PROD_DEPOSIT.DL_UPDATE_STAMP
	 * @param dlUpdateStamp  the value for ABACUS.ABA_PD_PROD_DEPOSIT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlUpdateStamp(Short dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}
}