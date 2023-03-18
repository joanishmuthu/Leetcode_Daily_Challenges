package com.leetcode75;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBT {
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
    public static boolean isCompleteTree(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean seenNull = false;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size; i ++){// Traverse all nodes on this level
                TreeNode curr = queue.poll();
                if(curr == null) {
                    seenNull = true;// When found null, set the flag
                }
                else {
                    if(seenNull) return false;// If found non null node, but flag is set. Return false
                    queue.offer(curr.left);
                    queue.offer(curr.right); 
                }
            }
        }
        return seenNull;
    }
    
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		TreeNode a=new TreeNode(2);
		TreeNode b=new TreeNode(3);
		TreeNode c=new TreeNode(4);
		TreeNode d=new TreeNode(5);
		TreeNode e=new TreeNode(6);
		root.left=a;
		root.right=b;
		a.left=c;
		a.right=d;
		b.left=e;
		System.out.println(isCompleteTree(root));
	}
}
