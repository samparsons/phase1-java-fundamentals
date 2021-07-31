package com.simplilearn.methods.bank;

public class BankOperations {
	
	public double showBalance(Account account) {
		System.out.println("The account " + account.accNo +" has Balance: "+account.balance);
		return account.balance;
	}
	
	public double withdrawAmount(Account account,double amount) {
		if(amount>0 || amount<account.balance) {
			account.balance -= amount; 
			return account.balance;
		} else {
			System.out.println("Invalid Withdraw Amount");
			return 0;
		}
		
	}
	
	
}
