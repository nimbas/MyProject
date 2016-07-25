/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.security.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



/**
 *
 * @author YangByeongSub
 * @since
 *
 */
public class LocalUserDetails implements UserDetails{

	private static final long serialVersionUID = -451355538146737254L;

	private User user;

	private List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

	public LocalUserDetails(User user) {
		this.user = user;
		
		// Default Login Role
		authorities.add(new SimpleGrantedAuthority("ROLE_MEMBER"));
		// Additional Roles
		for(Role role : user.getRoles()){
			authorities.add(new SimpleGrantedAuthority(role.getRoleId()));
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public User getUser() {
		return user;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getPassword() {
		return user.getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getUsername() {
		return user.getLoginId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}
}
