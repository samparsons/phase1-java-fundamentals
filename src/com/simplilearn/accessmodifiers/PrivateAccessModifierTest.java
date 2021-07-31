package com.simplilearn.accessmodifiers;

public class PrivateAccessModifierTest {

	public static void main(String[] args) {
		Account account = new Account();
		
		// private property access  > // compile time error
		/*
		 * All the below give a 'the field [field] is not visible'
		 * System.out.println(account.id);
		 * System.out.println(account.balance);
		 * System.out.println(account.username);
		 * System.out.println(account.password);
		 * account.showBalance();
		 */
		
		
		
		account.showUser();
	}

}

class Account {
	// data members : properties
	private long id = 100001;
	private double balance = 740394.432;
	private String username = "mike123";
	private String password = "mike@123";
	
	// private methods
	private double showBalance() {
		return balance;
	}
	
	public long showId() {
		return id;
	}
	
	public void showUser() {
		System.out.println("The user : "+username);
	}
	// private constructor
	// Note : Private Constructor based class can not be instantiated.
	Account() { };
}