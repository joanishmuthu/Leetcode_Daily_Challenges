package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

import com.leetcode75.SortedList.ListNode;

public class ReverseLinkedList {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		ListNode curr=head;
		ListNode prev=null;
		ListNode next=null;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		return prev;
		

	}

	public static void main(String[] args) {
		ListNode listNode=new ListNode(1);
		ListNode listNode1=new ListNode(2);
		ListNode listNode2=new ListNode(3);

		listNode.next=listNode1;
		listNode1.next=listNode2;
		ListNode rev=reverseList(listNode);
	}
}
