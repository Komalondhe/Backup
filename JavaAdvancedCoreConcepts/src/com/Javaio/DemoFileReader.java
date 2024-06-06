package com.Javaio;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {

	public static void main(String[] args) {
		FileReader reader=null;
		try {
			reader=new FileReader("example.txt");
			int character;
			while((character=reader.read())!=-1) {
				System.out.print((char)character);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(reader!=null) {
					reader.close();
				}
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

	}

}
