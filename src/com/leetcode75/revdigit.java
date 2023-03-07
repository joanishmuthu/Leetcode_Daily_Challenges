package com.leetcode75;

public class revdigit {
	public static int rev(int a) {
		if (a == 0) {
			return a;
		} else {
			int k = a % 10;
 
			int l = String.valueOf(a).length()-1;
			a = a / 10;
			return (int) (k * Math.pow(10, l) + rev(a));
		}

	}

	public static void main(String[] args) {
		int a = 12;
		int h = rev(a);
		System.out.println(h);
	}
}
