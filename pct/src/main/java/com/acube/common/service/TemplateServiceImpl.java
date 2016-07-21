/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acube.common.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.acube.common.domain.jqgrid.GridRequest;
import com.acube.common.domain.jqgrid.GridResponse;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.Search;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.mapper.ProductRepository;
import com.acube.common.pagination.Pagination;
import com.acube.pc.domain.Product;
import com.acube.pc.domain.ProductExample;
import com.acube.pc.domain.ProductTree;
import com.acube.pc.mapper.mbg.ProductMapper;

@Service
public class TemplateServiceImpl implements TemplateService {

	private static final Logger logger = LoggerFactory.getLogger(TemplateServiceImpl.class);

	@Autowired
	private ProductMapper productMapper;
	@Autowired
	private ProductRepository productRepository;

	@Override
	public GridResponse<Product> findProductByName(GridRequest gridRequest, Search search) throws DataAccessException {

		GridResponse<Product> response = new GridResponse<Product>();

		ProductExample example = new ProductExample();
		if (search.getValue() != "" && !"null".equalsIgnoreCase(search.getValue())) {
			example.createCriteria().andProdNameLike("%" + search.getValue() + "%");
		}

		example.setOrderByClause(gridRequest.getSortField() + " " + (gridRequest.getSortDesc() ? "desc" : "asc"));
		response.setPageNumber(gridRequest.getPageNumber());
		response.setPageSize(gridRequest.getPageSize());
		response.setTotalRowCount(productMapper.countByExample(example));
		response.setRows(productMapper.selectByExampleWithRowbounds(example, gridRequest.getRowBounds()));

		return response;
	}

	@Override
	public GridResponse<Product> findAll(GridRequest gridRequest) throws DataAccessException {

		GridResponse<Product> response = new GridResponse<Product>();

		ProductExample example = new ProductExample();
		example.setOrderByClause(gridRequest.getSortField() + " " + (gridRequest.getSortDesc() ? "desc" : "asc"));
		response.setPageNumber(gridRequest.getPageNumber());
		response.setPageSize(gridRequest.getPageSize());
		response.setTotalRowCount(productMapper.countByExample(example));
		response.setRows(productMapper.selectByExampleWithRowbounds(example, gridRequest.getRowBounds()));

		return response;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int getProductCountByCriteria() {
		ProductExample example = new ProductExample();
		return productMapper.countByExample(example);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Product> getProductsByCriteria() {
		ProductExample example = new ProductExample();
		return productMapper.selectByExample(example);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<Product> getProducts(SearchFilter searchFilter, Pagination pagination) {
		/*
		 * JQueryGrid<Product> response = new JQueryGrid<Product>(pagination);
		 * response.setRows(productRepository.getProducts(searchFilter,
		 * pagination));
		 */
		// JQueryGrid<Product> response = new JQueryGrid<Product>(pagination,
		// productRepository.getProducts(searchFilter, pagination));
		return new JQueryGrid<Product>(pagination, productRepository.getProducts(searchFilter, pagination));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<Product> getProducts(SearchFilter searchFilter) {
		return new JQueryGrid<Product>(productRepository.getAllProducts(searchFilter));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<Product> getProductsByWithoutPaging(SearchFilter searchFilter) {
		return new JQueryGrid<Product>(productRepository.getProductsByWithoutPaging(searchFilter));
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public JQueryGrid<ProductTree> getTreeGridByProduct() {
		return new JQueryGrid<ProductTree>(productRepository.getTreeGridByProduct());
	}
}
