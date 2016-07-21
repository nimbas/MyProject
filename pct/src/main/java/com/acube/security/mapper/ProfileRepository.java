package com.acube.security.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.acube.common.domain.mbg.SeSecurityProfileInfo;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.pagination.Pagination;
import com.acube.security.domain.Profile;
import com.acube.security.domain.ProfileElement;

public interface ProfileRepository {

	List<SeSecurityProfileInfo> getProfiles(SearchFilter searchFilter);

	List<SeSecurityProfileInfo> getAvailableProfiles(SearchFilter searchFilter);

	List<SeSecurityProfileInfo> getSelectedProfiles(SearchFilter searchFilter);

	List<ProfileElement> getAvailableAuthorities(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getSelectedAuthorities(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getAvailableChannels(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getSelectedChannels(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getAvailableObjects(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getSelectedObjects(SearchFilter searchFilter, Pagination pagination);

	List<ProfileElement> getAvailableTreeMenu(SearchFilter searchFilter, Pagination pagination);
	
	List<ProfileElement> getAllProfileElements(SearchFilter searchFilter);

	int addProfileElement(ProfileElement profileElement);

	int deleteProfileElement(ProfileElement profileElement);

	int addProfileLink(Profile profile);

	int deleteProfileLink(@Param("groupSeq") long groupSeq);

	int deleteProfileLinkByEach(@Param("groupSeq") long groupSeq, @Param("profileId") String profileId);
}