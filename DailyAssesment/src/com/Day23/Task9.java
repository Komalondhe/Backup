package com.Day23;

import java.util.Arrays;
public class Task9 {
// Generic method to swap two elements in an array
public static <T> void swapElements(T[] array, int index1, int index2) {
T temp = array[index1];
array[index1] = array[index2];
array[index2] = temp;
}
public static void main(String[] args) {
// Swap elements in an Integer array
Integer[] intArray = {1, 2, 3, 4, 5};
System.out.println("Before swap: " + Arrays.toString(intArray));
swapElements(intArray, 1, 3);
System.out.println("After swap: " + Arrays.toString(intArray));
// Swap elements in a String array
String[] strArray = {"apple", "banana", "cherry", "date"};
System.out.println("Before swap: " + Arrays.toString(strArray));
swapElements(strArray, 0, 2);
System.out.println("After swap: " + Arrays.toString(strArray));
}
}