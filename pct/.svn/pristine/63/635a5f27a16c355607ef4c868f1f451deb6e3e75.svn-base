package com.acube.security.spring;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.acube.security.domain.Elements;
import com.acube.security.domain.LocalUserDetails;
import com.acube.security.domain.Role;
import com.acube.security.domain.User;
import com.acube.security.service.UserService;

public class CustomUserDetailsService implements Serializable, UserDetailsService {

	private static final long serialVersionUID = 1L;

	private static Logger logger = LoggerFactory.getLogger(CustomUserDetailsService.class);

	// 객체직렬화할때는 포함되지 않게 함.

	@Autowired
	private UserService userService;
	
	/**
	 * Returns a populated {@link UserDetails} object. The username is first
	 * retrieved from the database and then mapped to a {@link UserDetails}
	 * object.
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			User user = userService.getUserByLoginId("1", username);
			if (user == null) {
				throw new UsernameNotFoundException("User Id is not existed");
			}

			user.setRoles(getRoles(user.getUserId())); // M type 프로파일
			user.setElements(getElements(user.getUserId()));// C type 프로파일(button등) 프로파일

			return new LocalUserDetails(user);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private List<Role> getRoles(String userName) {

		List<Role> roles = new ArrayList<Role>();
		List<String> profileIds = userService.getProfileIdByUserId(userName);
		if (profileIds == null) {
			return roles;
		}
		for (final String role : profileIds) {
			roles.add(new Role(role));
		}

		return roles;
	}

	private List<Elements> getElements(String userName) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userId", userName);
		map.put("recordType", "C");
		map.put("lang", "en");
		List<Elements> elements = userService.getElementsListByUserId(map);

		return elements;
	}
}
