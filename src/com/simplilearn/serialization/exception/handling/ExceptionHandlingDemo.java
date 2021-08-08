package com.simplilearn.serialization.exception.handling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Program initiated");
		System.out.println("--------------------");
		
		try {
		int balance = 2000;
		int amount = 10;
		int result = balance / amount;
		System.out.println("Result Average Balance: "+result);
		
		}catch(ArithmeticException ex) {
			System.err.print("The following error occured: "+ex.getMessage());
		}finally {
			System.out.println("Always execute!");
		}
		
		System.out.println("Program terminated");

	}

}
