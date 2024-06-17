package com.Debug;


public class DebugExample {

	public static void main(String[] args) {
		int a=3;
		int b=9;
		int c=add(a,b);

	}
	public static int add(int a,int b) {
		int sum=a+b;
		int d=Sub(a,b);
		return sum;
	}
	public static int Sub(int a,int b) {
		int sum=a-b;
		return sum;
	}

}
