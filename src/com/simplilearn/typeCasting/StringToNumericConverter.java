package com.simplilearn.typeCasting;

public class StringToNumericConverter {

	public static void main(String[] args) {
		// TODO :: WAP to convert a string value to a numeric value
		
		/**
		 * String to numeric
		 */
		
		String price = "123.27";  //Convertible string
		String amount = "1277";  //Convertible string
		String username = "abcd1234"; //nonConvertible string - throws an error at runtime, NumberFormatException
		
		// string(non-primitive type) to int(primitive type) => Wrapper class
		
		int intAmount = Integer.parseInt(amount);
		double doublePrice = Double.parseDouble(price);
		
		System.out.println("Integer Amount: "+intAmount);
		System.out.println("Double Price: "+doublePrice);
		
		

	}

}
