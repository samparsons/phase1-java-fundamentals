package com.simplilearn.collections.multithreading;

public class ThreadWithLambda {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
				for(int i=0;i<30;i++) {
					System.out.println("Thread ABC lambda is running ...");
				}
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i=0;i<1;i++) {
				System.out.println("Thread XYZ lambda is running ...");
			}
		});
		
		Thread thread3 = new Thread(() -> {
			for(int i=0;i<1;i++) {
				System.out.println("Thread XYZ lambda is running ...");
			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
