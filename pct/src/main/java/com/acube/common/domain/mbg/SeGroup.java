package com.acube.common.domain.mbg;

import java.util.Date;

public class SeGroup extends SeGroupKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_GROUP.GROUP_NAME
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String groupName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_GROUP.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_GROUP.MARKET_CODE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String marketCode;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_GROUP.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private Date sysCreateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_GROUP.GROUP_LEVEL
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String groupLevel;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_GROUP.GROUP_NAME
	 * @return  the value of ABACUS.ABA_SE_GROUP.GROUP_NAME
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_GROUP.GROUP_NAME
	 * @param groupName  the value for ABACUS.ABA_SE_GROUP.GROUP_NAME
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_GROUP.DESCRIPTION
	 * @return  the value of ABACUS.ABA_SE_GROUP.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_GROUP.DESCRIPTION
	 * @param description  the value for ABACUS.ABA_SE_GROUP.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_GROUP.MARKET_CODE
	 * @return  the value of ABACUS.ABA_SE_GROUP.MARKET_CODE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getMarketCode() {
		return marketCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_GROUP.MARKET_CODE
	 * @param marketCode  the value for ABACUS.ABA_SE_GROUP.MARKET_CODE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_GROUP.SYS_CREATE_DATE
	 * @return  the value of ABACUS.ABA_SE_GROUP.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public Date getSysCreateDate() {
		return sysCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_GROUP.SYS_CREATE_DATE
	 * @param sysCreateDate  the value for ABACUS.ABA_SE_GROUP.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setSysCreateDate(Date sysCreateDate) {
		this.sysCreateDate = sysCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_GROUP.GROUP_LEVEL
	 * @return  the value of ABACUS.ABA_SE_GROUP.GROUP_LEVEL
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getGroupLevel() {
		return groupLevel;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_GROUP.GROUP_LEVEL
	 * @param groupLevel  the value for ABACUS.ABA_SE_GROUP.GROUP_LEVEL
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setGroupLevel(String groupLevel) {
		this.groupLevel = groupLevel;
	}
}