package com.simplilearn.datastructures.bigO;

public class ExampleOnTimeComplexity {
	static int[] items = {10,20,30,40,50,60,70,80,90,100,110,120};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(items);
		displayTwice(items);

	}
	
	// this method runs in O(1) + O(n) + O(1) => O(2+n) => since N has much more impact, we summarize to O(n) => Linear Time Complexity 
	private static void display(int[] items) {
		System.out.println(items[0]);
		for(int item : items) {
			System.out.println(item);
		}
		System.out.println(items[5]);
	}
	
	// this method runs in O(1+n+1+n) => O(2+2n) => O(n) => linear time complexity
	private static void displayTwice(int[] items) {
		System.out.println(items[0]);
		for(int item : items) {
			System.out.println(item);
		}
		System.out.println(items[5]);
		int index=0;
		while(index<items.length) {
			System.out.println(items[index]);
			index++;
		}
	}
	

}
