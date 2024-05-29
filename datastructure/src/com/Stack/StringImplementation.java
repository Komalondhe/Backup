package com.Stack;

import java.security.PublicKey;

public class StringImplementation {
	class Node{
		int data;
		Node nextNode;
		public Node(int val) {
data=val;
nextNode=null;

		}
	}
	Node frontNode ,rear;
	StringImplementation(){
		frontNode=null;
		rear=null;
		
	}
	public void enquee(int val) {
		Node newNode=new Node(val);
		if (frontNode==null) {
			frontNode=newNode;
			
		}
		else {
			rear.nextNode=newNode;
			rear=newNode;
		}
		/*public int dequeue() {
			if (frontNode==null){
				throw new IndexOutOfBoundsException("Queue is empty");
				int temp=frontNode.data;
				frontNode=frontNode.nextNode;
				if (frontNode==nul) {
					rear=null;
					return temp;*/
					
				}
				/*public boolean isEmpty() {
					return frontNode==nul;
				}*/
				
				/*public int elementAtFront() {
					if(frontNode==nul)
						throw new IndexOutOfBoundsException("queue is empty");
						return frontNode.data;
						
				}*/
			
			
		}
	


