package com.acube.security.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class CoAuthCode extends BaseDomain implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5888066858185313361L;
	private String authId;
	private String authName;
	private String authType;
	private String description;
	private ProfileElement profileElement ;
	public String getAuthId() {
		return authId;
	}
	public void setAuthId(String authId) {
		this.authId = authId;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public ProfileElement getProfileElement(){
		return new ProfileElement(authId, authName, authType, description);
	}
}
