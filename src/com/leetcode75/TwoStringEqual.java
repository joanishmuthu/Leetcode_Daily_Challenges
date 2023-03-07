package com.leetcode75;

public class TwoStringEqual {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String a="";
		String b="";
		for(int i=0;i<word1.length;i++) {
			a=a+word1[i];
		}
		for(int i=0;i<word2.length;i++) {
			b=b+word2[i];
		}
		if(a.equals(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String[] a= {"ab", "c"};
		String[] b= {"a","bc"};
		System.out.println(arrayStringsAreEqual(a, b));
	}
}
