package com.simplilearn.innerclass;

public class OuterTest {
	private double amount = 890.90;
	public String message1 = "hello world ";
	
	//inner class
	class InnerTest {
		
		//used for grouping logic, securing data, etc.
		private String message2 = "hello world 2";
		
		public void showData() {
			System.out.println("Outer class amount: "+amount);
			System.out.println("Outer class message1: "+ message1);
			System.out.println("Inner class message2: " + message2);
		}
		
	}
	
	public static void main(String[] args) {
		
		//create outer class object
		OuterTest outer = new OuterTest();
		
		// crete inner class object by referencing outer class reference.
		InnerTest inner = outer.new InnerTest();
		
		inner.showData();
		
	}
	
	
}
