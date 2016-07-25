package com.acube.pvs.service;

import java.io.File;


import java.util.Date;
import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.ProductRate;
import com.acube.pvs.domain.ProductRelation;
import com.acube.pvs.domain.Product;
import com.acube.pvs.domain.ProductFtr;
import com.acube.pvs.domain.ProductFtrParam;
import com.acube.pvs.domain.ProductPenalty;
import com.acube.pvs.domain.PsProd;
import com.acube.pvs.domain.PsProvFtr;

public interface ProdFeatureService {

	// 상품조회
	JQueryGrid<Product> getProducts(SearchFilter searchFilter, Pagination pagination);
	// 상품 목록 업데이트
	public int updateProduct(Product product);

	// 요율정보
	public int getProductRateListCount(SearchFilter searchFilter);
	public JQueryGrid<ProductRate> getProductRateGridList(SearchFilter searchFilter, Pagination pagination);
	public JQueryGrid<ProductRate> getProductCycleRateGridList(SearchFilter searchFilter, Pagination pagination) ;
	
	// 종속관계 Relation
	public JQueryGrid<ProductRelation> getProductDpndGridList(SearchFilter searchFilter, Pagination pagination) ;
	
	// Feature
	public JQueryGrid<ProductFtr> getProductFtrGridList(SearchFilter searchFilter, Pagination pagination);
	
	// Feature Parma
	public JQueryGrid<ProductFtrParam> getProductFtrParamList(SearchFilter searchFilter, Pagination pagination);
	
	// Discount
	public JQueryGrid<Product> getDiscountTable(SearchFilter searchFilter, Pagination pagination);
	
	// Penalty
	public JQueryGrid<ProductPenalty> getPenalty(SearchFilter searchFilter, Pagination pagination);
}
