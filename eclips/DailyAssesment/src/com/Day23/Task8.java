package com.Day23;

public class Task8<T, U> {
private T first;
private U second;
// Constructor
public Task8(T first, U second) {
this.first = first;
this.second = second;
}
// Getters
public T getFirst() {
return first;
}
public U getSecond() {
return second;
}
// Setters
public void setFirst(T first) {
this.first = first;
}
public void setSecond(U second) {
this.second = second;
}
// Method to return a reversed version of the pair
public Task8<U, T> reverse() {
return new Task8<>(second, first);
}
// toString method for displaying the pair
@Override
public String toString() {
return "Pair{" + "first=" + first + ", second=" + second + '}';
}
public static void main(String[] args) {
// Example usage
Task8<Integer, String> pair = new Task8<>(1, "One");
System.out.println("Original Pair: " + pair);
Task8<String, Integer> reversedPair = pair.reverse();
System.out.println("Reversed Pair: " + reversedPair);
}
}