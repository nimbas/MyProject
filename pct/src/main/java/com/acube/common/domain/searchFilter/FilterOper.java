package com.acube.common.domain.searchFilter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

/**
 * JQGrid의 검색시 filters에 해당하는 JSON 문자를 변환하는 Domain
 *
 * @author YangByeongSub
 * @since
 *
 */
public class FilterOper implements Serializable{
	/*  */
	private static final long serialVersionUID = -1526425657172317065L;
	private String groupOp ;//JQGrid AND or OR
	private List<Rules> rules ;//JQGrid filter
	public String getGroupOp() {
		return groupOp;
	}
	public void setGroupOp(String groupOp) {
		this.groupOp = groupOp;
	}
	public List<Rules> getRules() {
		return rules;
	}
	public void setRules(List<Rules> rules) {
		this.rules = rules;
	}
	public List<Search> getSearchFilters(){
		List<Search> searchs = new ArrayList<Search>();
		if(this.rules != null){
			for(Rules rule : this.rules){
				if(!StringUtils.isEmpty(rule.getData())){
					searchs.add(getOperationSearch(rule.getField(), rule.getOp(), rule.getData()));
				}
			}
		}
		return searchs ;
	}
	
	/**
	 * JQGRID의 검색 조건에 맞는 명령어 생성
	 * 
	 * @param searchField
	 * @param searchString
	 * @param operType : eq:equal, ne:not equal, bw:beginswith, bn:doesnotbeginwith, ew:endswith, <BR>
	 *            en:doesnotendwith, cn:like, nc:not like, in:isin,ni:isnotin
	 * @return
	 */
	public static Search getOperationSearch(String searchField, String operType, String searchString) {
		Search search = new Search();
		search.setName(searchField);
		if ("eq".equalsIgnoreCase(operType) || "equal".equalsIgnoreCase(operType) || "=".equalsIgnoreCase(operType)) {// equal
			search.setType("=");
			search.setValue(searchString);
		}  else if ("ne".equalsIgnoreCase(operType) || "notequal".equalsIgnoreCase(operType)) {// not equal
			search.setType("!=");
			search.setValue(searchString);
		} else if ("in".equalsIgnoreCase(operType)) {// in ('xx')
			search.setType("IN");
			search.setValue("('" + searchString + "')");
		} else if ("ni".equalsIgnoreCase(operType)) {// not in ('xx')
			search.setType("NOT IN");
			search.setValue("('" + searchString + "')");
		} else if ("like".equalsIgnoreCase(operType) || "cn".equalsIgnoreCase(operType)) {// contains xx
			search.setType("LIKE");
			search.setValue("'%" + searchString.toUpperCase() + "%'");
		} else if ("nc".equalsIgnoreCase(operType)) {// not contains xx
			search.setType("NOT LIKE");
			search.setValue("'%" + searchString.toUpperCase() + "%'");
		} else if ("bw".equalsIgnoreCase(operType)) { // begin with xx
			search.setType("LIKE");
			search.setValue("'" + searchString.toUpperCase() + "%'");
		} else if ("bn".equalsIgnoreCase(operType)) {// not begin with xx
			search.setType("NOT LIKE");
			search.setValue("'" + searchString.toUpperCase() + "%'");
		} else if ("ew".equalsIgnoreCase(operType)) { // end with xx
			search.setType("LIKE");
			search.setValue("'%" + searchString.toUpperCase() + "'");
		} else if ("en".equalsIgnoreCase(operType)) { // not end with xx
			search.setType("NOT LIKE");
			search.setValue("'%" + searchString.toUpperCase() + "'");
		} else {
			search.setType("LIKE");
			search.setValue("'%" + searchString.toUpperCase() + "%'");
		}
		return search;
	}
}	