package com.acube.security.spring;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import com.acube.security.domain.Elements;
import com.acube.security.domain.LocalUserDetails;
import com.acube.security.domain.Role;
import com.acube.security.domain.User;

public class SecurityUtil {
	private static Logger logger = LoggerFactory.getLogger(SecurityUtil.class);

	public static String getUsername() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (auth.getPrincipal() instanceof UserDetails) {
			return ((UserDetails) auth.getPrincipal()).getUsername();
		} else {
			return auth.getPrincipal().toString();
		}
	}

	public static ArrayList<String> getUserRoles() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
		ArrayList<String> currentUserRoles = new ArrayList<String>();
		for (GrantedAuthority authority : authorities) {
			currentUserRoles.add(authority.getAuthority());
		}
		if (logger.isDebugEnabled()) {
			logger.debug("currentUserRoles:" + currentUserRoles);
		}
		return currentUserRoles;
	}

	public static boolean doesUserHasRole(String role) {
		ArrayList<String> currentUserRoles = getUserRoles();
		for (String s : currentUserRoles) {
			if (s.equals(role)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * 현재 사용자 정보 : Member
	 */
	public static User getCurrentUser() {
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
	 * 현재 사용자가 사용 가능한 M type 프로파일 (Menu)
	 */
	public static List<Role> getCurrentRoles() {
		return getCurrentUser().getRoles();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * 현재 사용자가 사용 가능한 C type 프로파일
	 */
	public static List<Elements> getCurrentElements() {
		return getCurrentUser().getElements();
	}
}
