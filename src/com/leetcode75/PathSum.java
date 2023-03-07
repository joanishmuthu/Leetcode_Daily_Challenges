package com.leetcode75;

import java.util.ArrayList;
import java.util.Stack;

import com.leetcode75.SameTree.TreeNode;

public class PathSum {

	public static boolean sum(TreeNode root,int targetSum) {
		if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            return true;
        }
        
        return sum(root.left, targetSum - root.val) || sum(root.right, targetSum-root.val);
	}
	
	public static void main(String[] args) {
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
//		TreeNode n4=new TreeNode(11);
//		TreeNode n5=new TreeNode(13);
//		TreeNode n6=new TreeNode(4);
//		TreeNode n7=new TreeNode(7);
//		TreeNode n8=new TreeNode(2);
//		TreeNode n9=new TreeNode(1);
		n1.left=n2;
		n1.right=n3;
//		n2.left=n4;
//		n3.left=n5;
//		n3.right=n6;
//		n4.left=n7;
//		n4.right=n8;
//		n6.right=n9;
		System.out.println(sum(n1,22));
		
	}
}
