package com.simplilearn.datastructures.linkedList.circularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {

		Employee employee1 = new Employee(10001, "Mike Smith", "Engineering", 634345);
		Employee employee2 = new Employee(10002, "Ava Smith", "Engineering", 8934345);
		Employee employee3 = new Employee(10003, "Mark Smith", "Engineering", 634345);
		Employee employee4 = new Employee(10004, "William Smith", "Engineering", 134345);

		// create circular list instance
		CircularLinkedList clList = new CircularLinkedList();

		System.out.println("List is empty : " + clList.isEmpty());
		System.out.println("List size : " + clList.getSize());

		System.out.println("-----------------------");

		clList.add(employee1);
		clList.add(employee2);
		clList.add(employee3);
		clList.add(employee4);

		System.out.println("List is empty : " + clList.isEmpty());
		System.out.println("List size : " + clList.getSize());

		System.out.println("-----------------------");

		 Node removedNode = clList.remove();

		System.out.println("Removed node :" + removedNode);

		clList.printList();

	}

}