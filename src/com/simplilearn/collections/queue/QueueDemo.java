package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// example of people standing in a queue and each person is holding a token.
		//Queue works in first in, first out order (FIFO).
		
		Queue<String> peopleQueue = new ArrayDeque<>();
		
		peopleQueue.add("Jon");
		peopleQueue.add("Robb");
		peopleQueue.add("Sansa");
		peopleQueue.add("Arya");
		peopleQueue.add("Rickon");
		
		// peek element - shows head element
		System.out.println("---------------------------");
		System.out.println("See Head (peek): "+peopleQueue.peek());
		
		// element method
		System.out.println("---------------------------");
		System.out.println("See Head (element): "+peopleQueue.element());
		
		// print and remove
		System.out.println("---------------------------");
		System.out.println("Remove Head (poll): "+peopleQueue.poll());
		System.out.println("See Head (peek): "+peopleQueue.peek());
		
		// Iterate over a queue
		System.out.println("---------------------------");
		for(String elem : peopleQueue) {
			System.out.println("Name in queue: "+elem);
		}
		
		// PriorirtyQueue: Does not maintain the FIFO order. 
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		Queue<String> bankQueue = new PriorityQueue<String>();
		
		bankQueue.add("Danerys");
		bankQueue.add("Rhaegar");
		bankQueue.add("Aerys II");
		bankQueue.add("Viserys");
		
		// Iterate over a queue
		System.out.println("---------------------------");
		for(String elem : bankQueue) {
			System.out.println("Name in queue: "+elem);
		}
		
		// Deque example
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
		deque.add(100);
		deque.add(200);
		deque.add(300);
		deque.add(400);
		deque.addFirst(50);
		deque.addLast(500);
		
		for(int elem : deque) {
			System.out.println("value in queue: "+elem);
		}
		
		
		
				

	}

}
