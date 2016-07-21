package com.acube.pvs.domain.monitor;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class SysResourceTree  extends BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7408293570893832762L;
	
	private String hostName ;
	private String datetime ;
	private String name     ;
	private String tot      ;
	private String use      ;
	private String unuse    ;
	private String ratio    ;
	private String category ;
	private String diskcomment;
	
	private String id;
	private String parent;
	private int lvl;
	private int level;
	private boolean isIsLeaf;
	private boolean expanded;
	private boolean loaded;
	
	
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTot() {
		return tot;
	}
	public void setTot(String tot) {
		this.tot = tot;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getUnuse() {
		return unuse;
	}
	public void setUnuse(String unuse) {
		this.unuse = unuse;
	}
	public String getRatio() {
		return ratio;
	}
	public void setRatio(String ratio) {
		this.ratio = ratio;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the diskcomment
	 */
	public String getDiskcomment() {
		return diskcomment;
	}
	/**
	 * @param diskcomment the diskcomment to set
	 */
	public void setDiskcomment(String diskcomment) {
		this.diskcomment = diskcomment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public boolean isIsLeaf() {
		return isIsLeaf;
	}
	public void setIsLeaf(boolean isIsLeaf) {
		this.isIsLeaf = isIsLeaf;
	}
	public boolean isExpanded() {
		return expanded;
	}
	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	public boolean isLoaded() {
		return loaded;
	}
	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
