package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// map uses key:value pairs.
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		phoneBook.put("Robb",5555554677L);
		phoneBook.put("Arya",5555554678L);
		phoneBook.put("Sansa",5555554679L);
		phoneBook.put("Bran",5555554680L);
		
		// see all
		System.out.println(phoneBook);
		// get with key value
		System.out.println("Find Robb's number: "+phoneBook.get("Robb"));
		System.out.println("Find Arya's number: "+phoneBook.get("Arya"));
		//iterate map
		for(Map.Entry<String,Long> entry : phoneBook.entrySet()) {
			System.out.println("Key : "+entry.getKey());
			System.out.println("Key : "+entry.getValue());
		}
		
	}

}
