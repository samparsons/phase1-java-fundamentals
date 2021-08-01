package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		// imagine we're going grocery shoping and we are collecting grocery items. Name : Price
		
		Map<String, Double> mapOfItems = new HashMap<String,Double>();
		
		mapOfItems.put("Orange", .49);
		mapOfItems.put("Banana", .19);
		mapOfItems.put("Mango", 1.49);
		mapOfItems.put("Grapefruit", .89);
		mapOfItems.put("Turkey", 2.49);
		mapOfItems.put("Orange Juice 1L", 3.49);
		
		//ugly output
		
		System.out.println(mapOfItems);
		// get value with a key
		System.out.println(mapOfItems.get("Mango"));
		
		System.out.println("---------------------------");
		// linkedhashmap respects order entered
		Map<String, Integer> mapOfCities = new LinkedHashMap<String,Integer>();
		
		mapOfCities.put("Washington DC", 20010);
		mapOfCities.put("Chicago", 19001);
		mapOfCities.put("New York", 00141);
		mapOfCities.put("Boston", 57986);
		
		System.out.println(mapOfCities);
		
		System.out.println("---------------------------");
		TreeMap<Integer,String> mapOfEmployees = new TreeMap<Integer,String>();
		mapOfEmployees.put(105, "Sam Parsons");
		mapOfEmployees.put(102, "Arya Stark");
		mapOfEmployees.put(103, "Geoffery Baratheon");
		mapOfEmployees.put(104, "Jon Snow");
		
		System.out.println(mapOfEmployees);
		System.out.println(mapOfEmployees.descendingMap());
			
	}

}
