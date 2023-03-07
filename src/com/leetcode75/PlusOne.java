package com.leetcode75;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if (i == (digits.length - 1)) {
				if (digits[i] == 9) {
					digits=new int[digits.length+1];
					digits[i] = 1;
					digits[i + 1] = 0;
					break;
				} else {
					digits[i] = digits[i] + 1;
				}
			}
		}
		return digits;

	}

	public static void main(String[] args) {
		int[] digits = {9,9};
		int[] res = plusOne(digits);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
