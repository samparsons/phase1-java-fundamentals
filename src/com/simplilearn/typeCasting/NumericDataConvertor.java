package com.simplilearn.typeCasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		// step 1 collect data from console
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------");
		System.out.println(" :: Welcome to Numeric Converter ::");
		System.out.println(" :: Enter a integer number :: ");
		int userInput = input.nextInt();
		
		//step 2. convert user input into different type
		//implicit type cast
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explicit type cast
		
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		System.out.println("---------Implicit-----------");
		System.out.println("bigValue : "+bigValue);
		System.out.println("floatValue : "+floatValue);
		System.out.println("doubleValue : "+doubleValue);
		System.out.println("----------Explicit----------");
		System.out.println("byteValue : "+byteValue);
		System.out.println("shortValue : "+shortValue);
		

	}

}
