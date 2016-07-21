package com.acube.pvs.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class PsUiAlarmConf extends PsUiAlarmConfKey  implements Serializable {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.STATUS
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private String status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.MIN
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private BigDecimal min;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.MAX
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private BigDecimal max;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.COLOR
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private String color;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.FILENAME
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private String filename;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column PMSADM.ABA_PS_UI_ALARM_CONF.DESCRIPTION
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.STATUS
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.STATUS
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.STATUS
	 * @param status  the value for PMSADM.ABA_PS_UI_ALARM_CONF.STATUS
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.MIN
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.MIN
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public BigDecimal getMin() {
		return min;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.MIN
	 * @param min  the value for PMSADM.ABA_PS_UI_ALARM_CONF.MIN
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setMin(BigDecimal min) {
		this.min = min;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.MAX
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.MAX
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public BigDecimal getMax() {
		return max;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.MAX
	 * @param max  the value for PMSADM.ABA_PS_UI_ALARM_CONF.MAX
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setMax(BigDecimal max) {
		this.max = max;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.COLOR
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.COLOR
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public String getColor() {
		return color;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.COLOR
	 * @param color  the value for PMSADM.ABA_PS_UI_ALARM_CONF.COLOR
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.FILENAME
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.FILENAME
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.FILENAME
	 * @param filename  the value for PMSADM.ABA_PS_UI_ALARM_CONF.FILENAME
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.DESCRIPTION
	 * @return  the value of PMSADM.ABA_PS_UI_ALARM_CONF.DESCRIPTION
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column PMSADM.ABA_PS_UI_ALARM_CONF.DESCRIPTION
	 * @param description  the value for PMSADM.ABA_PS_UI_ALARM_CONF.DESCRIPTION
	 * @mbggenerated  Fri Dec 12 11:34:09 KST 2014
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5459698523329331885L;
}