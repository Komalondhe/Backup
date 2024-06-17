package com.Day12;


class ListNode {
int val;
ListNode next;
ListNode(int x) { val = x; }
}
public class Task2 {
public static int findMiddleElement(ListNode head) {
ListNode slow = head;
ListNode fast = head;
while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
}
return slow.val;
}
public static void main(String[] args) {
// Example linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
ListNode head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);
head.next.next.next.next = new ListNode(5);
int middleElement = findMiddleElement(head);
System.out.println("Middle element: " + middleElement);
}
}

