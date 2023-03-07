package com.leetcode75;

import java.util.ArrayList;
import java.util.Stack;

import com.leetcode75.SameTree.TreeNode;

public class MaxProduct {
	static ArrayList<Integer> arr=new ArrayList<>();
	static Stack<Integer> stack=new Stack<>();
	static int sum=0;
	public static int treetoarr(TreeNode root,int s) {
		if(root==null) {
			return 0;
		}
		else {
			int left=treetoarr(root.left, s);
			int right=treetoarr(root.right, s);
			int total=left+right+root.val;
			arr.add(total);
			return 0;
		}
	}
	public static void treecount(TreeNode root) {
		if(root==null) {
			return;
		}
		else {
			sum=sum+root.val;
			treecount(root.left);
			treecount(root.right);
		}
	}
	public static int maxprod(ArrayList<Integer> arr) {
		
		for(int i=0;i<arr.size();i++) {
			
		}
		return 0;
		
	}
		
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		n3.left=n6;
		treetoarr(n1,0);
		maxprod(arr);
	}
}
