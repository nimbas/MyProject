package com.acube.pvs.domain;

import java.io.Serializable;
import java.util.List;

import com.acube.common.domain.BaseDomain;


public class ProductDpnd extends BaseDomain implements Serializable, Cloneable {

	private static final long serialVersionUID = -1134589839092290240L;

	private String relsSeqno		;
	private String prodCd           ;   //상품ID
	private String trgtProdCd       ;   //대상상품ID
	private String valdStrtDt       ;   //유효시작일자
	private String prodDpndSelsDvCd ;   //상품종속관계구분코드
	private String relsKdCd         ;   //상품종속유형코드
	private String valdEndDt        ;   //유효종료일자
	
	private String prodName;
	private String trgtProdName;
	private String prodDpndSelsDvNm ;
    private String addChrge;
    private String detailCode;
    
    private List<ProductDpnd>productDpndList;
	
	private String[] checks;



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



	public String getValdStrtDt() {
		return valdStrtDt;
	}



	public void setValdStrtDt(String valdStrtDt) {
		this.valdStrtDt = valdStrtDt;
	}



	public String getProdDpndSelsDvCd() {
		return prodDpndSelsDvCd;
	}



	public void setProdDpndSelsDvCd(String prodDpndSelsDvCd) {
		this.prodDpndSelsDvCd = prodDpndSelsDvCd;
	}



	public String getRelsKdCd() {
		return relsKdCd;
	}



	public void setRelsKdCd(String relsKdCd) {
		this.relsKdCd = relsKdCd;
	}



	public String getValdEndDt() {
		return valdEndDt;
	}



	public void setValdEndDt(String valdEndDt) {
		this.valdEndDt = valdEndDt;
	}



	public String getProdName() {
		return prodName;
	}



	public void setProdName(String prodName) {
		this.prodName = prodName;
	}



	public String getTrgtProdName() {
		return trgtProdName;
	}



	public void setTrgtProdName(String trgtProdName) {
		this.trgtProdName = trgtProdName;
	}



	public String getProdDpndSelsDvNm() {
		return prodDpndSelsDvNm;
	}



	public void setProdDpndSelsDvNm(String prodDpndSelsDvNm) {
		this.prodDpndSelsDvNm = prodDpndSelsDvNm;
	}



	public String[] getChecks() {
		return checks;
	}



	public void setChecks(String[] checks) {
		this.checks = checks;
	}



	public String getAddChrge() {
		return addChrge;
	}



	public void setAddChrge(String addChrge) {
		this.addChrge = addChrge;
	}



	public String getRelsSeqno() {
		return relsSeqno;
	}



	public void setRelsSeqno(String relsSeqno) {
		this.relsSeqno = relsSeqno;
	}



	public List<ProductDpnd> getProductDpndList() {
		return productDpndList;
	}



	public void setProductDpndList(List<ProductDpnd> productDpndList) {
		this.productDpndList = productDpndList;
	}



	public String getDetailCode() {
		return detailCode;
	}



	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}
	
	
	
	
}