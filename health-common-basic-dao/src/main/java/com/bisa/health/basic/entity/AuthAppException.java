package com.bisa.health.basic.entity;

public class AuthAppException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthAppException() {
		super();
	}

	public AuthAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public AuthAppException(String message) {
		super(message);
	}

	public AuthAppException(Throwable cause) {
		super(cause);
	}
}
