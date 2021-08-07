package com.simplilearn.collections.multithreading;

class Customer {
	double balance = 1000.0;
	
	synchronized void deposit(double amount) {
		System.out.println("Going to deposit ...");
		balance += amount;
		System.out.println("Deposit completed & new balance = "+balance);
		notify();
	}
	
	synchronized void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("Insufficient Funds ...");
			try {
				wait(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		balance -= amount;
		System.out.println("Withdraw completed & new balance = "+balance);
	}
	
	synchronized void showBalance() {
		System.out.println("Your balance is: "+balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {
		// create customer object
		Customer customer = new Customer();
		
		
		Thread t1 = new Thread(()-> {
			customer.withdraw(3000);
		});
		Thread t2 = new Thread(()-> {
			customer.showBalance();
		});
		Thread t3 = new Thread(()-> {
			customer.deposit(50000);
		});
		
		
		t1.start();
		t2.start();
		t3.start();
	}
}
