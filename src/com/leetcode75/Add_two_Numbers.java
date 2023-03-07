package com.leetcode75;

public class Add_two_Numbers {
	ListNode head;
	static class ListNode{
		int data;
		ListNode next;
		ListNode(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		Add_two_Numbers a=new Add_two_Numbers();
		a.head=new ListNode(2);
		ListNode n1=new ListNode(4);
		ListNode n2=new ListNode(3);
		a.head.next=n1;
		n1.next=n2;
		Add_two_Numbers b=new Add_two_Numbers();
		b.head=new ListNode(5);
		ListNode n3=new ListNode(6);
		ListNode n4=new ListNode(4);
		b.head.next=n3;
		n3.next=n4;
		ListNode res=AddData(a.head, b.head);
		while(res!=null) {
			System.out.println(res.data);
			res=res.next;
		}
	}
	private static ListNode AddData(ListNode head2, ListNode head3) {
		String s1="";
		String s2="";
		while(head2!=null) {
			s1=s1+head2.data;
			head2=head2.next;
		}
		while(head3!=null) {
			s2=s2+head3.data;
			head3=head3.next;
		}
		StringBuilder sb1=new StringBuilder();
		sb1.append(s1);
		sb1.reverse();
		StringBuilder sb2=new StringBuilder();
		sb2.append(s2);
		sb2.reverse();
		s1=sb1.toString();
		s2=sb2.toString();
		Integer res=Integer.parseInt(s1)+Integer.parseInt(s2);
		String k=res.toString();
		String[] m=k.split("");
		ListNode n1=new ListNode(0);
		ListNode temp=n1;
		for(int i=0;i<m.length;i++) {
			ListNode op=new ListNode(Integer.parseInt(m[i]));
			temp.next=op;
			temp=temp.next;
		}
		return n1.next;
		
	}
}
