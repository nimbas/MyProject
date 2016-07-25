package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;
import com.acube.common.domain.WorkType;

public class CustomerFile extends BaseDomain implements Serializable {
	private static final long serialVersionUID = 3068779534839027918L;
	private String  fileSeqno ;
	private String  custNo    ;
	private String  fileDvCd  ;
	private String  fileDtlDvCd  ;
	private String  filePath  ;
	private String  fileName  ;
	private String  entrNo    ;
	private boolean enabled   ;
	private WorkType workType;
	
	private String fileDtlDvCds[] ;
	public String getFileSeqno() {
		return fileSeqno;
	}
	public void setFileSeqno(String fileSeqno) {
		this.fileSeqno = fileSeqno;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getFileDvCd() {
		return fileDvCd;
	}
	public void setFileDvCd(String fileDvCd) {
		this.fileDvCd = fileDvCd;
	}
	public String getFileDtlDvCd() {
		return fileDtlDvCd;
	}
	public void setFileDtlDvCd(String fileDtlDvCd) {
		this.fileDtlDvCd = fileDtlDvCd;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String[] getFileDtlDvCds() {
		return fileDtlDvCds;
	}
	public void setFileDtlDvCds(String[] fileDtlDvCds) {
		this.fileDtlDvCds = fileDtlDvCds;
	}
	public WorkType getWorkType() {
		return workType;
	}
	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}

}
