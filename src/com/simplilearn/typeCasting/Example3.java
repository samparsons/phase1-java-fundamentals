package com.simplilearn.typeCasting;

import java.util.Scanner;

public class Example3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO :: WAP for string to number value (byte,short,int,long,double,float)
		// collect user input from console.
		
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println(" :: Welcome to Example 3 ::");
		System.out.println(" ::    Enter a Byte Number    ::");
		byte byteInput = input.nextByte();
		System.out.println(" ::    Enter a Short Number   ::");
		short shortInput = input.nextShort();
		System.out.println(" ::   Enter a Integer Number  ::");
		int intInput = input.nextInt();
		System.out.println(" ::    Enter a Long Number    ::");
		long longInput = input.nextLong();
		System.out.println(" ::    Enter a Float Number   ::");
		float floatInput = input.nextFloat();
		System.out.println(" ::   Enter a Double Number   ::");
		double doubleInput = input.nextDouble();
		System.out.println(" ::    "+byteInput+"    ::");
		System.out.println(" ::    "+shortInput+"    ::");
		System.out.println(" ::    "+intInput+"    ::");
		System.out.println(" ::    "+longInput+"    ::");
		System.out.println(" ::    "+floatInput+"   ::");
		System.out.println(" ::    "+doubleInput+"   ::");
	}

}
