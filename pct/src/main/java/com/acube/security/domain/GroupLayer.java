package com.acube.security.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class GroupLayer extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6254715273288381020L;

	private String id;
	private String level;
	private String groupSeq;
	private String groupName;
	private String userSeq;
	private String userId;
	private String parent;
	private String treeName; // jsTree용
	private String description; // jsTree용
	private String leapMode;
	private boolean children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGroupSeq() {
		return groupSeq;
	}

	public void setGroupSeq(String groupSeq) {
		this.groupSeq = groupSeq;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getLeapMode() {
		return leapMode;
	}

	public void setLeapMode(String leapMode) {
		this.leapMode = leapMode;
	}

	public boolean isChildren() {
		return children;
	}

	public void setChildren(boolean children) {
		this.children = children;
	}

	/**
	 * @return the treeName
	 */
	public String getTreeName() {
		return treeName;
	}

	/**
	 * @param treeName
	 *            the treeName to set
	 */
	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "GroupLayer [id=" + id + ", level=" + level + ", groupSeq=" + groupSeq + ", groupName=" + groupName + ", userSeq=" + userSeq + ", userId=" + userId + ", parent=" + parent + ", treeName=" + treeName + "]";
	}

}