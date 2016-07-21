package com.acube.pvs.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class ProductPenalty extends BaseDomain implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -820452964670231874L;
	private String prodCd		;
	private String trgtProdCd   ;
	private String featureNm    ;
	private String pnlt         ;
	
	public String getProdCd() {
		return prodCd;
	}
	public void setProdCd(String prodCd) {
		this.prodCd = prodCd;
	}
	public String getTrgtProdCd() {
		return trgtProdCd;
	}
	public void setTrgtProdCd(String trgtProdCd) {
		this.trgtProdCd = trgtProdCd;
	}
	public String getFeatureNm() {
		return featureNm;
	}
	public void setFeatureNm(String featureNm) {
		this.featureNm = featureNm;
	}
	public String getPnlt() {
		return pnlt;
	}
	public void setPnlt(String pnlt) {
		this.pnlt = pnlt;
	}

}
