package com.leetcode75;

public class LongestPalindrome {
	static int p=0;
    public static int longestPalindrome(String s) {
    	for(int i=0;i<s.length();i++) {
    		PalinChecker(s.substring(0, i));
    	}
    	return p;
    }
    private static void PalinChecker(String substring) {
		// TODO Auto-generated method stub
    	String res="";
		for(int i=substring.length()-1;i>=0;i--) {
			res=res+substring.charAt(i);
		}
		if(res.equals(substring) && res.length()>p) {
			p=res.length();
		}
	}
	public static void main(String[] args) {
		String s="bbbab";
		System.out.println(longestPalindrome(s));
	}
}
