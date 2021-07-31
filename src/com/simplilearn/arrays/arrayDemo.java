package com.simplilearn.arrays;

import java.util.Arrays;

public class arrayDemo {

	public static void main(String[] args) {
		// arrays is an ordered collection of similar type of data elements.
		
		//declaring the array size
		//int numbers[] = new int[50];
		//numbers[0] = 100;
		//numbers[1] = 100;
		//numbers[2] = 100;
		
		//providing default size of array.
		int numbers[] = {10,20,30,40,50,60};
		
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		System.out.println("----------------------------------");
		
		System.out.println("Element at index 0: "+numbers[0]);
		System.out.println("Element at index 5: "+numbers[5]);
		
		System.out.println("----------------------------------");
		
		//access elements in interations
		
		for(int index=0;index<numbers.length;index++) {
			System.out.println("Element at index "+index+": "+numbers[index]);
		}
		

	}

}
