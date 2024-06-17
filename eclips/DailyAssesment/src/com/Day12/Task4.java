package com.Day12;


import java.util.Stack;
public class Task4 {
public static void sortStack(Stack<Integer> stack) {
Stack<Integer> tempStack = new Stack<>();
while (!stack.isEmpty()) {
int temp = stack.pop();
while (!tempStack.isEmpty() && tempStack.peek() < temp) {
stack.push(tempStack.pop());
}
tempStack.push(temp);
}
// Move elements from tempStack back to stack
while (!tempStack.isEmpty()) {
stack.push(tempStack.pop());
}
}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
stack.push(4);
stack.push(1);
stack.push(3);
stack.push(2);
System.out.println("Original Stack: " + stack);
sortStack(stack);
System.out.println("Sorted Stack: " + stack);
}
}

