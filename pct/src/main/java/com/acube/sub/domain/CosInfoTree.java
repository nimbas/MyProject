package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class CosInfoTree extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -86662265821317635L;
	String hposBizbrCd;
	String dlrCd;
	String dlrNm;
	String bizbrLvlDvCd;
	public String getHposBizbrCd() {
		return hposBizbrCd;
	}
	public void setHposBizbrCd(String hposBizbrCd) {
		this.hposBizbrCd = hposBizbrCd;
	}
	public String getDlrCd() {
		return dlrCd;
	}
	public void setDlrCd(String dlrCd) {
		this.dlrCd = dlrCd;
	}
	public String getDlrNm() {
		return dlrNm;
	}
	public void setDlrNm(String dlrNm) {
		this.dlrNm = dlrNm;
	}
	public String getBizbrLvlDvCd() {
		return bizbrLvlDvCd;
	}
	public void setBizbrLvlDvCd(String bizbrLvlDvCd) {
		this.bizbrLvlDvCd = bizbrLvlDvCd;
	}
	
	
	
}
