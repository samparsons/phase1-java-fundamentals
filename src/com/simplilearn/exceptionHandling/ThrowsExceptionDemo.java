package com.simplilearn.exceptionHandling;

import java.io.IOException;

public class ThrowsExceptionDemo {
	
	// throws keyword is used to delcare exception.

	// calling method
	public static void main(String[] args) {
		try {
			ageValidator(20);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	
	// method declaration age validator
	public static void ageValidator(int age) throws IOException {
		if(age > 20) {
			System.out.println("valid age.");
			
		} else {
			throw new IOException("Not a valid age.");
		}
	}

}
