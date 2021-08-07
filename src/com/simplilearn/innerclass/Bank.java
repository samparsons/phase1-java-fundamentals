package com.simplilearn.innerclass;

import java.util.Map;

public class Bank {
	private int accountNumber;
	private String name;
	private String email;
	private long phone;
	private int creditScore;
	private double balance;
	private String state;
	
	
	static class Banking {
		public double deposit(Bank b, double deposit) {
			b.balance = b.balance + deposit;
			return b.balance; 
		}
		
		static public void withdraw(Bank b,double withdraw) {
			double newBalance	= b.balance - withdraw;
			if(newBalance >= 0) {
				System.out.println("You have successfully withdrawn: $"+withdraw);
				b.balance = newBalance;
			}else{
				System.out.println("You did not have enough to withdraw: $"+withdraw);
				System.out.println("We have withdrawn: $"+b.balance);
				b.balance = 0.00d;
			}
		}
		
		public void closeAccount(Map<Long,Bank> m,long id) {
			System.out.println("Removing your account number "+id+" now...");
			m.remove(id);
			System.out.println("verification step. Account number "+id+"check result:"+m.get(id));
		}
		
	}

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
