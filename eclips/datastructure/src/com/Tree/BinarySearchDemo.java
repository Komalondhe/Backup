package com.Tree;

public class BinarySearchDemo {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree=new BinarySearchTree(50);
		binarySearchTree.insert(binarySearchTree.root,20);
		binarySearchTree.insert(70);
		binarySearchTree.insert(10);
		binarySearchTree.insert(25);
		binarySearchTree.insert(60);
		binarySearchTree.insert(90);
		binarySearchTree.insert(80);
		binarySearchTree.insert(75);
		binarySearchTree.inOrder(binarySearchTree.root);
		if(binarySearchTree.Search(binarySearchTree.root, 70)==null)
			System.out.println("Not found");
		else 
			System.out.println("Found");
			
		//delete
		binarySearchTree.delete(binarySearchTree.root, 70);
		binarySearchTree.inOrder(binarySearchTree.root);
		
	}

}
