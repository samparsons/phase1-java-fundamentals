package com.simplilearn.datastructures.queue.arrayqueue;

import java.util.EmptyStackException;

public class ArrayQueue {
	private Employee[] queue;
	private int front;
	private int rear;
	
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public int size() {
		return rear - front;
	}
	
	public int capacity() {
		return queue.length;
	}
	
	// add => add element into stack
		public void add(Employee emp1) {
			// make queue auto growable to avoid stack overflow error
			if(rear == queue.length) {
				// double the size of stack
				Employee[] newArr = new Employee[2*queue.length];
				System.arraycopy(queue, 0, newArr, 0, queue.length);
				queue = newArr;
			}
			// add value in stack
			queue[rear++]= emp1;
		}
		
		public Employee remove() {
			// verify if empty
			if(size()==0) {
				rear = 0;
				front = 0;
				return null;
			}
			
			Employee removeNode = queue[front];
			queue[++front] = null;
			return removeNode;
		}
		
		public Employee peek() {
			// verify if empty
			if(size()==0) {
				rear = 0;
				front = 0;
				return null;
			}
			
			return  queue[front];
		}
		
		public void printStack() {
			System.out.println("front =>");
			for(int i = front; i < rear; i++) {
				System.out.println(queue[i]);
			}
			System.out.println("<= rear");
		}
}
