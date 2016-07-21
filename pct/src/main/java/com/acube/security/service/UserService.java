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

import com.acube.common.domain.BaseDomain;
import com.acube.security.domain.DealerMaster;
import com.acube.security.domain.Elements;
import com.acube.security.domain.User;

/**
 * @author kangyou,choi
 */
public interface UserService {

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(User user);

	void deleteUser(DealerMaster dealerMaster);

	void deleteUsers(BaseDomain base, List<User> users);

	void moveUsers(DealerMaster dealerMaster, List<User> users);

	void moveUser(User user);

	User getUserByUserId(String userId);

	User getUserByLoginId(String marketCode, String loginId);

	List<String> getProfileIdByUserId(String userId);

	List<Elements> getElementsListByUserId(HashMap<String, String> map);

	List<User> getAvailableIp(User user);

	List<User> getUsersByDealer(DealerMaster dealerMaster);

	int getCheckLoginID(User user);
}
