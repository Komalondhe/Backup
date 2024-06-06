package com.Javaio;

import java.io.File;

public class FolderList {

	public static void main(String[] args) {
		int count=0;
		File file=new File("C:\\Users\\Administrator\\Desktop\\Backup\\DailyAssesment\\bin\\com");
		String[]strings=file.list();
		for(String s1:strings) {
			File f1=new File(file,s1);
			if(f1.isDirectory()) {
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);

	}

}
