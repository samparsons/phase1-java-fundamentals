package com.simplilearn.collections.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		Bob bob = new Bob();
		Thread thread1 = new Thread(bob);
		thread1.start();
		
		Mark mark = new Mark();
		Thread thread2 = new Thread(mark);
		thread2.start();
		
		//bob.updateWork();
		
		

	}

}

class Work {
	public void updateWork() {
		System.out.println("UpdateWork");
	}
}

class Bob extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("Bob is running ...");
		
	}
	
}

class Mark implements Runnable {
	@Override
	public void run() {
		System.out.println("Mark is running ...");
		
	}
	
}