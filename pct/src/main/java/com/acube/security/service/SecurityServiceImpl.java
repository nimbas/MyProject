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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.security.domain.Elements;
import com.acube.security.domain.LocalUserDetails;
import com.acube.security.domain.Role;
import com.acube.security.domain.User;
import com.acube.security.mapper.UserRepository;
import com.acube.sub.domain.Member;

@Service
@Transactional
public class SecurityServiceImpl implements SecurityService {

	private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);

	@Autowired
	private transient UserRepository userRepository;

	/**
	 * {@inheritDoc}
	 * 
	 * 현재 사용자 정보 : Member
	 */
	@Override
	public User getCurrentUser() {
		if (SecurityContextHolder.getContext().getAuthentication() == null) {
			return null;
		}

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		LocalUserDetails userDetails = null;
		if (principal instanceof UserDetails) {
			userDetails = (LocalUserDetails) principal;
		}
		return userDetails.getUser();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * 현재 사용자가 사용 가능한 M type 프로파일 (Role : 권한)
	 */
	@Override
	public List<Role> getCurrentRoles() {
		return this.getCurrentUser().getRoles();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * 현재 사용자가 사용 가능한 C type 프로파일 : 버튼등
	 */
	@Override
	public List<Elements> getCurrentElements() {
		return this.getCurrentUser().getElements();
	}

	@Override
	public List<Elements> getAccessableMenu() {
		List<Elements> menuList;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userId", this.getCurrentUser().getUserId());
		map.put("recordType", "M");
		map.put("lang", "en");
		map.put("securityNo", "2001005"); // 테스트로 가입메뉴만 : Subscription - 1000421
		menuList = userRepository.getElementsListByUserId(map);
		return menuList;
	}

}
