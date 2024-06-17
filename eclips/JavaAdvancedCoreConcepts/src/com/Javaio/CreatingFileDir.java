package com.Javaio;

import java.io.File;
import java.io.IOException;

public class CreatingFileDir {

	public static void main(String[] args) throws  IOException  {
		File file=new File("abc.txt");
		System.out.println(file.exists());//false
		file.createNewFile();//file creating
		System.out.println(file.exists());
		file.exists();
		file.createNewFile();
		file.mkdir();
		file.isFile();
		file.isDirectory();
		file.list();// all file present in directory
		file.length();
	}

}
