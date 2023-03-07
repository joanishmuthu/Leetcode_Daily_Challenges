package com.leetcode75;

import com.leetcode75.ReverseLinkedList.ListNode;

public class Cyclic_LinkedList {
	public static ListNode detectCycle(ListNode head) {
		ListNode ptr=head;
		ListNode fptr=head;
		ListNode res = null;
		while(ptr!=null) {
			ptr=ptr.next;
			fptr=fptr.next.next;
			if(ptr.next==null) {
				res=null;
				break;
			}
			else if(ptr==fptr) {
				res=ptr.next;
				break;
			}
			
		}
		return res;
	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(3);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(0);
		ListNode listNode4 = new ListNode(-4);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next=listNode4;
		listNode4.next=listNode2;
		ListNode ref=detectCycle(listNode1);
		System.out.println(ref.val);
		
	}
}
