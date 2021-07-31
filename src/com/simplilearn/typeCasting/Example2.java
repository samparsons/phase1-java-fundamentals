package com.simplilearn.typeCasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO :: WAP for converting long, float, int => byte, short, double.
		
		long longvar 	= 100;
		float floatvar 	= 125;
		int intvar 		= 150;
		
		byte bytelong 	= (byte) longvar;
		short shortlong = (short) longvar;
		double doublelong = longvar;
		
		byte bytefloat 	= (byte) floatvar;
		short shortfloat = (short) floatvar;
		double doublefloat = floatvar;
		
		byte byteint 	= (byte) intvar;
		short shortint = (short) intvar;
		double doubleint = intvar;
		
		System.out.println("------------------------");
		System.out.println("----Example 2 output----");
		System.out.println("------------------------");
		System.out.println("longvar Data:      "	+longvar);
		System.out.println("floatvar Data:     "	+floatvar);
		System.out.println("intvar Data:       "	+intvar);
		System.out.println("bytelong Data:     "	+bytelong);
		System.out.println("shortlong Data:    "	+shortlong);
		System.out.println("doublelong Data:   "	+doublelong);
		System.out.println("bytefloat Data:    "	+bytefloat);
		System.out.println("shortfloat Data:   "	+shortfloat);
		System.out.println("doublefloat Data:  "	+doublefloat);
		System.out.println("byteint Data:      "	+byteint);
		System.out.println("shortint Data:     "	+shortint);
		System.out.println("doubleint Data:    "	+doubleint);

	}

}
