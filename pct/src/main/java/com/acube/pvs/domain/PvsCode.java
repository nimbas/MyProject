package com.acube.pvs.domain;

import java.io.Serializable;

public class PvsCode implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -8776545061739449860L;
	private String code;
	private String meaning;
	
	public String getCode() {
		return this.code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMeaning() {
		return this.meaning;
	}
	
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
}
