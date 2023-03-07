package com.leetcode75;

public class superpower {
	public static int superPow(int a, int[] b) {
		int l=b.length-1;
		int sum=0;
		for(int i=0;i<b.length;i++) {
			sum=sum+b[i]*((int)Math.pow(10, l));
			l--;
		}
		return (int)Math.pow(a,sum);
	}

	public static void main(String[] args) {
		int[] arr= {2,0,0};
		System.out.println(superPow(2147483647, arr));
	}
}
