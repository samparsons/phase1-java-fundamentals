package com.simplilearn.collections.map;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.simplilearn.innerclass.Bank;

public class UPMap {
	public static void main(String[] args) {
		// WAP for un & pw map that uses un as key and pw as value. 
		// login and registration by taking user input.
		
		TreeMap<String,String> mapOfUsers = new TreeMap<String,String>();
		mapOfUsers.put("sp123", "pw1");
		mapOfUsers.put("as123", "pw2");
		mapOfUsers.put("gb123", "pw3");
		mapOfUsers.put("js123", "pw4");
		
		System.out.println(mapOfUsers);
		System.out.println(mapOfUsers.descendingMap());
		
		//login
		//verify user exists. verify that pw matches.
		
		boolean until = true;
		System.out.println("------------------------------------------------------------------");
		System.out.println(" :: Welcome to the PW changer				::");
		System.out.println("------------------------------------------------------------------");
		String username = null;
		
		//run until registration or quit
		while(until) {
			if(username == null) {
				System.out.println(" :: Please enter you username.				::");
				Scanner input1 			= new Scanner(System.in);
				String usernameIn 	= input1.nextLine();
				String usernameSearch = mapOfUsers.get(usernameIn);
				if(Objects.isNull(usernameSearch)) { 
					//registration
					//if user does not exists. collect un and pw. then verify by login.
					System.out.println("------------------------------------------------------------------");
					System.out.println(" :: Username not found. Enter a username.				::");
					Scanner input2 			= new Scanner(System.in);
					String regUsernameIn 	= input2.nextLine();
					System.out.println("------------------------------------------------------------------");
					System.out.println(" :: Enter a password.				::");
					Scanner input3 			= new Scanner(System.in);
					String pwIn 	= input3.nextLine();
					mapOfUsers.put(regUsernameIn,pwIn);
					System.out.println("------------------------------------------------------------------");
					System.out.println(" :: You are registered. Your new username and password are below ::");
					System.out.println(" :: Username:"+regUsernameIn+" | password: "+mapOfUsers.get(usernameIn)+" ::");
					System.out.println(" :: Keep going until you can update your password. ::");
					System.out.println("------------------------------------------------------------------");
				}else {
					//change pw
					System.out.println(" :: Username found. Please update your password.	::");
					Scanner input4 			= new Scanner(System.in);
					String updatePwIn 	= input4.nextLine();
					mapOfUsers.put(usernameIn,updatePwIn);
					System.out.println(" :: You have updated your pasword. Your username and new password are below ::");
					for(Entry<String,String> user :  mapOfUsers.entrySet()) {
						if(user.getKey().equals(usernameIn)) {
						System.out.println(" :: Username: "+user.getKey()+" | password: "+user.getValue()+" ::");
						}
					}
					System.out.println(" :: Thank you, you are done! ::");
					
					until = false;
					
				}
			}
			
					
		}
	}

}
