package com.acube.common.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.acube.common.domain.jqgrid.GridRequest;
import com.acube.common.domain.jqgrid.GridResponse;
import com.acube.common.domain.jqgrid.JqGridRequest;
import com.acube.common.domain.jqgrid.JqGridResponse;
import com.acube.common.domain.searchFilter.Search;
import com.acube.common.service.TemplateService;
import com.acube.pc.domain.Product;

/**
 * <pre>
 * com.abacus.pc.web.rest 
 *    |_ ProductController.java
 * 
 * comment:Restful service controller
 *         RestController used in Spring 4.x.
 * </pre>
 * 
 * @date : 2014. 11. 6. 오후 2:16:26
 * @version :
 * @author : ChoiKangYou
 */
@RestController
public class RestTemplateController {

    private static final Logger logger = LoggerFactory.getLogger(RestTemplateController.class);

    @Autowired
    private TemplateService productService;

    @RequestMapping(value = "ajax/findByName", method = RequestMethod.GET)
    public JqGridResponse<Product> findByName(JqGridRequest jqGridRequest, Search search) {
	
	logger.debug("=================ajax/findByName================");
	
	GridRequest gridRequest = jqGridRequest.createDataRequest();
	GridResponse<Product> dataResponse = productService.findProductByName(gridRequest, search);

	return new JqGridResponse<Product>(dataResponse);
    }

    @RequestMapping(value = "ajax/findAll", method = RequestMethod.GET)
    public JqGridResponse<Product> findAll(JqGridRequest jqGridRequest) {

	logger.debug("=================ajax/findAll================");
	
	GridRequest gridRequest = jqGridRequest.createDataRequest();
	GridResponse<Product> dataResponse = productService.findAll(gridRequest);

	return new JqGridResponse<Product>(dataResponse);
    }

}
