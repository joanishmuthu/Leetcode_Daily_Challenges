package com.leetcode75;

public class SortedList {
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
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr=list1;
        while(curr!=null) {
        	if(curr.next==null) {
        		curr.next=list2;
        		break;
        	}
        	curr=curr.next;
        }
        
        int i=6;
        while(i>0) {
        	ListNode sorting=list1;
        	while(sorting.next!=null) {
        		if(sorting.val>sorting.next.val) {
        			int temp=sorting.val;
        			sorting.val=sorting.next.val;
        			sorting.next.val=temp;
        		}
        		sorting=sorting.next;
        	}
        	i--;
        }
		return list1;
        
    }

	public static void main(String[] args) {
		ListNode listNode=new ListNode(1);
		ListNode listNode1=new ListNode(3);
		ListNode listNode2=new ListNode(2);

		listNode.next=listNode1;
		listNode1.next=listNode2;
		
		ListNode listNode3=new ListNode(4);
		ListNode listNode4=new ListNode(5);
		ListNode listNode5=new ListNode(6);
		
		listNode3.next=listNode4;
		listNode4.next=listNode5;
		
		ListNode res=mergeTwoLists(listNode, listNode3);
	}
}
