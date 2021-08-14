package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		readFile("test.txt");

	}
	
	private static void readFile(String filename) {
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			int count = 0;
			while((count=fileInputStream.read()) != -1) {
				System.out.print((char)count);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found error.");
		} catch (IOException e) {
			System.out.println("File read failed.");
		}
	}

}
