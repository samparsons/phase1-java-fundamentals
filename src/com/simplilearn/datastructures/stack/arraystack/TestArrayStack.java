package com.simplilearn.datastructures.stack.arraystack;

public class TestArrayStack {

	public static void main(String[] args) {
		Employee emp1 = new Employee(01, "Sam", "IT", 1000000.00d);
		Employee emp2 = new Employee(02, "Jim", "Sales", 1200000.00d);
		Employee emp3 = new Employee(03, "Sara", "Marketing", 900000.00d);
		Employee emp4 = new Employee(04, "Marabai", "Administration", 10000000.00d);
		
		ArrayStack stack = new ArrayStack(2);
		
		System.out.println("stack size: "+stack.size());
		System.out.println("stack capacity: "+stack.capacity());
		System.out.println("stack is empty: "+stack.isEmpty());
		System.out.println("-----------------");
		
		stack.push(emp1);
		stack.push(emp2);
		System.out.println("stack size: "+stack.size());
		System.out.println("stack capacity: "+stack.capacity());
		System.out.println("stack is empty: "+stack.isEmpty());
		System.out.println("-----------------");
		stack.push(emp3);
		stack.push(emp4);
		System.out.println("stack size: "+stack.size());
		System.out.println("stack capacity: "+stack.capacity());
		System.out.println("stack is empty: "+stack.isEmpty());
		System.out.println("-----------------");
		System.out.println("stack top: "+stack.peek());
		System.out.println("-----------------");
		stack.printStack();
		System.out.println("-----------------");
		System.out.println("stack pop: "+stack.pop());
		System.out.println("-----------------");
		stack.printStack();
		

	}

}
