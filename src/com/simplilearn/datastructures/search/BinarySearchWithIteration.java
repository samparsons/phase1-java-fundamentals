package com.simplilearn.datastructures.search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchWithIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputs = {-22,-10-5,0,10,20,30,40,50,60,70,80,90,100,110,120};
		
		int value = 60;
		
		int searchIndex = binarySearch(inputs,value);
		
		if(searchIndex>0) {
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
			int midpoint = (start+end) / 2;
			
			if(inputs[midpoint]==value) {
				return midpoint;
			}else if (inputs[midpoint]<value) {
				 start = midpoint + 1;
			}else if (inputs[midpoint]>value) {
				start = midpoint - 1;
			}
			
			
		}
		return -1;
			
	}
	
	

}
