package com.Javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {

	public static void main(String[] args) {
		BufferedWriter writer=null;
		try {
			writer=new BufferedWriter(new FileWriter("example1.txt"));
			writer.write("Hello , world!");
			writer.newLine();
			writer.write("THiS IS A NEW LINE");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer !=null) {
					writer.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
