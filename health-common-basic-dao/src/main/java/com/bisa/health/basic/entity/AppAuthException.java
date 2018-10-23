package com.bisa.health.basic.entity;

public class AppAuthException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public AppAuthException() {
        super();
    }

    public AppAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public AppAuthException(String message) {
        super(message);
    }

    public AppAuthException(Throwable cause) {
        super(cause);
    }
}
