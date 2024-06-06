package com.FunctionalProgramming;
@FunctionalInterface
interface StringLength{
	int getLength(String s);
}


public class MethodLambda {

	public static void main(String[] args) {
		StringLength lengthFunction=(String s)->s.length();
		
		
		String myString="Hello world";
		int length=lengthFunction.getLength(myString);
		System.out.println("Length of String is+"+length);

	}

}
