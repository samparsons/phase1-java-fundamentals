package com.simplilearn.typeCasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO :: Write a Program (WAP) for converting int, byte, short => float, double, long.
		
		int integer 		= 23;
		byte bytedata 		= 100;
		short shortdata 	= 150;
		
		float floatint 		= integer;
		float floatbyte 	= bytedata;
		float floatshort 	= shortdata;
		
		double doubleint 	= integer;
		double doublebyte 	= bytedata;
		double doubleshort 	= shortdata;
		
		long longint 		= integer;
		long longbyte 		= bytedata;
		long longshort 		= shortdata;
		
		System.out.println("------------------------");
		System.out.println("----Example 1 output----");
		System.out.println("------------------------");
		System.out.println("integer Data:      "	+integer);
		System.out.println("bytedata Data:     "	+bytedata);
		System.out.println("shortdata Data:    "	+shortdata);
		System.out.println("floatint Data:     "	+floatint);
		System.out.println("floatbyte Data:    "	+floatbyte);
		System.out.println("floatshort Data:   "	+floatshort);
		System.out.println("doubleint Data:    "	+doubleint);
		System.out.println("doublebyte Data:   "	+doublebyte);
		System.out.println("doubleshort Data:  "	+doubleshort);
		System.out.println("longint Data:      "	+longint);
		System.out.println("longbyte Data:     "	+longbyte);
		System.out.println("longshort Data:    "	+longshort);

	}

}
