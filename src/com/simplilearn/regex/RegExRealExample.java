package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExRealExample {

	public static void main(String[] args) {
		// WA pattern for that accepts alphanumeric chars only fo username
		String username = "sam94380";
		String pattern1 = "[a-zA-Z0-9]+";
		System.out.println("Result: "+Pattern.matches(pattern1, username));
		
		// WE pattern for that accepts alphanumeric chars but only up to 10 chars (exactly 10 = {10} )
		String username2 = "af380adfd";
		String pattern2 = "[a-zA-Z0-9]{0,10}";
		System.out.println("Result: "+Pattern.matches(pattern2, username2));
		
		// firstName where only small letters allowed up to 6 chars
		String firstname = "sam";
		String regex3 = "[a-z]{0,6}";
		System.out.println("Result: "+Pattern.matches(regex3, firstname));
		// email where only small chars are allowed up to 15 chars
		String email = "sam12gmailcom";
		String regex4 = "[a-z0-9]{0,15}";
		System.out.println("Result: "+Pattern.matches(regex4, email));
		
		// email where only small chars with number and @ special allowed up to 15 chars.
		String email2 = "s#am.12@g.com";
		String regex5 = "[a-z0-9\\.\\@]{0,15}";
		System.out.println("Result: "+Pattern.matches(regex5, email2));

	}

}
