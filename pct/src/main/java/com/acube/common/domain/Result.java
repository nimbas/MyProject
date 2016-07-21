package com.acube.common.domain;

import java.io.Serializable;
import com.acube.common.exception.ExceptionMsg;

public class Result implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3427514063408718924L;

	private String 		resultMsg;
	private ResultCode 	resultCode;
	private Object 		resultObj;
	private ExceptionMsg exceptionMsg ;
	
	
	public Result(){
		
	}
	public Result(ExceptionMsg exceptionMsg){
		this.exceptionMsg = exceptionMsg ;
	}
	public Result(ResultCode resultCode, String resultMsg, ExceptionMsg exceptionMsg){
		this.resultCode = resultCode;
		this.resultMsg  = resultMsg;
		this.exceptionMsg = exceptionMsg ;
	}
	public Result(ResultCode resultCode){
		this.resultCode = resultCode;
	}
	public Result(ResultCode resultCode, String resultMsg){
		this.resultCode = resultCode;
		this.resultMsg  = resultMsg;
	}
	
	public Result(ResultCode resultCode, String resultMsg, Object resultObj){
		this.resultCode = resultCode;
		this.resultMsg  = resultMsg;
		this.resultObj  = resultObj;
	}
	
	public Result(ResultCode resultCode, Object resultObj){
		this.resultCode = resultCode;
		this.resultObj  = resultObj;
	}
	
	public Result(ResultCode resultCode, Exception e){
		this.resultCode = resultCode;		
		this.resultMsg  = e.getMessage();
	}
	
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public ResultCode getResultCode() {
		return resultCode;
	}
	public void setResultCode(ResultCode resultCode) {
		this.resultCode = resultCode;
	}
	public Object getResultObj() {
		return resultObj;
	}
	public void setResultObj(Object resultObj) {
		this.resultObj = resultObj;
	}
	public ExceptionMsg getExceptionMsg() {
		return exceptionMsg;
	}
	public void setExceptionMsg(ExceptionMsg exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
	
}
