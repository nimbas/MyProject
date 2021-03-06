package com.acube.sub.domain;

import java.io.Serializable;
import java.util.List;

import com.acube.common.domain.BaseDomain;


public class SearchCustEntrVO extends BaseDomain implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7933233768145208995L;
	private String entrNo;
	private String prodNo;
	private String aceno;
	private String billAcntNo;
	private String svcCd;
	private String svcNm;
	private String custNo;
	private String custNm;
	private String custNm0;
	private String custNm1;
	private String custNm2;
	private String custrnmNo;
	private String bsRegNo;
	private String bizRegNm;
	private String frstEntrDttm;
	private String entrSttsCd;
	private String entrSttsNm;
	private String ocsSttsCd;
	private String ocsSttsNm;	
	private String entrChngDttm;
	private String entrSttsChngRsnCd;
	private String entrSttsChngRsnNm;
	private String entrSttsChngRsnDtlCd;
	private String entrSttsChngRsnDtlNm;
	private String estbAddrNo;
	private String fullAddr;
	private String ppayEntrDvCd;
	private String ppayEntrDvNm;
	private String cnvgNo;
	private String cnvgKdCd;
	private String cnvgKdNm;
	private String language;
	private String todayDate;
	private String custDvNm;
	private String prodCd;
	private String imsiNo;
	
	private String prodNm;
	private String svcSttsCd;
	private String svcStrtDttm;
	private String svcEndDttm;
	
	private String mode;
	
	private String rlusrCustNo;
	private String rlusrCustNm;
	
	
	private String ltpymSttsCd;
	private String ltpymSttsNm;
	private String ltpymSttsChngDt;
	private String unpaidAmt;
	private String asParent;
	private String asLevel;
	private String asLeaf;
	private String asExpanded;
	private List<SearchCustEntrVO> subCustEntrs;
	
	public List<SearchCustEntrVO> getSubCustEntrs() {
		return subCustEntrs;
	}
	public void setSubCustEntrs(List<SearchCustEntrVO> subCustEntrs) {
		this.subCustEntrs = subCustEntrs;
	}
	public String getAsExpanded() {
		return asExpanded;
	}
	public void setAsExpanded(String asExpanded) {
		this.asExpanded = asExpanded;
	}
	public String getAsParent() {
		return asParent;
	}
	public void setAsParent(String asParent) {
		this.asParent = asParent;
	}
	public String getAsLevel() {
		return asLevel;
	}
	public void setAsLevel(String asLevel) {
		this.asLevel = asLevel;
	}
	public String getAsLeaf() {
		return asLeaf;
	}
	public void setAsLeaf(String asLeaf) {
		this.asLeaf = asLeaf;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getImsiNo() {
		return imsiNo;
	}
	public void setImsiNo(String imsiNo) {
		this.imsiNo = imsiNo;
	}
	public String getCustNm0() {
		return custNm0;
	}
	public void setCustNm0(String custNm0) {
		this.custNm0 = custNm0;
	}
	public String getCustNm1() {
		return custNm1;
	}
	public void setCustNm1(String custNm1) {
		this.custNm1 = custNm1;
	}
	public String getCustNm2() {
		return custNm2;
	}
	public void setCustNm2(String custNm2) {
		this.custNm2 = custNm2;
	}
	public String getCustDvNm() {
		return custDvNm;
	}
	public void setCustDvNm(String custDvNm) {
		this.custDvNm = custDvNm;
	}
	public String getTodayDate() {
		return todayDate;
	}
	public void setTodayDate(String todayDate) {
		this.todayDate = todayDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
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
	public String getBillAcntNo() {
		return billAcntNo;
	}
	public void setBillAcntNo(String billAcntNo) {
		this.billAcntNo = billAcntNo;
	}
	public String getSvcCd() {
		return svcCd;
	}
	public void setSvcCd(String svcCd) {
		this.svcCd = svcCd;
	}
	public String getSvcNm() {
		return svcNm;
	}
	public void setSvcNm(String svcNm) {
		this.svcNm = svcNm;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustNm() {
		return custNm;
	}
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	public String getCustrnmNo() {
		return custrnmNo;
	}
	public void setCustrnmNo(String custrnmNo) {
		this.custrnmNo = custrnmNo;
	}
	public String getBsRegNo() {
		return bsRegNo;
	}
	public void setBsRegNo(String bsRegNo) {
		this.bsRegNo = bsRegNo;
	}
	public String getBizRegNm() {
		return bizRegNm;
	}
	public void setBizRegNm(String bizRegNm) {
		this.bizRegNm = bizRegNm;
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
	public String getEntrSttsNm() {
		return entrSttsNm;
	}
	public void setEntrSttsNm(String entrSttsNm) {
		this.entrSttsNm = entrSttsNm;
	}
	public String getOcsSttsCd() {
		return ocsSttsCd;
	}
	public void setOcsSttsCd(String ocsSttsCd) {
		this.ocsSttsCd = ocsSttsCd;
	}
	public String getOcsSttsNm() {
		return ocsSttsNm;
	}
	public void setOcsSttsNm(String ocsSttsNm) {
		this.ocsSttsNm = ocsSttsNm;
	}
	public String getEntrSttsChngRsnCd() {
		return entrSttsChngRsnCd;
	}
	public void setEntrSttsChngRsnCd(String entrSttsChngRsnCd) {
		this.entrSttsChngRsnCd = entrSttsChngRsnCd;
	}
	public String getEntrSttsChngRsnNm() {
		return entrSttsChngRsnNm;
	}
	public void setEntrSttsChngRsnNm(String entrSttsChngRsnNm) {
		this.entrSttsChngRsnNm = entrSttsChngRsnNm;
	}
	public String getEntrSttsChngRsnDtlCd() {
		return entrSttsChngRsnDtlCd;
	}
	public void setEntrSttsChngRsnDtlCd(String entrSttsChngRsnDtlCd) {
		this.entrSttsChngRsnDtlCd = entrSttsChngRsnDtlCd;
	}
	public String getEntrSttsChngRsnDtlNm() {
		return entrSttsChngRsnDtlNm;
	}
	public void setEntrSttsChngRsnDtlNm(String entrSttsChngRsnDtlNm) {
		this.entrSttsChngRsnDtlNm = entrSttsChngRsnDtlNm;
	}
	public String getEstbAddrNo() {
		return estbAddrNo;
	}
	public void setEstbAddrNo(String estbAddrNo) {
		this.estbAddrNo = estbAddrNo;
	}
	public String getFullAddr() {
		return fullAddr;
	}
	public void setFullAddr(String fullAddr) {
		this.fullAddr = fullAddr;
	}
	public String getPpayEntrDvCd() {
		return ppayEntrDvCd;
	}
	public void setPpayEntrDvCd(String ppayEntrDvCd) {
		this.ppayEntrDvCd = ppayEntrDvCd;
	}
	public String getPpayEntrDvNm() {
		return ppayEntrDvNm;
	}
	public void setPpayEntrDvNm(String ppayEntrDvNm) {
		this.ppayEntrDvNm = ppayEntrDvNm;
	}
	public String getCnvgNo() {
		return cnvgNo;
	}
	public void setCnvgNo(String cnvgNo) {
		this.cnvgNo = cnvgNo;
	}
	public String getCnvgKdCd() {
		return cnvgKdCd;
	}
	public void setCnvgKdCd(String cnvgKdCd) {
		this.cnvgKdCd = cnvgKdCd;
	}
	public String getCnvgKdNm() {
		return cnvgKdNm;
	}
	public void setCnvgKdNm(String cnvgKdNm) {
		this.cnvgKdNm = cnvgKdNm;
	}
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public String getSvcStrtDttm() {
		return svcStrtDttm;
	}
	public String getSvcEndDttm() {
		return svcEndDttm;
	}
	public void setSvcStrtDttm(String svcStrtDttm) {
		this.svcStrtDttm = svcStrtDttm;
	}
	public void setSvcEndDttm(String svcEndDttm) {
		this.svcEndDttm = svcEndDttm;
	}
	public String getEntrChngDttm() {
		return entrChngDttm;
	}
	public void setEntrChngDttm(String entrChngDttm) {
		this.entrChngDttm = entrChngDttm;
	}
	public String getSvcSttsCd() {
		return svcSttsCd;
	}
	public void setSvcSttsCd(String svcSttsCd) {
		this.svcSttsCd = svcSttsCd;
	}
	public String getProdNm() {
		return prodNm;
	}
	public void setProdNm(String prodNm) {
		this.prodNm = prodNm;
	}
	public String getRlusrCustNo() {
		return rlusrCustNo;
	}
	public void setRlusrCustNo(String rlusrCustNo) {
		this.rlusrCustNo = rlusrCustNo;
	}
	public String getRlusrCustNm() {
		return rlusrCustNm;
	}
	public void setRlusrCustNm(String rlusrCustNm) {
		this.rlusrCustNm = rlusrCustNm;
	}
	public String getLtpymSttsCd() {
		return ltpymSttsCd;
	}
	public String getLtpymSttsNm() {
		return ltpymSttsNm;
	}
	public String getLtpymSttsChngDt() {
		return ltpymSttsChngDt;
	}
	public void setLtpymSttsCd(String ltpymSttsCd) {
		this.ltpymSttsCd = ltpymSttsCd;
	}
	public void setLtpymSttsNm(String ltpymSttsNm) {
		this.ltpymSttsNm = ltpymSttsNm;
	}
	public void setLtpymSttsChngDt(String ltpymSttsChngDt) {
		this.ltpymSttsChngDt = ltpymSttsChngDt;
	}
	public String getUnpaidAmt() {
		return unpaidAmt;
	}
	public void setUnpaidAmt(String unpaidAmt) {
		this.unpaidAmt = unpaidAmt;
	}
	
}
