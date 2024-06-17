package com.FunctionalProgramming;

import java.util.Scanner;

@FunctionalInterface
interface Adder{
	int add(int a,int b);
}


	
public class AdditionLambda {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter val1:");
		int num1=scanner.nextInt();
		System.out.println("Enter val2:");
		int num2=scanner.nextInt();
		Adder adder=(a,b)->a+b;
		int result =adder.add(num1,num2);
		System.out.println("Result of Addition is:"+result);

	}

}
