package com.simplilearn.exceptionHandling.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BankOperation {

	public static void main(String[] args) {
		
		//account list
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account(1001,"Robb Stark",6547895));
		accounts.add(new Account(1002,"Sansa Stark",6547896));
		accounts.add(new Account(1003,"Arya Stark",6547897));
		accounts.add(new Account(1004,"Rickon Stark",6547898));
		accounts.add(new Account(1005,"Bran Stark",6547899));
		accounts.add(new Account(1006,"Jon Snow",6547890));
		
		showBalance(1001,accounts);
		showBalance(1007,accounts);
		
		try {
			depositAmount(1002,accounts,3215);
		} catch (InvalidTransactionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	//show balance
	private static Account showBalance(int accNo,List<Account> accounts) {
		try {
			int count = 0;
			for(Account acc : accounts) {
				if (acc.accNo == accNo) {
					System.out.println("The Account: "+acc.accNo);
					System.out.println("The user: "+acc.name);
					System.out.println("The balance: "+acc.balance);
					count++;
				}
			}
				if(count==0) {
					throw new AccountNotFoundException("Account does not exist with accNo: "+accNo);
				}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	//deposit
	private static void depositAmount(int accNo, List<Account> accounts, int depositAmount) throws InvalidTransactionException {
		int count = 0;
		for(Account acc : accounts) {
			if (acc.accNo == accNo) {
				if(depositAmount >0 ) {
					System.out.println("Current Balance: "+acc.balance);
					acc.balance += depositAmount;
					showBalance(accNo,accounts);
				}else {
					throw new InvalidTransactionException("Invalid deposit amount.");
				}
				count++;
			}
		}
		if(count == 0) {
			throw new AccountNotFoundException("Account does not exist with accNo: "+accNo);
		}

		
	}
	
	
	//withdraw
	
}

	
