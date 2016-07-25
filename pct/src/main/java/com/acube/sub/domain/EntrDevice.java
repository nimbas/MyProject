package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class EntrDevice extends BaseDomain implements Serializable, Cloneable {
	private static final long serialVersionUID = -6061877775618185217L;
	private String entrNo            ;     
	private String devByEntrSeqno    ;     
	private String aceno             ;     
	private String devcMdlCd         ;     
	private String devcMdlNm         ;     
	private String devcSttsCd        ;     
	private String devcSttsNm        ;     
	private String sbgnMdlCd         ;     
	private String sbgnDevcMdlNm     ;     
	private String devcNo            ;     
	private String devRgstDt         ;     
	private String leaseEndDt        ;     
	private String monthRemainLease  ;     
	private String remainLeaseAmt  	 ;     
	private String devValdEndDt      ;     
	private String lastYn            ;     
	private String devHistYn         ;     
	private String devChngRsnCd      ;     
	private String prssDlrCd         ;     
	private String prssDlrNm         ;     
	private String eqipSaleCd        ;     
	private String eqipSaleNm        ;     
	private String eqipClssCd        ;     
	private String classNm           ;     
	private String eqipUseDvCd       ;     
	private String saleAmt           ;     
	private String insttMnbr         ;     
	private String eqipRturnDvCd     ;     
	private String rtgdYn            ;     
	private String pnltExmptYm       ;     
	private String estbCostExmptYn   ;     
	private String bfrDevByEntrSeqno ;     
	private String intgBizCd         ;     
	private String iccidNo           ;     
	private String dlvrAmt           ;     
	private String lteRoamImsi       ;     
	private String cashSaleAmt       ;     
	private String cardSaleAmt       ;     
	private String insttSaleAmt      ;     
	private String usimRuseYn        ;     
	private String cpnNo             ;     
	private String devCpnDscntAmt    ;     
	private String agmtMnbr          ;     
	private String agmtDvCd          ;
	private String rentMnbr          ;
	private String serialNumber      ;
	private String dscntPlcyNo      ;
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getDevByEntrSeqno() {
		return devByEntrSeqno;
	}
	public void setDevByEntrSeqno(String devByEntrSeqno) {
		this.devByEntrSeqno = devByEntrSeqno;
	}
	public String getAceno() {
		return aceno;
	}
	public void setAceno(String aceno) {
		this.aceno = aceno;
	}
	public String getDevcMdlCd() {
		return devcMdlCd;
	}
	public void setDevcMdlCd(String devcMdlCd) {
		this.devcMdlCd = devcMdlCd;
	}
	public String getDevcMdlNm() {
		return devcMdlNm;
	}
	public void setDevcMdlNm(String devcMdlNm) {
		this.devcMdlNm = devcMdlNm;
	}
	public String getDevcSttsCd() {
		return devcSttsCd;
	}
	public void setDevcSttsCd(String devcSttsCd) {
		this.devcSttsCd = devcSttsCd;
	}
	public String getDevcSttsNm() {
		return devcSttsNm;
	}
	public void setDevcSttsNm(String devcSttsNm) {
		this.devcSttsNm = devcSttsNm;
	}
	public String getSbgnMdlCd() {
		return sbgnMdlCd;
	}
	public void setSbgnMdlCd(String sbgnMdlCd) {
		this.sbgnMdlCd = sbgnMdlCd;
	}
	public String getSbgnDevcMdlNm() {
		return sbgnDevcMdlNm;
	}
	public void setSbgnDevcMdlNm(String sbgnDevcMdlNm) {
		this.sbgnDevcMdlNm = sbgnDevcMdlNm;
	}
	public String getDevcNo() {
		return devcNo;
	}
	public void setDevcNo(String devcNo) {
		this.devcNo = devcNo;
	}
	public String getDevRgstDt() {
		return devRgstDt;
	}
	public void setDevRgstDt(String devRgstDt) {
		this.devRgstDt = devRgstDt;
	}
	public String getDevValdEndDt() {
		return devValdEndDt;
	}
	public void setDevValdEndDt(String devValdEndDt) {
		this.devValdEndDt = devValdEndDt;
	}
	public String getLastYn() {
		return lastYn;
	}
	public void setLastYn(String lastYn) {
		this.lastYn = lastYn;
	}
	public String getDevHistYn() {
		return devHistYn;
	}
	public void setDevHistYn(String devHistYn) {
		this.devHistYn = devHistYn;
	}
	public String getDevChngRsnCd() {
		return devChngRsnCd;
	}
	public void setDevChngRsnCd(String devChngRsnCd) {
		this.devChngRsnCd = devChngRsnCd;
	}
	public String getPrssDlrCd() {
		return prssDlrCd;
	}
	public void setPrssDlrCd(String prssDlrCd) {
		this.prssDlrCd = prssDlrCd;
	}
	public String getPrssDlrNm() {
		return prssDlrNm;
	}
	public void setPrssDlrNm(String prssDlrNm) {
		this.prssDlrNm = prssDlrNm;
	}
	public String getEqipSaleCd() {
		return eqipSaleCd;
	}
	public void setEqipSaleCd(String eqipSaleCd) {
		this.eqipSaleCd = eqipSaleCd;
	}
	public String getEqipSaleNm() {
		return eqipSaleNm;
	}
	public void setEqipSaleNm(String eqipSaleNm) {
		this.eqipSaleNm = eqipSaleNm;
	}
	public String getEqipClssCd() {
		return eqipClssCd;
	}
	public void setEqipClssCd(String eqipClssCd) {
		this.eqipClssCd = eqipClssCd;
	}
	public String getClassNm() {
		return classNm;
	}
	public void setClassNm(String classNm) {
		this.classNm = classNm;
	}
	public String getEqipUseDvCd() {
		return eqipUseDvCd;
	}
	public void setEqipUseDvCd(String eqipUseDvCd) {
		this.eqipUseDvCd = eqipUseDvCd;
	}
	public String getSaleAmt() {
		return saleAmt;
	}
	public void setSaleAmt(String saleAmt) {
		this.saleAmt = saleAmt;
	}
	public String getInsttMnbr() {
		return insttMnbr;
	}
	public void setInsttMnbr(String insttMnbr) {
		this.insttMnbr = insttMnbr;
	}
	public String getEqipRturnDvCd() {
		return eqipRturnDvCd;
	}
	public void setEqipRturnDvCd(String eqipRturnDvCd) {
		this.eqipRturnDvCd = eqipRturnDvCd;
	}
	public String getRtgdYn() {
		return rtgdYn;
	}
	public void setRtgdYn(String rtgdYn) {
		this.rtgdYn = rtgdYn;
	}
	public String getPnltExmptYm() {
		return pnltExmptYm;
	}
	public void setPnltExmptYm(String pnltExmptYm) {
		this.pnltExmptYm = pnltExmptYm;
	}
	public String getEstbCostExmptYn() {
		return estbCostExmptYn;
	}
	public void setEstbCostExmptYn(String estbCostExmptYn) {
		this.estbCostExmptYn = estbCostExmptYn;
	}
	public String getBfrDevByEntrSeqno() {
		return bfrDevByEntrSeqno;
	}
	public void setBfrDevByEntrSeqno(String bfrDevByEntrSeqno) {
		this.bfrDevByEntrSeqno = bfrDevByEntrSeqno;
	}
	public String getIntgBizCd() {
		return intgBizCd;
	}
	public void setIntgBizCd(String intgBizCd) {
		this.intgBizCd = intgBizCd;
	}
	public String getIccidNo() {
		return iccidNo;
	}
	public void setIccidNo(String iccidNo) {
		this.iccidNo = iccidNo;
	}

	public String getDlvrAmt() {
		return dlvrAmt;
	}
	public void setDlvrAmt(String dlvrAmt) {
		this.dlvrAmt = dlvrAmt;
	}
	public String getLteRoamImsi() {
		return lteRoamImsi;
	}
	public void setLteRoamImsi(String lteRoamImsi) {
		this.lteRoamImsi = lteRoamImsi;
	}
	public String getCashSaleAmt() {
		return cashSaleAmt;
	}
	public void setCashSaleAmt(String cashSaleAmt) {
		this.cashSaleAmt = cashSaleAmt;
	}
	public String getCardSaleAmt() {
		return cardSaleAmt;
	}
	public void setCardSaleAmt(String cardSaleAmt) {
		this.cardSaleAmt = cardSaleAmt;
	}
	public String getInsttSaleAmt() {
		return insttSaleAmt;
	}
	public void setInsttSaleAmt(String insttSaleAmt) {
		this.insttSaleAmt = insttSaleAmt;
	}
	public String getUsimRuseYn() {
		return usimRuseYn;
	}
	public void setUsimRuseYn(String usimRuseYn) {
		this.usimRuseYn = usimRuseYn;
	}
	public String getCpnNo() {
		return cpnNo;
	}
	public void setCpnNo(String cpnNo) {
		this.cpnNo = cpnNo;
	}
	public String getDevCpnDscntAmt() {
		return devCpnDscntAmt;
	}
	public void setDevCpnDscntAmt(String devCpnDscntAmt) {
		this.devCpnDscntAmt = devCpnDscntAmt;
	}
	public String getAgmtMnbr() {
		return agmtMnbr;
	}
	public void setAgmtMnbr(String agmtMnbr) {
		this.agmtMnbr = agmtMnbr;
	}
	public String getAgmtDvCd() {
		return agmtDvCd;
	}
	public void setAgmtDvCd(String agmtDvCd) {
		this.agmtDvCd = agmtDvCd;
	}
	public String getRentMnbr() {
		return rentMnbr;
	}
	public void setRentMnbr(String rentMnbr) {
		this.rentMnbr = rentMnbr;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getLeaseEndDt() {
		return leaseEndDt;
	}
	public void setLeaseEndDt(String leaseEndDt) {
		this.leaseEndDt = leaseEndDt;
	}
	public String getMonthRemainLease() {
		return monthRemainLease;
	}
	public void setMonthRemainLease(String monthRemainLease) {
		this.monthRemainLease = monthRemainLease;
	}
	public String getRemainLeaseAmt() {
		return remainLeaseAmt;
	}
	public void setRemainLeaseAmt(String remainLeaseAmt) {
		this.remainLeaseAmt = remainLeaseAmt;
	}
	public String getDscntPlcyNo() {
		return dscntPlcyNo;
	}
	public void setDscntPlcyNo(String dscntPlcyNo) {
		this.dscntPlcyNo = dscntPlcyNo;
	} 

}
