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

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.CoAuthCode;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;
import com.acube.security.mapper.AuthorityRepository;

@Service
@Transactional
public class AuthorityServiceImpl implements AuthorityService {

	private static final Logger logger = LoggerFactory.getLogger(AuthorityServiceImpl.class);

	@Autowired
	AuthorityRepository authorityRepository;

	@Override
	public JQueryGrid<CoAuthCode> getAuthorities(SearchFilter searchFilter) {
		return new JQueryGrid<CoAuthCode>(authorityRepository.getAuthorities(searchFilter));
	}

	
	@Override
	public void addAuthority(CoAuthCode authCode) {
		authorityRepository.addAuthority(authCode);
	}
	
	@Override
	public void addAuthorityByProfile(List<ProfileElement> authCodes, User user) {
		for(ProfileElement profileElement : authCodes){
			profileElement.setBaseInfo(user.getWorkDate(), user.getOperatorId(), user.getApplicationId());
			authorityRepository.addAuthorityByProfile(profileElement);
		}
	}

	@Override
	public void updateAuthority(CoAuthCode authCode) {
		authorityRepository.updateAuthority(authCode);
	}
	
	@Override
	public void deleteAuthority(CoAuthCode authCode) {
		authorityRepository.deleteAuthority(authCode);
	}
	
	@Override
	public void deleteAuthorityByProfile(List<ProfileElement> authCodes, User user) {
		for(ProfileElement profileElement : authCodes){
			profileElement.setBaseInfo(user.getWorkDate(), user.getOperatorId(), user.getApplicationId());
			authorityRepository.deleteAuthorityByProfile(profileElement);
		}
	}

}
