package com.BitwiseAlgorithm;

import java.util.Scanner;

public class CountBits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number to check:");
		int num=scanner.nextInt();
		System.out.println("Number of bits in:"+num+"is"+Integer.bitCount(num));
	}

}
