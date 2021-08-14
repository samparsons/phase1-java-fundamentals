package com.simplilearn.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) {
		try {
			copyFile("test.txt","copy.txt");
		} catch (IOException e) {
			System.out.println("File to close objects");
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

}
