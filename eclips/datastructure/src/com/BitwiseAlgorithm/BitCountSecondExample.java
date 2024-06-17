package com.BitwiseAlgorithm;

public class BitCountSecondExample {
	public static int CountBits(int n) {
		int count=0;
		while(n>0) {
			count+=(n & 1);
			n>>=1;
		}
		return count;
	}
	public static void main(String args[]) {
		int num=53;
		System.out.println("Number of setBits in: "+num +" is "+CountBits(num));
		
	}

}
