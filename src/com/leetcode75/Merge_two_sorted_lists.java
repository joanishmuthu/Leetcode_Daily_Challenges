package com.leetcode75;

public class Merge_two_sorted_lists {
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
		ListNode result = list1;
		while (result != null) {
			if (result.next == null) {
				while (list2 != null) {
					result.next = list2;
					break;
				}
				break;
			}
			result = result.next;
		}
		ListNode curr2 = list1;
		ListNode inc=list1;
		while (inc != null) {
			while (curr2.next != null) {
				if (curr2.val > curr2.next.val) {
					int temp = curr2.val;
					curr2.val = curr2.next.val;
					curr2.next.val = temp;
				}
				curr2 = curr2.next;
			}
			curr2=list1;
			inc=inc.next;
		}

		return list1;

	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode();
//		ListNode listNode2 = new ListNode();
//		ListNode listNode3 = new ListNode();

		ListNode listNode4 = new ListNode();
//		ListNode listNode5 = new ListNode();
//		ListNode listNode6 = new ListNode();

//		listNode1.val = 1;
//		listNode1.next = listNode2;
//		listNode2.val = 2;
//		listNode3.val = 4;
//		listNode2.next = listNode3;

		listNode4.val = 0;
//		listNode4.next = listNode5;
//		listNode5.val = 3;
//		listNode6.val = 4;
//		listNode5.next = listNode6;

		ListNode final1 = mergeTwoLists(listNode1, listNode4);
		ListNode curr = final1;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
}
