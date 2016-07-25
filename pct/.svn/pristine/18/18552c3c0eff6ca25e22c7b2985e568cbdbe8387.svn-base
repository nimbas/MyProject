package com.acube.common.pagination;

import org.apache.ibatis.session.RowBounds;

/**
 * Pagination protocol 정의 mybatis 의 RowBound 에 의존적.
 * ORM 교체 시 의존성 분리 검토 필요
 * @author YangByeongSub
 * @since 1.0
 * @see org.apache.ibatis.session.RowBounds
 */

public class Pagination extends RowBounds {

	private static final int DEFAULT_WINDOW_SIZE = 10;

	private static final int DEFAULT_OBJECT_PER_PAGE = 50;
	
	private static final int DEFUALT_CURRENT_PAGE = 0;
	
	private static final int MOBILE_SIZE = 10;
	private static final int MOBILE_WINDOW_SIZE  = 5;

	private int currentPage;//현재페이지 : UI에서는 시작페이지를 1로부터 시작하도록 함. 이 모듈은 0에서부터 시작함. 
	private int objectsCount;//전체 리스트 갯수
	private int objectsPerPage; //페이지별 리스트 갯수
	private int windowSize; // 페이지목록 사이즈
   
	 
	
	public Pagination() {
		super(NO_ROW_OFFSET, DEFAULT_OBJECT_PER_PAGE);
		
		this.currentPage = DEFUALT_CURRENT_PAGE;
		this.objectsPerPage = DEFAULT_OBJECT_PER_PAGE;
		this.windowSize = DEFAULT_WINDOW_SIZE;
	}
	
	public Pagination(boolean mobile) {
		super(!mobile?NO_ROW_OFFSET:MOBILE_SIZE, !mobile?DEFAULT_OBJECT_PER_PAGE:MOBILE_SIZE);
		
		this.currentPage = DEFUALT_CURRENT_PAGE;
		this.objectsPerPage = DEFAULT_OBJECT_PER_PAGE;
		this.windowSize = DEFAULT_WINDOW_SIZE;
		if(mobile){
			this.objectsPerPage = MOBILE_SIZE;
			this.windowSize = MOBILE_WINDOW_SIZE;
		}
	}

	public Pagination(int currentPage) {
		
		super(((currentPage>0?currentPage-1:currentPage) * DEFAULT_OBJECT_PER_PAGE), DEFAULT_OBJECT_PER_PAGE);
		
		this.currentPage = currentPage -1 ;
		this.objectsPerPage = DEFAULT_OBJECT_PER_PAGE;
		this.windowSize = DEFAULT_WINDOW_SIZE;
	}
	
	public Pagination(int currentPage, boolean mobile) {
		super(((currentPage>0?currentPage-1:currentPage) * (!mobile?DEFAULT_OBJECT_PER_PAGE:MOBILE_SIZE)), (!mobile?DEFAULT_OBJECT_PER_PAGE:MOBILE_SIZE));
		
		this.currentPage = (currentPage>0?currentPage-1:currentPage);
		this.objectsPerPage = DEFAULT_OBJECT_PER_PAGE;
		this.windowSize = DEFAULT_WINDOW_SIZE;
		if(mobile){
			this.objectsPerPage = MOBILE_SIZE;
			this.windowSize = MOBILE_WINDOW_SIZE;
		}
	}

	public Pagination(int currentPage, int objectsPerPage) { //이건대
		super(((currentPage>0?currentPage-1:currentPage) * objectsPerPage), objectsPerPage);		
		this.currentPage = (currentPage>0?currentPage-1:currentPage);
		this.objectsPerPage = objectsPerPage;
		this.windowSize = DEFAULT_WINDOW_SIZE;
	}
	
	public Pagination(int currentPage, int objectsPerPage, boolean mobile) {
		super(((currentPage>0?currentPage-1:currentPage) * objectsPerPage), objectsPerPage);		
		this.currentPage = (currentPage>0?currentPage-1:currentPage);
		this.objectsPerPage = objectsPerPage;
		this.windowSize = DEFAULT_WINDOW_SIZE;
		if(mobile){
			this.windowSize = MOBILE_WINDOW_SIZE;
		}
	}
	
	public Pagination(int currentPage, int objectsPerPage, int windowSize) {
		super(((currentPage>0?currentPage-1:currentPage) * objectsPerPage), objectsPerPage);
		this.currentPage = (currentPage>0?currentPage-1:currentPage);
		this.objectsPerPage = objectsPerPage;
		this.windowSize = windowSize;
		
	}
	
	public Pagination(int currentPage, int objectsPerPage, int windowSize, boolean mobile) {
		super(((currentPage>0?currentPage-1:currentPage) * objectsPerPage), objectsPerPage);	
		this.currentPage = (currentPage>0?currentPage-1:currentPage);
		this.objectsPerPage = objectsPerPage;
		this.windowSize = windowSize;
		/*if(mobile){
			this.objectsPerPage = MOBILE_SIZE;
			this.windowSize = MOBILE_WINDOW_SIZE;
		}*/
	}

	public int getSkipPage() {
		return currentPage * objectsPerPage;
	}

	public int getPageCount() {
		if (objectsPerPage < 0) {
			return 1;
		} else {
			return (int) Math.ceil((double) objectsCount / (double) objectsPerPage);
		}
	}

	public int getFirstPage() {
		return 0;
	}

	public int getLastPage() {
		return (Math.max(0, getPageCount() - 1));
	}

	public int getFirstPageForWindow() {
		return (currentPage / windowSize) * windowSize;
	}

	public int getLastPageForWindow() {
		return Math.min(getLastPage(), (currentPage / windowSize) * windowSize
				+ (windowSize - 1));
	}

	public boolean isPrevPageEnabled() {
		return (currentPage >= windowSize);
	}

	public boolean isNextPageEnabled() {
		return (getLastPageForWindow() < getLastPage());
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public int getObjectsCount() {
		return objectsCount;
	}

	public int getObjectsPerPage() {
		return objectsPerPage;
	}
	
	public void setObjectsPerPage(int objectsPerPage) {
		this.objectsPerPage = objectsPerPage;
	}
	
	public void setObjectsCount(int objectsCount) {
		this.objectsCount = objectsCount;
	}

	public int getWindowSize() {
		return windowSize;
	}
}
