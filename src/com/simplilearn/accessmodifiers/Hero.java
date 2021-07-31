package com.simplilearn.accessmodifiers;

public class Hero {
	
	// protected properties
	protected String power = "Wolvereen - Healing Power";
	
	// protected methods
	protected void usePower() {
		System.out.println("The best power is "+power+".");
	}
	
	public void showPower() {
		System.out.println("The power shown : "+power+".");
	}
}
