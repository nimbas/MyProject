package com.acube.pvs.exception;

public class PvException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7848866217510145516L;

	public PvException() {
	}
	
	public PvException(String message) {
		super(message);
	}
	
	public PvException(Throwable cause) {
		super(cause);
	}
	public PvException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
