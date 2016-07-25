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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.Group;
import com.acube.security.domain.GroupLayer;
import com.acube.security.domain.OrgLayer;
import com.acube.security.domain.User;
import com.acube.security.mapper.OrgRepository;
import com.acube.security.mapper.ProfileRepository;

@Service
@Transactional
public class OrgServiceImpl implements OrgService {

	private static final Logger logger = LoggerFactory.getLogger(OrgServiceImpl.class);

	@Autowired
	private OrgRepository orgRepository;
	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public List<JsTree> getOrgTree(String dlrCd, String groupSeq, boolean includeUsers) {

		List<JsTree> jsTreeList = new ArrayList<JsTree>();

		List<OrgLayer> ol = orgRepository.getOrgnizationListByTree(dlrCd, groupSeq, includeUsers);

		for (OrgLayer o : ol) {
			JsTree jsTree = new JsTree();
			jsTree.setId(o.getDlrCd());

			if (StringUtils.isEmpty(o.getHposBizbrCd())) {
				jsTree.setParent("#");
			} else {
				jsTree.setParent(o.getHposBizbrCd());
			}

			jsTree.setText(o.getDlrNm());
			jsTree.setLevel(o.getLevel());
			jsTree.setChildren(o.isChildren());
			jsTree.setLeapMode(o.getLeapMode());
			if ("U".equals(o.getLeapMode())) {
				jsTree.setIcon("glyphicon glyphicon-user");
			}
			jsTreeList.add(jsTree);
		}

		return jsTreeList;

	}

	@Override
	public List<OrgLayer> getOrgnizationList() {
		return orgRepository.getOrgnizationList(null);
	}
	
	@Override
	public List<OrgLayer> getOrgnizationList(String rootDlrCd) {
		return orgRepository.getOrgnizationList(rootDlrCd);
	}

	@Override
	public List<GroupLayer> getGroupUser() {
		return orgRepository.getGroupUser(null);
	}

	@Override
	public List<JsTree> getAllGroupTree(String groupSeq) {
		List<JsTree> jsTreeList = new ArrayList<JsTree>();
		List<GroupLayer> sl = orgRepository.getGroupUser(groupSeq);
		for (GroupLayer s : sl) {
			JsTree jsTree = new JsTree();
			jsTree.setId(s.getId());
			if (StringUtils.isEmpty(s.getParent())) {
				jsTree.setParent("#");
			} else {
				jsTree.setParent(s.getParent());
			}

			jsTree.setText(s.getTreeName());
			if (s.getLeapMode().equals("U")) {
				jsTree.setIcon("glyphicon glyphicon-user");
			}
			jsTree.setDescr(s.getDescription());
			jsTree.setLevel(s.getLevel());
			jsTree.setChildren(s.isChildren());
			jsTree.setLeapMode(s.getLeapMode());
			jsTreeList.add(jsTree);
		}
		return jsTreeList;
	}

	@Override
	public JQueryGrid<User> getUserByGroup(SearchFilter searchFilter) {
		return new JQueryGrid<User>(orgRepository.getUsersByGroup(searchFilter));
	}

	@Override
	public void addAuthGroup(Group group) {
		orgRepository.addAuthGroup(group);
	}

	@Override
	public void updateAuthGroup(Group group) {
		orgRepository.updateAuthGroup(group);
	}

	@Override
	public void deleteAuthGroup(Group group) {
		// 그룹 사용자 삭제
		orgRepository.deleteGroupUserLinkByGroup(group);
		// 그룹 프로파일 삭제
		profileRepository.deleteProfileLink(group.getGroupSeq());
		// 그룹삭제
		orgRepository.deleteAuthGroup(group);
	}

	@Override
	public void processAuthGroupUserLink(String appendWithSubDealer, Group group, List<HashMap<String, String>> groupList) {
		if (groupList != null) {
			List<String> dealers = new ArrayList<String>();
			List<String> users = new ArrayList<String>();
			for (HashMap<String, String> map : groupList) {
				String dType = map.get("leapMode");
				String id = map.get("id");
				if (dType.equals("D")) {
					dealers.add(id);
				} else {
					users.add(id);
				}
			}
			if (dealers.size() == 0)
				dealers = null;
			if (users.size() == 0)
				users = null;
			List<User> userList = orgRepository.getUsersOfSelectedDealer(appendWithSubDealer, group, dealers, users);
			group.setUsers(userList);
			this.addAuthGroupUserLink(group);
		}
	}

	@Override
	public void addAuthGroupUserLink(Group group) {
		group.setEnabledFlag("Y");
		if (group.getUsers() != null)
			for (User user : group.getUsers()) {
				user.setBaseInfo(group.getSysCreationDate(), group.getOperatorId(), group.getApplicationId());
				user.setGroup(group);
				orgRepository.addGroupUserLink(user);
			}
	}

	@Override
	public void deleteAuthGroupUserLink(Group group) {
		if (group.getUsers() != null)
			for (User user : group.getUsers()) {
				user.setBaseInfo(group.getSysCreationDate(), group.getOperatorId(), group.getApplicationId());
				user.setGroup(group);
				orgRepository.deleteGroupUserLinkByUser(user);
			}
	}

	@Override
	public List<Group> getGroupList() {
		return orgRepository.getGroupList();
	}

}
