package com.acube.security.mapper;

import java.util.List;

import com.acube.security.domain.Elements;

public interface ElementsRepository {

	/*모든 엘리먼트 트리로 가져오기*/
	List<Elements> getAllElementsTreeList();
	
	/*하위 메뉴 모두 가져오기*/
	List<Elements> selectObjectInfoByCascade(String id);
}