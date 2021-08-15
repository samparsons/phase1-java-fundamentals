package com.simplilearn.datastructures.linkedList.doublylinkedlist;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000.00d);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000.00d);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000.00d);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000.00d);
		
		DoublyLinkedList dlList = new DoublyLinkedList();
		
		dlList.addToFront(emp1);
		dlList.addToFront(emp2);
		dlList.addToFront(emp3);
		dlList.addToEnd(emp4);
		
		System.out.println(dlList.isEmpty());
		System.out.println(dlList.getSize());
		
		//dlList.removeFromFront();
		
		//dlList.removeFromEnd();
		
		dlList.printList();
		

	}

}
