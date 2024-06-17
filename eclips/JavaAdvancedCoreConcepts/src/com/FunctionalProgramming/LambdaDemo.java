package com.FunctionalProgramming;
@FunctionalInterface
interface interf{
	public void Meth();
}
class Test implements interf{

	@Override
	public void Meth() {
		
	}
	
}

public class LambdaDemo {

	public static void main(String[] args) {
		interf i=()->System.out.println("Hello World,Welcome to java World");
		i.Meth();

	}

}
