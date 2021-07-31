package com.simplilearn.arrays.pingsystem;

import java.util.Arrays;
import java.util.Scanner;

public class EPSystem {

	public static void main(String[] args) {
		// create user array, email array, and password array. return the valid password for the emails. 
		
		// TODO WAP to collect email from user, verify that emails with users[], show relevant password. -> method showEmailPassword()
		// 2. based on email, change password. update the value in that index level. -> updatePasswordBasedOnEmail()
		
		String[] usernames 	= {"Jon Snow","Robb Stark","Sansa Stark","Arya Stark","Rickon Stark"};
		String[] emails 	= {"jsnow@gmail.com","a@a","fire@yahoo.com","noname@braavos.com","dags@shaggy.com"};
		String[] passwords = {"dany123","redwedding","anyonebutlittlefinger","hotpie","shaggy"};

		System.out.println("------------------------------");
		System.out.println(" :: Welcome to PW Changer ::");
		System.out.println("------------------------------");
		
		
		// make sure the email matches a value in the emails array.
		
				
				
		boolean until = true;
		int match = 0;
		
		//allow for pw confirmation
		while(until) {
			System.out.println("What is your email address (To quit type: N)?");
			Scanner input1 			= new Scanner(System.in);
			String userResponse1 	= input1.nextLine();
			if (userResponse1.equals("Q")) {
				System.out.println("Goodbye!");
				match++;
				until = false;
			}
			for(int index=0;index<emails.length;index++) {
				if(userResponse1.equals(emails[index])) {
					// allow for pw change
					System.out.println("What is your new password?");
					Scanner input2 			= new Scanner(System.in);
					String userResponse2 	= input2.nextLine();
					System.out.println("Your old password is "+passwords[index]+". Your new password is '"+userResponse2+"' - is that ok? Y or N");
					Scanner input3 			= new Scanner(System.in);
					String userResponse3 	= input3.nextLine();
					if(userResponse3.equals("Y")) {
						passwords[index] = userResponse2;
						System.out.println("Your password is updated to "+userResponse2+"!");
						System.out.println("pw check, index #"+index+" : "+Arrays.toString(passwords));
						match++;
						until = false;
					} else {
						System.out.println("No changes made!");
						match++;
					}
				} 
				
			}
			if(match == 0) {
				System.out.println("No Match");
	
			}
		}

	}

}
