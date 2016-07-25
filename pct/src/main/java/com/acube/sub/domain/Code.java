package com.acube.sub.domain;

import java.io.Serializable;
import java.util.List;

public class Code implements Serializable {
	private static final long serialVersionUID = 823504564943849253L;
	private String codeId ;
	private String codeName ;
	private String upCodeId ;
	private String dscpt ;
	private String level ;
	private String tmpMode ;
	private String tmpVal1 ;
	private String tmpVal2 ;
	private List<Code> codeList;
	
	public List<Code> getCodeList() {
		return codeList;
	}
	public void setCodeList(List<Code> codeList) {
		this.codeList = codeList;
	}
	public String getCodeId() {
		return codeId;
	}
	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}
	public String getCodeName() {
		return codeName;
	}
	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	public String getUpCodeId() {
		return upCodeId;
	}
	public void setUpCodeId(String upCodeId) {
		this.upCodeId = upCodeId;
	}
	public String getDscpt() {
		return dscpt;
	}
	public void setDscpt(String dscpt) {
		this.dscpt = dscpt;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getTmpMode() {
		return tmpMode;
	}
	public void setTmpMode(String tmpMode) {
		this.tmpMode = tmpMode;
	}
	public String getTmpVal1() {
		return tmpVal1;
	}
	public void setTmpVal1(String tmpVal1) {
		this.tmpVal1 = tmpVal1;
	}
	public String getTmpVal2() {
		return tmpVal2;
	}
	public void setTmpVal2(String tmpVal2) {
		this.tmpVal2 = tmpVal2;
	}

}
