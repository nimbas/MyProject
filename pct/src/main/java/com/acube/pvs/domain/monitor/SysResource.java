package com.acube.pvs.domain.monitor;

public class SysResource {

	private String hostName ;
	private String datetime ;
	private String name     ;
	private String tot      ;
	private String use      ;
	private String unuse    ;
	private String ratio    ;
	private String unusedratio;
	
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
	/**
	 * @return the unusedratio
	 */
	public String getUnusedratio() {
		return unusedratio;
	}
	/**
	 * @param unusedratio the unusedratio to set
	 */
	public void setUnusedratio(String unusedratio) {
		this.unusedratio = unusedratio;
	}
	
}
