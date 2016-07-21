package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class EntrProduct extends BaseDomain implements Serializable, Cloneable {
	private static final long serialVersionUID = -3227087764324507145L;
	private String entrNo               ;
	private String entrSvcSeqno         ;
	private String svcCd                ;
	private String svcNm                ;
	private String prodCd               ;
	private String prodName             ;
	private String hposSvcCd            ;
	private String hposSvcNm            ;
	private String parentYn             ;
	private String hposEntrSvcSeqno     ;
	private String svcKdCd              ;
	private String svcKdNm              ;
	private String svcDtlCd             ;
	private String svcSttsCd            ;
	private String svcSttsNm            ;
	private String svcSttsChngDttm      ;
	private String svcFrstStrtDttm      ;
	private String svcStrtDttm          ;
	private String svcStrtRsnCd         ;
	private String svcStrtRgstDttm      ;
	private String svcEndDttm           ;
	private String svcEndRsnCd          ;
	private String svcEndRgstDttm       ;
	private String svcDutyUseStrtDt     ;
	private String svcDutyUseEndDt      ;
	private String svcDutyUseMnthCn     ;
	private String svcDutyUseDvCd       ;
	private String trstnNo              ;
	private String billAcntNo           ;
	private String svcGrpCd             ;
	private String svcRelsDvCd          ;
	private String ndblCvrtSvcCd        ;
	private String rsvEndYn             ;
	private String rsvEndDt             ;
	private String svcGrSeqno           ;
	private String rtngStrtDttm         ;
	private String rtngEndDttm          ;
	private String aplyLvlCd            ;
	private String sbgnChngApntDt       ;
	private String aceno                ;
	private String devByEntrSeqno       ;
	private String prpayYn              ;
	private String ndblEntrSvcSeqno     ;
	private String lastIndcId           ;
	private String svcStrtRgstDlrCd     ;
	private String svcStrtRgstDlrNm     ;
	private String prodCustHopeDt       ;
	private String defRate				;                
	private String deciFctrVlue1      	;
	private String deciFctrVlue2      	;
	private String deciFctrVlue3      	;
	private String deciFctrVlue4      	;
	private String deciFctrVlue5      	;
	private String deciFctrVlue6      	;
	private String deciFctrVlue7      	;
	private String deciFctrVlue8      	;
	private String deciFctrVlue9      	;
	private String deciAmt	          	;
	
	
	private String treatment	        ;
	private String monthlyFee	        ;
	private String rqstSttsCd	        ;
	
	private String treatmentYn	        ;
	private String thresholdYn	        ;
	private String limitDay	          	;		
	private String hposProdCd			;
	
	private String rsrvProdCd			;
	private String rsrvProdNm			;
	private String cfuNo				;
	private String loanPassword			;
	
	// private ProductDvCd productDvCd		;
	private String dscntPlcyNo  		;
	
	
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getEntrSvcSeqno() {
		return entrSvcSeqno;
	}
	public void setEntrSvcSeqno(String entrSvcSeqno) {
		this.entrSvcSeqno = entrSvcSeqno;
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
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getHposSvcCd() {
		return hposSvcCd;
	}
	public void setHposSvcCd(String hposSvcCd) {
		this.hposSvcCd = hposSvcCd;
	}
	public String getHposSvcNm() {
		return hposSvcNm;
	}
	public void setHposSvcNm(String hposSvcNm) {
		this.hposSvcNm = hposSvcNm;
	}
	public String getParentYn() {
		return parentYn;
	}
	public void setParentYn(String parentYn) {
		this.parentYn = parentYn;
	}
	public String getHposEntrSvcSeqno() {
		return hposEntrSvcSeqno;
	}
	public void setHposEntrSvcSeqno(String hposEntrSvcSeqno) {
		this.hposEntrSvcSeqno = hposEntrSvcSeqno;
	}
	public String getSvcKdCd() {
		return svcKdCd;
	}
	public void setSvcKdCd(String svcKdCd) {
		this.svcKdCd = svcKdCd;
	}
	public String getSvcKdNm() {
		return svcKdNm;
	}
	public void setSvcKdNm(String svcKdNm) {
		this.svcKdNm = svcKdNm;
	}
	public String getSvcDtlCd() {
		return svcDtlCd;
	}
	public void setSvcDtlCd(String svcDtlCd) {
		this.svcDtlCd = svcDtlCd;
	}
	public String getSvcSttsCd() {
		return svcSttsCd;
	}
	public void setSvcSttsCd(String svcSttsCd) {
		this.svcSttsCd = svcSttsCd;
	}
	public String getSvcSttsNm() {
		return svcSttsNm;
	}
	public void setSvcSttsNm(String svcSttsNm) {
		this.svcSttsNm = svcSttsNm;
	}
	public String getSvcSttsChngDttm() {
		return svcSttsChngDttm;
	}
	public void setSvcSttsChngDttm(String svcSttsChngDttm) {
		this.svcSttsChngDttm = svcSttsChngDttm;
	}
	public String getSvcFrstStrtDttm() {
		return svcFrstStrtDttm;
	}
	public void setSvcFrstStrtDttm(String svcFrstStrtDttm) {
		this.svcFrstStrtDttm = svcFrstStrtDttm;
	}
	public String getSvcStrtDttm() {
		return svcStrtDttm;
	}
	public void setSvcStrtDttm(String svcStrtDttm) {
		this.svcStrtDttm = svcStrtDttm;
	}
	public String getSvcStrtRsnCd() {
		return svcStrtRsnCd;
	}
	public void setSvcStrtRsnCd(String svcStrtRsnCd) {
		this.svcStrtRsnCd = svcStrtRsnCd;
	}
	public String getSvcStrtRgstDttm() {
		return svcStrtRgstDttm;
	}
	public void setSvcStrtRgstDttm(String svcStrtRgstDttm) {
		this.svcStrtRgstDttm = svcStrtRgstDttm;
	}
	public String getSvcEndDttm() {
		return svcEndDttm;
	}
	public void setSvcEndDttm(String svcEndDttm) {
		this.svcEndDttm = svcEndDttm;
	}
	public String getSvcEndRsnCd() {
		return svcEndRsnCd;
	}
	public void setSvcEndRsnCd(String svcEndRsnCd) {
		this.svcEndRsnCd = svcEndRsnCd;
	}
	public String getSvcEndRgstDttm() {
		return svcEndRgstDttm;
	}
	public void setSvcEndRgstDttm(String svcEndRgstDttm) {
		this.svcEndRgstDttm = svcEndRgstDttm;
	}
	public String getSvcDutyUseStrtDt() {
		return svcDutyUseStrtDt;
	}
	public void setSvcDutyUseStrtDt(String svcDutyUseStrtDt) {
		this.svcDutyUseStrtDt = svcDutyUseStrtDt;
	}
	public String getSvcDutyUseEndDt() {
		return svcDutyUseEndDt;
	}
	public void setSvcDutyUseEndDt(String svcDutyUseEndDt) {
		this.svcDutyUseEndDt = svcDutyUseEndDt;
	}
	public String getSvcDutyUseMnthCn() {
		return svcDutyUseMnthCn;
	}
	public void setSvcDutyUseMnthCn(String svcDutyUseMnthCn) {
		this.svcDutyUseMnthCn = svcDutyUseMnthCn;
	}
	public String getSvcDutyUseDvCd() {
		return svcDutyUseDvCd;
	}
	public void setSvcDutyUseDvCd(String svcDutyUseDvCd) {
		this.svcDutyUseDvCd = svcDutyUseDvCd;
	}
	public String getTrstnNo() {
		return trstnNo;
	}
	public void setTrstnNo(String trstnNo) {
		this.trstnNo = trstnNo;
	}
	public String getBillAcntNo() {
		return billAcntNo;
	}
	public void setBillAcntNo(String billAcntNo) {
		this.billAcntNo = billAcntNo;
	}
	public String getSvcGrpCd() {
		return svcGrpCd;
	}
	public void setSvcGrpCd(String svcGrpCd) {
		this.svcGrpCd = svcGrpCd;
	}
	public String getSvcRelsDvCd() {
		return svcRelsDvCd;
	}
	public void setSvcRelsDvCd(String svcRelsDvCd) {
		this.svcRelsDvCd = svcRelsDvCd;
	}
	public String getNdblCvrtSvcCd() {
		return ndblCvrtSvcCd;
	}
	public void setNdblCvrtSvcCd(String ndblCvrtSvcCd) {
		this.ndblCvrtSvcCd = ndblCvrtSvcCd;
	}
	public String getRsvEndYn() {
		return rsvEndYn;
	}
	public void setRsvEndYn(String rsvEndYn) {
		this.rsvEndYn = rsvEndYn;
	}
	public String getRsvEndDt() {
		return rsvEndDt;
	}
	public void setRsvEndDt(String rsvEndDt) {
		this.rsvEndDt = rsvEndDt;
	}
	public String getSvcGrSeqno() {
		return svcGrSeqno;
	}
	public void setSvcGrSeqno(String svcGrSeqno) {
		this.svcGrSeqno = svcGrSeqno;
	}
	public String getRtngStrtDttm() {
		return rtngStrtDttm;
	}
	public void setRtngStrtDttm(String rtngStrtDttm) {
		this.rtngStrtDttm = rtngStrtDttm;
	}
	public String getRtngEndDttm() {
		return rtngEndDttm;
	}
	public void setRtngEndDttm(String rtngEndDttm) {
		this.rtngEndDttm = rtngEndDttm;
	}
	public String getAplyLvlCd() {
		return aplyLvlCd;
	}
	public void setAplyLvlCd(String aplyLvlCd) {
		this.aplyLvlCd = aplyLvlCd;
	}
	public String getSbgnChngApntDt() {
		return sbgnChngApntDt;
	}
	public void setSbgnChngApntDt(String sbgnChngApntDt) {
		this.sbgnChngApntDt = sbgnChngApntDt;
	}
	public String getAceno() {
		return aceno;
	}
	public void setAceno(String aceno) {
		this.aceno = aceno;
	}
	public String getDevByEntrSeqno() {
		return devByEntrSeqno;
	}
	public void setDevByEntrSeqno(String devByEntrSeqno) {
		this.devByEntrSeqno = devByEntrSeqno;
	}
	public String getPrpayYn() {
		return prpayYn;
	}
	public void setPrpayYn(String prpayYn) {
		this.prpayYn = prpayYn;
	}
	public String getNdblEntrSvcSeqno() {
		return ndblEntrSvcSeqno;
	}
	public void setNdblEntrSvcSeqno(String ndblEntrSvcSeqno) {
		this.ndblEntrSvcSeqno = ndblEntrSvcSeqno;
	}
	public String getLastIndcId() {
		return lastIndcId;
	}
	public void setLastIndcId(String lastIndcId) {
		this.lastIndcId = lastIndcId;
	}
	public String getSvcStrtRgstDlrCd() {
		return svcStrtRgstDlrCd;
	}
	public void setSvcStrtRgstDlrCd(String svcStrtRgstDlrCd) {
		this.svcStrtRgstDlrCd = svcStrtRgstDlrCd;
	}
	public String getSvcStrtRgstDlrNm() {
		return svcStrtRgstDlrNm;
	}
	public void setSvcStrtRgstDlrNm(String svcStrtRgstDlrNm) {
		this.svcStrtRgstDlrNm = svcStrtRgstDlrNm;
	}
	public String getProdCustHopeDt() {
		return prodCustHopeDt;
	}
	public void setProdCustHopeDt(String prodCustHopeDt) {
		this.prodCustHopeDt = prodCustHopeDt;
	}
	public String getDefRate() {
		return defRate;
	}
	public void setDefRate(String defRate) {
		this.defRate = defRate;
	}
	public String getDeciFctrVlue1() {
		return deciFctrVlue1;
	}
	public void setDeciFctrVlue1(String deciFctrVlue1) {
		this.deciFctrVlue1 = deciFctrVlue1;
	}
	public String getDeciFctrVlue2() {
		return deciFctrVlue2;
	}
	public void setDeciFctrVlue2(String deciFctrVlue2) {
		this.deciFctrVlue2 = deciFctrVlue2;
	}
	public String getDeciFctrVlue3() {
		return deciFctrVlue3;
	}
	public void setDeciFctrVlue3(String deciFctrVlue3) {
		this.deciFctrVlue3 = deciFctrVlue3;
	}
	public String getDeciFctrVlue4() {
		return deciFctrVlue4;
	}
	public void setDeciFctrVlue4(String deciFctrVlue4) {
		this.deciFctrVlue4 = deciFctrVlue4;
	}
	public String getDeciFctrVlue5() {
		return deciFctrVlue5;
	}
	public void setDeciFctrVlue5(String deciFctrVlue5) {
		this.deciFctrVlue5 = deciFctrVlue5;
	}
	public String getDeciFctrVlue6() {
		return deciFctrVlue6;
	}
	public void setDeciFctrVlue6(String deciFctrVlue6) {
		this.deciFctrVlue6 = deciFctrVlue6;
	}
	public String getDeciFctrVlue7() {
		return deciFctrVlue7;
	}
	public void setDeciFctrVlue7(String deciFctrVlue7) {
		this.deciFctrVlue7 = deciFctrVlue7;
	}
	public String getDeciFctrVlue8() {
		return deciFctrVlue8;
	}
	public void setDeciFctrVlue8(String deciFctrVlue8) {
		this.deciFctrVlue8 = deciFctrVlue8;
	}
	public String getDeciFctrVlue9() {
		return deciFctrVlue9;
	}
	public void setDeciFctrVlue9(String deciFctrVlue9) {
		this.deciFctrVlue9 = deciFctrVlue9;
	}
	public String getDeciAmt() {
		return deciAmt;
	}
	public void setDeciAmt(String deciAmt) {
		this.deciAmt = deciAmt;
	}
	public String getTreatment() {
		return treatment;
	}
	public String getMonthlyFee() {
		return monthlyFee;
	}
	public String getRqstSttsCd() {
		return rqstSttsCd;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public void setMonthlyFee(String monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	public void setRqstSttsCd(String rqstSttsCd) {
		this.rqstSttsCd = rqstSttsCd;
	}
	public String getTreatmentYn() {
		return treatmentYn;
	}
	public String getThresholdYn() {
		return thresholdYn;
	}
	public String getLimitDay() {
		return limitDay;
	}
	public void setTreatmentYn(String treatmentYn) {
		this.treatmentYn = treatmentYn;
	}
	public void setThresholdYn(String thresholdYn) {
		this.thresholdYn = thresholdYn;
	}
	public void setLimitDay(String limitDay) {
		this.limitDay = limitDay;
	}
	public String getHposProdCd() {
		return hposProdCd;
	}
	public void setHposProdCd(String hposProdCd) {
		this.hposProdCd = hposProdCd;
	}
	public String getRsrvProdCd() {
		return rsrvProdCd;
	}
	public void setRsrvProdCd(String rsrvProdCd) {
		this.rsrvProdCd = rsrvProdCd;
	}
	public String getRsrvProdNm() {
		return rsrvProdNm;
	}
	public void setRsrvProdNm(String rsrvProdNm) {
		this.rsrvProdNm = rsrvProdNm;
	}
	public String getCfuNo() {
		return cfuNo;
	}
	public void setCfuNo(String cfuNo) {
		this.cfuNo = cfuNo;
	}
	public String getLoanPassword() {
		return loanPassword;
	}
	public void setLoanPassword(String loanPassword) {
		this.loanPassword = loanPassword;
	}
/*	public ProductDvCd getProductDvCd() {
		return productDvCd;
	}
	public void setProductDvCd(ProductDvCd productDvCd) {
		this.productDvCd = productDvCd;
	}*/
	public String getDscntPlcyNo() {
		return dscntPlcyNo;
	}
	public void setDscntPlcyNo(String dscntPlcyNo) {
		this.dscntPlcyNo = dscntPlcyNo;
	}

}
