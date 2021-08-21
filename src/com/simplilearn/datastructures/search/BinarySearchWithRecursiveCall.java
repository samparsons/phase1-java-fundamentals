package com.simplilearn.datastructures.search;

public class BinarySearchWithRecursiveCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputs = {-22,-10-5,0,10,20,30,40,50,60,70,80,90,100,110,120};
		
		int value = -10;
		
		int start = 0;
		
		int end = inputs.length-1;
		
		int searchIndex = binarySearch(inputs,start,end,value);
		
		if(searchIndex>=0) {
			System.out.println("element "+value+" found at index "+searchIndex);
		}else {
			System.out.println("value not found");
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
			return binarySearch(inputs,midpoint+1,end,value);
		} else {
			return binarySearch(inputs,midpoint-1,end,value);
		}
		
		
	}

}
