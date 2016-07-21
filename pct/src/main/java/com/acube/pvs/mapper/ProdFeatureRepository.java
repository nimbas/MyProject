package com.acube.pvs.mapper;

import java.util.List;




import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pvs.domain.ProductRate;
import com.acube.pvs.domain.ProductRelation;
import com.acube.pvs.domain.Product;
import com.acube.pvs.domain.ProductFtr;
import com.acube.pvs.domain.ProductFtrParam;
import com.acube.pvs.domain.ProductPenalty;

public interface ProdFeatureRepository {

	// 상품목록조회
	List<Product> getProducts(SearchFilter searchFilter, Pagination pagination);
	
	// 상품 목록 업데이트
	public int updateProduct(Product product);
	
	//요율정보
	public int getProductRateListCount(SearchFilter  searchFilter) ;
	public List<ProductRate> getProductRateGridList(SearchFilter searchFilter, Pagination pagination) ;
	public List<ProductRate> getProductCycleRateGridList(SearchFilter searchFilter, Pagination pagination) ;
	
	// Relation 정보
	public List<ProductRelation> getProductDpndGridList(SearchFilter searchFilter, Pagination pagination) ;
	
	// Feature 정보
	public List<ProductFtr> getProductFtrGridList(SearchFilter searchFilter, Pagination pagination) ;
	
	// Feature Param 정보
	public List<ProductFtrParam> getProductFtrParamList(SearchFilter searchFilter, Pagination pagination);
	
	// Discount Grid List
	public List<Product> getDiscountTable(SearchFilter searchFilter, Pagination pagination);
	
	// Penalty
	public List<ProductPenalty> getPenalty(SearchFilter searchFilter, Pagination pagination);

}
