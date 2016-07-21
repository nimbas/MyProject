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

import org.springframework.dao.DataAccessException;

import com.acube.common.domain.jqgrid.GridRequest;
import com.acube.common.domain.jqgrid.GridResponse;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.Search;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.pc.domain.Product;
import com.acube.pc.domain.ProductTree;

/**
 * @author kangyou,choi
 */
public interface TemplateService {

    GridResponse<Product> findProductByName(GridRequest request, Search search) throws DataAccessException;

    GridResponse<Product> findAll(GridRequest request) throws DataAccessException;
    
    int getProductCountByCriteria();
    List<Product> getProductsByCriteria();
    
    JQueryGrid<Product> getProducts(SearchFilter searchFilter, Pagination pagination);
    JQueryGrid<Product> getProducts(SearchFilter searchFilter);
    JQueryGrid<Product> getProductsByWithoutPaging(SearchFilter searchFilter);
    JQueryGrid<ProductTree> getTreeGridByProduct();
}
