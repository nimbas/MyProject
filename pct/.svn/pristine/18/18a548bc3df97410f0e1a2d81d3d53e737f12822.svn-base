package com.acube.pvs.web;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.domain.PsParamMap;
import com.acube.pvs.domain.PsProvMap;
import com.acube.pvs.service.MapService;
import com.acube.security.service.SecurityService;

@Controller
@RequestMapping
public class MapController {

	private final static Logger logger = LoggerFactory.getLogger(MapController.class);

	@Autowired
	MapService mapService;
	@Autowired
	LogicalDateService dateService;
	@Autowired
	SecurityService securityService;

	/**
	 * provision map list 화면
	 * 
	 * @param model
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/maps" }, method = { RequestMethod.GET })
	public String moveToMapList(Model model) {
		return "pvs/map/list";
	}

	/**
	 * map list 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/map/search" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsProvMap> searchMaps(SearchFilter searchFilter) {
		return mapService.getProvMapDefs(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
	}

	/**
	 * map정보 추가
	 * 
	 * @param provMap
	 * @return
	 */
	@RequestMapping(value = { "/map" }, method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result processMap(@RequestBody PsProvMap provMap) {
		provMap.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "processMap");
		mapService.processProvMapDef(provMap);
		return new Result(ResultCode.SUCCESS);
	}

	/**
	 * map정보 삭제
	 * 
	 * @param provMap
	 * @return
	 */
	@RequestMapping(value = { "/map" }, method = { RequestMethod.DELETE }, consumes = { "application/json" })
	@ResponseBody
	public Result deleteMap(@RequestBody PsProvMap provMap) {
		provMap.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "addMap");
		mapService.deleteProvMapDef(provMap);
		return new Result(ResultCode.SUCCESS);
	}

	/**
	 * map list 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/map/target/search" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsProvMap> searchMapTargets(@RequestParam String neId, SearchFilter searchFilter) {
		if(StringUtils.isNotEmpty(neId) && !"0".equals(neId)){
			return mapService.getProvTrgtMaps(searchFilter);
		}
		return new JQueryGrid<PsProvMap>();
	}

	/**
	 * map정보 처리(add, update, delete)
	 * 
	 * @param provMap
	 * @return
	 */
	@RequestMapping(value = { "/map/target" }, method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result processMapTarget(@RequestBody PsProvMap provMap) {
		provMap.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "processMapTarget");
		mapService.processProvTrgtMap(provMap);
		return new Result(ResultCode.SUCCESS);
	}

	/**
	 * target param map list 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/map/param/target/search" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsParamMap> searchTargetParamMaps(@RequestParam String neId, SearchFilter searchFilter) {
		if(StringUtils.isNotEmpty(neId) && !"0".equals(neId)){
			return mapService.getProvTargetParameterMaps(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}
		return new JQueryGrid<PsParamMap>();
	}
	
	
	@RequestMapping(value = { "/map/param/source" }, method = { RequestMethod.GET })
	public String moveToSourceParmamList(Model model) {
		return "pvs/map/sourceParamList";
	}
	
	/**
	 * source param map list 조회
	 * 
	 * @param searchFilter
	 * @return
	 */
	@RequestMapping(value = { "/map/param/source/search" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsParamMap> searchSourceParamMaps(@RequestParam String neId, SearchFilter searchFilter) {
		if(StringUtils.isNotEmpty(neId) && !"0".equals(neId)){
			return mapService.getProvSourceParameterMaps(searchFilter, new Pagination(searchFilter.getPage(), searchFilter.getRows()));
		}
		return new JQueryGrid<PsParamMap>();
	}

	@RequestMapping(value = { "/map/param" }, method = { RequestMethod.POST }, consumes = { "application/json" })
	@ResponseBody
	public Result processProvParamMap(@RequestBody PsProvMap provMap) {
		provMap.setBaseInfo(dateService.getCurrentDate(), securityService.getCurrentUser().getUserId(), "processParamMap");
		mapService.processParamMap(provMap);
		return new Result(ResultCode.SUCCESS);
	}
	
	@RequestMapping(value = { "/map/exception/flow" }, method = { RequestMethod.POST })
	@ResponseBody
	public JQueryGrid<PsProvMap> searchExceptionFlow(@RequestParam String neId, SearchFilter searchFilter) {
		if(StringUtils.isNotEmpty(neId) && !"0".equals(neId)){
			return mapService.getExceptionFlow(searchFilter);
		}
		return new JQueryGrid<PsProvMap>();
	}
}