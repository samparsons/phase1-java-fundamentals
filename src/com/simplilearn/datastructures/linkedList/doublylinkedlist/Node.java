package com.simplilearn.datastructures.linkedList.doublylinkedlist;

public class Node {
	private Node previous;
	private Node next;
	private Employee data;
	
	public Node(Employee data) {
		this.data = data;
	}
	
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	
	
	public Node(Node previous, Node next, Employee data) {
		super();
		this.previous = previous;
		this.next = next;
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Node [previous=" + previous + ", next=" + next + "]";
	}
	
	
}
