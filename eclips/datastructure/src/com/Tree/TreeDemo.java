package com.Tree;

public class TreeDemo {
	class TreeNode{
		int val;
	 TreeNode left,right;
	 public TreeNode(int item) {
		 val=item;
		 left=right=null;
	 }
		
	}
	class BinarySearchTree{
		TreeNode root;
		public BinarySearchTree() {
			root=null;
			}
		void insert(int key) {
			//root=insertRec(root,key);
		}
		TreeNode inserRec(TreeNode root,int key) {
			if(root==null) {
				root=new TreeNode(key);
				return root;
			}
			if(key<root.val) {
				root.left=inserRec(root.left, key);
			}
			else if(key>root.val){
				root.right=inserRec(root.right, key);
				
			}
			return root;
		}
	}

	public static void main(String[] args) {
		
	}

}
