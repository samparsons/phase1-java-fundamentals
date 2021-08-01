package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternExample {

	public static void main(String[] args) {
		
		System.out.println("Response: "+ Pattern.matches(".n", "Yn")); 		// true  -> 1st char can be any value but second character must be 'n'
		System.out.println("Response: "+ Pattern.matches(".m", "Hmm")); 	// false -> only 2 char allowed
		System.out.println("Response: "+ Pattern.matches(".m", "Hx")); 		// false -> 2nd char must be m
		System.out.println("Response: "+ Pattern.matches("..m", "Hxm")); 	// true  -> 3rd char must be m
		System.out.println("Response: "+ Pattern.matches("..m", "Hx")); 	// false -> no 3rd char, so 3rd char is not m
		System.out.println("Response: "+ Pattern.matches("n.", "nY")); 		// true  -> 2 char. first char is n.
		System.out.println("Response: "+ Pattern.matches("n..", "nYx")); 	// true  -> 3 char. first char is n.
 		System.out.println("Response: "+ Pattern.matches(".n.", "YnY")); 	// true  -> 3 char. 2nd char is n.
 		//more than 3 character to evaluate, do not use . use range operations.

	}

}
