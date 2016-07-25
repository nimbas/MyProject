/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.security.domain;

import java.io.Serializable;



/**
 *
 * @author YangByeongSub
 * @since
 *
 */
public class Role implements Serializable{
	/*  */
	private static final long serialVersionUID = 8621594026398514198L;
	private String roleId ;
	private String roleName ;
	
	public Role(String roleId){
		this.roleId = roleId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
