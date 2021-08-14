package com.simplilearn.datastructures.arrays;

import java.util.Arrays;

public class ArrayOrderStatistic {

	public static void main(String[] args) {
		// identify the kth smallest and largest element inside array.
		
		int[] items = {-15,45,84,34,789,11,0,1000,800};
		// kth smallest element
		// kth largest element
		
		int pos = 3;
		int result = findKthSmallest(items,pos);
		int result2 = findKthLargest(items,pos);
		
		System.out.println("the pos "+pos+" based smalled element "+result);
		System.out.println("the pos "+pos+" based smalled element "+result2);
		

	}

	private static int findKthSmallest(int[] items, int pos) {
		
		// sort arrayin ascending order
		Arrays.sort(items);
		
		//return Kth smallest
		
		return items[pos-1];
	}
	
	private static int findKthLargest(int[] items, int pos) {
		
		// sort arrayin ascending order
		Arrays.sort(items);
		
		//return Kth largest
		
		return items[items.length-pos];
	}
	
	

}
