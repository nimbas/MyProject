package com.acube.security.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.CoAuthCode;
import com.acube.security.domain.ProfileElement;

public interface AuthorityRepository {

	List<CoAuthCode> getAuthorities(SearchFilter searchFilter);
	int addAuthority(CoAuthCode authCode);
	int addAuthorityByProfile(ProfileElement profileElement);
	int updateAuthority(CoAuthCode authCode);
	int deleteAuthority(CoAuthCode authCode);
	int deleteAuthorityByProfile(ProfileElement profileElement);
}