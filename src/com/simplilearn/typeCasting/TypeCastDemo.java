package com.simplilearn.typeCasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		// Implicit Typecast: Automatic
		/**
		 * multiline comment example
		 * Widening Typecast : Converts data from lower range value to higher range value.
		 * byte -> short -> int -> long -> float -> double
		 */
		byte smallCount = 100; //range : -128 to 127 => 1 byte => 8 bit
		
		int intCount = smallCount; //automatically converted
		
		long bigCount = intCount; 
		
		float floatCount = bigCount;
		
		double doubleCount = floatCount;
		
		System.out.println("Byte Count: "+smallCount);
		System.out.println("Integer Count: "+intCount);
		System.out.println("Long Count: "+bigCount);
		System.out.println("Float Count: "+floatCount);
		System.out.println("Double Count: "+doubleCount);
		

	}

}
