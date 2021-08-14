package com.simplilearn.datastructures.arrays;

public class ArrayDSDemo {

	public static void main(String[] args) {
		int[] items = {-15,23,40,34,78,67,50};
		
		display(items);

	}

	private static void display(int[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println("the index: "+ i +" and value: "+items[i]);
		}
		
		for(int item : items) {
			System.out.println("value: "+item);
		}
		
	}

}
