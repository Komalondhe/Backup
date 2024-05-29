package com.BitwiseAlgorithm;

public class FindNonReapitingelement {
	public static void findReapitingElement(int[]arr) {
		int xorResult=0;
		for(int num:arr) {
			xorResult ^=num;
			
		}
		int setBit=xorResult & -xorResult;
		int x=0,y=0;
		for(int num:arr) {
			if((num & setBit)==0) {
				x ^=num;
			}
			else {
				y ^=num;
			}
		}
		System.out.println("The two non-Reapitin element are:"+x+" and "+y);
		
	}

	public static void main(String[] args) {
		int arr[]= {2,4,2,5,2,3,3,1};
		findReapitingElement(arr);
	}

}
