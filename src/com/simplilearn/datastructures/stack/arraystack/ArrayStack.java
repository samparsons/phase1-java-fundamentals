package com.simplilearn.datastructures.stack.arraystack;

import java.util.EmptyStackException;

public class ArrayStack {
	private Employee[] stack;
	private int top;
	
	// first method - create stack
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public int capacity() {
		return stack.length;
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	// push => add element into stack
	public void push(Employee data) {
		// make stack auto growable to avoid stack overflow error
		if(top==stack.length) {
			// double the size of stack
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}

		// add value in stack
		stack[top++]= data;
	}
	
	public Employee pop() {
		// verify if empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		Employee removeNode = stack[--top];
		stack[top] = null;
		return removeNode;
	}
	
	public Employee peek() {
		// verify if empty
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack[top-1];
	}
	
	public void printStack() {
		System.out.println("top =>");
		for(int i = top-1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
	
}
