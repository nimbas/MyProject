/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

/**
 *
 * @author bsyang
 * @since
 *
 */

public class Entrance extends BaseDomain implements Serializable, Cloneable{
	
	/*  */
	private static final long serialVersionUID = -440683061867410394L;
	private String entrNo                     ; //���Թ�ȣ
	private String custNo                 	  ; //����ȣ
	private String realCustNo                 ; //�ǻ�� ����ȣ
	private String grade					  ; //grade

	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getRealCustNo() {
		return realCustNo;
	}
	public void setRealCustNo(String realCustNo) {
		this.realCustNo = realCustNo;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Entrance [entrNo=" + entrNo + ", custNo=" + custNo + ", realCustNo=" + realCustNo + ", grade=" + grade
				+ "]";
	}

}
