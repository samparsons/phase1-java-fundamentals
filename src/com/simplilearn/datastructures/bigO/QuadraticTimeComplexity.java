package com.simplilearn.datastructures.bigO;

public class QuadraticTimeComplexity {
	public static void main(String[] args) {
		
		// ordered static data
		int[] items = {10,20,30,40,50,60,70,80,90,100,110,120};
		
		displayAllPairs(items);
		System.out.println("--------------------");
		displayThreePairs(items);
		

	}

	// the first for loop runs in O(n) complexity.
	// the second for loop runs in O(n) complexity.
	// the total time complexity runs in O(n^2) => Quadratic time complexity (avoid if possible)
	private static void displayAllPairs(int[] items) {
		for(int first : items) {
			for(int second : items) {
				System.out.println(first+" "+second);
			}
		}
	}
	// this method runs in O(n*n*n) => O(n^3) => Exponential / Quadratic time complexity
	private static void displayThreePairs(int[] items) {
			
	for(int first : items) {
			for(int second : items) {
				for(int third : items) {
				System.out.println(first+" "+second+" "+third);
				}
			}
		}
	}
}
