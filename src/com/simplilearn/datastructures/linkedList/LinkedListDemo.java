package com.simplilearn.datastructures.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000.00d);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000.00d);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000.00d);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000.00d);
		
		LinkedList<Employee> emLinkedList = new LinkedList<>();
		emLinkedList.add(emp1);
		emLinkedList.add(emp2);
		
		emLinkedList.addFirst(emp3);
		emLinkedList.addLast(emp4);
		
		System.out.println(emLinkedList);
		for(Employee emp : emLinkedList) {
			System.out.println(emp);
		}
		

	}

}
