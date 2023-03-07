package com.leetcode75;

import com.leetcode75.ZigZagBTree.TreeNode;

public class Depth_of_BT {
	public static int maxDepth(TreeNode root) {
		int res = depth(root, 0);
		return res;
	}

	public static int depth(TreeNode root, int val) {
		int maxtotal=0;
		if (root == null) {
			return val;
		} else {
			val++;
			int total=depth(root.left, val);
			int total1=depth(root.right, val);
			maxtotal=Math.max(total, total1);
			return maxtotal;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode a = new TreeNode(9);
		TreeNode b = new TreeNode(20);
		TreeNode c = new TreeNode(15);
		TreeNode d = new TreeNode(7);
		root.left = a;
		root.right = b;
		b.left = c;
		b.right = d;
		System.out.println(maxDepth(root));
	}
}
