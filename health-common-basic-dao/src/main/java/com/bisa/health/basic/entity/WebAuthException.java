package com.bisa.health.basic.entity;

public class WebAuthException extends RuntimeException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public WebAuthException() {
        super();
    }

    public WebAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebAuthException(String message) {
        super(message);
    }

    public WebAuthException(Throwable cause) {
        super(cause);
    }
}
