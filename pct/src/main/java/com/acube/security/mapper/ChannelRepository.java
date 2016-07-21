package com.acube.security.mapper;

import java.util.List;

import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.security.domain.ProfileElement;

public interface ChannelRepository {

	List<ProfileElement> getChannels(SearchFilter searchFilter);
}