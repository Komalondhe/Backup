package com.InheritanceCommon;
class Base{
	static String string="Super keywod";
	public Base() {
		System.out.printf("1");
	}
}
public class SuperKyword extends Base {
	public SuperKyword() {
		super();
		System.out.printf("2");
	}

	public static void main(String[] args) {
		SuperKyword superKyword=new SuperKyword();
		

	}

}
