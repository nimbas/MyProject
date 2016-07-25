/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class EntrInfo  extends BaseDomain implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String entrNo               ;
	private String prodNo               ;
	private String aceno                ;
	private String svcCd                ;
	private String custNo               ;
	private String vpnRepNoYn           ;
	private String rlusrCustNo          ;
	private String entrChngDttm         ;
	private String frstEntrDttm         ;
	private String entrSttsCd           ;
	private String entrSttsChngRsnCd    ;
	private String entrSttsChngRsnDtlCd ;
	private String entrDlrCd            ;
	private String mgmtDlrCd            ;
	private String marketCode           ;
	private String entrSttsChngDttm     ;
	private String homecdNo             ;
	private String estbAddrNo           ;
	private String entrKdCd             ;
	private String entrBizPlcyCd        ;
	private String imsiNo               ;
	private String minNo                ;
	private String chngBfrProdNo        ;
	private String chngAftProdNo        ;
	private String chngBfrBillAcntNo    ;
	private String chngAftBillAcntNo    ;
	private String chngBfrNameCustNo    ;
	private String chngAftNameCustNo    ;
	private String sprtRtngYn           ;
	private String sprtRtngValdEndDt    ;
	private String sendPhbYn            ;
	private String icallPhbYn           ;
	private String ppayEntrDvCd         ;
	private String schdlAdjmtRsnDvCd    ;
	private String custSbgnHopeDt       ;
	private String sbgnApntDt           ;
	private String expryHopeDt          ;
	private String hpno                 ;
	private String beginEbcstExmpYn     ;
	private String bfrEbcstExmpYn       ;
	private String expryCvrtDvCd        ;
	private String pymapntDt            ;
	private String pymapntExectYn       ;
	private String costRvrtDeptCd       ;
	private String frstRqstDt           ;
	private String indcId               ;
	private String mngrId               ;
	private String reqDate              ;
	private String billAcntNo           ;
	
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getProdNo() {
		return prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}
	public String getAceno() {
		return aceno;
	}
	public void setAceno(String aceno) {
		this.aceno = aceno;
	}
	public String getSvcCd() {
		return svcCd;
	}
	public void setSvcCd(String svcCd) {
		this.svcCd = svcCd;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getVpnRepNoYn() {
		return vpnRepNoYn;
	}
	public void setVpnRepNoYn(String vpnRepNoYn) {
		this.vpnRepNoYn = vpnRepNoYn;
	}
	public String getRlusrCustNo() {
		return rlusrCustNo;
	}
	public void setRlusrCustNo(String rlusrCustNo) {
		this.rlusrCustNo = rlusrCustNo;
	}
	public String getEntrChngDttm() {
		return entrChngDttm;
	}
	public void setEntrChngDttm(String entrChngDttm) {
		this.entrChngDttm = entrChngDttm;
	}
	public String getFrstEntrDttm() {
		return frstEntrDttm;
	}
	public void setFrstEntrDttm(String frstEntrDttm) {
		this.frstEntrDttm = frstEntrDttm;
	}
	public String getEntrSttsCd() {
		return entrSttsCd;
	}
	public void setEntrSttsCd(String entrSttsCd) {
		this.entrSttsCd = entrSttsCd;
	}
	public String getEntrSttsChngRsnCd() {
		return entrSttsChngRsnCd;
	}
	public void setEntrSttsChngRsnCd(String entrSttsChngRsnCd) {
		this.entrSttsChngRsnCd = entrSttsChngRsnCd;
	}
	public String getEntrSttsChngRsnDtlCd() {
		return entrSttsChngRsnDtlCd;
	}
	public void setEntrSttsChngRsnDtlCd(String entrSttsChngRsnDtlCd) {
		this.entrSttsChngRsnDtlCd = entrSttsChngRsnDtlCd;
	}
	public String getEntrDlrCd() {
		return entrDlrCd;
	}
	public void setEntrDlrCd(String entrDlrCd) {
		this.entrDlrCd = entrDlrCd;
	}
	public String getMgmtDlrCd() {
		return mgmtDlrCd;
	}
	public void setMgmtDlrCd(String mgmtDlrCd) {
		this.mgmtDlrCd = mgmtDlrCd;
	}
	public String getMarketCode() {
		return marketCode;
	}
	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}
	public String getEntrSttsChngDttm() {
		return entrSttsChngDttm;
	}
	public void setEntrSttsChngDttm(String entrSttsChngDttm) {
		this.entrSttsChngDttm = entrSttsChngDttm;
	}
	public String getHomecdNo() {
		return homecdNo;
	}
	public void setHomecdNo(String homecdNo) {
		this.homecdNo = homecdNo;
	}
	public String getEstbAddrNo() {
		return estbAddrNo;
	}
	public void setEstbAddrNo(String estbAddrNo) {
		this.estbAddrNo = estbAddrNo;
	}
	public String getEntrKdCd() {
		return entrKdCd;
	}
	public void setEntrKdCd(String entrKdCd) {
		this.entrKdCd = entrKdCd;
	}
	public String getEntrBizPlcyCd() {
		return entrBizPlcyCd;
	}
	public void setEntrBizPlcyCd(String entrBizPlcyCd) {
		this.entrBizPlcyCd = entrBizPlcyCd;
	}
	public String getImsiNo() {
		return imsiNo;
	}
	public void setImsiNo(String imsiNo) {
		this.imsiNo = imsiNo;
	}
	public String getMinNo() {
		return minNo;
	}
	public void setMinNo(String minNo) {
		this.minNo = minNo;
	}
	public String getChngBfrProdNo() {
		return chngBfrProdNo;
	}
	public void setChngBfrProdNo(String chngBfrProdNo) {
		this.chngBfrProdNo = chngBfrProdNo;
	}
	public String getChngAftProdNo() {
		return chngAftProdNo;
	}
	public void setChngAftProdNo(String chngAftProdNo) {
		this.chngAftProdNo = chngAftProdNo;
	}
	public String getChngBfrBillAcntNo() {
		return chngBfrBillAcntNo;
	}
	public void setChngBfrBillAcntNo(String chngBfrBillAcntNo) {
		this.chngBfrBillAcntNo = chngBfrBillAcntNo;
	}
	public String getChngAftBillAcntNo() {
		return chngAftBillAcntNo;
	}
	public void setChngAftBillAcntNo(String chngAftBillAcntNo) {
		this.chngAftBillAcntNo = chngAftBillAcntNo;
	}
	public String getChngBfrNameCustNo() {
		return chngBfrNameCustNo;
	}
	public void setChngBfrNameCustNo(String chngBfrNameCustNo) {
		this.chngBfrNameCustNo = chngBfrNameCustNo;
	}
	public String getChngAftNameCustNo() {
		return chngAftNameCustNo;
	}
	public void setChngAftNameCustNo(String chngAftNameCustNo) {
		this.chngAftNameCustNo = chngAftNameCustNo;
	}
	public String getSprtRtngYn() {
		return sprtRtngYn;
	}
	public void setSprtRtngYn(String sprtRtngYn) {
		this.sprtRtngYn = sprtRtngYn;
	}
	public String getSprtRtngValdEndDt() {
		return sprtRtngValdEndDt;
	}
	public void setSprtRtngValdEndDt(String sprtRtngValdEndDt) {
		this.sprtRtngValdEndDt = sprtRtngValdEndDt;
	}
	public String getSendPhbYn() {
		return sendPhbYn;
	}
	public void setSendPhbYn(String sendPhbYn) {
		this.sendPhbYn = sendPhbYn;
	}
	public String getIcallPhbYn() {
		return icallPhbYn;
	}
	public void setIcallPhbYn(String icallPhbYn) {
		this.icallPhbYn = icallPhbYn;
	}
	public String getPpayEntrDvCd() {
		return ppayEntrDvCd;
	}
	public void setPpayEntrDvCd(String ppayEntrDvCd) {
		this.ppayEntrDvCd = ppayEntrDvCd;
	}
	public String getSchdlAdjmtRsnDvCd() {
		return schdlAdjmtRsnDvCd;
	}
	public void setSchdlAdjmtRsnDvCd(String schdlAdjmtRsnDvCd) {
		this.schdlAdjmtRsnDvCd = schdlAdjmtRsnDvCd;
	}
	public String getCustSbgnHopeDt() {
		return custSbgnHopeDt;
	}
	public void setCustSbgnHopeDt(String custSbgnHopeDt) {
		this.custSbgnHopeDt = custSbgnHopeDt;
	}
	public String getSbgnApntDt() {
		return sbgnApntDt;
	}
	public void setSbgnApntDt(String sbgnApntDt) {
		this.sbgnApntDt = sbgnApntDt;
	}
	public String getExpryHopeDt() {
		return expryHopeDt;
	}
	public void setExpryHopeDt(String expryHopeDt) {
		this.expryHopeDt = expryHopeDt;
	}
	public String getHpno() {
		return hpno;
	}
	public void setHpno(String hpno) {
		this.hpno = hpno;
	}
	public String getBeginEbcstExmpYn() {
		return beginEbcstExmpYn;
	}
	public void setBeginEbcstExmpYn(String beginEbcstExmpYn) {
		this.beginEbcstExmpYn = beginEbcstExmpYn;
	}
	public String getBfrEbcstExmpYn() {
		return bfrEbcstExmpYn;
	}
	public void setBfrEbcstExmpYn(String bfrEbcstExmpYn) {
		this.bfrEbcstExmpYn = bfrEbcstExmpYn;
	}
	public String getExpryCvrtDvCd() {
		return expryCvrtDvCd;
	}
	public void setExpryCvrtDvCd(String expryCvrtDvCd) {
		this.expryCvrtDvCd = expryCvrtDvCd;
	}
	public String getPymapntDt() {
		return pymapntDt;
	}
	public void setPymapntDt(String pymapntDt) {
		this.pymapntDt = pymapntDt;
	}
	public String getPymapntExectYn() {
		return pymapntExectYn;
	}
	public void setPymapntExectYn(String pymapntExectYn) {
		this.pymapntExectYn = pymapntExectYn;
	}
	public String getCostRvrtDeptCd() {
		return costRvrtDeptCd;
	}
	public void setCostRvrtDeptCd(String costRvrtDeptCd) {
		this.costRvrtDeptCd = costRvrtDeptCd;
	}
	public String getFrstRqstDt() {
		return frstRqstDt;
	}
	public void setFrstRqstDt(String frstRqstDt) {
		this.frstRqstDt = frstRqstDt;
	}
	public String getIndcId() {
		return indcId;
	}
	public void setIndcId(String indcId) {
		this.indcId = indcId;
	}
	public String getMngrId() {
		return mngrId;
	}
	public void setMngrId(String mngrId) {
		this.mngrId = mngrId;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getBillAcntNo() {
		return billAcntNo;
	}
	public void setBillAcntNo(String billAcntNo) {
		this.billAcntNo = billAcntNo;
	}
	@Override
	public String toString() {
		return "EntrInfo ["
	            +  "entrNo="                  + entrNo 
	            +  ", prodNo="                + prodNo 
	            +  ", aceno="                 + aceno 
	            +  ", svcCd="                 + svcCd
				+  ", custNo="                + custNo 
				+  ", vpnRepNoYn="            + vpnRepNoYn 
				+  ", rlusrCustNo="           + rlusrCustNo
				+  ", entrChngDttm="          + entrChngDttm 
				+  ", frstEntrDttm="          + frstEntrDttm 
				+  ", entrSttsCd="            + entrSttsCd
				+  ", entrSttsChngRsnCd="     + entrSttsChngRsnCd 
				+  ", entrSttsChngRsnDtlCd="  + entrSttsChngRsnDtlCd
				+  ", entrDlrCd="             + entrDlrCd 
				+  ", mgmtDlrCd="             + mgmtDlrCd 
				+  ", marketCode="            + marketCode
				+  ", entrSttsChngDttm="      + entrSttsChngDttm
				+  ", homecdNo="              + homecdNo
				+  ", estbAddrNo="            + estbAddrNo
				+  ", entrKdCd="              + entrKdCd
				+  ", entrBizPlcyCd="         + entrBizPlcyCd
				+  ", imsiNo="                + imsiNo
				+  ", minNo="                 + minNo 
				+  ", chngBfrProdNo="         + chngBfrProdNo 
				+  ", chngAftProdNo="         + chngAftProdNo
				+  ", chngBfrBillAcntNo="     + chngBfrBillAcntNo
				+  ", chngAftBillAcntNo="     + chngAftBillAcntNo
				+  ", chngBfrNameCustNo="     + chngBfrNameCustNo
				+  ", chngAftNameCustNo="     + chngAftNameCustNo
				+  ", sprtRtngYn="            + sprtRtngYn 
				+  ", sprtRtngValdEndDt="     + sprtRtngValdEndDt 
				+  ", sendPhbYn="             + sendPhbYn
				+  ", icallPhbYn="            + icallPhbYn 
				+  ", ppayEntrDvCd="          + ppayEntrDvCd 
				+  ", schdlAdjmtRsnDvCd="     + schdlAdjmtRsnDvCd 
				+  ", custSbgnHopeDt="        + custSbgnHopeDt 
				+  ", sbgnApntDt="            + sbgnApntDt
				+  ", expryHopeDt="           + expryHopeDt
				+  ", hpno="                  + hpno
				+  ", beginEbcstExmpYn="      + beginEbcstExmpYn
				+  ", bfrEbcstExmpYn="        + bfrEbcstExmpYn
				+  ", expryCvrtDvCd="         + expryCvrtDvCd
				+  ", pymapntDt="             + pymapntDt
				+  ", pymapntExectYn="        + pymapntExectYn
				+  ", costRvrtDeptCd="        + costRvrtDeptCd
				+  ", frstRqstDt="            + frstRqstDt 
				+  ", indcId="                + indcId 
				+  ", mngrId="                + mngrId
				+  ", reqDate="               + reqDate 
				+  ", billAcntNo="            + billAcntNo        + "]";
	}
	
	
}
