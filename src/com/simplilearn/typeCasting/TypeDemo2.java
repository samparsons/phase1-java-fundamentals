package com.simplilearn.typeCasting;

public class TypeDemo2 {

	public static void main(String[] args) {
		// Explicit Typecast 
		/**
		 * Explicit type conversion does not happen automatically
		 * Also called Narrowing.
		 * Narrowing : converts data of incompatible type to compatible type by converting data from a 'higher range value' to a 'lower range value'
		 * 
		 */
		
		double price = 1500.25d;
		
		long bigPrice = (long) price; //narrowing double => long
		
		int intPrice = (int) bigPrice; //narrowing long => int
		
		short shortPrice = (short) bigPrice; //narrowing long => short
		
		byte bytePrice = (byte) price; //narrowing double => byte
		
		System.out.println("Double Price: "+price);
		System.out.println("Long Price: "+bigPrice);
		System.out.println("Integer Price: "+intPrice);
		System.out.println("Short Price: "+shortPrice);
		System.out.println("Byte Price: "+bytePrice);
		

	}

}
