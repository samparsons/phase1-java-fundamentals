package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExRealExample {

	public static void main(String[] args) {
		// WA pattern for that accepts alphanumeric chars only for username
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
		String email2 = "sam12@g.com";
		String regex5 = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		System.out.println("Result: "+Pattern.matches(regex5, email2));

	}

}