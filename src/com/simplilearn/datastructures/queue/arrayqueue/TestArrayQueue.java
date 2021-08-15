package com.simplilearn.datastructures.queue.arrayqueue;

public class TestArrayQueue {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000.00d);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000.00d);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000.00d);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000.00d);
		
		ArrayQueue queue = new ArrayQueue(2);
		
		System.out.println("stack size: "+queue.size());
		System.out.println("stack capacity: "+queue.capacity());
		System.out.println("-----------------");
		
		queue.add(emp1);
		queue.add(emp2);
		
		System.out.println("stack size: "+queue.size());
		System.out.println("stack capacity: "+queue.capacity());
		System.out.println("-----------------");
		
		queue.add(emp3);
		queue.add(emp4);
		
		System.out.println("stack size: "+queue.size());
		System.out.println("stack capacity: "+queue.capacity());
		System.out.println("-----------------");
		System.out.println("peek: "+queue.peek());
		System.out.println("-----------------");
		queue.printStack();
		System.out.println("-----------------");
		System.out.println("remove: "+queue.remove());
		System.out.println("-----------------");
		queue.printStack();


	}

}
