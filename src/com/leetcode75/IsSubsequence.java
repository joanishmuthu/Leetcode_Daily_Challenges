package com.leetcode75;

public class IsSubsequence {
	public static boolean substring(String s,String t) {
		String[] s1=s.split("");
		String[] s2=t.split("");
		int c=0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					c++;
				}
			}
		}
		if(c==s1.length) {
			return true;
		}
		else if(s1[0].equals("")) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		String s="";
		String t="ahbgdc";
		System.out.println(substring(s, t));
	}
}
