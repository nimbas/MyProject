package com.acube.common.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pc.domain.Product;
import com.acube.pc.domain.ProductTree;

public interface ProductRepository {

	List<Product> getProducts(SearchFilter searchFilter, Pagination pagination);
	List<Product> getAllProducts(SearchFilter searchFilter);
	List<Product> getProductsByWithoutPaging(SearchFilter searchFilter);
	List<ProductTree> getTreeGridByProduct();

}