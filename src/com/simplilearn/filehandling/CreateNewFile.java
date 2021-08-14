package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFileUsingFileClass("data.txt");
		createFileUsingFileOUtStream("test.txt");
	}
	
	private static void createFileUsingFileClass(String filename) {
		File file = new File(filename);
		
		try {
			if(file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists!");
			}
			//write content to file -> filewriter -> character stream
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Test data to file!");
			fileWriter.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
	private static void createFileUsingFileOUtStream(String filename) {
		try {
			String data = "Today is a wonderful day!";
			FileOutputStream out = new FileOutputStream(filename);
		
		out.write(data.getBytes());
		out.close();
		}catch (FileNotFoundException e) {
			System.out.println("File operation failed.");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File operation failed.");
		} 
	}
}
