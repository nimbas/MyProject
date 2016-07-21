/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.domain;

import java.util.Date;

/**
 *
 * @author YangByeongSub
 * @since
 *
 */
public abstract class BaseDomain implements Base {

	private int rowNumber;
	private int totalCount;
	
	private Date sysCreationDate;
	private Date sysUpdateDate;
	private String operatorId;
	private String applicationId;
	private String dlServiceCode;
	private Short dlUpdateStamp;

	private WorkType workType = WorkType.NONE;//디폴트값이 NONE인 이유는 디폴트로 아무런 작업하지 말라는 의미
	private Result result ;
	
	@Override
	public int getRowNumber() {
		return rowNumber;
	}

	@Override
	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
	}

	@Override
	public int getTotalCount() {
		return totalCount;
	}

	@Override
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public Date getSysCreationDate() {
		return sysCreationDate;
	}

	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	public Date getSysUpdateDate() {
		return sysUpdateDate;
	}

	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	public String getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getDlServiceCode() {
		return dlServiceCode;
	}

	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	public Short getDlUpdateStamp() {
		return dlUpdateStamp;
	}

	public void setDlUpdateStamp(Short dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}
	
	public WorkType getWorkType() {
		return workType;
	}

	public void setWorkType(WorkType workType) {
		this.workType = workType;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public void setBaseInfo(Date workDate, String operatorId, String applicationId){
		this.sysCreationDate = workDate ;
		this.sysUpdateDate 	 = workDate ;
		this.operatorId 	 = operatorId;
		this.applicationId  = applicationId;
	}
	
	public Object[] copyBaseInfo(){
		Object[] baseInfo = new Object[4];
		baseInfo[0] = this.sysCreationDate;
		baseInfo[1] = this.sysUpdateDate ;
		baseInfo[2] = this.operatorId;
		baseInfo[3] = this.applicationId;
		return baseInfo ;
	}
	
	public Object[] pasteBaseInfo2(Object[] baseInfo){
		this.sysCreationDate = (Date)baseInfo[0];  
		this.sysUpdateDate   = (Date)baseInfo[1]; 
		this.operatorId      = (String)baseInfo[2];
		this.applicationId   = (String)baseInfo[3];
		return baseInfo ;
	}
	
	public void setBaseInfo(BaseDomain base){
		this.sysCreationDate = base.getSysCreationDate();  
		this.sysUpdateDate   = base.getSysUpdateDate(); 
		this.operatorId      = base.getOperatorId();
		this.applicationId   = base.getApplicationId();
	}
}
