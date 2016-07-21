package com.acube.security.service;

import java.util.List;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.mbg.SeSecurityProfileInfo;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.security.domain.Group;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;

/**
 * @author kangyou,choi
 */
public interface ProfileService {

	String getAllElementsTreeByHtml();

	JQueryGrid<SeSecurityProfileInfo> getProfiles(SearchFilter searchFilter);

	JQueryGrid<SeSecurityProfileInfo> getAvailableProfiles(SearchFilter searchFilter);

	JQueryGrid<SeSecurityProfileInfo> getSelectedProfiles(SearchFilter searchFilter);

	void processProfile(List<SeSecurityProfileInfo> profiles, User user);

	JQueryGrid<ProfileElement> getAvailableAuthorities(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getSelectedAuthorities(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getAvailableChannels(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getSelectedChannels(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getAvailableObjects(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getSelectedObjects(SearchFilter searchFilter, Pagination pagination);

	JQueryGrid<ProfileElement> getAvailableTreeMenu(SearchFilter searchFilter, Pagination pagination);
	
	JQueryGrid<ProfileElement> getAllProfileElements(SearchFilter searchFilter);

	void addProfileElements(List<ProfileElement> profileElements, User user);

	void deleteProfileElements(List<ProfileElement> profileElements, User user);

	void addProfileLink(Group group);

	void deleteProfileLink(Group group);

	void deleteAllProfileLinkByGroup(long groupSeq);

}
