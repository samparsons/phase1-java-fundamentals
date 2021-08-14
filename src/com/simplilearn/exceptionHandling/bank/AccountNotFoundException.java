package com.simplilearn.exceptionHandling.bank;

public class AccountNotFoundException extends RuntimeException {
	String message;
	AccountNotFoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "AccountNotFoundException [message=" + message + "]";
	}
	
	
	
}
