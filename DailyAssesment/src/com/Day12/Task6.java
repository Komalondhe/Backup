package com.Day12;


import java.util.Stack;
public class Task6 {
static class SequenceSearcher {
public static boolean isSequencePresent(Stack<Integer> stack,
int[] sequence) {
int sequenceIndex = 0;
while (!stack.isEmpty() && sequenceIndex <
sequence.length) {
int poppedElement = stack.pop();
if (poppedElement == sequence[sequenceIndex]) {
sequenceIndex++;
} else {
stack.push(poppedElement);
}
}
return sequenceIndex == sequence.length;
}
}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
stack.push(3);
stack.push(2);
stack.push(1);
int[] sequence = {1, 2, 3};
System.out.println("Sequence present: " +
SequenceSearcher.isSequencePresent(stack, sequence));
}
}
