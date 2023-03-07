package com.leetcode75;

public class InvertBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
    public static TreeNode invertTree(TreeNode root) {
        if(root==null) {
        	return root;
        }
        else {
        	TreeNode temp=root.left;
        	root.left=root.right;
        	root.right=temp;
        	invertTree(root.left);
        	invertTree(root.right);
        	
        	return root;
        	
        }
    }
    public static void main(String[] args) {
		TreeNode root=new TreeNode(4);
		TreeNode a=new TreeNode(2);
		TreeNode b=new TreeNode(7);
		TreeNode c=new TreeNode(1);
		TreeNode d=new TreeNode(3);
		TreeNode e=new TreeNode(6);
		TreeNode f=new TreeNode(9);
		root.left=a;
		root.right=b;
		a.left=c;
		a.right=d;
		b.left=e;
		b.right=f;
		TreeNode rev=invertTree(root);
		System.out.println();
	}
}
