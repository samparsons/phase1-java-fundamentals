package com.simplilearn.innerclass;

public class Bank {
	private int accountNumber;
	private String name;
	private String email;
	private long phone;
	private int creditScore;
	private double balance;
	private String state;
	
	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getState() {
		return name;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Bank(int accountNumber, String name, String email, long phone, int creditScore, double balance, String state) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.creditScore = creditScore;
		this.balance = balance;
		this.state = state;
	}

	public Bank() {
		super();
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", creditScore=" + creditScore + ", balance=" + balance + ", state="+ state +"]";
	}
	
	

}
