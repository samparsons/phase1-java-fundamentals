package com.simplilearn.arrays.pingsystem;

import java.util.Scanner;

public class PingSystem {
	public static void main(String[] args) {
		//TODO: A range Ip Addresses you should ping and validate each ip address
		
		String[] ipAddresses = {"192.168.0.1","", "192.168.0.2"};
		System.out.println("------------------------------");
		System.out.println(" :: Welcome to IP Validator ::");
		System.out.println("------------------------------");
		
		for(String ip : ipAddresses) {
			System.out.println("Is this ip ("+ip+") a valid ip? Y or N");
			Scanner input 			= new Scanner(System.in);
			String userResponse 	= input.nextLine();
			System.out.println("Your answer is: "+userResponse);
		}
		
		
	}
}
