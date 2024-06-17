package com.Javaio;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		File file=new File("Training");
		System.out.println(file.exists());
		file.mkdir();
		System.out.println(file.exists());
	}

}
