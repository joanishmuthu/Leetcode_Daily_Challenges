package com.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class ZigZagBTree {
    static List<Integer> arr=new ArrayList<>();
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
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Inorder(root);
        List<List<Integer>> res=new ArrayList<>();
        int[] a=arr.stream().mapToInt(i->i).toArray();
        List<Integer> a2=new ArrayList<>();
        a2.add(a[0]);
        res.add(a2);
        int count=0;
        for(int i=1;i<a.length-1;i+=2) {
        	if(count%2==0) {
        		List<Integer> a1=new ArrayList<>();
            	int temp=a[i];
            	a[i]=a[i+1];
            	a[i+1]=temp;
            	a1.add(a[i]);
            	a1.add(a[i+1]);
            	res.add(a1);
        	}
        	else {
        		List<Integer> a1=new ArrayList<>();
        		a1.add(a[i]);
            	a1.add(a[i+1]);
            	res.add(a1);
        	}
        	count++;
        }
        return res;
    }
	private static void Inorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return;
		}
		else {
			arr.add(root.val);
			Inorder(root.left);
			Inorder(root.right);
		}
	}
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		TreeNode a=new TreeNode(9);
		TreeNode b=new TreeNode(20);
		TreeNode c=new TreeNode(15);
		TreeNode d=new TreeNode(7);
		root.left=a;
		root.right=b;
		b.left=c;
		b.right=d;
		List<List<Integer>> res=zigzagLevelOrder(root);
	}
}
