package com.acube.security.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.acube.security.domain.Elements;
import com.acube.security.mapper.UserRepository;
import com.acube.security.spring.SecurityUtil;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	UserRepository userRepository;
	private List<Elements> menuList;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getCurrentMenu() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("userId", SecurityUtil.getCurrentUser().getUserId());
		map.put("recordType", "M");
		map.put("lang", "en");
		map.put("securityNo", "2001005"); // 테스트로 가입메뉴만 : Subscription - 1000421
		menuList = userRepository.getElementsListByUserId(map);
		StringBuffer htmlBuf = new StringBuffer();
		this.getMenuHtml(htmlBuf);
		return htmlBuf.toString();
	}

	public List<Elements> getMenuChildInfoList(String currentSecurityNo) {
		List<Elements> newList = new ArrayList<Elements>();

		for (int i = 0; i < menuList.size(); i++) {
			Elements el = menuList.get(i);
			String topMenuId = el.getTopMenuId();
			if (currentSecurityNo.equals(topMenuId)) {
				newList.add(el);
			}
		}
		return newList;
	}

	public boolean hasChild(String currentSecurityNo) {
		List<Elements> childList = getMenuChildInfoList(currentSecurityNo);
		return childList != null && childList.size() > 0;
	}

	private void getMenuHtml(StringBuffer htmlBuf) {
		List<Elements> topLevelList = getRootMenu();
		htmlBuf.append("<ul>");
		for (int i = 0; i < topLevelList.size(); i++) {
			Elements el = topLevelList.get(i);
			String url = "#";
			if (!StringUtils.isEmpty(el.getAccessUrl())) {
				url = el.getAccessUrl();
			}

			String iconClass = el.getIconClass();
			if (StringUtils.isEmpty(iconClass)) {
				iconClass = "fa fa-lg fa-fw fa-puzzle-piece"; // default icon
			}

			htmlBuf.append("<li><a href=\"" + url + "\"><i class=\"" + iconClass + "\"></i> <span class=\"menu-item-parent\">" + el.getDescriptionMsg() + "</span></a>");
			if (hasChild(el.getSecurityNo())) {
				htmlBuf.append("<ul>");
				getRecursiveMenuHtml(htmlBuf, el.getSecurityNo());
				htmlBuf.append("</ul>");
			}
			htmlBuf.append("</li>");
		}
		htmlBuf.append("</ul>");
	}

	private void getRecursiveMenuHtml(StringBuffer htmlBuf, String genSecurityNo) {
		List<Elements> elementInfoList = getMenuChildInfoList(genSecurityNo);
		for (int i = 0; i < elementInfoList.size(); i++) {
			Elements el = elementInfoList.get(i);
			if (hasChild(el.getSecurityNo())) {
				htmlBuf.append("<li>");
				String url = "#";
				if (!StringUtils.isEmpty(el.getAccessUrl())) {
					url = el.getAccessUrl();
				}
				htmlBuf.append("<a href=\"" + url + "\">");
				htmlBuf.append(el.getDescriptionMsg());
				htmlBuf.append("</a>");
				htmlBuf.append("<ul>");
				getRecursiveMenuHtml(htmlBuf, el.getSecurityNo());
				htmlBuf.append("</ul>");
				htmlBuf.append("</li>");
			} else {
				String url = "#";
				if (!StringUtils.isEmpty(el.getAccessUrl())) {
					url = el.getAccessUrl();
				}
				htmlBuf.append("<li><a href=\"" + url + "\" id=\"menuClick\" menuId=\"" + el.getMenuId() + "\" secNo=\"" + el.getSecurityNo() + "\" >" + el.getDescriptionMsg() + "</a></li>");
			}
		}
	}

	public List<Elements> getRootMenu() {
		List<Elements> newList = new ArrayList<Elements>();

		for (int i = 0; i < menuList.size(); i++) {
			Elements el = menuList.get(i);
			String menuLevel = el.getMenulevel();
			if ("1".equals(menuLevel)) {
				newList.add(el);
			}
		}

		return newList;
	}
}
