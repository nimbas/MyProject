package com.acube.common.domain.code;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.acube.common.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


//@JsonIgnoreProperties(value={"securityGroupId", "charLang", "charMeaning", "charDscpt", "success" , "message", "manageFlag", "enabledFlag", "startDateActive", "endDateActive"})
@JsonPropertyOrder(value={"codeGroup", "language", "code", "startDateActive","endDateActive","meaning", "description", "enabledFlag","sourceLang", "svcDomain", "subGrp1", "subGrp2", "createdBy","lastUpdatedBy","creationDate","lastUpdateDate"})
public class LookupCode extends BaseDomain implements Serializable{
	
	/*  */
	private static final long serialVersionUID = -3812491150799432617L;
	private String codeGroup         ;
	private String language          ;
	private String code      		 ;
	private String meaning           ;
	private String description       ;
	private boolean enabledFlag  = true ;
	private Date   startDateActive   ;
	private Date   endDateActive     ;
	private String sourceLang        ;
	private String securityGroupId   ;
	private String svcDomain  ;
	private String subGrp1  ;
	private String subGrp2  ;
	
	/* 생성/수정 이력 부분 추가 */
	private String createdBy;
	private String lastUpdatedBy;
	private Date creationDate;
	private Date lastUpdateDate;
	
	private String startDateActive_js;
	private String endDateActive_js;
	
	private String parentMeaning;
	
	/* 수정 시, 상태 값 */
	// {ADD, UPDATE, DELETE}
	private String updateStatus;

	/* 멀티언어 처리 */
	private String charLang[] ;//{"af", "ar-DZ", "ar", "az", "bg", "bs", "ca", "cs", "cy-GB", "da", "de", "el", "en-AU", "en-GB", "en-NZ", "eo", "es", "et", "eu", "fa", "fi", "fo", "fr-CH", "fr", "gl", "he", "hi", "hr", "hu", "hy", "id", "is", "it", "ja", "ka", "kk", "km", "ko", "lb", "lt", "lv", "mk", "ml", "ms", "nl-BE", "nl", "no", "pl", "pt-BR", "pt", "rm", "ro", "ru", "sk", "sl", "sq", "sr-SR", "sr", "sv", "ta", "th", "tj", "tr", "uk", "vi", "zh-CN", "zh-HK", "zh-TW"};
	private String charMeaning[]     ;
	private String charDscpt[]       ;
	
	/* csv 일괄처리시 성공여부와 실패메시지 */
	private boolean success = true;
	private String  message = "OK";
	
	/* 코드목록 조회시 관리자 여부 */
	private boolean manageFlag = false ;
	
	
	public String getCodeGroup() {
		return codeGroup;
	}
	public void setCodeGroup(String codeGroup) {
		this.codeGroup = codeGroup;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonIgnore
	public boolean isEnabledFlag() {
		return enabledFlag;
	}
	public void setEnabledFlag(boolean enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	@JsonIgnore
	public Date getStartDateActive() {
		return startDateActive;
	}
	
	public void setStartDateActive(Date startDateActive) {
		this.startDateActive = startDateActive;
	}
	
	@JsonIgnore
	public Date getEndDateActive() {
		return endDateActive;
	}
	
	public void setEndDateActive(Date endDateActive) {
		this.endDateActive = endDateActive;
	}
	public String getSourceLang() {
		return sourceLang;
	}
	public void setSourceLang(String sourceLang) {
		this.sourceLang = sourceLang;
	}
	@JsonIgnore
	public String getSecurityGroupId() {
		return securityGroupId;
	}
	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}
	@JsonIgnore
	public String[] getCharLang() {
		return charLang;
	}
	public void setCharLang(String[] charLang) {
		this.charLang = charLang;
	}
	@JsonIgnore
	public String[] getCharMeaning() {
		return charMeaning;
	}
	public void setCharMeaning(String[] charMeaning) {
		this.charMeaning = charMeaning;
	}
	@JsonIgnore
	public String[] getCharDscpt() {
		return charDscpt;
	}
	public void setCharDscpt(String[] charDscpt) {
		this.charDscpt = charDscpt;
	}
	@JsonIgnore
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	@JsonIgnore
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
	@JsonIgnore
	public boolean isManageFlag() {
		return manageFlag;
	}
	public void setManageFlag(boolean manageFlag) {
		this.manageFlag = manageFlag;
	}
	public String getSvcDomain() {
		return svcDomain;
	}
	public void setSvcDomain(String svcDomain) {
		this.svcDomain = svcDomain;
	}
	public String getSubGrp1() {
		return subGrp1;
	}
	public void setSubGrp1(String subGrp1) {
		this.subGrp1 = subGrp1;
	}
	public String getSubGrp2() {
		return subGrp2;
	}
	public void setSubGrp2(String subGrp2) {
		this.subGrp2 = subGrp2;
	}
	
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	@JsonIgnore
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	@JsonIgnore
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}
	
	
	/**
	 * 자료 송수신 시, 데이터 변조 및 임시저장을 위한 변수 접근 함수 SET
	 * 
	 */
	public String getStartDateActive_js() {
		return startDateActive_js;
	}
	public void setStartDateActive_js(String startDateActive_js) {
		this.startDateActive_js = startDateActive_js;
	}
	public String getEndDateActive_js() {
		return endDateActive_js;
	}
	public void setEndDateActive_js(String endDateActive_js) {
		this.endDateActive_js = endDateActive_js;
	}
	public String getParentMeaning() {
		return parentMeaning;
	}
	public void setParentMeaning(String parentMeaning) {
		this.parentMeaning = parentMeaning;
	}
	
	@Override
	public String toString() {
		return "LookupCode [lookupType=" + codeGroup + ", language="
				+ language + ", lookupCodeId=" + code + ", meaning="
				+ meaning + ", description=" + description + ", enabledFlag="
				+ enabledFlag + ", startDateActive=" + startDateActive
				+ ", endDateActive=" + endDateActive + ", sourceLang="
				+ sourceLang + ", securityGroupId=" + securityGroupId
				+ ", charLang=" + Arrays.toString(charLang) + ", charMeaning="
				+ Arrays.toString(charMeaning) + ", charDscpt="
				+ Arrays.toString(charDscpt) + ", success=" + success
				+ ", message=" + message + ", manageFlag=" + manageFlag + "]"
				+", CreateBy="+createdBy+", LastUpdateBy="+lastUpdatedBy
				+ ", CreationDate="+creationDate+", LastUpdateDate"+lastUpdateDate;
	}
	
	/* 수정 시, 상태값을 통하여 추가/수정/삭제 체크 */	
	public String getUpdateStatus() {
		return updateStatus;
	}
	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}
	
}	