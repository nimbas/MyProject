package com.acube.security.spring;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.acube.security.domain.Elements;
import com.acube.security.domain.Role;
import com.acube.security.service.SecurityService;

public class AbacusObjectPermission {

	protected Log logger = LogFactory.getLog(this.getClass());

	@Autowired
	private SecurityService securityService;

	public boolean tagPermission(String objectName) {

		logger.info("=================it's tagPermission=================");

		boolean result = false;

		try {
			List<Elements> elements = securityService.getCurrentElements();
			for (Elements element : elements) {
				if (element.getMenuId().endsWith(objectName)) {
					result = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug("=================it's tagPermission=================:" + ((result) ? "visible" : "invisible"));

			return result;
		}

		logger.debug("=================it's tagPermission=================:" + ((result) ? "visible" : "invisible"));

		return result;
	}

	public boolean tagRolePermission(String... objectNames) {

		logger.info("=================it's tagRolePermission=================");

		boolean result = false;

		try {
			List<Role> roles = securityService.getCurrentRoles();
			for (Role role : roles) {
				for (String objectName : objectNames)
					if (role.getRoleId().equals(objectName)) {
						result = true;
						break;
					}
				if (result == true) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug("=================it's tagRolePermission=================:" + ((result) ? "visible" : "invisible"));

			return result;
		}

		logger.debug("=================it's tagRolePermission=================:" + ((result) ? "visible" : "invisible"));

		return result;
	}

	public boolean tagMenuPermission(String objectName) {

		logger.info("=================it's tagMenuPermission=================");

		boolean result = false;

		try {
			List<Elements> elements = securityService.getAccessableMenu();
			for (Elements element : elements) {
				if (element.getMenuId().endsWith(objectName)) {
					result = true;
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.debug("=================it's tagMenuPermission=================:" + ((result) ? "visible" : "invisible"));

			return result;
		}

		logger.debug("=================it's tagPermission=================:" + ((result) ? "visible" : "invisible"));

		return result;
	}
}
