package com.acube.sub.domain;

import java.io.Serializable;
import java.util.List;

import com.acube.common.domain.ControlType;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CustAttribute implements Serializable {
	private static final long serialVersionUID = -140562068654720523L;
	private String pvParamId ; 
	private ControlType paramType ;
	private String pvParamNm ;
	private String paramValue  ;
	private String defValue  ;
	private String codeGroup ;
	private boolean mandatory  ;
	private boolean enabled  ;
	private String custNo ;
	private String lang ;
	private String charLang[] ;//{"af", "ar-DZ", "ar", "az", "bg", "bs", "ca", "cs", "cy-GB", "da", "de", "el", "en-AU", "en-GB", "en-NZ", "eo", "es", "et", "eu", "fa", "fi", "fo", "fr-CH", "fr", "gl", "he", "hi", "hr", "hu", "hy", "id", "is", "it", "ja", "ka", "kk", "km", "ko", "lb", "lt", "lv", "mk", "ml", "ms", "nl-BE", "nl", "no", "pl", "pt-BR", "pt", "rm", "ro", "ru", "sk", "sl", "sq", "sr-SR", "sr", "sv", "ta", "th", "tj", "tr", "uk", "vi", "zh-CN", "zh-HK", "zh-TW"};
	private String charParamNm[]     ;
	
	private List<CustAttributeEnum> custAttributeEnums; 
	public String getPvParamId() {
		return pvParamId;
	}
	public void setPvParamId(String pvParamId) {
		this.pvParamId = pvParamId;
	}
	public ControlType getParamType() {
		return paramType;
	}
	public void setParamType(ControlType paramType) {
		this.paramType = paramType;
	}
	public String getPvParamNm() {
		return pvParamNm;
	}
	public void setPvParamNm(String pvParamNm) {
		this.pvParamNm = pvParamNm;
	}
	public String getParamValue() {
		return paramValue;
	}
	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}
	public String getDefValue() {
		return defValue;
	}
	public void setDefValue(String defValue) {
		this.defValue = defValue;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	@JsonIgnore public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public List<CustAttributeEnum> getCustAttributeEnums() {
		return custAttributeEnums;
	}
	public void setCustAttributeEnums(List<CustAttributeEnum> custAttributeEnums) {
		this.custAttributeEnums = custAttributeEnums;
	}
	public String getCodeGroup() {
		return codeGroup;
	}
	public void setCodeGroup(String codeGroup) {
		this.codeGroup = codeGroup;
	}
	@JsonIgnore public String[] getCharLang() {
		return charLang;
	}
	public void setCharLang(String[] charLang) {
		this.charLang = charLang;
	}
	@JsonIgnore public String[] getCharParamNm() {
		return charParamNm;
	}
	public void setCharParamNm(String[] charParamNm) {
		this.charParamNm = charParamNm;
	}
	@Override
	public String toString() {
		return "CustAttribute [pvParamId=" + pvParamId + ", paramType="
				+ paramType + ", pvParamNm=" + pvParamNm + ", paramValue="
				+ paramValue + ", defValue=" + defValue + ", codeGroup="
				+ codeGroup + ", mandatory=" + mandatory + ", enabled="
				+ enabled + ", custNo=" + custNo + ", lang=" + lang
				+ ", charLang=" + charLang + ", charParamNm=" + charParamNm
				+ ", custAttributeEnums=" + custAttributeEnums + "]";
	}

}
