package com.acube.common.taglib;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.acube.common.service.code.CodeService;



@Service
public class CodeConfiguration implements Serializable {

	/*  */
	private static final long serialVersionUID = -2693702230361547903L;

	private final Logger log = LoggerFactory.getLogger(CodeConfiguration.class);
	
	private boolean initialized = false;
	private static CodeConfiguration instance = null;
	
	@Autowired private MessageSource messageSource;
	@Autowired private CodeService codeService;
	
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

	public static CodeConfiguration getInstance() {
		return instance;
	}

	private void setInstance(CodeConfiguration instance) {
		CodeConfiguration.instance = instance;
	}
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public CodeService getCodeService() {
		return codeService;
	}
}
