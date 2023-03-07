package com.leetcode75;

public class Palindrome {
	public static void main(String[] args) {
		String s="hello";
		String[] k=s.split("");
        String m="";
		int j=0;
		for(int i=k.length-1;i>=0;i--) {
			m=k[j].toString()+m;
			j++;
		}
		System.out.println(m);
	}
}
