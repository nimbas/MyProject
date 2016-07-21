package com.acube.pc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class RateInterval {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.INVENTORY_ITEM_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Long inventoryItemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.TIME_BAND_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String timeBandCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.FROM_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal fromValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.TO_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal toValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String rateAplyUnitCd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Long rateAplyUnit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal rate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.SPND_RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private BigDecimal spndRate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date valdStrtDt;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysCreationDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Date sysUpdateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String operatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String applicationId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private String dlServiceCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	private Short dlUpdateStamp;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.INVENTORY_ITEM_ID
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.INVENTORY_ITEM_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Long getInventoryItemId() {
		return inventoryItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.INVENTORY_ITEM_ID
	 * @param inventoryItemId  the value for ABACUS.ABA_PD_RATE_INTERVAL.INVENTORY_ITEM_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setInventoryItemId(Long inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.TIME_BAND_CD
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.TIME_BAND_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getTimeBandCd() {
		return timeBandCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.TIME_BAND_CD
	 * @param timeBandCd  the value for ABACUS.ABA_PD_RATE_INTERVAL.TIME_BAND_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setTimeBandCd(String timeBandCd) {
		this.timeBandCd = timeBandCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.FROM_VALUE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.FROM_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getFromValue() {
		return fromValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.FROM_VALUE
	 * @param fromValue  the value for ABACUS.ABA_PD_RATE_INTERVAL.FROM_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setFromValue(BigDecimal fromValue) {
		this.fromValue = fromValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.TO_VALUE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.TO_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getToValue() {
		return toValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.TO_VALUE
	 * @param toValue  the value for ABACUS.ABA_PD_RATE_INTERVAL.TO_VALUE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setToValue(BigDecimal toValue) {
		this.toValue = toValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT_CD
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getRateAplyUnitCd() {
		return rateAplyUnitCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT_CD
	 * @param rateAplyUnitCd  the value for ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT_CD
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setRateAplyUnitCd(String rateAplyUnitCd) {
		this.rateAplyUnitCd = rateAplyUnitCd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Long getRateAplyUnit() {
		return rateAplyUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT
	 * @param rateAplyUnit  the value for ABACUS.ABA_PD_RATE_INTERVAL.RATE_APLY_UNIT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setRateAplyUnit(Long rateAplyUnit) {
		this.rateAplyUnit = rateAplyUnit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.RATE
	 * @param rate  the value for ABACUS.ABA_PD_RATE_INTERVAL.RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SPND_RATE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.SPND_RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public BigDecimal getSpndRate() {
		return spndRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SPND_RATE
	 * @param spndRate  the value for ABACUS.ABA_PD_RATE_INTERVAL.SPND_RATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSpndRate(BigDecimal spndRate) {
		this.spndRate = spndRate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.VALD_STRT_DT
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getValdStrtDt() {
		return valdStrtDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.VALD_STRT_DT
	 * @param valdStrtDt  the value for ABACUS.ABA_PD_RATE_INTERVAL.VALD_STRT_DT
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setValdStrtDt(Date valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_CREATION_DATE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysCreationDate() {
		return sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_CREATION_DATE
	 * @param sysCreationDate  the value for ABACUS.ABA_PD_RATE_INTERVAL.SYS_CREATION_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_UPDATE_DATE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Date getSysUpdateDate() {
		return sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.SYS_UPDATE_DATE
	 * @param sysUpdateDate  the value for ABACUS.ABA_PD_RATE_INTERVAL.SYS_UPDATE_DATE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.OPERATOR_ID
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.OPERATOR_ID
	 * @param operatorId  the value for ABACUS.ABA_PD_RATE_INTERVAL.OPERATOR_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.APPLICATION_ID
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getApplicationId() {
		return applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.APPLICATION_ID
	 * @param applicationId  the value for ABACUS.ABA_PD_RATE_INTERVAL.APPLICATION_ID
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_SERVICE_CODE
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public String getDlServiceCode() {
		return dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_SERVICE_CODE
	 * @param dlServiceCode  the value for ABACUS.ABA_PD_RATE_INTERVAL.DL_SERVICE_CODE
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_UPDATE_STAMP
	 * @return  the value of ABACUS.ABA_PD_RATE_INTERVAL.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public Short getDlUpdateStamp() {
		return dlUpdateStamp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_PD_RATE_INTERVAL.DL_UPDATE_STAMP
	 * @param dlUpdateStamp  the value for ABACUS.ABA_PD_RATE_INTERVAL.DL_UPDATE_STAMP
	 * @mbggenerated  Thu Nov 27 11:27:55 KST 2014
	 */
	public void setDlUpdateStamp(Short dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}
}