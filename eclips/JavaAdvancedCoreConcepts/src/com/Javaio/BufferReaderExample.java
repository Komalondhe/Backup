package com.Javaio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		BufferedReader reader=null;
		try {
	 reader=new BufferedReader(new FileReader("example1.txt"));
	 String lineString;
	 while((lineString=reader.readLine())!=null) {
		 System.out.println(lineString);
	 }
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(reader !=null) {
				reader.close();
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
		

	}

}
