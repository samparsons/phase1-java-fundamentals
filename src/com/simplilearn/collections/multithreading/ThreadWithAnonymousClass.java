package com.simplilearn.collections.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		// writing an implementation of object class. Runnable() is a functional interface that we can implement with an anonymous class.
		Runnable obj1 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Thread ABC is running ...");
				}
				
			}
		};
		
		Runnable obj2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Thread XYZ is running ...");
				}
				
			}
		};
		
		Thread thread1 = new Thread(obj1);
		thread1.start();
		
		Thread thread2 = new Thread(obj2);
		thread2.start();
		
		// but you dont even need the Runnable objects.
		
		Thread thread3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Thread ABC2 is running ...");
				}
				
			}
		});
		thread3.start();
		
		Thread thread4 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Thread XYZ2 is running ...");
				}
				
			}
		});
		thread4.start();
		
	

	}

}
