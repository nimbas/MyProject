package com.acube.security.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.Group;
import com.acube.security.domain.GroupLayer;
import com.acube.security.domain.OrgLayer;
import com.acube.security.domain.User;

public interface OrgRepository {

	/* 조직도 가져오기 */
	List<OrgLayer> getOrgnizationListByTree(@Param("dlrCd") String dlrCd, @Param("groupSeq") String groupSeq, @Param("includeUsers") boolean includeUsers);

	List<OrgLayer> getOrgnizationList(@Param("rootDlrCd") String rootDlrCd);

	/* 권한 그룹-유저 가져오기 */
	List<GroupLayer> getGroupUser(@Param("groupSeq") String groupSeq);

	List<User> getUsersByGroup(SearchFilter searchFilter);

	int addAuthGroup(Group group);

	int updateAuthGroup(Group group);

	int deleteAuthGroup(Group group);

	int addGroupUserLink(User user);

	int deleteGroupUserLinkByGroup(Group group);

	int deleteGroupUserLinkByUser(User user);

	List<User> getUsersOfSelectedDealer(@Param("appendWithSubDealer") String appendWithSubDealer, @Param("group") Group group, @Param("dealers") List<String> dealers, @Param("users") List<String> users);
	
	List<Group> getGroupList() ;
}