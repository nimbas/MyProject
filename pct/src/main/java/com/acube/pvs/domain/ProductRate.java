package com.acube.pvs.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class ProductRate extends BaseDomain implements Serializable, Cloneable {
	private static final long serialVersionUID = -1134589839092290240L;

	private String inventoryItemId;

	private String valdStrtDt;
	private String prodCd;
	private String ftrCd;
	private String ftrCdNm; // 05.05추가
	private String rateDvCd;
	private String iocllDvCd;
	private String callingZoneCd;
	private String calledZoneCd;
	private String rateAplyLvlCd;
	private String rateAplyDvCd;
	private String uageApplyDvCd;
	private String rateAplyTimebandCd;
	private String rateAplyIntervalCd;
	private String rateAplyCyclDvCd;
	private String rateAplyKdCd;
	private String rateAplyUnitCd;
	private String rateAplyUnit;
	private String rate;
	private String spndRate;
	private String initRateCycleDuration;
	private String initRateAplyUnitCd;
	private String initRateAplyUnit;
	private String initRate;
	private String valdEndDt;
	private String onCycle;
	private String cond;
	private String cntGrpName;
	private String cntName;
	private String cntScale;
	private String cntUint;

	public String getInventoryItemId() {
		return inventoryItemId;
	}

	public void setInventoryItemId(String inventoryItemId) {
		this.inventoryItemId = inventoryItemId;
	}

	public String getValdStrtDt() {
		return valdStrtDt;
	}

	public void setValdStrtDt(String valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}

	public String getProdCd() {
		return prodCd;
	}

	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}

	public String getFtrCd() {
		return ftrCd;
	}

	public void setFtrCd(String ftrCd) {
		this.ftrCd = ftrCd;
	}

	public String getFtrCdNm() {
		return ftrCdNm;
	}

	public void setFtrCdNm(String ftrCdNm) {
		this.ftrCdNm = ftrCdNm;
	}

	public String getRateDvCd() {
		return rateDvCd;
	}

	public void setRateDvCd(String rateDvCd) {
		this.rateDvCd = rateDvCd;
	}

	public String getIocllDvCd() {
		return iocllDvCd;
	}

	public void setIocllDvCd(String iocllDvCd) {
		this.iocllDvCd = iocllDvCd;
	}

	public String getCallingZoneCd() {
		return callingZoneCd;
	}

	public void setCallingZoneCd(String callingZoneCd) {
		this.callingZoneCd = callingZoneCd;
	}

	public String getCalledZoneCd() {
		return calledZoneCd;
	}

	public void setCalledZoneCd(String calledZoneCd) {
		this.calledZoneCd = calledZoneCd;
	}

	public String getRateAplyLvlCd() {
		return rateAplyLvlCd;
	}

	public void setRateAplyLvlCd(String rateAplyLvlCd) {
		this.rateAplyLvlCd = rateAplyLvlCd;
	}

	public String getRateAplyDvCd() {
		return rateAplyDvCd;
	}

	public void setRateAplyDvCd(String rateAplyDvCd) {
		this.rateAplyDvCd = rateAplyDvCd;
	}

	public String getUageApplyDvCd() {
		return uageApplyDvCd;
	}

	public void setUageApplyDvCd(String uageApplyDvCd) {
		this.uageApplyDvCd = uageApplyDvCd;
	}

	public String getRateAplyTimebandCd() {
		return rateAplyTimebandCd;
	}

	public void setRateAplyTimebandCd(String rateAplyTimebandCd) {
		this.rateAplyTimebandCd = rateAplyTimebandCd;
	}

	public String getRateAplyIntervalCd() {
		return rateAplyIntervalCd;
	}

	public void setRateAplyIntervalCd(String rateAplyIntervalCd) {
		this.rateAplyIntervalCd = rateAplyIntervalCd;
	}

	public String getRateAplyCyclDvCd() {
		return rateAplyCyclDvCd;
	}

	public void setRateAplyCyclDvCd(String rateAplyCyclDvCd) {
		this.rateAplyCyclDvCd = rateAplyCyclDvCd;
	}

	public String getRateAplyKdCd() {
		return rateAplyKdCd;
	}

	public void setRateAplyKdCd(String rateAplyKdCd) {
		this.rateAplyKdCd = rateAplyKdCd;
	}

	public String getRateAplyUnitCd() {
		return rateAplyUnitCd;
	}

	public void setRateAplyUnitCd(String rateAplyUnitCd) {
		this.rateAplyUnitCd = rateAplyUnitCd;
	}

	public String getRateAplyUnit() {
		return rateAplyUnit;
	}

	public void setRateAplyUnit(String rateAplyUnit) {
		this.rateAplyUnit = rateAplyUnit;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSpndRate() {
		return spndRate;
	}

	public void setSpndRate(String spndRate) {
		this.spndRate = spndRate;
	}

	public String getInitRateCycleDuration() {
		return initRateCycleDuration;
	}

	public void setInitRateCycleDuration(String initRateCycleDuration) {
		this.initRateCycleDuration = initRateCycleDuration;
	}

	public String getInitRateAplyUnitCd() {
		return initRateAplyUnitCd;
	}

	public void setInitRateAplyUnitCd(String initRateAplyUnitCd) {
		this.initRateAplyUnitCd = initRateAplyUnitCd;
	}

	public String getInitRateAplyUnit() {
		return initRateAplyUnit;
	}

	public void setInitRateAplyUnit(String initRateAplyUnit) {
		this.initRateAplyUnit = initRateAplyUnit;
	}

	public String getInitRate() {
		return initRate;
	}

	public void setInitRate(String initRate) {
		this.initRate = initRate;
	}

	public String getValdEndDt() {
		return valdEndDt;
	}

	public void setValdEndDt(String valdEndDt) {
		this.valdEndDt = valdEndDt;
	}

	public String getOnCycle() {
		return onCycle;
	}

	public void setOnCycle(String onCycle) {
		this.onCycle = onCycle;
	}

	public String getCond() {
		return cond;
	}

	public void setCond(String cond) {
		this.cond = cond;
	}

	public String getCntGrpName() {
		return cntGrpName;
	}

	public void setCntGrpName(String cntGrpName) {
		this.cntGrpName = cntGrpName;
	}

	public String getCntName() {
		return cntName;
	}

	public void setCntName(String cntName) {
		this.cntName = cntName;
	}

	public String getCntScale() {
		return cntScale;
	}

	public void setCntScale(String cntScale) {
		this.cntScale = cntScale;
	}

	public String getCntUint() {
		return cntUint;
	}

	public void setCntUint(String cntUint) {
		this.cntUint = cntUint;
	}
}
