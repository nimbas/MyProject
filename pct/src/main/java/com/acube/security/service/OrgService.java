/*
 * Copyright 2002-2013 the original author or authors.
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
package com.acube.security.service;

import java.util.HashMap;
import java.util.List;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.Group;
import com.acube.security.domain.GroupLayer;
import com.acube.security.domain.OrgLayer;
import com.acube.security.domain.User;

/**
 * @author kangyou,choi
 */
public interface OrgService {

	/* 조직도 가져오기 */
	List<OrgLayer> getOrgnizationList();

	List<OrgLayer> getOrgnizationList(String rootDlrCd);

	/* 권한 그룹-유저 가져오기 */
	List<GroupLayer> getGroupUser();

	JQueryGrid<User> getUserByGroup(SearchFilter searchFilter);

	List<JsTree> getOrgTree(String id, String groupSeq, boolean includeUsers);

	List<JsTree> getAllGroupTree(String groupSeq);

	void addAuthGroup(Group group);

	void updateAuthGroup(Group group);

	void deleteAuthGroup(Group group);

	void processAuthGroupUserLink(String appendWithSubDealer, Group group, List<HashMap<String, String>> groupList);

	void addAuthGroupUserLink(Group group);

	void deleteAuthGroupUserLink(Group group);

	List<Group> getGroupList();

}
