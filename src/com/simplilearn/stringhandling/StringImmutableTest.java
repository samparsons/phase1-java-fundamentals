package com.simplilearn.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {

		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		// concat() -> update the string
		String reponse = username.concat(" Snow");
		
		System.out.println(username); // old name -> old string 
		
		System.out.println(reponse);  // new name  -> new String

	}

}