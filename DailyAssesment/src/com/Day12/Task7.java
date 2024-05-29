package com.Day12;

class ListNode4 {
int val;
ListNode4 next;
ListNode4(int val) {
this.val = val;
this.next = null;
}
}
public class Task7 {
public static ListNode4 mergeTwoLists(ListNode4 l1, ListNode4 l2) {
// Create a dummy node to act as the start of the merged list
ListNode4 dummy = new ListNode4(-1);
ListNode4 current = dummy;
// Merge the lists
while (l1 != null && l2 != null) {
if (l1.val <= l2.val) {
current.next = l1;
l1 = l1.next;
} else {
current.next = l2;
l2 = l2.next;
}
current = current.next;
}
// Append the remaining nodes
if (l1 != null) {
current.next = l1;
} else {
current.next = l2;
}
// The head of the merged list is the next node of the dummy node
return dummy.next;
}
public static void printList(ListNode4 head) {
ListNode4 current = head;
while (current != null) {
System.out.print(current.val + " ");
current = current.next;
}
System.out.println();
}
public static void main(String[] args) {
// Example: Create two sorted linked lists
ListNode4 l1 = new ListNode4(1);
l1.next = new ListNode4(3);
l1.next.next = new ListNode4(5);
ListNode4 l2 = new ListNode4(2);
l2.next = new ListNode4(4);
l2.next.next = new ListNode4(6);
// Merge the lists
ListNode4 mergedList = mergeTwoLists(l1, l2);
// Print the merged list
System.out.println("Merged List:");
printList(mergedList);
}
}

