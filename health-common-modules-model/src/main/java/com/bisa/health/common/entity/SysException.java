package com.bisa.health.common.entity;

@SuppressWarnings("serial")
public class SysException extends RuntimeException {

	public SysException() {
		super();
	}

	public SysException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public SysException(String msg) {
		super(msg);
	}

	public SysException(Throwable cause) {
		super(cause);
	}

}
