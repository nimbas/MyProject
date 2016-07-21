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

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;
import com.acube.security.domain.DealerMaster;
import com.acube.security.domain.Elements;
import com.acube.security.domain.User;
import com.acube.security.mapper.ProfileRepository;
import com.acube.security.mapper.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProfileRepository profileRepository;


	@Override
	public void addUser(User user) {
		if(StringUtils.isNotEmpty(user.getIpAddress())){
			userRepository.usedIpAddress(user);
		}
		userRepository.addUser(user);
	}

	@Override
	public void updateUser(User user) {
		if(StringUtils.isNotEmpty(user.getIpAddress())){
			userRepository.updateAssignableIpAddress(user);//혹 기존 ip는 assignYn = 'N' 처리
			userRepository.usedIpAddress(user); //새로운 혹은 기존 IP에 대해 사용 처리
		}else{
			userRepository.updateAssignableIpAddress(user);//혹 기존 ip는 assignYn = 'N' 처리
		}
		userRepository.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.updateAssignableIpAddress(user);
		userRepository.deleteUser(user);
	}
	
	@Override
	public void deleteUser(DealerMaster dealerMaster) {
		List<User> users = userRepository.getUsersByDealer(dealerMaster.getDlrCd());
		if (users != null && users.size() > 0) {
			for(User user : users){ 
				user.setBaseInfo(dealerMaster);
				userRepository.updateAssignableIpAddress(user);
			}
			 
		}
		userRepository.deleteUserByDealer(dealerMaster);
	}

	@Override
	public void deleteUsers(BaseDomain base, List<User> users) {
		for(User user : users){
			user.setBaseInfo(base);
			userRepository.updateAssignableIpAddress(user);
			userRepository.deleteUser(user);
		}
	}
	
	@Override
	public void moveUser(User user) {
		userRepository.moveUser(user);
	}

	@Override
	public User getUserByUserId(String userId) {
		return userRepository.getUserByUserId(userId);
	}

	@Override
	public User getUserByLoginId(String marketCode, String loginId) {
		User user = new User();
		user.setMarketCode(marketCode);
		user.setLoginId(loginId);
		return userRepository.getUserByLoginId(user);
	}

	@Override
	public List<String> getProfileIdByUserId(String userId) {
		return userRepository.getProfileIdByUserId(userId);
	}

	@Override
	public List<Elements> getElementsListByUserId(HashMap<String, String> map) {
		return userRepository.getElementsListByUserId(map);
	}

	@Override
	public void moveUsers(DealerMaster dealerMaster, List<User> users) {
		
		if(users != null){
			for(User user : users){
				user.setBaseInfo(dealerMaster);
				userRepository.moveUser(user);
			}
		}
	}

	@Override
	public List<User> getAvailableIp(User user) {
		return userRepository.getAvailableIp(user);
	}

	@Override
	public int getCheckLoginID(User user) {
		return userRepository.getCheckLoginID(user);
	}

	@Override
	public List<User> getUsersByDealer(DealerMaster dealerMaster) {
		return userRepository.getUsersByDealer(dealerMaster.getDlrCd());
	}
}
