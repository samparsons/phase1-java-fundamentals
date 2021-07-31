package com.simplilearn.arrays;

public class StringArrayExample {

	public static void main(String[] args) {
		// Collect a group of people together
		
		String[] names = {"Jon","Arya","Sansa","Robb","Bran","Rickon"};
		
		System.out.println("Name at index 0: "+names[0]);
		System.out.println("Name at index 0: "+names[4]);
		//System.out.println("Name at index 0: "+names[6]); generates ArrayIndexOutOfBoundsException if you try to access something out of bounds
		
		System.out.println("----------------------------------");
		for(int index=0;index<names.length;index++) {
			System.out.println("Name at index "+index+": "+names[index]);
		}

	}

}
