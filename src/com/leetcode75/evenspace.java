package com.leetcode75;

public class evenspace {
	public static void main(String[] args) {
		String text="  this   is  a sentence ";
		String[] space=text.split("");
		int count=0;
		for(int i=0;i<space.length;i++) {
			if(space[i].equals(" ")) {
				count++;
			}
		}
		String[] text1=text.split(" ");
		String res="";
		for(int i=0;i<text1.length;i++) {
			if(!text1[i].equals(" ")) {
				String space1=" ";
				res=text1[i]+space1.repeat(count);
			}
		}
		
	}
}
