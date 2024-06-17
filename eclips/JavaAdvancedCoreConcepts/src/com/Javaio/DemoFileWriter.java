package com.Javaio;

import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter  fw =new  FileWriter("example.txt");
		fw.write("HI !");
		fw.write("Hello this is example file");
		fw.write('\n');
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.flush();
		fw.close();
		
		
				
		

	}

}
