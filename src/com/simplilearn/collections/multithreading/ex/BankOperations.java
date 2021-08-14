package com.simplilearn.collections.multithreading.ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Bank {
	private String username;
	private String password;
	private boolean auth;
	private int accNo;
	private String name;
	private String email;
	private long phone;
	private int creditScore;
	private double balance;
	private String state;
		
	
	protected String getUsername() {
		return username;
	}

	protected void setUsername(String username) {
		this.username = username;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
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
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Bank(String username, String password, int accNo, String name, String email, long phone, int creditScore,
			double balance, String state) {
		super();
		this.username = username;
		this.password = password;
		this.accNo = accNo;
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
		return "Bank [username=" + username + ", password=" + password + ", accNo=" + accNo + ", name=" + name
				+ ", email=" + email + ", phone=" + phone + ", creditScore=" + creditScore + ", balance=" + balance
				+ ", state=" + state + "]";
	}

	public synchronized void auth(Bank b,String un,String pw,int count) {
		if(count < 3) {
			if(un.equalsIgnoreCase(b.username)) {
				if(pw.equals(b.password)) {
					System.out.println("Success, logging in now.");
					b.setAuth(true);
				} else {
					System.out.println("Invaid password. Try again.");
					count++;
				}
			}else {
				System.out.println("Invalid Username. Try again.");
				count++;
			}
		}else {
			System.out.println("You've exceeded the allowable attempts. Terminating this session.");
			boolean until = false;
		}
	}
	
	public synchronized double showBalance(Bank b,int accNo) {
		return b.balance;
	}
	
	public synchronized void withdraw(Bank b,int accNo,double withdrawAmt) {
		if(withdrawAmt > b.balance) {
			System.out.println("Your withdraw amount is greater than your current balance.");
			
		}else if(withdrawAmt < 0) {
			System.out.println("Invalid withdraw amount. Must be greater than $0.00");
		}else {
			System.out.println("Withdraw commencing...");
			b.balance -= withdrawAmt;
			System.out.println("Your new balance is $"+b.balance);
		}
	}
	
	public synchronized void deposit(Bank b,int accNo,double depositAmt) {
		
	}

	
	
}

public class BankOperations {
	
	int authAccNo = 0;
	
	boolean auth = false;
	public static void main(String[] args) {
		// write a thread safe operation for a bank
		// showBalance, withdraw, deposit, etc. 
		//use sleep, wait, notify, notify all
		
		Bank bank1 = new Bank("js","pw",1001,"Jon Snow","bastarts@gmail.com",	5555551234L, 780, 5123.09,"open");
		Bank bank2 = new Bank("as","pw",1002,"Arya Stark",		"needle@gmail.com", 	5555551234L, 640, 1243.09,"open");
		Bank bank3 = new Bank("dt","pw",1003,"Danerys Targaryen",	"dragonz@yahoo.com", 	5555551234L, 500, 1223.09,"open");
		Bank bank4 = new Bank("rb","pw",1004,"Renly Baratheon",	"rendo@gmail.com", 		5555551234L, 310, 1213.09,"open");
		
		Map<Long,Bank> bankMap = new LinkedHashMap<Long,Bank>();
		
		bankMap.put(1L,bank1);
		bankMap.put(2L,bank2);
		bankMap.put(3L,bank3);
		bankMap.put(4L,bank4);
		
		
		
		System.out.println("------------------------------------------------------------------");
		System.out.println(" :: Welcome to the Iron Bank of Braavos				::");
		System.out.println("------------------------------------------------------------------");
		
		
			
			
				int count = 0;
				boolean until = true;
				while(until) {
					System.out.println("Enter your bank account number below.");
					System.out.println("count: "+count);
					Scanner input1 			= new Scanner(System.in);
					long bankid 	= input1.nextLong();
					
					Bank account = bankMap.get(bankid);
					if(!Objects.isNull(account)) {
						System.out.println("Enter your bank username below.");
						Scanner input2 			= new Scanner(System.in);
						String un 	= input2.nextLine();
						
						System.out.println("Enter your bank password below.");
						Scanner input3 			= new Scanner(System.in);
						String pw 	= input3.nextLine();
						
						account.auth(account, un, pw, count);
					
					if(account.getAuth()==true) {
						Integer accNo = account.getAccNo();
						String name = account.getName();				
						System.out.println("------------------------------------------------------------------");
						System.out.println(" :: Hello "+name+"! What would you like to do today?		::");
						System.out.println("------------------------------------------------------------------");
						System.out.println(" :: Options Below						::");
						System.out.println("------------------------------------------------------------------");
						System.out.println(" :: AccountNo: 		"+accNo+" 					::");
						//Banking
						System.out.println(" :: See balance: 	type 'balance' 				::");
						System.out.println(" :: Make deposit: 	type 'deposit' 				::");
						System.out.println(" :: Make withdrawal: 	type 'withdraw' 			::");
						//Finance
						//others - need to check (insurance?)
						System.out.println(" :: Close account: 	type 'close' 				::");
						System.out.println(" :: Quit: 		type 'quit' 				::");
						System.out.println("------------------------------------------------------------------");
					System.out.println("Choose an option above. What would you like to do today?");
					Scanner input4 			= new Scanner(System.in);
					String userResponse 	= input4.nextLine();
				}
					
				}
			}
		
	}

}
