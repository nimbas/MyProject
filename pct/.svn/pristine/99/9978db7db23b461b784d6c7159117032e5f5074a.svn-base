/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author YangByeongSub
 * @since
 *
 */
public class ExceptionMsg {
	private String errorCode ;
	private String errorMessage ;
	private String detailMessage;
	private Exception exception;
	
	public ExceptionMsg(){
		
	}
	public ExceptionMsg(String errorCode, String errorMessage, Exception exception){
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.exception = exception;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@JsonIgnore
	public Exception getException() {
		return exception;
	}
	public void setException(Exception exception) {
		this.exception = exception;
	}
	public String getDetailMessage() {
		Writer writer = new StringWriter();
		PrintWriter printWriter = new PrintWriter(writer);
		exception.printStackTrace(printWriter);
		return writer.toString();
	}
	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}
}
