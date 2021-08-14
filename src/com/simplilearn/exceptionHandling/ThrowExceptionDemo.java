package com.simplilearn.exceptionHandling;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ThrowExceptionDemo {

	public static void main(String[] args) {

	}
	
	private static void ageValidator(int age) {
		if (age > 18) {
			System.out.println("valid age");
		}else {
			throw new RuntimeException("invalid age");
		}
	}
	
	private static void stringValidator(String str) {
		if(str != null && str.length()>0) {
			
			System.out.println("valid string");
		} else {
			throw new RuntimeException("not a string");
		}
	}

}
