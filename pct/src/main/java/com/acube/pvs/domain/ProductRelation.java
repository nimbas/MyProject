package com.acube.pvs.domain;

import java.io.Serializable;

import com.acube.common.domain.BaseDomain;

public class ProductRelation extends BaseDomain implements Serializable, Cloneable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prodCd           ;
	private String prodName         ;
	private String trgtProdCd       ;
	private String trgtProdName     ;
	private String prodDpndSelsDvCd ;
	private String trgtProdType     ;
	private String prodDpndSelsDvNm ;
	private String relsKdCd         ;
	private String valdStrtDt       ;
	private String valdEndDt        ;
	private String addChrge         ;
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
	public String getTrgtProdCd() {
		return trgtProdCd;
	}
	public void setTrgtProdCd(String trgtProdCd) {
		this.trgtProdCd = trgtProdCd;
	}
	public String getTrgtProdName() {
		return trgtProdName;
	}
	public void setTrgtProdName(String trgtProdName) {
		this.trgtProdName = trgtProdName;
	}
	public String getProdDpndSelsDvCd() {
		return prodDpndSelsDvCd;
	}
	public void setProdDpndSelsDvCd(String prodDpndSelsDvCd) {
		this.prodDpndSelsDvCd = prodDpndSelsDvCd;
	}
	public String getTrgtProdType() {
		return trgtProdType;
	}
	public void setTrgtProdType(String trgtProdType) {
		this.trgtProdType = trgtProdType;
	}
	public String getProdDpndSelsDvNm() {
		return prodDpndSelsDvNm;
	}
	public void setProdDpndSelsDvNm(String prodDpndSelsDvNm) {
		this.prodDpndSelsDvNm = prodDpndSelsDvNm;
	}
	public String getRelsKdCd() {
		return relsKdCd;
	}
	public void setRelsKdCd(String relsKdCd) {
		this.relsKdCd = relsKdCd;
	}
	public String getValdStrtDt() {
		return valdStrtDt;
	}
	public void setValdStrtDt(String valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}
	public String getValdEndDt() {
		return valdEndDt;
	}
	public void setValdEndDt(String valdEndDt) {
		this.valdEndDt = valdEndDt;
	}
	public String getAddChrge() {
		return addChrge;
	}
	public void setAddChrge(String addChrge) {
		this.addChrge = addChrge;
	}
	@Override
	public String toString() {
		return "ProductRelation [prodCd=" + prodCd + ", prodName=" + prodName
				+ ", trgtProdCd=" + trgtProdCd + ", trgtProdName="
				+ trgtProdName + ", prodDpndSelsDvCd=" + prodDpndSelsDvCd
				+ ", trgtProdType=" + trgtProdType + ", prodDpndSelsDvNm="
				+ prodDpndSelsDvNm + ", relsKdCd=" + relsKdCd + ", valdStrtDt="
				+ valdStrtDt + ", valdEndDt=" + valdEndDt + ", addChrge="
				+ addChrge + "]";
	}
	
	
}

