package com.simplilearn.methods.bank;

public class Account {

	long accNo;
	double balance;
	String userName;
	String bankName;
	
	// constructor 
	Account(){ }
	
	// one parameterized constructor
	Account(long accNo){
		this.accNo = accNo;
	}
	
	// two parameterized constructor
	Account(long accNo,double balance){
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// multi parameterized constructor
	Account(long accNo,double balance,String userName,String bankName){
		this.accNo = accNo;
		this.balance = balance;
		this.userName = userName;
		this.bankName = bankName;
	}

}
