package com.InheritanceCommon;
class A{
	int i;
	void display() {
		System.out.println(i);
	}
}
class B extends A{
	int j;
	void display() {
		System.out.println(j);
	}
}
public class OutputBased {

	public static void main(String[] args) {
		B b=new B();
		b.i=1;
		b.j=2;
		b.display();

	}

}
