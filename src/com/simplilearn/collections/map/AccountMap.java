package com.simplilearn.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccountMap {
	
	public static void main(String[] args) {
		
		Account account1 = new Account(1001,"Winterfell",5123.09);
		Account account2 = new Account(1002,"Harkkonen",1243.09);
		Account account3 = new Account(1003,"Targaryen",1223.09);
		Account account4 = new Account(1004,"Baratheon",1213.09);
		
		Map<Long,Account> accountMap = new LinkedHashMap<Long,Account>();
		
		accountMap.put(700001L, account1);
		accountMap.put(700002L, account2);
		accountMap.put(700003L, account3);
		accountMap.put(700004L, account4);
		
		System.out.println(accountMap);
		
		System.out.println("---------------------------");
		
		for(Map.Entry<Long, Account> a : accountMap.entrySet()) {
			System.out.println("Account object: "+a);
			System.out.println("Account key: "+a.getKey());
			System.out.println("Account value: "+a.getValue());
			
		}
		
		System.out.println("---------------------------");
		System.out.println("Account object: "+accountMap.get(700001L));

	}

}
