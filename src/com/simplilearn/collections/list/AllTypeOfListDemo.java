package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {
		// ArrayList - read operations
		List<String> listOfCompanies = new ArrayList<String>();
		listOfCompanies.add("DELL");
		listOfCompanies.add("Salesforce");
		listOfCompanies.add("Apple");
		listOfCompanies.add("DELL");
		
		System.out.println(listOfCompanies);
		
		// LinkedList - good for change,update,delete
		
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("Washington DC");
		listOfCities.add("Indianapolis");
		listOfCities.add("Mumbai");
		
		System.out.println(listOfCities);
		
		// Vector - thread safe
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Banana");
		listOfFruits.add("Mango");
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Kiwi");

		System.out.println(listOfFruits);
		
		// no data type list -- possible but NOT RECOMMENDED
		
		List varients = new ArrayList();
		varients.add(1);
		varients.add("test");
		varients.add(false);
		varients.add(12222.02);
		
		System.out.println(varients);
	}

}
