package com.acube.common.domain.searchFilter;

import java.io.Serializable;

/**
 * JQGrid에서 전달되는 검색 조건 및 ORDER BY 관리
 * 
 * @author YangByeongSub
 * @since 1.0
 *
 */
public abstract class JQGridSearchFilter implements Serializable {

	/*  */
	private static final long serialVersionUID = -5886593519250952222L;
	/**
	 * 
	 */
	private int rows;// JQGRID 페이지당 보여줄 목록 갯수
	private int page;// JQGRID 현재페이지
	private String[] searchField; // JQGRID 검색키
	private String[] searchString; // JQGRID 검색어
	private String[] searchOper; // JQGRID 검색조건:
	private String sidx; // JQGRID 정렬명
	private String sord; // JQGRID 정렬순
	private String filters;
	

	public JQGridSearchFilter() {
		super();
		this.page = 1;
	}

	/**
	 * JQGRID 페이지당 보여줄 목록 갯수
	 * 
	 * @return
	 */
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	/**
	 * JQGRID 현재페이지 : 1부터 시작
	 * 
	 * @return
	 */
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * 검색할 컬럼
	 * 
	 * @return
	 */
	public String[] getSearchField() {
		return searchField;
	}

	public void setSearchField(String[] searchField) {
		this.searchField = searchField;
	}

	/**
	 * 검색할 단어
	 * 
	 * @return
	 */
	public String[] getSearchString() {
		return searchString;
	}

	public void setSearchString(String[] searchString) {
		this.searchString = searchString;
	}

	/**
	 * 검색 옵션 <BR>
	 * - eq=equal, ne=notequal, bw=beginswith, bn=doesnotbeginwith, ew=endswith,<BR>
	 * en=doesnotendwith, cn=contains,nc=doesnotcontain, in=isin, ni=isnotin
	 * 
	 * @return
	 */
	public String[] getSearchOper() {
		return searchOper;
	}

	public void setSearchOper(String[] searchOper) {
		this.searchOper = searchOper;
	}

	/**
	 * ORDER BY : Column name
	 * 
	 * @return
	 */
	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	/**
	 * ORDER BY : ASC, DESC
	 * 
	 * @return
	 */
	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}
	
	public String getFilters() {
		return this.filters;
	}
	public void setFilters(String filters) {
		this.filters = filters;
	}
}
