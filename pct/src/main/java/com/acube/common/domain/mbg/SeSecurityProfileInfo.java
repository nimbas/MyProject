package com.acube.common.domain.mbg;

import java.util.Date;

public class SeSecurityProfileInfo extends SeSecurityProfileInfoKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.PROFILE_TYPE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String profileType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private Date sysCreateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_OPERATOR_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String sysOperatorId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_APPLICATION_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	private String sysApplicationId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.DESCRIPTION
	 * @return  the value of ABACUS.ABA_SE_SECURITY_PROFILE_INFO.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.DESCRIPTION
	 * @param description  the value for ABACUS.ABA_SE_SECURITY_PROFILE_INFO.DESCRIPTION
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.PROFILE_TYPE
	 * @return  the value of ABACUS.ABA_SE_SECURITY_PROFILE_INFO.PROFILE_TYPE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getProfileType() {
		return profileType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.PROFILE_TYPE
	 * @param profileType  the value for ABACUS.ABA_SE_SECURITY_PROFILE_INFO.PROFILE_TYPE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_CREATE_DATE
	 * @return  the value of ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public Date getSysCreateDate() {
		return sysCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_CREATE_DATE
	 * @param sysCreateDate  the value for ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_CREATE_DATE
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setSysCreateDate(Date sysCreateDate) {
		this.sysCreateDate = sysCreateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_OPERATOR_ID
	 * @return  the value of ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_OPERATOR_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getSysOperatorId() {
		return sysOperatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_OPERATOR_ID
	 * @param sysOperatorId  the value for ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_OPERATOR_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setSysOperatorId(String sysOperatorId) {
		this.sysOperatorId = sysOperatorId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_APPLICATION_ID
	 * @return  the value of ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_APPLICATION_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public String getSysApplicationId() {
		return sysApplicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_APPLICATION_ID
	 * @param sysApplicationId  the value for ABACUS.ABA_SE_SECURITY_PROFILE_INFO.SYS_APPLICATION_ID
	 * @mbggenerated  Mon Dec 29 18:19:29 KST 2014
	 */
	public void setSysApplicationId(String sysApplicationId) {
		this.sysApplicationId = sysApplicationId;
	}

	@Override
	public String toString() {
		return "SeSecurityProfileInfo [description=" + description + ", profileType=" + profileType + ", sysCreateDate=" + sysCreateDate + ", sysOperatorId=" + sysOperatorId + ", sysApplicationId="
				+ sysApplicationId + "]";
	}


	
}