package com.acube.common.domain.searchFilter;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.util.StringUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *  Mybatis의 mapper xml에서 검색항목 및 정렬항목 관리
 * 
 * @author YangByeongSub
 * @since 1.0
 *
 */
public class SearchFilter extends JQGridSearchFilter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8745218618828099658L;

	private FilterOper filterOper; // multi filter시 사용
	private String filterMaps; // mybatis xml에서 사용
	private HashMap<String, Object> filterMap; // mybatis xml에서 사용
	private List<Search> pdhFilters;

	public List<Search> getPdhFilters() {
		return pdhFilters;
	}

	public void setPdhFilters(List<Search> pdhFilters) {
		this.pdhFilters = pdhFilters;
	}

	public String getFilterMaps() {
		return filterMaps;
	}

	public void setFilterMaps(String filterMaps) {
		this.filterMaps = filterMaps;
		this.getFilterMapByStr();
	}

	@SuppressWarnings("unchecked")
	public HashMap<String, Object> getFilterMapByStr() {
		if (!StringUtils.isEmpty(filterMaps)) {
			ObjectMapper om = new ObjectMapper();
			try {
				this.filterMap = om.readValue(filterMaps, HashMap.class);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return this.filterMap ;
	}
	/**
	 * 검색필터를 이용하지 못하는 경우에 필요시 사용
	 * 
	 * @return
	 */
	public HashMap<String, Object> getFilterMap() {
		return filterMap;
	}

	public void setFilterMap(HashMap<String, Object> filterMap) {
		this.filterMap = filterMap;
	}

	public FilterOper getFilterOper() {
		return this.filterOper;
	}

	/**
	 * JQGRID 멀티 검색시
	 * 
	 * @return
	 */
	public FilterOper convertToFilterOper() {

		// multi search시에만 데이타 존재
		if (!StringUtils.isEmpty(super.getFilters())) {
			ObjectMapper om = new ObjectMapper();
			try {
				this.filterOper = om.readValue(super.getFilters(), FilterOper.class);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return filterOper;
	}

	/**
	 * 검색필터 갯수 : 검색작업 Init 시작점
	 * 
	 * @return
	 */
	public int getFilterCount() {
		List<Search> searchFilters = this.getSearchFilters();
		if (searchFilters == null)
			return 0;
		else
			return searchFilters.size();
	}

	public List<Search> getSearchFilters() {

		// multi search시
		if (!StringUtils.isEmpty(super.getFilters())) {

			// filters 스트링을 FilterOper domain으로 변환 작업
			FilterOper oper = convertToFilterOper();
			if (oper != null) {
				return oper.getSearchFilters();
			}
		}
		// 단일 search시
		else {
			List<Search> searchFilters = new ArrayList<Search>();
			int idx = 0;
			if( this.getSearchString() != null){
				for (String searchValue : this.getSearchString()) {
					if (!"".equals(searchValue) && searchValue != null) {
						searchFilters.add(FilterOper.getOperationSearch(this.getSearchField()[idx], this.getSearchOper()[idx], searchValue));
					}
					idx++;
				}
			}
			if (searchFilters.size() > 0) {
				return searchFilters;
			}
		}
		return null;
	}
	
	public void putFilterMap(String filterName, Object object){
		if(filterMap == null){
			filterMap = new HashMap<String, Object>();
		}
		filterMap.put(filterName, object);
	}
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("SearchFilters[");
		if (this.getSearchFilters() != null) {
			for (Search search : this.getSearchFilters()) {
				str.append("{searchField=" + search.getName() + ", searchOper=" + search.getType() + ",searchString=" + search.getValue() + "},");
			}
			str.append("], [sortKey=" + super.getSidx() + ", sortBy=" + super.getSord() + "]");
		}
		return str.toString();
	}
	
}
