package com.Javaio;

import java.io.File;

public class FileList {

		public static void main(String[] args) {
			int count=0;
			File file=new File("C:\\Users\\Administrator\\Desktop\\Backup\\DailyAssesment\\bin\\com\\Day17");
			String[]strings=file.list();
			for(String s1:strings) {
				File f1=new File(file,s1);
				if(f1.isFile()) {
					count++;
					System.out.println(s1);
				}
			}
			System.out.println(count);

		}

	}
