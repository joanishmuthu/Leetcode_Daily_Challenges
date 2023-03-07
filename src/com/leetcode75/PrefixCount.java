package com.leetcode75;

public class PrefixCount {
    public static int countPrefixes(String[] words, String s) {
        Character prefix=s.charAt(0);
        int count=0;
        for(int i=0;i<words.length;i++) {
        	if(words[i].charAt(0)==prefix) {
        		count++;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		
	}
}
