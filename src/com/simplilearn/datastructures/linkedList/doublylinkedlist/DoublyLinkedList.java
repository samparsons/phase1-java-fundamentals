package com.simplilearn.datastructures.linkedList.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	// DoubleLinkedList Operations
	
	// get size
	public int getSize() {
		return size;
	}
	// is empty
	public boolean isEmpty() {
		return head == null;
	}
	// add element to front
	public void addToFront(Employee data) {
		// create a node
		Node node = new Node(data);
		
		//if list empty head and tail are same
		if(isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		
		// new node as head
		head = node;
		size++;
	}
	// add element to end
	public void addToEnd(Employee data) {
		// create a node
		Node node = new Node(data);
		
		if(isEmpty()) {
			head=node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
			
		// tail will be new node
		tail = node;
		size++;
	}
	// remove element from front
	public Node removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		Node removedNode = head;
		// if only one element in list:
		if(head.getNext()==null) {
			tail = null;
		} else { // otherwise more than one:
			head.getNext().setPrevious(null);
			
		}
		
		head = head.getNext();
		size--;
		removedNode.setData(null);
		return removedNode;
	}
	// remove element from end
	public Node removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		Node removedNode = tail;
		if(tail.getPrevious()==null) {
			head=null;
		} else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	// print list
	public void printList() {
		Node current = head;
		System.out.println("Head =>");
		while (current != null) {
			System.out.println(current.getData());
			System.out.println("< = >");
			current = current.getNext();
		}
		System.out.println("<= Tail");
	}

}
