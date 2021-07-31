package com.simplilearn.arrays;

import java.util.Scanner;

public class BankOperationWhile {
	static boolean until = true;
	public static void main(String[] args) {
		String[] usernames 	= {"Jon Snow","Robb Stark","Sansa Stark","Arya Stark","Rickon Stark"};
		int[] userIds 	= {1001,1002,1003,1004,1005};
		double[] balances = {76552.30,23423.45,65482.45,8979462.54,6548236.45};
		int match 	= 0;
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println(" :: Welcome to show balance feature of Iron Bank ::");
		
		while (until) {
			System.out.println(" ::    Enter a UserId    ::");
			int userId 	= input.nextInt();
			System.out.println("---------------------------");
			
			//find a userId
			for(int index=0;index<userIds.length;index++) {
				
				//match user given userId with existing userId elements in the array
				if(userIds[index]==userId) {
					System.out.println("User is found with UserId: "+userId);
					System.out.println("User account is: "+usernames[index]);
					System.out.println("User balance is: "+balances[index]);
					match++;
					until = false;
				}
			}
			if(match==0) {
				System.out.println("User is not found with UserId "+userId);
			}
		}
	}
}