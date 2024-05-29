package com.List;
public class DemoList {
 
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.insertAtBeginning(9);
		list.insertAtBeginning(5);
		list.display();
		System.out.println("");
		list.insertAtPos(1, 10);
		list.display();
 
	}
 
}