package com.Day18;

public class BitManipulation {
	public static int countSetBits(int x) {
		int count=0;
		while(x>0) {
			count+=x & 1;
			x>>=1;
		}
		return count;
	}
	public static int totalSetBits(int n) {
		int totalCount=0;
		for(int i=1;i<=n;i++) {
			totalCount+=countSetBits(i);
			
		}
		return totalCount;
		 
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println("total number of set bits from 1 to "+ n+":"+totalSetBits(n));
		
	}

}
