package com.Javaio;

import java.io.File;

public class ListOfallFile {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\Administrator\\Desktop\\Backup\\DailyAssesment\\bin\\com\\Day12");
		int cout=0;
		String[]strings=file.list();
		for(String s1:strings) {
			cout=cout+1;
			System.out.println(s1);
		}
		System.out.println("count of files:"+cout);

	}

}
