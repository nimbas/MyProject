package com.acube.sub.domain;

import java.io.Serializable;
import java.util.Date;

import com.acube.common.domain.BaseDomain;

public class Counsel extends BaseDomain implements Serializable, Cloneable {
	private static final long serialVersionUID = -3560441759268266280L;  //  ??
	private String eventCd 			;
	//공통 begin
	private String marketCode       ;
	private String counselId        ;               
	private String entrNo              ;
	private String custNo              ;
	//공통 end
	
	//counsel info begin	
	private String svcCd            ;
	private String counselName      ;
	private String counselTel       ;
	private String custReq          ;
	private String counselRes       ;
	private String relationshipType ;
	private Date regDate            ;
	private Date transferDate            ;
	private String counselDivision  ;
	private String counselTypeCd    ;
	private String counselDtlCd     ;
	private String counselDtlCd2    ;
	private String counselDtlCd3    ;	
	private String counselDtlCd4    ;	
	private String counselDtlCd5    ;	
	private String counselDtlCd6    ;	
	private String counselDtlCd7    ;	
	private String counselDtlCd8    ;	
	
	private String counselDivisionText  ;
	private String counselTypeCdText    ;
	private String counselDtlCdText     ;
	private String counselDtlCd2Text     ;
	private String counselDtlCd3Text     ;
	private String counselDtlCd4Text     ;
	private String counselDtlCd5Text     ;
	private String counselDtlCd6Text     ;
	private String counselDtlCd7Text     ;
	private String counselDtlCd8Text     ;
	private String activityCd       ;
	private String transferType     ;
	private String transferText     ;
	private String counselStatus    ;
	private String counselStatusText;  
	private String firstOperator    ;
	private String hopeDate         ;
	private String hopeTime         ;
	private String rsvDate8         ;
	private String rsvTime          ;
	private String counselEndDate8  ;
	private String counselEndTime   ;
	private String serviceType      ;
	private String custType         ;
	private String counselName2     ;
	private String counselName3     ;	
	private String question;
	private String answer;
	private String AcceptDate;
	private String EndDate;
	private String conselName1;
	private String activitySeqNo;
	
	private String occurrenceDate;
	private String occurrenceTime;
	
	//counsel info end
	
	
	
	//work order begin
	private String orderNum            ;
	private String orderSeq            ;
	private String managerId         ;
	private String orderRsvDate8     ;
	private String orderRsvTime      ;
	private String orderRequestDate8 ;
	private String orderRequestTime  ;
	private String activityCode      ;
	private String orderStatus       ;
	private String orderStDate       ;
	private String orderStTime       ;
	private String orderFinDate8     ;
	private String orderFinTime      ;
	private String remark            ;
	private String bundleType        ;
	private String cnvgNo            ;
	private Date cnvgAplyStrtDttm  ;
	private String counselRe;
	private String counselPro;
	private String counselCo;
	private String activityDesc;
	//work order end 
	//counsel history begin
	private String counselSeqno;
	//counsel history end
	//추가
	private String funcName;
	private String actMode;
	
	//aba_ccm_counsel_cust_info begin
	private String addNum              ; 
	private String custVilgAbvAddr  ; 
	private String custVilgBlwAddr  ;
	
	private String joinYn;
	private String asType;
	private String sysOperatorId ;
	private String leadTime;
	//aba_ccm_counsel_cust_info begin end
	
	// private List<CrmOffer> offers;
	
	private String prodNo;
	
	private String deciAmt;
	
	//ccsWork006검색 조건
	private String reqFromDate;
	private String reqToDate;
	private String completeleadTime;	
	private String progressleadTime;
	private String acceptleadTime;
	
	//만족도 추가
	private String satisfactionYn;
	private String satisfactionQueSeq;
	private String satisfactionAnsSeq;
	
	private String manageDlrId;
	
	private String activityPath;
	private String counselOwner;
	private String doorCode;
	
	private String mduIp;
	private String mduPort;
	private String softPhoneCheck;
	
	private String postPoneStatus;
	
	public String getMarketCode() {
		return marketCode;
	}
	public void setMarketCode(String marketCode) {
		this.marketCode = marketCode;
	}
	public String getCounselId() {
		return counselId;
	}
	public void setCounselId(String counselId) {
		this.counselId = counselId;
	}
	public String getEntrNo() {
		return entrNo;
	}
	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getSvcCd() {
		return svcCd;
	}
	public void setSvcCd(String svcCd) {
		this.svcCd = svcCd;
	}
	public String getCounselName() {
		return counselName;
	}
	public void setCounselName(String counselName) {
		this.counselName = counselName;
	}
	public String getCounselTel() {
		return counselTel;
	}
	public void setCounselTel(String counselTel) {
		this.counselTel = counselTel;
	}
	public String getCustReq() {
		return custReq;
	}
	public void setCustReq(String custReq) {
		this.custReq = custReq;
	}
	public String getCounselRes() {
		return counselRes;
	}
	public void setCounselRes(String counselRes) {
		this.counselRes = counselRes;
	}
	public String getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(String relationshipType) {
		this.relationshipType = relationshipType;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getRegDate() {
		return regDate;
	}
	
	public Date getTransferDate() {
		return transferDate;
	}
	public void setTransferDate(Date transferDate) {
		this.transferDate = transferDate;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAcceptDate() {
		return AcceptDate;
	}
	public void setAcceptDate(String acceptDate) {
		AcceptDate = acceptDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getCounselRe() {
		return counselRe;
	}
	public void setCounselRe(String counselRe) {
		this.counselRe = counselRe;
	}
	public String getCounselPro() {
		return counselPro;
	}
	public void setCounselPro(String counselPro) {
		this.counselPro = counselPro;
	}
	public String getCounselCo() {
		return counselCo;
	}
	public void setCounselCo(String counselCo) {
		this.counselCo = counselCo;
	}
	public String getActivityDesc() {
		return activityDesc;
	}
	public void setActivityDesc(String activityDesc) {
		this.activityDesc = activityDesc;
	}
	public String getSysOperatorId() {
		return sysOperatorId;
	}
	public void setSysOperatorId(String sysOperatorId) {
		this.sysOperatorId = sysOperatorId;
	}
	
	
	public String getCounselDivision() {
		return counselDivision;
	}
	public void setCounselDivision(String counselDivision) {
		this.counselDivision = counselDivision;
	}
	public String getCounselTypeCd() {
		return counselTypeCd;
	}
	public void setCounselTypeCd(String counselTypeCd) {
		this.counselTypeCd = counselTypeCd;
	}
	public String getCounselDtlCd() {
		return counselDtlCd;
	}
	public void setCounselDtlCd(String counselDtlCd) {
		this.counselDtlCd = counselDtlCd;
	}
	public String getCounselDtlCd2() {
		return counselDtlCd2;
	}
	public void setCounselDtlCd2(String counselDtlCd2) {
		this.counselDtlCd2 = counselDtlCd2;
	}
	public String getCounselDtlCd3() {
		return counselDtlCd3;
	}
	public void setCounselDtlCd3(String counselDtlCd3) {
		this.counselDtlCd3 = counselDtlCd3;
	}
	public String getCounselDtlCd4() {
		return counselDtlCd4;
	}
	public void setCounselDtlCd4(String counselDtlCd4) {
		this.counselDtlCd4 = counselDtlCd4;
	}
	public String getCounselDtlCd5() {
		return counselDtlCd5;
	}
	public void setCounselDtlCd5(String counselDtlCd5) {
		this.counselDtlCd5 = counselDtlCd5;
	}
	public String getCounselDtlCd6() {
		return counselDtlCd6;
	}
	public void setCounselDtlCd6(String counselDtlCd6) {
		this.counselDtlCd6 = counselDtlCd6;
	}
	public String getCounselDtlCd7() {
		return counselDtlCd7;
	}
	public void setCounselDtlCd7(String counselDtlCd7) {
		this.counselDtlCd7 = counselDtlCd7;
	}
	public String getCounselDtlCd8() {
		return counselDtlCd8;
	}
	public void setCounselDtlCd8(String counselDtlCd8) {
		this.counselDtlCd8 = counselDtlCd8;
	}
	public String getCounselDivisionText() {
		return counselDivisionText;
	}
	public void setCounselDivisionText(String counselDivisionText) {
		this.counselDivisionText = counselDivisionText;
	}
	public String getCounselTypeCdText() {
		return counselTypeCdText;
	}
	public void setCounselTypeCdText(String counselTypeCdText) {
		this.counselTypeCdText = counselTypeCdText;
	}
	public String getCounselDtlCdText() {
		return counselDtlCdText;
	}
	public void setCounselDtlCdText(String counselDtlCdText) {
		this.counselDtlCdText = counselDtlCdText;
	}
	public String getCounselDtlCd2Text() {
		return counselDtlCd2Text;
	}
	public void setCounselDtlCd2Text(String counselDtlCd2Text) {
		this.counselDtlCd2Text = counselDtlCd2Text;
	}
	public String getCounselDtlCd3Text() {
		return counselDtlCd3Text;
	}
	public void setCounselDtlCd3Text(String counselDtlCd3Text) {
		this.counselDtlCd3Text = counselDtlCd3Text;
	}
	public String getCounselDtlCd4Text() {
		return counselDtlCd4Text;
	}
	public void setCounselDtlCd4Text(String counselDtlCd4Text) {
		this.counselDtlCd4Text = counselDtlCd4Text;
	}
	public String getCounselDtlCd5Text() {
		return counselDtlCd5Text;
	}
	public void setCounselDtlCd5Text(String counselDtlCd5Text) {
		this.counselDtlCd5Text = counselDtlCd5Text;
	}
	public String getCounselDtlCd6Text() {
		return counselDtlCd6Text;
	}
	public void setCounselDtlCd6Text(String counselDtlCd6Text) {
		this.counselDtlCd6Text = counselDtlCd6Text;
	}
	public String getCounselDtlCd7Text() {
		return counselDtlCd7Text;
	}
	public void setCounselDtlCd7Text(String counselDtlCd7Text) {
		this.counselDtlCd7Text = counselDtlCd7Text;
	}
	public String getCounselDtlCd8Text() {
		return counselDtlCd8Text;
	}
	public void setCounselDtlCd8Text(String counselDtlCd8Text) {
		this.counselDtlCd8Text = counselDtlCd8Text;
	}
	public String getActivityCd() {
		return activityCd;
	}
	public void setActivityCd(String activityCd) {
		this.activityCd = activityCd;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getTransferText() {
		return transferText;
	}
	public void setTransferText(String transferText) {
		this.transferText = transferText;
	}
	public String getCounselStatus() {
		return counselStatus;
	}
	public void setCounselStatus(String counselStatus) {
		this.counselStatus = counselStatus;
	}	
	public String getCounselStatusText() {
		return counselStatusText;
	}
	public void setCounselStatusText(String counselStatusText) {
		this.counselStatusText = counselStatusText;
	}
	public String getFirstOperator() {
		return firstOperator;
	}
	public void setFirstOperator(String firstOperator) {
		this.firstOperator = firstOperator;
	}
	public String getHopeDate() {
		return hopeDate;
	}
	public void setHopeDate(String hopeDate) {
		this.hopeDate = hopeDate;
	}
	public String getHopeTime() {
		return hopeTime;
	}
	public void setHopeTime(String hopeTime) {
		this.hopeTime = hopeTime;
	}
	public String getRsvDate8() {
		return rsvDate8;
	}
	public void setRsvDate8(String rsvDate8) {
		this.rsvDate8 = rsvDate8;
	}
	public String getRsvTime() {
		return rsvTime;
	}
	public void setRsvTime(String rsvTime) {
		this.rsvTime = rsvTime;
	}
	public String getCounselEndDate8() {
		return counselEndDate8;
	}
	public void setCounselEndDate8(String counselEndDate8) {
		this.counselEndDate8 = counselEndDate8;
	}
	public String getCounselEndTime() {
		return counselEndTime;
	}
	public void setCounselEndTime(String counselEndTime) {
		this.counselEndTime = counselEndTime;
	}

	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCounselName2() {
		return counselName2;
	}
	public void setCounselName2(String counselName2) {
		this.counselName2 = counselName2;
	}
	public String getCounselName3() {
		return counselName3;
	}
	public void setCounselName3(String counselName3) {
		this.counselName3 = counselName3;
	}
	
	
	
	public String getActivitySeqNo() {
		return activitySeqNo;
	}
	public void setActivitySeqNo(String activitySeqNo) {
		this.activitySeqNo = activitySeqNo;
	}
	
	public String getOccurrenceDate() {
		return occurrenceDate;
	}
	public void setOccurrenceDate(String occurrenceDate) {
		this.occurrenceDate = occurrenceDate;
	}
	public String getOccurrenceTime() {
		return occurrenceTime;
	}
	public void setOccurrenceTime(String occurrenceTime) {
		this.occurrenceTime = occurrenceTime;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	
	public String getOrderSeq() {
		return orderSeq;
	}
	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getOrderRsvDate8() {
		return orderRsvDate8;
	}
	public void setOrderRsvDate8(String orderRsvDate8) {
		this.orderRsvDate8 = orderRsvDate8;
	}
	public String getOrderRsvTime() {
		return orderRsvTime;
	}
	public void setOrderRsvTime(String orderRsvTime) {
		this.orderRsvTime = orderRsvTime;
	}
	public String getOrderRequestDate8() {
		return orderRequestDate8;
	}
	public void setOrderRequestDate8(String orderRequestDate8) {
		this.orderRequestDate8 = orderRequestDate8;
	}
	public String getOrderRequestTime() {
		return orderRequestTime;
	}
	public void setOrderRequestTime(String orderRequestTime) {
		this.orderRequestTime = orderRequestTime;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStDate() {
		return orderStDate;
	}
	public void setOrderStDate(String orderStDate) {
		this.orderStDate = orderStDate;
	}
	public String getOrderStTime() {
		return orderStTime;
	}
	public void setOrderStTime(String orderStTime) {
		this.orderStTime = orderStTime;
	}
	public String getOrderFinDate8() {
		return orderFinDate8;
	}
	public void setOrderFinDate8(String orderFinDate8) {
		this.orderFinDate8 = orderFinDate8;
	}
	public String getOrderFinTime() {
		return orderFinTime;
	}
	public void setOrderFinTime(String orderFinTime) {
		this.orderFinTime = orderFinTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getBundleType() {
		return bundleType;
	}
	public void setBundleType(String bundleType) {
		this.bundleType = bundleType;
	}
	public String getCnvgNo() {
		return cnvgNo;
	}
	public void setCnvgNo(String cnvgNo) {
		this.cnvgNo = cnvgNo;
	}
	public Date getCnvgAplyStrtDttm() {
		return cnvgAplyStrtDttm;
	}
	public void setCnvgAplyStrtDttm(Date cnvgAplyStrtDttm) {
		this.cnvgAplyStrtDttm = cnvgAplyStrtDttm;
	}
	public String getFuncName() {
		return funcName;
	}
	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	public String getCounselSeqno() {
		return counselSeqno;
	}
	public void setCounselSeqno(String counselSeqno) {
		this.counselSeqno = counselSeqno;
	}
	public String getActMode() {
		return actMode;
	}
	public void setActMode(String actMode) {
		this.actMode = actMode;
	}
	public String getAddNum() {
		return addNum;
	}
	public void setAddNum(String addNum) {
		this.addNum = addNum;
	}
	public String getCustVilgAbvAddr() {
		return custVilgAbvAddr;
	}
	public void setCustVilgAbvAddr(String custVilgAbvAddr) {
		this.custVilgAbvAddr = custVilgAbvAddr;
	}
	public String getCustVilgBlwAddr() {
		return custVilgBlwAddr;
	}
	public void setCustVilgBlwAddr(String custVilgBlwAddr) {
		this.custVilgBlwAddr = custVilgBlwAddr;
	}
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	public String getJoinYn() {
		return joinYn;
	}
	public void setJoinYn(String joinYn) {
		this.joinYn = joinYn;
	}
	public String getAsType() {
		return asType;
	}
	public void setAsType(String asType) {
		this.asType = asType;
	}
	public String getLeadTime() {
		return leadTime;
	}
	public void setLeadTime(String leadTime) {
		this.leadTime = leadTime;
	}
	
/*	public List<CrmOffer> getOffers() {
		return offers;
	}
	public void setOffers(List<CrmOffer> offers) {
		this.offers = offers;
	}*/
	public String getProdNo() {
		return prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}
	public String getDeciAmt() {
		return deciAmt;
	}
	public void setDeciAmt(String deciAmt) {
		this.deciAmt = deciAmt;
	}
	public String getReqFromDate() {
		return reqFromDate;
	}
	public void setReqFromDate(String reqFromDate) {
		this.reqFromDate = reqFromDate;
	}
	public String getReqToDate() {
		return reqToDate;
	}
	public void setReqToDate(String reqToDate) {
		this.reqToDate = reqToDate;
	}
	public String getSatisfactionYn() {
		return satisfactionYn;
	}
	public void setSatisfactionYn(String satisfactionYn) {
		this.satisfactionYn = satisfactionYn;
	}
	public String getSatisfactionQueSeq() {
		return satisfactionQueSeq;
	}
	public void setSatisfactionQueSeq(String satisfactionQueSeq) {
		this.satisfactionQueSeq = satisfactionQueSeq;
	}
	public String getSatisfactionAnsSeq() {
		return satisfactionAnsSeq;
	}
	public void setSatisfactionAnsSeq(String satisfactionAnsSeq) {
		this.satisfactionAnsSeq = satisfactionAnsSeq;
	}
	public String getConselName1() {
		return conselName1;
	}
	public void setConselName1(String conselName1) {
		this.conselName1 = conselName1;
	}
	public String getCompleteleadTime() {
		return completeleadTime;
	}
	public void setCompleteleadTime(String completeleadTime) {
		this.completeleadTime = completeleadTime;
	}
	public String getProgressleadTime() {
		return progressleadTime;
	}
	public void setProgressleadTime(String progressleadTime) {
		this.progressleadTime = progressleadTime;
	}
	public String getAcceptleadTime() {
		return acceptleadTime;
	}
	public void setAcceptleadTime(String acceptleadTime) {
		this.acceptleadTime = acceptleadTime;
	}
	public String getManageDlrId() {
		return manageDlrId;
	}
	public void setManageDlrId(String manageDlrId) {
		this.manageDlrId = manageDlrId;
	}
	public String getActivityPath() {
		return activityPath;
	}
	public void setActivityPath(String activityPath) {
		this.activityPath = activityPath;
	}
	public String getCounselOwner() {
		return counselOwner;
	}
	public void setCounselOwner(String counselOwner) {
		this.counselOwner = counselOwner;
	}
	public String getDoorCode() {
		return doorCode;
	}
	public void setDoorCode(String doorCode) {
		this.doorCode = doorCode;
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
	public void setMduPort(String mdpPort) {
		this.mduPort = mdpPort;
	}
	public String getPostPoneStatus() {
		return postPoneStatus;
	}
	public void setPostPoneStatus(String postPoneStatus) {
		this.postPoneStatus = postPoneStatus;
	}
	public String getSoftPhoneCheck() {
		return softPhoneCheck;
	}
	public void setSoftPhoneCheck(String softPhoneCheck) {
		this.softPhoneCheck = softPhoneCheck;
	}
	@Override
	public String toString() {
		return "Counsel [eventCd=" + eventCd + ", marketCode=" + marketCode
				+ ", counselId=" + counselId + ", entrNo=" + entrNo
				+ ", custNo=" + custNo + ", svcCd=" + svcCd + ", counselName="
				+ counselName + ", counselTel=" + counselTel + ", custReq="
				+ custReq + ", counselRes=" + counselRes
				+ ", relationshipType=" + relationshipType + ", regDate="
				+ regDate + ", transferDate=" + transferDate
				+ ", counselDivision=" + counselDivision + ", counselTypeCd="
				+ counselTypeCd + ", counselDtlCd=" + counselDtlCd
				+ ", counselDtlCd2=" + counselDtlCd2 + ", counselDtlCd3="
				+ counselDtlCd3 + ", counselDtlCd4=" + counselDtlCd4
				+ ", counselDtlCd5=" + counselDtlCd5 + ", counselDtlCd6="
				+ counselDtlCd6 + ", counselDtlCd7=" + counselDtlCd7
				+ ", counselDtlCd8=" + counselDtlCd8 + ", counselDivisionText="
				+ counselDivisionText + ", counselTypeCdText="
				+ counselTypeCdText + ", counselDtlCdText=" + counselDtlCdText
				+ ", counselDtlCd2Text=" + counselDtlCd2Text
				+ ", counselDtlCd3Text=" + counselDtlCd3Text
				+ ", counselDtlCd4Text=" + counselDtlCd4Text
				+ ", counselDtlCd5Text=" + counselDtlCd5Text
				+ ", counselDtlCd6Text=" + counselDtlCd6Text
				+ ", counselDtlCd7Text=" + counselDtlCd7Text
				+ ", counselDtlCd8Text=" + counselDtlCd8Text + ", activityCd="
				+ activityCd + ", transferType=" + transferType
				+ ", transferText=" + transferText + ", counselStatus="
				+ counselStatus + ", counselStatusText=" + counselStatusText
				+ ", firstOperator=" + firstOperator + ", hopeDate=" + hopeDate
				+ ", hopeTime=" + hopeTime + ", rsvDate8=" + rsvDate8
				+ ", rsvTime=" + rsvTime + ", counselEndDate8="
				+ counselEndDate8 + ", counselEndTime=" + counselEndTime
				+ ", serviceType=" + serviceType + ", custType=" + custType
				+ ", counselName2=" + counselName2 + ", counselName3="
				+ counselName3 + ", question=" + question + ", answer="
				+ answer + ", AcceptDate=" + AcceptDate + ", EndDate="
				+ EndDate + ", conselName1=" + conselName1 + ", activitySeqNo="
				+ activitySeqNo + ", occurrenceDate=" + occurrenceDate
				+ ", occurrenceTime=" + occurrenceTime + ", orderNum="
				+ orderNum + ", orderSeq=" + orderSeq + ", managerId="
				+ managerId + ", orderRsvDate8=" + orderRsvDate8
				+ ", orderRsvTime=" + orderRsvTime + ", orderRequestDate8="
				+ orderRequestDate8 + ", orderRequestTime=" + orderRequestTime
				+ ", activityCode=" + activityCode + ", orderStatus="
				+ orderStatus + ", orderStDate=" + orderStDate
				+ ", orderStTime=" + orderStTime + ", orderFinDate8="
				+ orderFinDate8 + ", orderFinTime=" + orderFinTime
				+ ", remark=" + remark + ", bundleType=" + bundleType
				+ ", cnvgNo=" + cnvgNo + ", cnvgAplyStrtDttm="
				+ cnvgAplyStrtDttm + ", counselRe=" + counselRe
				+ ", counselPro=" + counselPro + ", counselCo=" + counselCo
				+ ", activityDesc=" + activityDesc + ", counselSeqno="
				+ counselSeqno + ", funcName=" + funcName + ", actMode="
				+ actMode + ", addNum=" + addNum + ", custVilgAbvAddr="
				+ custVilgAbvAddr + ", custVilgBlwAddr=" + custVilgBlwAddr
				+ ", joinYn=" + joinYn + ", asType=" + asType
				+ ", sysOperatorId=" + sysOperatorId + ", leadTime=" + leadTime
				+ ", offers=" +/* offers + */", prodNo=" + prodNo + ", deciAmt="
				+ deciAmt + ", reqFromDate=" + reqFromDate + ", reqToDate="
				+ reqToDate + ", completeleadTime=" + completeleadTime
				+ ", progressleadTime=" + progressleadTime
				+ ", acceptleadTime=" + acceptleadTime + ", satisfactionYn="
				+ satisfactionYn + ", satisfactionQueSeq=" + satisfactionQueSeq
				+ ", satisfactionAnsSeq=" + satisfactionAnsSeq
				+ ", manageDlrId=" + manageDlrId + ", activityPath="
				+ activityPath + ", counselOwner=" + counselOwner
				+ ", doorCode=" + doorCode + ", mduIp=" + mduIp + ", mduPort="
				+ mduPort + ", softPhoneCheck=" + softPhoneCheck
				+ ", postPoneStatus=" + postPoneStatus + "]";
	}
	
	public Counsel clone(){
		try {
			return (Counsel) super.clone();
		} catch (CloneNotSupportedException e) {
			return null ;
		}
	}

}
