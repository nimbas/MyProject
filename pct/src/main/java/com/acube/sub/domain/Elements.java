package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class Elements extends BaseDomain implements Serializable, Cloneable {
private static final long serialVersionUID = -8130585539092290240L;

	
	private String securityNo;
	private String recordType;
	private String menuType;
	private String menuId;
	private String topMenuId;
	private String menuOrd;
	private String windowId;
	private String windowDesc;
	private String notCommandId;
	private String description;
	private String descriptionMsg;
	
	private String id;
	private String level;
	private String menulevel;
	private String parent;
	private boolean isLeaf;
	private boolean expanded;
	private boolean loaded;
	private String mode;
	private boolean checkVal;
	
	private String lang;
	
	
	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Elements(){
		isLeaf = false;
		expanded = false;
		loaded = true;
	}
	
	public String getSecurityNo() {
		return securityNo;
	}
	public void setSecurityNo(String securityNo) {
		this.securityNo = securityNo;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getMenuType() {
		return menuType;
	}
	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getTopMenuId() {
		return topMenuId;
	}
	public void setTopMenuId(String topMenuId) {
		this.topMenuId = topMenuId;
	}
	
	public String getMenuOrd() {
		return menuOrd;
	}
	public void setMenuOrd(String menuOrd) {
		this.menuOrd = menuOrd;
	}
	public String getWindowId() {
		return windowId;
	}
	public void setWindowId(String windowId) {
		this.windowId = windowId;
	}
	public String getWindowDesc() {
		return windowDesc;
	}
	public void setWindowDesc(String windowDesc) {
		this.windowDesc = windowDesc;
	}
	public String getNotCommandId() {
		return notCommandId;
	}
	public void setNotCommandId(String notCommandId) {
		this.notCommandId = notCommandId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public String getLevel() {
		return menulevel;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getMenulevel() {
		return menulevel;
	}
	
	public void setMenuLevel(String menulevel) {
		this.menulevel = menulevel;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public boolean getIsLeaf() {
		return isLeaf;
	}
	public void setIsLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	public boolean getExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean getLoaded() {
		return loaded;
	}
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	
	public String getId() {
		return securityNo;
	}
	public void setId(String id) {
		this.id = id;
	}

	public boolean getCheckVal() {
		return checkVal;
	}

	public void setCheckVal(boolean checkVal) {
		this.checkVal = checkVal;
	}

	public String getDescriptionMsg() {
		return descriptionMsg;
	}

	public void setDescriptionMsg(String descriptionMsg) {
		this.descriptionMsg = descriptionMsg;
	}

}
