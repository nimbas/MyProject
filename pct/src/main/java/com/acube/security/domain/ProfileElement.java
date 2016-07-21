package com.acube.security.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class ProfileElement extends BaseDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 76970804368643210L;
	private String objectId;
	private String objectName;
	private String objectType;
	private String description;
	private String profileId;
	private String profileType;
	public ProfileElement(){
		
	}
	public ProfileElement(String objectId, String objectName, String ojbectType, String description){
		this.objectId=objectId;     
		this.objectName=objectName;   
		this.objectType=ojbectType;   
		this.description=description;  
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public String getObjectName() {
		return objectName;
	}
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProfileId() {
		return profileId;
	}
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	public String getProfileType() {
		return profileType;
	}
	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}
		
}
