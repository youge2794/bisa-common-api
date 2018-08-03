package com.bisa.health.basic.entity;

public class SysAppException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SysAppException() {
		super();
	}

	public SysAppException(String message, Throwable cause) {
		super(message, cause);
	}

	public SysAppException(String message) {
		super(message);
	}

	public SysAppException(Throwable cause) {
		super(cause);
	}
}
