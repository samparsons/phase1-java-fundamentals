package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternExample4 {

	public static void main(String[] args) {
		System.out.println("Response: "+ Pattern.matches("[a-z]*", "azhar"));				// true  -> 0 to many characters allowed. Must be a-z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[a-z]*", "x"));					// true  -> 0 to many characters allowed. Must be a-z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[a-z]*", ""));					// true  -> 0 to many characters allowed. Must be a-z (case sensitive)
		
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[a-z]+", "x"));					// true  -> 1 to many characters allowed. Must be a-z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[a-z]+", ""));					// false -> 1 to many characters allowed. Must be a-z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[a-z]+", "pqr"));					// true  -> 1 to many characters allowed. Must be a-z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[a-z]+", "azhar"));				// true  -> 1 to many characters allowed. Must be a-z (case sensitive)
		
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[A-Z]+", "x"));					// false -> 1 to many characters allowed. Must be A-Z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[A-Z]+", "XYZ"));					// true  -> 1 to many characters allowed. Must be A-Z (case sensitive)
		System.out.println("Response: "+ Pattern.matches("[A-Z]+", "XYZ123"));				// false -> 1 to many characters allowed. Must be A-Z (case sensitive)
		
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[a-zA-Z]+", "mknPPQWS"));			// true  -> 1 to many characters allowed. Must be a-zA-Z (includes both cases)
		System.out.println("Response: "+ Pattern.matches("[a-zA-Z]+", "m"));				// true  -> 1 to many characters allowed. Must be a-zA-Z (includes both cases)
		System.out.println("Response: "+ Pattern.matches("[a-zA-Z]+", "M"));				// true  -> 1 to many characters allowed. Must be a-zA-Z (includes both cases)
		System.out.println("Response: "+ Pattern.matches("[a-zA-Z0-9]+", "mknPPQWS123"));	// true  -> 1 to many characters allowed. Must be a-zA-Z0-9 (includes both cases and nums)
		System.out.println("Response: "+ Pattern.matches("[a-zA-Z0-9]+", "123"));			// true  -> 1 to many characters allowed. Must be a-zA-Z0-9 (includes both cases and nums)
		
		System.out.println("---------------------------");
		// \\d is digit only
		System.out.println("Response: "+ Pattern.matches("\\d", "3"));						// true  -> 1 character allowed. Must be 0-9
		System.out.println("Response: "+ Pattern.matches("\\d+", "6543"));					// true  -> 1 to many characters allowed. Must be 0-9
		System.out.println("Response: "+ Pattern.matches("\\d+", "jkflsd"));				// false -> 1 to many characters allowed. Must be 0-9
		
		// \\D is the negation of digit only, so no digits allowed
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("\\D", "3"));						// false -> 1 character allowed. Must be 0-9
		System.out.println("Response: "+ Pattern.matches("\\D+", "6543"));					// false -> 1 to many characters allowed. Must be 0-9
		System.out.println("Response: "+ Pattern.matches("\\D+", "jkflsd"));				// true  -> 1 to many characters allowed. Must be 0-9
	}

}
