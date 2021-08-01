package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// step 1: define a data string
		String data = "Wn";
		
		//step 2: define a pattern
		Pattern pattern = Pattern.compile(".n");
		
		//step 3: define a matcher
		Matcher matcher = pattern.matcher(data);
		
		//step 4: match the pattern
		boolean result = matcher.matches();
		
		System.out.println("Result: "+result);
		System.out.println("---------------------------");
		
		// shorter syntax
		boolean result2 = Pattern.compile(".n").matcher(data).matches();
		System.out.println("Result: "+result2);
		System.out.println("---------------------------");
		
		// shortest sytax
		boolean result3 = Pattern.matches(".n", data);
		System.out.println("Result: "+result3);

	}

}
