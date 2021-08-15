package com.simplilearn.filehandling.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Examples {
	static String root = "/home/sparsonssalesfo/PG2-workspace/phase1-java-fundamentals-07-24-2021/"; 

	public static void main(String[] args) {
		// make a directory
		System.out.println("Enter the path to create a directory: ");
		Scanner sc = new Scanner(System.in);
		String path = sc.next();
		createDir(path);
		System.out.println("Enter the filename to create within "+path+": ");
		Scanner fn = new Scanner(System.in);
		String filename = fn.next();
		createFileUsingFileClass(path,filename);
		
		try {
			// 1. read a file
			FileInputStream file = new FileInputStream(path+"/"+filename);
			
			// 2. create input stream object
			ObjectInputStream in = new ObjectInputStream(file);
			
			// 3. deserialize object
			Employee employee = (Employee) in.readObject();
			
			System.out.println("deserialization complete");
			System.out.println("------------------------");
			System.out.println("employee id= "+employee.getId());
			System.out.println("employee id= "+employee.getName());
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	//classes to read, write, copy, delete a file.
	//1-create a dir, and add a file within the folder.
	//2-create a file, and add object data to the file (serialization / deserialzation)
	//3- 	Bank : showBalance, deposit, withdraw. Make sure to convert the stream into 
	//		when a user uses showBalance method, save the username, balance into a log file called showBalanceLog.
	//		depositAmount log -> username, balance, after withdraw balance.
	
	// use documentation here: https://docs.oracle.com/javase/8/docs/api/java/io/File.html
	//mkdir is the function that creates folders.
	
	
	
	private static void createDir(String path){
		File file = new File(root+path);
		Path chPath = new Path();
		
	    // check to see if directory exists
		boolean ckDir = file.exists(path);
		//Creating the directory
		boolean bool = file.mkdir();
	    if(bool){
	       System.out.println("Directory created successfully");
	    }else{
	       System.out.println("Sorry couldn’t create specified directory");
	    }
	}
	
	private static void createFileUsingFileClass(String path,String filename) {
		System.out.println("----------------------------");
		System.out.println("Create new Employee ");
		System.out.println("Enter Employee Number");
		Scanner en = new Scanner(System.in);
		int empNumber = en.nextInt();
		System.out.println("Enter Employee Name");
		Scanner n = new Scanner(System.in);
		String name = n.nextLine();
		// 1. create object
		Employee employee = new Employee(empNumber,name); 
		// 2. create a byte stream
		
		try {

			// create file output stream	
			FileOutputStream file = new FileOutputStream(path+"/"+filename);
			
			// create object output stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialize object
			out.writeObject(employee);
			
			System.out.println("Serialization is completed.");
			
			out.close();
			file.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	private static void copyFile(String source,String destination) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			//logic to copy file
		in = new FileInputStream(source);
		out = new FileOutputStream(destination);
		int c;
		while((c=in.read())!= -1) {
			out.write(c);
		}
		
		System.out.println("File is copied");
			
			
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}finally {
			// cleanup
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();
			}
		}
	}
			
	
	private static void deleteFile(String filename,String path) {
		//delete file logic
		try {
			Files.delete(Paths.get(path+filename));
			System.out.println("File is deleted.");
		} catch (IOException e) {
			System.out.println("file not found exception");
		}
		
	}

}
