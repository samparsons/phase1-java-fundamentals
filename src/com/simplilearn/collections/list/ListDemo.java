package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// define a list type collections
		
		// List -> Order collection of data with duplicate elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList, Vector, Stack
		
		//  declaration
		List<String> list1 = new ArrayList<String>(); // data backed by dynamic array, not thread safe, better for read operations
		List<String> list2 = new LinkedList<String>(); // data backed by doubly linkedlist, not thread safe, better for insert,delete,replace operations.
		List<String> list3 = new Vector<String>(); // thread safe collection.
		List<String> list4 = new Stack<String>(); // thread safe collection.
		
		List<String> namesList = new ArrayList<String>();
		namesList.add("Jon");
		namesList.add("Robb");
		namesList.add("Rickon");
		namesList.add("Jon");
		
		System.out.println(namesList);
		System.out.println("The element at index 2: "+namesList.get(2));
		System.out.println("---------------------------");
		// insert value at index 2
		namesList.add(2,"Sansa");
		System.out.println("The element at index 2: "+namesList.get(2));
		System.out.println(namesList);
		System.out.println("---------------------------");
		
		//iteration on list
		
		Iterator<String> itr = namesList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------");
		// enhanced for loop - forEach
		for(String name: namesList) {
			System.out.println(name);
		}
		
		System.out.println("---------------------------");
		// counter for loop
		
		for(int index=0;index<namesList.size();index++) {
			System.out.println("The index " + index + " and name : "+namesList.get(index));
		}
		
		
		

	}

}
