package com.simplilearn.collections.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {
		
		// create a new thread for John
		John thread1 = new John();
		thread1.start();
		
		// create a new thread for Sam
		Sam thread2 = new Sam();
		thread2.start();
		
		// create a new thread for Azhar
		Azhar thread3 = new Azhar();
		thread3.start();
		
		
	}

}

class Task {
	public void updateWork() {}

}

class John extends Thread { /* Task { error bc you cannot have multiple inheritance. If you want this case, multiple classes using a thread, use a runnable class.*/
	
	@Override
	public void run() {
	       // thread processing logic
			System.out.println("John Thread is running ...");
	    }
	
}

class Sam extends Thread {
	
	@Override
	public void run() {
	       // thread processing logic
			System.out.println("Sam Thread is running ...");
	    }
	
}

class Azhar extends Thread {
	
	@Override
	public void run() {
	       // thread processing logic
			System.out.println("Azhar Thread is running ...");
	    }
	
}

