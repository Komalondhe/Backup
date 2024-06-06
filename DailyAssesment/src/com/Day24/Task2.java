package com.Day24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person2{
	private String nameString;
	private int age;
	public Person2(String nameString,int age) {
		this.nameString=nameString;
		this.age=age;
	}
	public String getNameString() {
		return nameString;
	}
	
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return nameString + ":" +age;
	}
}

public class Task2 {

	public static void main(String[] args) {
		List<Person2>peopleList=new ArrayList<Person2>();
		peopleList.add(new Person2("komal", 30));
		peopleList.add(new Person2("sonal", 43));
		peopleList.add(new Person2("sonal", 23));
		peopleList.add(new Person2("Rupesh", 20));
		
		Collections.sort(peopleList,Comparator.comparingInt(Person2::getAge));
	peopleList.forEach(System.out::println);
	}

}
