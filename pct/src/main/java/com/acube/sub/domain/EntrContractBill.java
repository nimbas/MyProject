package com.acube.sub.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class EntrContractBill extends BaseDomain implements Serializable, Cloneable {
	
	private static final long serialVersionUID = -440683061867410394L;
	private String entrNo                                 ;
	private String prodNo                                 ;
	private String aceno                                  ;
	private String svcCd                                  ;
	private String svvNm                                  ;
	private String custNo                                 ;
	private String custFullNm                             ;
	private String vpnRepNoYn                             ;
	private String rlusrCustNo                            ;
	private String rlusrCustFullNm                        ;
	private String chngDttm                               ;
	private String frstDttm                               ;
	private String entrSttsCd                             ;
	private String entrSttsNm                             ;
	private String entrSttsChngRsnCd                      ;
	private String entrSttsChngRsnNm                      ;
	private String entrSttsChngRsnDtlCd                   ;
	private String entrSttsChngRsnDtlNm                   ;
	private String entrDlrCd                              ;
	private String dlrCd                                  ;
	private String mgmtDlrCd                              ;
	private String marketCode                             ;
	private String sttsChngDttm                           ;
	private String homecdNo                               ;
	private String estbAddrNo                             ;
	private String imsiNo                                 ;
	private String minNo                                  ;
	private String ppayEntrDvCd                           ;
	private String hpno                                   ;
	private String indcId                                 ;
	private String mngrId                                 ;
	private String reqDate                                ;
	private String billAcntNo                             ;
	private String billAddrSeqno                          ;
	private String billCntctPntSeqno                      ;
	private String pymMthdCd                              ;
	private String pymMthdNm                              ;
	private String bankCd                                 ;
	private String bankNm                                 ;
	private String cdcmpCd                                ;
	private String cdcmpNm                                ;
	private String cardValdEndYymm                        ;
	private String pymCustNm                              ;
	private String pymCustSsn                             ;
	private String acctNo                                 ;
	private String cardNo                                 ;
	private String bltxtRcptManNm                         ;
	private String bltxtKdCd                              ;
	private String bltxtKdNm                              ;
	private String billEmailAddr                         ;
	private String billAcntSttsCd                         ;
	private String billAcntSttsNm                         ;
	private String acntBlnc                               ;
	private String billCyclCd                             ;
	private String billCurCd                              ;
	private String billCurNm                              ;
	
	
	
	
	private String custDvCd                               ;
	private String custDvNm                               ;
	private String custKdCd                               ;
    private String custKdNm                               ;
    private String custrnmNo                              ;
    private String bsRegNo                                ;
    private String bizCompNm                              ;
    private String bizReptNm                              ;
    private String emailAddr							  ;
     
     
    private String sprtRtngYn							  ;
    private String ppayEntrDvNm                           ;
	
    private String custNm                             ;
    private String custNm1                             ;
    private String custNm2                            ;
    
	private String mrktCd;
	
	
	private String mininumCharge;
	private String mininumMonth;
	private String entrRqstSttsCd;
	private String entrEntrReqDate;
	private String entrRqstSttsChngRsnCd;
	private String entrRqstSttsChngRsnDtlCd;
	private String billRqstSttsCd;
	
	
	private String ltpymSttsCd;
	private String ltpymSttsNm;
	private String ltpymSttsChngDt;
	private String userKey;
	private String mduIp;
	private String mduPort;
	
	private String userId;
	private String custPswd;
	private String position;
	private String fullAddr;
	private String custGender;
	private String custBday;
	
	public String getUserKey() {
		return userKey;
	}

	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	public String getMrktCd() {
		return mrktCd;
	}

	public void setMrktCd(String mrktCd) {
		this.mrktCd = mrktCd;
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

	public String getSvcCd() {
		return svcCd;
	}

	public void setSvcCd(String svcCd) {
		this.svcCd = svcCd;
	}

	public String getSvvNm() {
		return svvNm;
	}

	public void setSvvNm(String svvNm) {
		this.svvNm = svvNm;
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustFullNm() {
		return custFullNm;
	}

	public void setCustFullNm(String custFullNm) {
		this.custFullNm = custFullNm;
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

	public String getRlusrCustFullNm() {
		return rlusrCustFullNm;
	}

	public void setRlusrCustFullNm(String rlusrCustFullNm) {
		this.rlusrCustFullNm = rlusrCustFullNm;
	}

	public String getChngDttm() {
		return chngDttm;
	}

	public void setChngDttm(String chngDttm) {
		this.chngDttm = chngDttm;
	}

	public String getFrstDttm() {
		return frstDttm;
	}

	public void setFrstDttm(String frstDttm) {
		this.frstDttm = frstDttm;
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

	public String getEntrDlrCd() {
		return entrDlrCd;
	}

	public void setEntrDlrCd(String entrDlrCd) {
		this.entrDlrCd = entrDlrCd;
	}

	public String getDlrCd() {
		return dlrCd;
	}

	public void setDlrCd(String dlrCd) {
		this.dlrCd = dlrCd;
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

	public String getSttsChngDttm() {
		return sttsChngDttm;
	}

	public void setSttsChngDttm(String sttsChngDttm) {
		this.sttsChngDttm = sttsChngDttm;
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

	public String getPpayEntrDvCd() {
		return ppayEntrDvCd;
	}

	public void setPpayEntrDvCd(String ppayEntrDvCd) {
		this.ppayEntrDvCd = ppayEntrDvCd;
	}

	public String getHpno() {
		return hpno;
	}

	public void setHpno(String hpno) {
		this.hpno = hpno;
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

	public String getBillAddrSeqno() {
		return billAddrSeqno;
	}

	public void setBillAddrSeqno(String billAddrSeqno) {
		this.billAddrSeqno = billAddrSeqno;
	}

	public String getBillCntctPntSeqno() {
		return billCntctPntSeqno;
	}

	public void setBillCntctPntSeqno(String billCntctPntSeqno) {
		this.billCntctPntSeqno = billCntctPntSeqno;
	}

	public String getPymMthdCd() {
		return pymMthdCd;
	}

	public void setPymMthdCd(String pymMthdCd) {
		this.pymMthdCd = pymMthdCd;
	}

	public String getPymMthdNm() {
		return pymMthdNm;
	}

	public void setPymMthdNm(String pymMthdNm) {
		this.pymMthdNm = pymMthdNm;
	}

	public String getBankCd() {
		return bankCd;
	}

	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}

	public String getBankNm() {
		return bankNm;
	}

	public void setBankNm(String bankNm) {
		this.bankNm = bankNm;
	}

	public String getCdcmpCd() {
		return cdcmpCd;
	}

	public void setCdcmpCd(String cdcmpCd) {
		this.cdcmpCd = cdcmpCd;
	}

	public String getCdcmpNm() {
		return cdcmpNm;
	}

	public void setCdcmpNm(String cdcmpNm) {
		this.cdcmpNm = cdcmpNm;
	}

	public String getCardValdEndYymm() {
		return cardValdEndYymm;
	}

	public void setCardValdEndYymm(String cardValdEndYymm) {
		this.cardValdEndYymm = cardValdEndYymm;
	}

	public String getPymCustNm() {
		return pymCustNm;
	}

	public void setPymCustNm(String pymCustNm) {
		this.pymCustNm = pymCustNm;
	}

	public String getPymCustSsn() {
		return pymCustSsn;
	}

	public void setPymCustSsn(String pymCustSsn) {
		this.pymCustSsn = pymCustSsn;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getBltxtRcptManNm() {
		return bltxtRcptManNm;
	}

	public void setBltxtRcptManNm(String bltxtRcptManNm) {
		this.bltxtRcptManNm = bltxtRcptManNm;
	}

	public String getBltxtKdCd() {
		return bltxtKdCd;
	}

	public void setBltxtKdCd(String bltxtKdCd) {
		this.bltxtKdCd = bltxtKdCd;
	}

	public String getBltxtKdNm() {
		return bltxtKdNm;
	}

	public void setBltxtKdNm(String bltxtKdNm) {
		this.bltxtKdNm = bltxtKdNm;
	}

	public String getBillEmailAddr() {
		return billEmailAddr;
	}

	public void setBillEmailAddr(String billEmailAddr) {
		this.billEmailAddr = billEmailAddr;
	}

	public String getBillAcntSttsCd() {
		return billAcntSttsCd;
	}

	public void setBillAcntSttsCd(String billAcntSttsCd) {
		this.billAcntSttsCd = billAcntSttsCd;
	}

	public String getBillAcntSttsNm() {
		return billAcntSttsNm;
	}

	public void setBillAcntSttsNm(String billAcntSttsNm) {
		this.billAcntSttsNm = billAcntSttsNm;
	}

	public String getAcntBlnc() {
		return acntBlnc;
	}

	public void setAcntBlnc(String acntBlnc) {
		this.acntBlnc = acntBlnc;
	}

	public String getBillCyclCd() {
		return billCyclCd;
	}

	public void setBillCyclCd(String billCyclCd) {
		this.billCyclCd = billCyclCd;
	}

	public String getBillCurCd() {
		return billCurCd;
	}

	public void setBillCurCd(String billCurCd) {
		this.billCurCd = billCurCd;
	}

	public String getBillCurNm() {
		return billCurNm;
	}

	public void setBillCurNm(String billCurNm) {
		this.billCurNm = billCurNm;
	}
	
	
	public String getCustDvCd() {
		return custDvCd;
	}

	public void setCustDvCd(String custDvCd) {
		this.custDvCd = custDvCd;
	}

	public String getCustDvNm() {
		return custDvNm;
	}

	public void setCustDvNm(String custDvNm) {
		this.custDvNm = custDvNm;
	}

	public String getCustKdCd() {
		return custKdCd;
	}

	public void setCustKdCd(String custKdCd) {
		this.custKdCd = custKdCd;
	}

	public String getCustKdNm() {
		return custKdNm;
	}

	public void setCustKdNm(String custKdNm) {
		this.custKdNm = custKdNm;
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

	public String getBizCompNm() {
		return bizCompNm;
	}

	public void setBizCompNm(String bizCompNm) {
		this.bizCompNm = bizCompNm;
	}

	public String getBizReptNm() {
		return bizReptNm;
	}

	public void setBizReptNm(String bizReptNm) {
		this.bizReptNm = bizReptNm;
	}

	
	public String getSprtRtngYn() {
		return sprtRtngYn;
	}

	public void setSprtRtngYn(String sprtRtngYn) {
		this.sprtRtngYn = sprtRtngYn;
	}
	
	
	public String getPpayEntrDvNm() {
		return ppayEntrDvNm;
	}

	public void setPpayEntrDvNm(String ppayEntrDvNm) {
		this.ppayEntrDvNm = ppayEntrDvNm;
	}
	
	public EntrContractBill clone(){
		try {
			return (EntrContractBill) super.clone();
		} catch (CloneNotSupportedException e) {
			return null ;
		}
	}

	public String getCustNm() {
		return custNm;
	}

	public void setCustNm(String custNm) {
		this.custNm = custNm;
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

	public String getMininumCharge() {
		return mininumCharge;
	}

	public String getMininumMonth() {
		return mininumMonth;
	}

	public String getEntrRqstSttsCd() {
		return entrRqstSttsCd;
	}

	public String getEntrEntrReqDate() {
		return entrEntrReqDate;
	}

	public String getEntrRqstSttsChngRsnCd() {
		return entrRqstSttsChngRsnCd;
	}

	public String getEntrRqstSttsChngRsnDtlCd() {
		return entrRqstSttsChngRsnDtlCd;
	}

	public String getBillRqstSttsCd() {
		return billRqstSttsCd;
	}

	public void setMininumCharge(String mininumCharge) {
		this.mininumCharge = mininumCharge;
	}

	public void setMininumMonth(String mininumMonth) {
		this.mininumMonth = mininumMonth;
	}

	public void setEntrRqstSttsCd(String entrRqstSttsCd) {
		this.entrRqstSttsCd = entrRqstSttsCd;
	}

	public void setEntrEntrReqDate(String entrEntrReqDate) {
		this.entrEntrReqDate = entrEntrReqDate;
	}

	public void setEntrRqstSttsChngRsnCd(String entrRqstSttsChngRsnCd) {
		this.entrRqstSttsChngRsnCd = entrRqstSttsChngRsnCd;
	}

	public void setEntrRqstSttsChngRsnDtlCd(String entrRqstSttsChngRsnDtlCd) {
		this.entrRqstSttsChngRsnDtlCd = entrRqstSttsChngRsnDtlCd;
	}

	public void setBillRqstSttsCd(String billRqstSttsCd) {
		this.billRqstSttsCd = billRqstSttsCd;
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

	public String getMduIp() {
		return mduIp;
	}

	public void setMduIp(String mduIp) {
		this.mduIp = mduIp;
	}

	public String getMduPort() {
		return mduPort;
	}

	public void setMduPort(String mduPort) {
		this.mduPort = mduPort;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getCustPswd() {
		return custPswd;
	}

	public void setCustPswd(String custPswd) {
		this.custPswd = custPswd;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getFullAddr() {
		return fullAddr;
	}

	public void setFullAddr(String fullAddr) {
		this.fullAddr = fullAddr;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustBday() {
		return custBday;
	}

	public void setCustBday(String custBday) {
		this.custBday = custBday;
	}

	@Override
	public String toString() {
		return "EntrContractBill [entrNo=" + entrNo + ", prodNo=" + prodNo + ", aceno=" + aceno + ", svcCd=" + svcCd
				+ ", svvNm=" + svvNm + ", custNo=" + custNo + ", custFullNm=" + custFullNm + ", vpnRepNoYn="
				+ vpnRepNoYn + ", rlusrCustNo=" + rlusrCustNo + ", rlusrCustFullNm=" + rlusrCustFullNm + ", chngDttm="
				+ chngDttm + ", frstDttm=" + frstDttm + ", entrSttsCd=" + entrSttsCd + ", entrSttsNm=" + entrSttsNm
				+ ", entrSttsChngRsnCd=" + entrSttsChngRsnCd + ", entrSttsChngRsnNm=" + entrSttsChngRsnNm
				+ ", entrSttsChngRsnDtlCd=" + entrSttsChngRsnDtlCd + ", entrSttsChngRsnDtlNm=" + entrSttsChngRsnDtlNm
				+ ", entrDlrCd=" + entrDlrCd + ", dlrCd=" + dlrCd + ", mgmtDlrCd=" + mgmtDlrCd + ", marketCode="
				+ marketCode + ", sttsChngDttm=" + sttsChngDttm + ", homecdNo=" + homecdNo + ", estbAddrNo="
				+ estbAddrNo + ", imsiNo=" + imsiNo + ", minNo=" + minNo + ", ppayEntrDvCd=" + ppayEntrDvCd + ", hpno="
				+ hpno + ", indcId=" + indcId + ", mngrId=" + mngrId + ", reqDate=" + reqDate + ", billAcntNo="
				+ billAcntNo + ", billAddrSeqno=" + billAddrSeqno + ", billCntctPntSeqno=" + billCntctPntSeqno
				+ ", pymMthdCd=" + pymMthdCd + ", pymMthdNm=" + pymMthdNm + ", bankCd=" + bankCd + ", bankNm=" + bankNm
				+ ", cdcmpCd=" + cdcmpCd + ", cdcmpNm=" + cdcmpNm + ", cardValdEndYymm=" + cardValdEndYymm
				+ ", pymCustNm=" + pymCustNm + ", pymCustSsn=" + pymCustSsn + ", acctNo=" + acctNo + ", cardNo="
				+ cardNo + ", bltxtRcptManNm=" + bltxtRcptManNm + ", bltxtKdCd=" + bltxtKdCd + ", bltxtKdNm="
				+ bltxtKdNm + ", billEmailAddr=" + billEmailAddr + ", billAcntSttsCd=" + billAcntSttsCd
				+ ", billAcntSttsNm=" + billAcntSttsNm + ", acntBlnc=" + acntBlnc + ", billCyclCd=" + billCyclCd
				+ ", billCurCd=" + billCurCd + ", billCurNm=" + billCurNm + ", custDvCd=" + custDvCd + ", custDvNm="
				+ custDvNm + ", custKdCd=" + custKdCd + ", custKdNm=" + custKdNm + ", custrnmNo=" + custrnmNo
				+ ", bsRegNo=" + bsRegNo + ", bizCompNm=" + bizCompNm + ", bizReptNm=" + bizReptNm + ", emailAddr="
				+ emailAddr + ", sprtRtngYn=" + sprtRtngYn + ", ppayEntrDvNm=" + ppayEntrDvNm + ", custNm=" + custNm
				+ ", custNm1=" + custNm1 + ", custNm2=" + custNm2 + ", mrktCd=" + mrktCd + ", mininumCharge="
				+ mininumCharge + ", mininumMonth=" + mininumMonth + ", entrRqstSttsCd=" + entrRqstSttsCd
				+ ", entrEntrReqDate=" + entrEntrReqDate + ", entrRqstSttsChngRsnCd=" + entrRqstSttsChngRsnCd
				+ ", entrRqstSttsChngRsnDtlCd=" + entrRqstSttsChngRsnDtlCd + ", billRqstSttsCd=" + billRqstSttsCd
				+ ", ltpymSttsCd=" + ltpymSttsCd + ", ltpymSttsNm=" + ltpymSttsNm + ", ltpymSttsChngDt="
				+ ltpymSttsChngDt + ", userKey=" + userKey + ", mduIp=" + mduIp + ", mduPort=" + mduPort + ", userId="
				+ userId + ", custPswd=" + custPswd + ", position=" + position + ", fullAddr=" + fullAddr
				+ ", custGender=" + custGender + ", custBday=" + custBday + "]";
	}
	
	

}
