package com.simplilearn.methods.bank;

public class Test {
	public static void main(String[] args) {
		BankOperations operations = new BankOperations();
		
		Account account = new Account(100001, 5000,"Jon Snow","Iron Bank");
		
		operations.showBalance(account);
		operations.withdrawAmount(account,1000);
		operations.showBalance(account);
		//to do: add deposit, add 
		
		
	}

}
