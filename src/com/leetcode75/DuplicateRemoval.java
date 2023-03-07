package com.leetcode75;

import java.util.ArrayList;

import com.leetcode75.Merge_two_sorted_lists.ListNode;

public class DuplicateRemoval {
	
    public static ListNode deleteDuplicates(ListNode head) {
    	ListNode curr=head;
    	ListNode prev=null;
    	ArrayList<Integer> arr=new ArrayList<>();
    	while(curr!=null) {
    		if(arr.contains(curr.val)) {
    			prev.next=curr.next;
    			curr=curr.next;
    		}
    		else {
    			arr.add(curr.val);
    			prev=curr;
        		curr=curr.next;
    		}
    		
    	}
    	
		return head;
        
    }
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(1);
		
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		
		ListNode dupli=deleteDuplicates(listNode1);

	}
}
