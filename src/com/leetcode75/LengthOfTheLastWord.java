package com.leetcode75;

public class LengthOfTheLastWord {
	public static int lengthOfLastWord(String s) {
		String[] str=s.split(" ");
		int c=0;
		for(int i=0;i<str.length;i++) {
			if(i==(str.length-1)) {
				String[] res=str[i].split("");
				c=res.length;
			}
		}
		return c;

	}

	public static void main(String[] args) {
		String s="luffy is still joyboy";
		System.out.println(lengthOfLastWord(s));
	}
}
