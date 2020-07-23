package com.jfilippo.user.register.utils;

public class ParameterAlreadyInUseException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ParameterAlreadyInUseException(String attribute) {
        super(String.format("Provided parameter with attribute:[%s] is already in use", attribute));
    }
    
}
