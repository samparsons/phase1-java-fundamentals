package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// Set is child interface in Collection
		// Set do not duplicate values
		// Implementation class: HashSet, LinkedHashSet, TreeSet
		
		// Declaration
		Set<String> set1 = new HashSet<String>(); // when do not want any insertion order to pres
		Set<String> set2 = new LinkedHashSet<String>(); // when want to preserve insertion order
		Set<String> set3 = new TreeSet<String>(); // arrange set element in ascending / descending order
		
		// set implemenetation ex
		
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("Salesforce");
		setOfUniqueCompanies.add("Google");
		setOfUniqueCompanies.add("Apple");
		
		System.out.println(setOfUniqueCompanies);
		
		// enhanced for loop
		for(String compName : setOfUniqueCompanies) {
			System.out.println(compName);
		}
		
		System.out.println("---------------------------");
		// Linked hash set
		Set<String> setOfUniqueBrands = new LinkedHashSet<String>();
		setOfUniqueBrands.add("Nike");
		setOfUniqueBrands.add("Adidas");
		setOfUniqueBrands.add("Puma");
		setOfUniqueBrands.add("Reebok");
		
		System.out.println(setOfUniqueBrands);
		
		// enhanced for loop
		for(String brand : setOfUniqueBrands) {
			System.out.println(brand);
		}
		
		System.out.println("---------------------------");
		// Tree set
		TreeSet<String> setOfUniqueName = new TreeSet<String>();
		setOfUniqueName.add("Jon");
		setOfUniqueName.add("Robb");
		setOfUniqueName.add("Sansa");
		setOfUniqueName.add("Arya");
		
		System.out.println(setOfUniqueName);
		System.out.println(setOfUniqueName.descendingSet());
		
		// enhanced for loop
		for(String name : setOfUniqueName) {
			System.out.println(name);
		}
		
		
	}
	

}
