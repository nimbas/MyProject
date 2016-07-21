package com.acube.common.exception;

public class AcubeException extends RuntimeException {

	static final long serialVersionUID = -1920333926723605199L;

	/**
     * 
     */
	AcubeException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	AcubeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	/**
	 * @param message
	 * @param cause
	 */
	AcubeException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public AcubeException(String message) {
		super(message);
	}

	/**
	 * @param message
	 */
	public AcubeException(String errNo, String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AcubeException(Throwable cause) {
		super(cause);

	}
}
