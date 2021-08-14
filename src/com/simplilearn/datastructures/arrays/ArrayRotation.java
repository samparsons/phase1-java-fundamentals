package com.simplilearn.datastructures.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] items = {-185,15,-46,65,789,635,412,54,53,99,457,6581,654};
		
		Arrays.toString(items);
		System.out.println("before rotation: "+Arrays.toString(items));
		rotateRight(items,3);
		System.out.println("after rotation: "+Arrays.toString(items));
		System.out.println("------------");
		int[] items2 = {-185,15,-46,65,789,635,412,54,53,99,457,6581,654};
		System.out.println(Arrays.toString(items2));
		rotateLeft(items2,3);
	}
	
	// right to left
	private static void rotateRight(int[] items,int cRotate) {
		
		if(cRotate > items.length) {
			cRotate = cRotate % items.length;
		}
		
		int[] temp = new int[items.length];
		//System.out.println(Arrays.toString(temp));
		
		//shift element into temporary array
		for (int i = 0; i < cRotate; i++) {
			temp[i]=items[items.length-cRotate+i];
		}
		//System.out.println(Arrays.toString(temp));
		
		int j = 0;
		for (int i = cRotate; i<items.length; i++) {
			temp[i] = items[j];
			j++;
		}
		
		
		//System.out.println(Arrays.toString(temp));
		System.arraycopy(temp, 0, items, 0, items.length);
	}
	
	private static void rotateLeft(int[] items,int cRotate) {
		
		int[] temp = new int[cRotate];
		System.out.println(Arrays.toString(temp));
		//copy elements which need to be rotated
		
		for (int i = 0; i < cRotate; i++) {
			temp[i] = items[i];
		}
		System.out.println(Arrays.toString(temp));
		
		// shift / move actual array
		for (int i = cRotate; i < items.length; i++) {
			items[i-cRotate] = items[i];	
		}
		System.out.println(Arrays.toString(items));
		
		//copy the temp element into the prod array
		
		for (int i = 0; i < cRotate; i++) {
			items[items.length-cRotate+i] = temp[i];
		}
		System.out.println(Arrays.toString(items));
		
		
				
	}
}
