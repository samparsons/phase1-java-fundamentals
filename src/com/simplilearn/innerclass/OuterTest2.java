package com.simplilearn.innerclass;

public class OuterTest2 {
	private static double amount = 890.90;
	public static String message1 = "hello world ";
	
	//inner class
	static class InnerTest {
		
		//used for grouping logic, securing data, etc.
		private String message2 = "hello world 2";
		
		public void showData() {
			System.out.println("Outer class amount: "+amount);
			System.out.println("Outer class message1: "+ message1);
			System.out.println("Inner class message2: " + message2);
		}
		
	}
	
	public static void main(String[] args) {
		
		// crete inner class object by referencing outer class reference.
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
		
	}
	
	
}
