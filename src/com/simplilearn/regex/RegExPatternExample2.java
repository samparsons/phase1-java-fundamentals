package com.simplilearn.regex;

import java.util.regex.Pattern;

public class RegExPatternExample2 {

	public static void main(String[] args) {
		
		System.out.println("Response: "+ Pattern.matches("[xyz]", "a")); 				// false -> it does not match 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]", "x")); 				// true  -> it does match 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]", "xy")); 				// false -> we want only one character that matches 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]", "xyz")); 				// false -> we want only one character that matches 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]", "y")); 				// true  -> it does match 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]", "X")); 				// false -> RegEx is case sensitive.
		
		
		System.out.println("Response: "+ Pattern.matches("[xyz][xyz]", "xy")); 			// true  -> it does match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz][xyz][xyz]", "xyz"));	// true  -> it does match for each character 'x','y', or 'z'
		//more than 3 character to evaluate, do not use . use range operations.
		//using a pattern combination with a qualifier
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[xyz]+", "xyz"));				// true  -> the + lets the pattern match 1 or more characters. It does match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]+", "xy"));				// true  -> the + lets the pattern match 1 or more characters. It does match for each character 'x','y', or 'z'
		
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[xyz]?", "x"));				// true  -> the ? lets the pattern match 1 or zero characters. It does match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]?", ""));				// true  -> the ? lets the pattern match 1 or zero characters. It does match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]?", "xy"));				// false -> the ? lets the pattern match 1 or zero characters. It does match for each character 'x','y', or 'z', but has too many chars.
		System.out.println("Response: "+ Pattern.matches("[xyz]?", "p"));				// false -> the ? lets the pattern match 1 or zero characters. It does not match for each character 'x','y', or 'z'. 
		
		System.out.println("---------------------------");
		System.out.println("Response: "+ Pattern.matches("[xyz]*", "x"));				// true  -> the * lets the pattern match 0 to many characters. It does need to match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]*", "xyzxzyyzzy"));		// true  -> the * lets the pattern match 0 to many characters. It does need to match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]*", ""));				// true  -> the * lets the pattern match 0 to many characters. It does need to match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]*", "p"));				// false -> the * lets the pattern match 0 to many characters. It does need to match for each character 'x','y', or 'z'
		System.out.println("Response: "+ Pattern.matches("[xyz]*", "xyzxzyyzzyp"));		// false -> all characters must match
		
	}

}
