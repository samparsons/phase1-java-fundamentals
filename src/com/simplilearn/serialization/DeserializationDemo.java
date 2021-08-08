package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		
		try {
			// 1. read a file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// 2. create input stream object
			ObjectInputStream in = new ObjectInputStream(file);
			
			// 3. deserialize object
			Employee employee = (Employee) in.readObject();
			
			System.out.println("deserialization complete");
			System.out.println("------------------------");
			System.out.println("employee id= "+employee.getId());
			System.out.println("employee dept= "+employee.getDept());
			System.out.println("employee id= "+employee.getName());
			System.out.println("employee id= "+employee.getSalary());
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
