package com.Day24;
public class Person {
private String name;
public Person(String name) {
this.name = name;
}
public String getName() {
return name;
}
private void printName() {
System.out.println("Name: " + name);
}
}