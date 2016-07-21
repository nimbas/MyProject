package com.acube.common.web.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.TemplateService;
import com.acube.pc.domain.Product;
import com.acube.pc.domain.ProductTree;
import com.acube.security.service.MenuService;

/**
 * <pre>
 * com.abacus.pc.web.mvc 
 *    |_ HomeController.java
 * 
 * comment:General mvc controller
 * </pre>
 * 
 * @date : 2014. 11. 6. 오후 2:17:52
 * @version :
 * @author : ChoiKangYou
 */
@Controller
public class MvcTemplateController {

	private static final Logger logger = LoggerFactory.getLogger(MvcTemplateController.class);

	@Autowired MenuService menuService;
	@Autowired TemplateService templateService;

	/**
	 * 페이징 있는 JQGrid 목록
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/listWithPage", method = RequestMethod.GET)
	public String templateListWithPage(Model model) {
		return "template/listWithPage";
	}
	/**
	 * 페이징 없는 JQGrid 목록
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/listWithoutPage", method = RequestMethod.GET)
	public String templateListWithoutPage(Model model) {
		return "template/listWithoutPage";
	}
	
	/**
	 * 트리그리드 템플릿
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/listTreeGrid", method = RequestMethod.GET)
	public String templateListTreeGrid(Model model) {
		return "template/listTreeGrid";
	}
	
	/**
	 * 페이징 있는 JQGrid 목록 데이타
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/template/find", method = RequestMethod.POST)
	@ResponseBody public JQueryGrid<Product> templateFind(Model model, SearchFilter searchFilter) {

		JQueryGrid<Product> gridResponse = templateService.getProducts(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		logger.debug(searchFilter.toString());
		return gridResponse ;
	}
	
	/**
	 * 페이징 없는 JQGrid 목록 데이타 : 단순데이타 
	 * @param model
	 * @param searchFilter
	 * @return {'prodCd' : '60', 'prodName' : 'Yari 3000'}
	 */
	@RequestMapping(value = "/template/findAll", method = RequestMethod.POST)
	@ResponseBody public JQueryGrid<Product> templateFindAll(Model model, SearchFilter searchFilter) {

		JQueryGrid<Product> gridResponse = templateService.getProducts(searchFilter);
		return gridResponse ;
	}
	
	/**
	 * 페이징 없는 JQGrid 목록 데이타 : 복합데이타 
	 * @param model
	 * @param searchFilter
	 * @return {'prodCd' : '60', 'prodName' : 'Yari 3000', 'rates' : [{'ftrCd' : '700', 'rate' : '500'}]}
	 */
	@RequestMapping(value = "/template/findWithoutPage", method = RequestMethod.POST)
	@ResponseBody public JQueryGrid<Product> templateFindWithoutPage(Model model, SearchFilter searchFilter) {

		JQueryGrid<Product> gridResponse = templateService.getProductsByWithoutPaging(searchFilter);
		return gridResponse ;
	}

	/**
	 * 조회페이지
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/view", method = RequestMethod.GET)
	public String templateView(Model model) {
		return "template/view";
	}
	
	/**
	 * 등록페이지
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/form", method = RequestMethod.GET)
	public String templateForm(Model model) {
		return "template/form";
	}
	
	/**
	 * TreeGrid 데이타
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = "/template/treeGrid", method = RequestMethod.POST)
	@ResponseBody public JQueryGrid<ProductTree> templateTreeGrid(Model model, SearchFilter searchFilter) {

		JQueryGrid<ProductTree> productTrees = templateService.getTreeGridByProduct();
		return productTrees ;
	}
	
	/**
	 * 모달 다이알로그 템플릿
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/template/modal", method = RequestMethod.GET)
	public String templateModalPopup(Model model) {
		return "template/modalListTreeGrid";
	}
}
