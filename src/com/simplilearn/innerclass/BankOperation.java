package com.simplilearn.innerclass;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import com.simplilearn.innerclass.Bank.Banking;
import com.simplilearn.innerclass.OuterTest2.InnerTest;


public class BankOperation {
	
	public static void main(String[] args) {
		// WAP for collecting Bank details in a map. key as Bank number, value as Bank object.
		// operations - 
		// showBalance() - pass an Bank id and show balance. 
		//withdraw() - pass an Bank id and decrease amount to balanace. 
		//closeBank() - .remove() value from map
		
		Bank bank1 = new Bank(1001,"Jon Snow",			"bastarts@gmail.com", 	5555551234L, 780, 5123.09,"open");
		Bank bank2 = new Bank(1002,"Arya Stark",		"needle@gmail.com", 	5555551234L, 640, 1243.09,"open");
		Bank bank3 = new Bank(1003,"Danerys Targaryen",	"dragonz@yahoo.com", 	5555551234L, 500, 1223.09,"open");
		Bank bank4 = new Bank(1004,"Renly Baratheon",	"rendo@gmail.com", 		5555551234L, 310, 1213.09,"open");
		
		Map<Long,Bank> bankMap = new LinkedHashMap<Long,Bank>();
		
		bankMap.put(1L,bank1);
		bankMap.put(2L,bank2);
		bankMap.put(3L,bank3);
		bankMap.put(4L,bank4);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println(" :: Welcome to the Iron Bank of Braavos				::");
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Enter your bank account number below.");
		Scanner input1 			= new Scanner(System.in);
		long bankid 	= input1.nextLong();
		
		Bank account = bankMap.get(bankid);
		if(!Objects.isNull(account)) {
			Integer accountNumber = account.getAccountNumber();
			String name = account.getName();
			//String email = account.getEmail();
			//long phone = account.getPhone();
			//int creditScore = account.getCreditScore();
			//double balance = account.getBalance();
			
			System.out.println("------------------------------------------------------------------");
			System.out.println(" :: Hello "+name+"! What would you like to do today?		::");
			System.out.println("------------------------------------------------------------------");
			System.out.println(" :: Options Below						::");
			System.out.println("------------------------------------------------------------------");
			System.out.println(" :: AccountNo: 		"+accountNumber+" 					::");
			System.out.println(" :: See balance: 	type 'balance' 				::");
			System.out.println(" :: Make deposit: 	type 'deposit' 				::");
			System.out.println(" :: Make withdrawal: 	type 'withdraw' 			::");
			System.out.println(" :: Close account: 	type 'close' 				::");
			System.out.println(" :: Quit: 		type 'quit' 				::");
			System.out.println("------------------------------------------------------------------");
			
			
			boolean until = true;
			while(until) {
				System.out.println("Choose an option above. What would you like to do today?");
				Scanner input2 			= new Scanner(System.in);
				String userResponse 	= input2.nextLine();
				
				// Get user balance
				if(userResponse.toLowerCase().equals("balance")) {
					System.out.println("Your balance is "+account.getBalance()+".");
					System.out.println("------------------------------------------------------------------");
				}
				
				// Make a deposit
				if(userResponse.toLowerCase().equals("deposit")) {
					System.out.println("How much would you like to deposit?");
					Scanner deposit 	= new Scanner(System.in);
					double depositAmt 	= deposit.nextDouble();
					//Banking method deposit.
					Banking banking = new Bank.Banking();
					double newBalance = banking.deposit(account,depositAmt);
					System.out.println("You have successfully deposited: $"+depositAmt);
					System.out.println("Your new balance is: $"+newBalance);
					System.out.println("------------------------------------------------------------------");
				}
				
				// Make a withdrawal
				if (userResponse.toLowerCase().equals("withdraw")) {
					System.out.println("How much would you like to withdraw?");
					Scanner withdraw 	= new Scanner(System.in);
					double withdrawAmt 	= withdraw.nextDouble();
					Banking banking = new Bank.Banking();
					banking.withdraw(account, withdrawAmt);
					System.out.println("Your new balance is: $"+account.getBalance());					
					System.out.println("------------------------------------------------------------------");
				}
				
				
				if (userResponse.toLowerCase().equals("close")) {
					Banking banking = new Bank.Banking();
					banking.closeAccount(bankMap,bankid);
					System.out.println("You're now being logged out. Thank you, we're sorry to lose you!");
					System.out.println("Goodbye!");
					System.out.println("------------------------------------------------------------------");
					until = false;
				}
				
				if (userResponse.toLowerCase().equals("quit")) {
					System.out.println("------------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Goodbye!");
					System.out.println("------------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------");
					System.out.println("------------------------------------------------------------------");
					until = false;
				}
			}
		}else {
			System.out.println("Sorry, your account was not found. Try again.");
		}
			
		
		
		
		
		
		
		
	}
	

}

