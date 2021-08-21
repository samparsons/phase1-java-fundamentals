package com.simplilearn.datastructures.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {
		
		// ordered static data
		int[] items = {10,20,30,40,50,60,70,80,90};
		
		displayOne(items);
		displayTwo(items);
		

	}
	// method runs in O(1) complexity bc it always will run 1 element no matter the size of the data -> this is constant time complexity
	private static void displayOne(int[] items) {
		System.out.println(items[5]);
	}
	
	// O(1) + O(1) = O(2) => O(1) => constant
	private static void displayTwo(int[] items) {
		System.out.println(items[5]);
		System.out.println(items[1]);
	}

}
