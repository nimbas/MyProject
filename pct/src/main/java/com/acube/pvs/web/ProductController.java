package com.acube.pvs.web;
 
import java.text.SimpleDateFormat;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.ProductRate;
import com.acube.pvs.domain.ProductRelation;
import com.acube.pvs.domain.Product;
import com.acube.pvs.domain.ProductDpnd;
import com.acube.pvs.domain.ProductFtr;
import com.acube.pvs.domain.ProductFtrParam;
import com.acube.pvs.domain.ProductPenalty;
import com.acube.pvs.domain.PsProd;
import com.acube.pvs.service.ProdFeatureService;
import com.acube.security.service.SecurityService;
 
@Controller
@RequestMapping
/**
 * 상품관련
 *
 * @author YangByeongSub
 * @since
 *
 */
public class ProductController {
	
	private final static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired ProdFeatureService 	prodFeatureService;
	@Autowired LogicalDateService 	dateService;
	@Autowired SecurityService 	securityService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		//날짜 데이타가 값이 입력이 안되는 경우 '' 를 Date 변환시 에러가 나는 문제 처리.
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	    dateFormat.setLenient(false);

	    // true passed to CustomDateEditor constructor means convert empty String to null
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	/**
	 * list 화면 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/products"}, method={RequestMethod.GET})
	public String moveToProductList(Model model){
		return "pvs/product/list";
	}

	/**
	 * list 조회
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value={"/product/search"}, method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<Product> searchProduct(SearchFilter searchFilter) {
		return prodFeatureService.getProducts(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Product Rate list 조회
	 */
	@RequestMapping(value={"/product/rate/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductRate> rateProduct(SearchFilter searchFilter){
		return prodFeatureService.getProductRateGridList(searchFilter, new Pagination(searchFilter.getPage(),searchFilter.getRows()));
	}
	
	/**
	 * Product Cycle list 조회
	 */
	
	@RequestMapping(value={"/product/cycle/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductRate> cycleProduct(SearchFilter searchFilter){
		return prodFeatureService.getProductCycleRateGridList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Product Relation list 조회
	 * 
	 */
	@RequestMapping(value={"/product/relation/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductRelation> relationProduct(SearchFilter searchFilter){
		return prodFeatureService.getProductDpndGridList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Feature Grid List
	 */
	@RequestMapping(value={"/product/ftr/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductFtr> featureProduct(SearchFilter searchFilter){
		return prodFeatureService.getProductFtrGridList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Ftr Param Grid List
	 */
	@RequestMapping(value={"/product/ftrparam/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductFtrParam> featureParamProduct(SearchFilter searchFilter){
		return prodFeatureService.getProductFtrParamList(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Discount Grid List
	 */
	@RequestMapping(value={"/product/dicount/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<Product> discountProduct(SearchFilter searchFilter){
		return prodFeatureService.getDiscountTable(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * penalty Grid List
	 */
	@RequestMapping(value={"/product/penalty/list"},method={RequestMethod.POST})
	@ResponseBody public JQueryGrid<ProductPenalty> penaltyProduct(SearchFilter searchFilter){
		return prodFeatureService.getPenalty(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}
	
	/**
	 * Product Update
	 */
	@RequestMapping(value={"/product/rate/update"},method={RequestMethod.PUT})
	@ResponseBody public Result productUpdate(@RequestBody Product product){
		
		prodFeatureService.updateProduct(product);
		
		return new Result(ResultCode.SUCCESS);
	}
 }