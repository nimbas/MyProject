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

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.CoAuthCode;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;

/**
 * @author kangyou,choi
 */
public interface AuthorityService {

	JQueryGrid<CoAuthCode> getAuthorities(SearchFilter searchFilter);

	void addAuthority(CoAuthCode authCode);

	void addAuthorityByProfile(List<ProfileElement> authCodes, User user);

	void updateAuthority(CoAuthCode authCode);

	void deleteAuthority(CoAuthCode authCode);

	void deleteAuthorityByProfile(List<ProfileElement> authCodes, User user);
}
