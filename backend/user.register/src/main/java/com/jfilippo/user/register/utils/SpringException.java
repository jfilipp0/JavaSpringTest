package com.jfilippo.user.register.utils;

@SuppressWarnings("serial")
public class SpringException extends RuntimeException {
    public SpringException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringException(String exMessage) {
        super(exMessage);
    }
}
