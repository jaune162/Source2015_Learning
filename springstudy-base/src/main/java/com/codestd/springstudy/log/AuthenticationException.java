package com.codestd.springstudy.log;

public class AuthenticationException extends Exception {

	private static final long serialVersionUID = -5160585885606759616L;

	public AuthenticationException() {
		super();
	}

	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}

	public AuthenticationException(String message) {
		super(message);
	}

	public AuthenticationException(Throwable cause) {
		super(cause);
	}
	

}
