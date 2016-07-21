/*
 * Copyright 2014 iexel
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

package com.acube.common.domain.jqgrid;

import java.util.List;

import com.acube.common.domain.Base;
import com.acube.common.pagination.Pagination;

/**
 * JQGRID를 이용한 목록 표시와 관련한 모듈
 *
 * @author YangByeongSub
 * @since
 *
 * @param <T>
 */
public class JQueryGrid<T extends Base> {

	private Pagination pagination;
	private int page;
	private int total;
	private List<T> rows;
	private String message;

	public JQueryGrid() {
		page = 1;
		pagination = new Pagination();
	}

	public JQueryGrid(Pagination pagination) {
		this.pagination = pagination;
		this.page = pagination.getCurrentPage() + 1;
	}
	
	/**
	 * 페이징 처리가 필요없는 그리드 사용시
	 * @param rows
	 */
	public JQueryGrid(List<T> rows) {
		this.pagination = new Pagination();
		this.setRows(rows);
	}
	
	
	/**
	 * 페이징 처리가 필요없고,메세지가 추가된 그리드 사용시
	 * @param rows
	 */
	public JQueryGrid(List<T> rows,String message) {
		this.pagination = new Pagination();
		this.setRows(rows);
		this.message = message;
	}
	
	/**
	 * 페이징 처리시가 필요한 그리드 사용시 
	 * @param pagination
	 * @param rows
	 */
	public JQueryGrid(Pagination pagination, List<T> rows) {
		this.pagination = pagination;
		this.page = pagination.getCurrentPage() + 1;
		this.setRows(rows);
	}

	/**
	 * 전체 Row 목록
	 * @return
	 */
	public List<T> getRows() {
		return this.rows;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
		if (this.rows != null && this.rows.size() > 0) {
			this.pagination.setObjectsCount(this.rows.get(0).getTotalCount());
			
			//rows 갯수는 존재하는 pagination.getObjectsCount()==0은 페이징처리가 아니라는 의미임.
			if(this.rows.size() > 0 && this.pagination.getObjectsCount() == 0){
				this.page = 1;
				this.total = 1 ;
				this.pagination.setObjectsCount(this.rows.size());
				this.pagination.setObjectsPerPage(this.rows.size());
			}
		}
		this.total = getTotal();
	}
	
	/**
	 * 현재페이지 : 1페이지부터 시작
	 * @return
	 */
	public int getPage() {
		return pagination.getCurrentPage() + 1;
	}

	/**
	 * 페이지 목록 갯수
	 * @return
	 */
	public int getTotal() {
		if (pagination.getObjectsPerPage() < 0) {
			return 1;
		} else {
			return (int) Math.ceil((double) pagination.getObjectsCount() / (double) pagination.getObjectsPerPage());
		}
	}

}
