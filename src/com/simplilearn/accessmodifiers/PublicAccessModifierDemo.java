package com.simplilearn.accessmodifiers;

public class PublicAccessModifierDemo {
	public static void main(String[] args) {
		
		// create object
		Father father = new Father();
		System.out.println("Amount : "+father.amount);
		System.out.println("Park Name : "+father.park);
		
		// access methods
		System.out.println("Amount() : "+father.showAmount());
		System.out.println("Park Name() : "+father.displayPark());
		
	}
}

class Father {
	
	// public variables
	public double amount = 84474.23d;
	public String park = "Public Park";
	
	// public methods
	
	public double showAmount() {
		return amount;
	}
	
	public String displayPark() {
		return park;
	}
	
	// constructor, which has the exact same name as the class.
	
	public Father() { }
}

