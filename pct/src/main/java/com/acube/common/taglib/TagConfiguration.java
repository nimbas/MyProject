package com.acube.common.taglib;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acube.sub.service.CosInfoService;


@Service
public class TagConfiguration implements Serializable {

	/*  */
	private static final long serialVersionUID = 1547103793830561629L;
	private final Logger log = LoggerFactory.getLogger(TagConfiguration.class);
	
	private boolean initialized = false;
	private static TagConfiguration instance = null;
	
	@Autowired private CosInfoService cosInfoService ;
	
	
	
	@PostConstruct
	public void init() {
		log.info("Initializing Abas Configuration.");
		
		synchronized (this) {
			if(!isInitialized()) {
				setInitialized(true);
				setInstance(this);
			}
		}
	}

	public boolean isInitialized() {
		return initialized;
	}

	private void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public static TagConfiguration getInstance() {
		return instance;
	}

	private void setInstance(TagConfiguration instance) {
		TagConfiguration.instance = instance;
	}
	
	public CosInfoService getCosInfoService() {
		return cosInfoService;
	}
}
