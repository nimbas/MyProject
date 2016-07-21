package com.acube.pvs.service;

import java.io.File;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.WorkType;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.exception.AcubeException;
import com.acube.common.pagination.Pagination;
import com.acube.common.util.ResourceUtil;
import com.acube.pvs.domain.ProductRate;
import com.acube.pvs.domain.ProductRelation;
import com.acube.pvs.domain.Product;
import com.acube.pvs.domain.ProductFtr;
import com.acube.pvs.domain.ProductFtrParam;
import com.acube.pvs.domain.ProductPenalty;
import com.acube.pvs.domain.PsProd;
import com.acube.pvs.domain.PsProvFtr;
import com.acube.pvs.mapper.ProdFeatureRepository;

@Service
@Transactional
public class ProdFeatureServiceImpl implements ProdFeatureService {

	@Autowired
	ProdFeatureRepository prodFeatureRepository;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<Product> getProducts(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<Product>(pagination, prodFeatureRepository.getProducts(searchFilter, pagination));
	}

	@Override
	public int getProductRateListCount(SearchFilter searchFilter) {
		// TODO Auto-generated method stub
		return prodFeatureRepository.getProductRateListCount(searchFilter);
	}

	@Override
	public JQueryGrid<ProductRate> getProductRateGridList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductRate>(pagination, prodFeatureRepository.getProductRateGridList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProductRate> getProductCycleRateGridList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductRate>(pagination, prodFeatureRepository.getProductCycleRateGridList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProductRelation> getProductDpndGridList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductRelation>(pagination, prodFeatureRepository.getProductDpndGridList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProductFtr> getProductFtrGridList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductFtr>(pagination, prodFeatureRepository.getProductFtrGridList(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProductFtrParam> getProductFtrParamList(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductFtrParam>(pagination, prodFeatureRepository.getProductFtrParamList(searchFilter,pagination));
	}

	@Override
	public JQueryGrid<Product> getDiscountTable(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<Product>(pagination, prodFeatureRepository.getDiscountTable(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProductPenalty> getPenalty(SearchFilter searchFilter, Pagination pagination) {
		// TODO Auto-generated method stub
		return new JQueryGrid<ProductPenalty>(pagination, prodFeatureRepository.getPenalty(searchFilter, pagination));
	}

	@Override
	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return prodFeatureRepository.updateProduct(product);
	}

}
