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
				 start = midpoint+1;
			}else {
				end = midpoint-1;
			}
		}
		return -1;
			
	}
	
private static int binarySearchtwo(int[] inputs, int value) {
		
		int start =0;
		int end = inputs.length-1;
		
		while(start<=end) {
			// middpoint
			int middpoint = (start+ end) / 2;
			
			// midpoint is the search value
			if(inputs[middpoint]==value) {
				return middpoint;
			}
			// search in righ half
			else if(inputs[middpoint] < value) {
				start = middpoint+1;
			}
			// search in left half
			else {
				end= middpoint-1;
			}
			
		}	
		return -1;
	}
	
	

}
