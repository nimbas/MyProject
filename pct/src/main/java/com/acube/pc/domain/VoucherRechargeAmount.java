package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class VoucherRechargeAmount {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.VOUCHER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String voucherId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Long counterId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String counterType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.BILLING_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String billingType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.AMOUNT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal amount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String unit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysCreationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysUpdateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String operatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String applicationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String dlServiceCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Short dlUpdateStamp;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.VOUCHER_ID
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.VOUCHER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getVoucherId() {
		return voucherId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.VOUCHER_ID
	 * @param voucherId  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.VOUCHER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_ID
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Long getCounterId() {
		return counterId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_ID
	 * @param counterId  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setCounterId(Long counterId) {
		this.counterId = counterId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_TYPE
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getCounterType() {
		return counterType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_TYPE
	 * @param counterType  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.COUNTER_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setCounterType(String counterType) {
		this.counterType = counterType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.BILLING_TYPE
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.BILLING_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getBillingType() {
		return billingType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.BILLING_TYPE
	 * @param billingType  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.BILLING_TYPE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.AMOUNT
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.AMOUNT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.AMOUNT
	 * @param amount  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.AMOUNT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.UNIT
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.UNIT
	 * @param unit  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_CREATION_DATE
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysCreationDate() {
		return sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_CREATION_DATE
	 * @param sysCreationDate  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_UPDATE_DATE
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysUpdateDate() {
		return sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_UPDATE_DATE
	 * @param sysUpdateDate  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.OPERATOR_ID
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.OPERATOR_ID
	 * @param operatorId  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.APPLICATION_ID
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.APPLICATION_ID
	 * @param applicationId  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_SERVICE_CODE
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getDlServiceCode() {
		return dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_SERVICE_CODE
	 * @param dlServiceCode  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_UPDATE_STAMP
	 * @return  the value of ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Short getDlUpdateStamp() {
		return dlUpdateStamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_UPDATE_STAMP
	 * @param dlUpdateStamp  the value for ABACUS.ABA_PD_VOUCHER_RECHARGE_AMOUNT.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlUpdateStamp(Short dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}
}