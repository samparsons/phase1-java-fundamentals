package com.simplilearn.exceptionHandling.bank;

public class InvalidTransactionException extends Exception {
	String message;
	InvalidTransactionException(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "InvalidTransactionException [message=" + message + "]";
	}
	
	
	
}
