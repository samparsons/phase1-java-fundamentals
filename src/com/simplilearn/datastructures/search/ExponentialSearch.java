package com.simplilearn.datastructures.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputs = {-22,-15,-3,-1,5,7,9,20,35,55};
		int value = 0;
		int result = exponentialSearch(inputs,value);
		
		if(result>=0) {
			System.out.println("The Element : "+value +" is found at index : "+result);
			}else {
			System.out.println("Element does not exist.");
			}
		
	}
	// best time complexity is O1, and worst is O(log2 n)
	private static int exponentialSearch (int[] inputs,int value) {
		//1 start with 0 index -> if search value present at index 0
		if(inputs[0]==value) {
			return 0;
		}
		
		// 2 doubling method
		int i=1;
		while( i < inputs.length && inputs[i] <= value) {
			i = i * 2;
		}
		
		//3 binary search
		return Arrays.binarySearch(inputs, i / 2 , Math.min(i, inputs.length), value);
		
	}

}
