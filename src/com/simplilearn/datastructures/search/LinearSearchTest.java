package com.simplilearn.datastructures.search;

public class LinearSearchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {10,20,30,40,50,60,70,80,90,100,110,120,35,-15,7,1,55,-22};
		
		int searchValue = 50;
		int searchIndex = linearSearch(items,searchValue);
		
		if(searchIndex >= 0) {
			System.out.println("search element: "+searchValue+" is found at index: "+searchIndex);
		} else {
			System.out.println("search value not found in provided list");
		}
		

	}
	
	private static int linearSearch(int[] items, int searchValue) {
		// search through a complete array
		for(int index = 0; index<items.length;index++) {
			if(items[index]==searchValue) {
				return index;
			}
		}
		return -1;
	}

}
