package com.leetcode75;

public class RemovingStars {
    public static String removeStars(String s) {
    	 StringBuilder sb = new StringBuilder();
    	    for (final char c : s.toCharArray())
    	      if (c == '*')
    	        sb.deleteCharAt(sb.length() - 1);
    	      else
    	        sb.append(c);
    	    return sb.toString();
    }
	public static void main(String[] args) {
		String s="leet**cod*e";
		System.out.println(removeStars(s));
		
	}
}
