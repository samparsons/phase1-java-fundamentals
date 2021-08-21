package com.simplilearn.datastructures.search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchWithIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputs = {-22,-15,-3,-1,7,9,20,35,44,55};
		
		int value = -22;
		
		int searchIndex = binarySearch(inputs,value);
		
		if(searchIndex>=0) {
			System.out.println("element "+value+" found at index "+searchIndex);
		}else {
			System.out.println("value not found");
		}
	}
	
	private static int binarySearch(int[] inputs, int value) {
		int start = 0;
		int end = inputs.length-1;
		
		while(start<=end) {
			//midpoint 
			int midpoint = (start+end)/2;
			
			if(inputs[midpoint]==value) {
				return midpoint;
			}else if (inputs[midpoint]<value) {
				 start = midpoint++;
			}else {
				end = midpoint--;
			}
		}
		return -1;
			
	}

}
