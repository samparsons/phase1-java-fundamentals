package com.simplilearn.collections.multithreading;

public class ThreadWithSleep {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()-> {
			System.out.println("Thread t1 is working");
		});
		Thread t2 = new Thread(()-> {
			System.out.println("Thread t2 is working");
		});
		Thread t3 = new Thread(()-> {
			System.out.println("Thread t3 is working");
		});
		
		t1.start();
		t2.sleep(5000);
		t2.start();
	}
	

}
