package com.simplilearn.datastructures.search;

public class BinarySearchWithRecursiveCall_wahid {

	public static void main(String[] args) {
		
int[] inputs = {-22,-15,-3,-1,7,9,20,35,55};
		
		//search value.
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
		
		// breaking condition -> if value not found
		if(start>end) {
			return -1;
		}
		
		int middpoint = (start+end)/2;
		
		//search value is middpoint
		if(inputs[middpoint]== value) {
			return middpoint;
		}
		// search in right halt
		if(inputs[middpoint] < value) {
			return binarySearch(inputs,middpoint+1,end,value);
		}
		//search in left half
		else {
			return binarySearch(inputs,start,middpoint-1,value);
		}
		
	}

}