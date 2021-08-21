package com.simplilearn.datastructures.sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] inputs = {-15,7,-3,40,-22, -1,5,7,9,20,35,55,1};
		System.out.println("before: "+Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("after: "+Arrays.toString(inputs));
	}// worst time complexity 0(n^2)
	private static void selectionSort(int[] inputs) {
		// iterate over unsorted partition 
		for (int lastUnsortedIndex = inputs.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			//assume largest element is present at index 0
			int largest = 0;
			for(int i=1 ; i<=lastUnsortedIndex; i++) {
				if(inputs[i]>inputs[largest])
				largest = i;
			}
			swap(inputs,largest,lastUnsortedIndex);	
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
