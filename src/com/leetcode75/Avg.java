package com.leetcode75;

public class Avg {
	public static void main(String[] args) {
		String[][] marks= {{"Joan","34"},{"James","76"}};
		int sum=0;
		int c=0;
		for(int i=0;i<marks.length;i++) {
			c++;
			sum=sum+Integer.parseInt(marks[i][1]);
		}
		int avg=sum/c;
		System.out.println(avg);
	}
}
