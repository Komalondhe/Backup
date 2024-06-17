package com.Testing;

public class Example2 {
	
	public int countA(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='A'){
				count=count+1;
			}		
		}
		return count;
		
	}
	 
	 
	public boolean ageCheck(int age) {
		if(age<20)
			return true;
		else
			return false;
	}
	 
	 
	public String nullCheck(String s) {
		if((s.equals("")) && (s!=null))
			return "";
		else  
			return s;
	}

}
