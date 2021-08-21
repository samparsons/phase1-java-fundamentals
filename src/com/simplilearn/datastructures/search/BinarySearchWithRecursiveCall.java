package com.simplilearn.datastructures.search;

public class BinarySearchWithRecursiveCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputs = {-22,-15,-3,-1,7,9,20,35,44,55};
		
		int value = -15;
		
		int start = 0;
		
		int end = inputs.length-1;
		
		int searchIndex = binarySearch(inputs,start,end,value);
		
		if(searchIndex>=0) {
			System.out.println("The Element : "+value +" is found at index : "+searchIndex);
			}else {
			System.out.println("Element does not exist.");
			}

	}
	
	private static int binarySearch(int[] inputs, int start, int end, int value) {
		
		// breaking if value not found
		
		if(start>end) {
			return -1;
		}
		
		int midpoint = (start+end)/2;
		
		if(inputs[midpoint]==value) {
			return midpoint;
		}
		
		if(inputs[midpoint] < value) {
			return binarySearch(inputs,midpoint++,end,value);
		} else {
			return binarySearch(inputs,start,midpoint--,value);
		}
		
		
	}

}
