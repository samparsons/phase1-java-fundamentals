package com.simplilearn.datastructures.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] inputs = {-15,7,-3,40,-22, -1,5,7,9,20,35,55,1};
		System.out.println("before: "+Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("after: "+Arrays.toString(inputs));

	}
	
	private static void bubbleSort(int[] inputs) {
		for ( int lastUnsortedIndex = inputs.length-1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if(inputs[i]>inputs[i+1]) {
					swap(inputs,i,i+1);
				}
			}
		}
	}
	private static void swap(int[] inputs, int largest, int lastUnsortedIndex) {
		if (largest==lastUnsortedIndex) {
			return;
		}
		
		int tmp = inputs[largest];
		inputs[largest]=inputs[lastUnsortedIndex];
		inputs[lastUnsortedIndex]=tmp;
		
	}

}
