package com.acube.pvs.domain.statistics;

import java.io.Serializable;

public class ProvStatistic implements Serializable{

	
	/*  */
	private static final long serialVersionUID = 8205898153639895692L;
	private String reqDate	   ;
	private String eventCd    ;
	private String eventName  ;
	private int sCnt          ;
	private int eCnt          ;
	private int pCnt          ;
	private int nCnt          ;
	public ProvStatistic(){
		
	}
	public ProvStatistic(String reqDate, int sCnt, int eCnt, int pCnt, int nCnt){
		this.reqDate = reqDate ;
		this.sCnt = sCnt ;
		this.eCnt = eCnt ;
		this.pCnt = pCnt ;
		this.nCnt = nCnt ;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getsCnt() {
		return sCnt;
	}
	public void setsCnt(int sCnt) {
		this.sCnt = sCnt;
	}
	public int geteCnt() {
		return eCnt;
	}
	public void seteCnt(int eCnt) {
		this.eCnt = eCnt;
	}
	public int getpCnt() {
		return pCnt;
	}
	public void setpCnt(int pCnt) {
		this.pCnt = pCnt;
	}
	public int getnCnt() {
		return nCnt;
	}
	public void setnCnt(int nCnt) {
		this.nCnt = nCnt;
	}
	
}
