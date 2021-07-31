package com.simplilearn.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = { {2,4,6,8,10}, {3,5,7,9,11,} };
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		System.out.println("---------------------------");
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(Arrays.toString(numbers[i]));
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]);

			}
		}
	}
}
