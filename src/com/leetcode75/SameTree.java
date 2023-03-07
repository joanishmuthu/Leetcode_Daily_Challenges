package com.leetcode75;

import java.util.ArrayList;

public class SameTree {
	static int sum=0;
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
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		TreeNode n7=new TreeNode(7);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		n3.right=n7;
		System.out.println(sumrange(n1, 2, 4));
		
		
		TreeNode n11=new TreeNode(1);
		TreeNode n21=new TreeNode(2);
		TreeNode n31=new TreeNode(3);
		n11.left=n21;
		n11.right=n31;
		
		System.out.println(checker(n1,n11));
	}
	
	public static int sumrange(TreeNode root,int low,int high){
		if(root==null) {
			return 1;
		}
		else {
			if(root.val>=low && root.val<=high) {
				sum=sum+root.val;
			}
			return sumrange(root.left, low, high) + sumrange(root.right, low, high);
			
		}
		
	}
	
	private static boolean checker(TreeNode n1, TreeNode n11) {
		if(n1==null && n11==null) {
			return true;
		}
		else if(n1==null || n11==null) {
			return false;
		}
		else {
			return (n1.val==n11.val) && (checker(n1.left, n11.left)) && (checker(n1.right, n11.right));
		}
	}
	public static int no_nodes(TreeNode n1) {
		if(n1==null) {
			return 0;
		}
		else {
			return 1+no_nodes(n1.left)+no_nodes(n1.right);
		}
	}
	private static void inorderchecker(TreeNode n1, int n, ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		if(n1==null) {
			return;
		}
		else {
			a.add(n1.val);
			inorderchecker(n1.left, n, a);
			inorderchecker(n1.right, n, a);
		}
		
	}
}
