package com.Day12;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Task3 {
public static void sortQueue(Queue<Integer> queue) {
Stack<Integer> stack = new Stack<>();
while (!queue.isEmpty()) {
int temp = queue.poll();
// Step1 Move elements from stack to queue until a suitable
//position is found
while (!stack.isEmpty() && stack.peek() > temp) {
queue.offer(stack.pop());
}
stack.push(temp);
}
// Step2 Move elements from stack to queue to complete the
//sorting
while (!stack.isEmpty()) {
queue.offer(stack.pop());
}
}
public static void main(String[] args) {
Queue<Integer> queue = new LinkedList<>();
queue.offer(5);
queue.offer(3);
queue.offer(7);
queue.offer(1);
queue.offer(9);
System.out.println("Original Queue: " + queue);
sortQueue(queue);
System.out.println("Sorted Queue: " + queue);
}
}

