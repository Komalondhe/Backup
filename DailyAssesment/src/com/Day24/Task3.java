package com.Day24;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;
class prson2 {
private String name;
private int age;
// Constructor
public prson2(String name, int age) {
this.name = name;
this.age = age;
}
// Getters and Setters
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
// toString method for printing
@Override
public String toString() {
return name + ": " + age;
}
// Method to demonstrate functional interfaces
public static void operateprson2(
Person person,
Predicate<Person> predicate,
Function<Person, String> function,
Consumer<Person> consumer,
Supplier<Person> supplier) {
// Predicate: Test condition on person
if (predicate.test(person)) {
System.out.println("Predicate condition is true for: " + person);
} else {
System.out.println("Predicate condition is false for: " + person);
}
// Function: Apply function to person
String result = function.apply(person);
System.out.println("Function result: " + result);
// Consumer: Perform operation on person
consumer.accept(person);
System.out.println("After Consumer operation: " + person);
// Supplier: Get a new person
Person newPerson = supplier.get();
System.out.println("Supplied new person: " + newPerson);
}
}
public class Task3{
public static void main(String[] args) {
	prson2 person = new prson2("Alice", 30);
// Define functional interfaces
Predicate<prson2> isAdult = p -> p.getAge() >= 18;
Function<prson2, String> personToName = prson2::getName;
Consumer<prson2> increaseAge = p -> p.setAge(p.getAge() + 1);
Supplier<prson2> newPersonSupplier = () -> new prson2("Bob", 25);
// Operate on person using functional interfaces
operateprson2(person, isAdult, personToName, increaseAge, newPersonSupplier);



}

private static void operateprson2(prson2 person, Predicate<prson2> isAdult, Function<prson2, String> personToName,
		Consumer<prson2> increaseAge, Supplier<prson2> newPersonSupplier) {
	// TODO Auto-generated method stub
	
}
}