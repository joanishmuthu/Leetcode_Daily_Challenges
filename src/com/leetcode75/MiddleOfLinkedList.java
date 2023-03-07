package com.leetcode75;

import com.leetcode75.ReverseLinkedList.ListNode;

public class MiddleOfLinkedList {
	

	public static ListNode middleNode(ListNode head) {
		ListNode curr=head;
		ListNode res= new ListNode();
		int c=0;
		while(head!=null) {
			c++;
			head=head.next;
		}
		int mid=(int)c/2;
		ListNode temp=curr;
		int t=0;
		while(temp!=null) {
			if(t==mid) {
				res.next=temp;
				break;
			}
			t++;
			temp=temp.next;
		}
		return res.next;
	}

	public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(3);
		
		listNode.next = listNode1;
		listNode1.next = listNode2;
		ListNode mid=middleNode(listNode);
		System.out.println();
	}
}
