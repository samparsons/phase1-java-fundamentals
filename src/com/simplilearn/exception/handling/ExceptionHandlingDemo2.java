package com.simplilearn.exception.handling;

public class ExceptionHandlingDemo2 {
	static int balance = 1000;
	
	public static void main(String[] args) {
		transaction(70);
		transaction(600);
		transaction(0);
		transaction(10);
		transaction(40);
		System.out.println("-----------");
		strLengthCalculator("Hello");
		strLengthCalculator(null);
		strLengthCalculator("Today is a good day");
		System.out.println("-----------");
		numberConvertor("12345687");
		numberConvertor("12345687acg");
		numberConvertor("465467");
	}
	
	private static void transaction(int amount) {
		try {
			float result = balance / amount;
			System.out.println("Result amount: "+result);
		}catch (ArithmeticException ex) {
			System.out.println("////Exception occurs: "+ex.getClass());
			System.out.println("////Exception message: "+ex.getMessage());
		}
	}
	
	private static void strLengthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("String Length: "+length);
		}catch(NullPointerException ex) {
			System.out.println("////Exception occurs: "+ex.getClass());
			System.out.println("////Exception message: "+ex.getMessage());
		}
	}
	
	private static void numberConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println("Result amount: "+result);
		}catch(NumberFormatException ex) {
			System.out.println("////Exception occurs: "+ex.getClass());
			System.out.println("////Exception message: "+ex.getMessage());
		}
	}

}
