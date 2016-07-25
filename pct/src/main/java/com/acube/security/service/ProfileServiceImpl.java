package com.acube.security.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acube.common.domain.WorkType;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.mbg.SeSecurityProfileInfo;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.common.mapper.mbg.CoSecurityElementsMapper;
import com.acube.common.mapper.mbg.SeSecurityProfileInfoMapper;
import com.acube.common.pagination.Pagination;
import com.acube.security.domain.Elements;
import com.acube.security.domain.Group;
import com.acube.security.domain.Profile;
import com.acube.security.domain.ProfileElement;
import com.acube.security.domain.User;
import com.acube.security.mapper.ElementsRepository;
import com.acube.security.mapper.ProfileRepository;

@Service
@Transactional
public class ProfileServiceImpl implements ProfileService {

	private static final Logger logger = LoggerFactory.getLogger(ProfileServiceImpl.class);

	@Autowired
	private transient ElementsRepository elementsMapper;

	@Autowired
	private transient CoSecurityElementsMapper coSecurityElementsMapper;

	@Autowired
	private transient SeSecurityProfileInfoMapper seSecurityProfileInfoMapper;

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public String getAllElementsTreeByHtml() {

		List<Elements> elementsList = elementsMapper.getAllElementsTreeList();

		StringBuilder sb = new StringBuilder();

		int next = 0;
		int current = 0;
		int row = 0;

		for (int i = 0; i < elementsList.size(); i++) {
			row++;

			if (row == elementsList.size()) {
				sb.append("</ul></ul>");
				break;
			}
			current = Integer.parseInt(elementsList.get(i).getLevel());
			next = Integer.parseInt(elementsList.get(i + 1).getLevel());

			if (current == 1) {
				sb.append("<ul id=\"objectTreeData\" style=\"display:none\" >");
				sb.append("<li" + " id=\"" + elementsList.get(i).getSecurityNo() + "\" >");
			} else {
				sb.append("<li" + " id=\"" + elementsList.get(i).getSecurityNo() + "\" >");
			}

			sb.append("<span><input type=\"hidden\" id=\"" + elementsList.get(i).getSecurityNo() + "\">" + elementsList.get(i).getDescription() + "</span>");

			if (current == 1) {
				sb.append("<ul>");
			} else if (next > current) {
				sb.append("<ul>");
			} else if (next == current) {
				sb.append("</li>");
			} else if (next < current) {
				sb.append("</li>");

				for (int j = 0; j < current - next; j++) {

					sb.append("</ul></li>");

				}
			}

		}

		return sb.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<SeSecurityProfileInfo> getProfiles(SearchFilter searchFilter) {
		return new JQueryGrid<SeSecurityProfileInfo>(profileRepository.getProfiles(searchFilter));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<SeSecurityProfileInfo> getAvailableProfiles(SearchFilter searchFilter) {
		return new JQueryGrid<SeSecurityProfileInfo>(profileRepository.getAvailableProfiles(searchFilter));
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public JQueryGrid<SeSecurityProfileInfo> getSelectedProfiles(SearchFilter searchFilter) {
		return new JQueryGrid<SeSecurityProfileInfo>(profileRepository.getSelectedProfiles(searchFilter));
	}

	@Override
	public void processProfile(List<SeSecurityProfileInfo> profiles, User user) {
		if (profiles != null) {
			for (SeSecurityProfileInfo profile : profiles) {
				profile.setMarketCode("000"); // market code를 000으로 세팅
				profile.setBaseInfo(user.getWorkDate(), user.getUserId(), user.getApplicationId());
				if (profile.getWorkType() == WorkType.CREATE) {
					seSecurityProfileInfoMapper.insertSelective(profile);
				} else if (profile.getWorkType() == WorkType.UPDATE) {
					seSecurityProfileInfoMapper.updateByPrimaryKeySelective(profile);
				} else if (profile.getWorkType() == WorkType.DELETE) {
					seSecurityProfileInfoMapper.deleteByPrimaryKey(profile);
				}
			}
		}
	}

	@Override
	public JQueryGrid<ProfileElement> getAvailableAuthorities(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getAvailableAuthorities(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getSelectedAuthorities(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getSelectedAuthorities(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getAvailableChannels(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getAvailableChannels(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getSelectedChannels(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getSelectedChannels(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getAvailableObjects(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getAvailableObjects(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getSelectedObjects(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getSelectedObjects(searchFilter, pagination));
	}

	@Override
	public JQueryGrid<ProfileElement> getAvailableTreeMenu(SearchFilter searchFilter, Pagination pagination) {
		return new JQueryGrid<ProfileElement>(pagination, profileRepository.getAvailableTreeMenu(searchFilter, pagination));
	}
	
	@Override
	public JQueryGrid<ProfileElement> getAllProfileElements(SearchFilter searchFilter) {
		return new JQueryGrid<ProfileElement>(profileRepository.getAllProfileElements(searchFilter));
	}
	
	@Override
	public void addProfileElements(List<ProfileElement> profileElements, User user) {
		if (profileElements != null) {
			for (ProfileElement profile : profileElements) {
				profile.setBaseInfo(user.getWorkDate(), user.getUserId(), user.getApplicationId());
				profileRepository.addProfileElement(profile);

				// TODO : Menu일때 하위 Menu 동시에 저장 처리
			}
		}

	}

	@Override
	public void deleteProfileElements(List<ProfileElement> profileElements, User user) {
		if (profileElements != null) {
			for (ProfileElement profile : profileElements) {
				profile.setBaseInfo(user.getWorkDate(), user.getUserId(), user.getApplicationId());
				profileRepository.deleteProfileElement(profile);

				// TODO : Menu일때 하위 Menu 동시에 삭제 처리
			}
		}

	}


	@Override
	public void addProfileLink(Group group) {
		
		if(group.getProfiles() != null)
		for(Profile profile : group.getProfiles()){
			//사용자 그룹 속한 프로파일 삭제
			profile.setBaseInfo(group.getSysCreationDate(), group.getOperatorId(), group.getApplicationId());
			profile.setGroup(group);
			profile.setEnabledFlag("Y");
			profileRepository.addProfileLink(profile);
		}
	}

	@Override
	public void deleteProfileLink(Group group) {
		
		if(group.getProfiles() != null)
		for(Profile profile : group.getProfiles()){
			//사용자 그룹 속한 프로파일 삭제
			profile.setBaseInfo(group.getSysCreationDate(), group.getOperatorId(), group.getApplicationId());
			profile.setEnabledFlag("N");
			profileRepository.deleteProfileLinkByEach(group.getGroupSeq(), profile.getProfileId());
		}
	}
	
	
	@Override
	public void deleteAllProfileLinkByGroup(long groupSeq) {
		//사용자 그룹 속한 프로파일 삭제
		profileRepository.deleteProfileLink(groupSeq);
	}

}
