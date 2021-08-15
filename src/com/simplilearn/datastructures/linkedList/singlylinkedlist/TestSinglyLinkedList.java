package com.simplilearn.datastructures.linkedList.singlylinkedlist;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000.00d);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000.00d);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000.00d);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000.00d);
		
		// create singly linked list instance
		SinglyLinkedList slList = new SinglyLinkedList();
		
		System.out.println("IsEmpty check: "+slList.isEmpty());
		System.out.println("Size check: "+slList.getSize());
		System.out.println("-----------------------------");
		slList.add(emp1);
		slList.add(emp2);
		slList.add(emp3);
		slList.add(emp4);
		System.out.println("IsEmpty check: "+slList.isEmpty());
		System.out.println("Size check: "+slList.getSize());
		System.out.println("-----------------------------");
		slList.printList();
		System.out.println("-----------------------------");
		Node removedNode = slList.remove();
		System.out.println(removedNode);
		System.out.println("-----------------------------");
		slList.printList();
		
		
		
		

		
	}

}
