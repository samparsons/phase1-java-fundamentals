package com.simplilearn.datastructures.linkedList.circularLinkedList;

public class CircularLinkedList {
	
	// head node
	private Node head;
	private Node tail;
	private int size;
	
	//linked list operations
	
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list is empty
		if(isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		
		// set head as new node.
		tail = node;
		// for circular linked list last node should be point to head.
		tail.setNext(head);
		size++;
	}
	
	// remove element
	public Node remove() {
		// verify linked empty
		if(isEmpty()) {
			return null;
		}
		// set removed node
		Node removedNode = head;
		// set next node in the list as head
		head = head.getNext();
		size--;
		
		//nullify the removed node
		removedNode.setNext(null);
		//change tail next node reference for circular linked  list
		tail.setNext(head);
		return removedNode;		
	}
	
	// print list
	public void printList() {
		
		Node current = head;
		
		if(current == null) {
			System.out.println("Circular Linked list is empty !");
		} else {
			System.out.println("Head -> ");
			do {
				if( current != null) {
					System.out.println(current.getData());
					System.out.println("=>");
					current = current.getNext();
				}				
			} while(current != head);
		}
		
	}
	
	
}