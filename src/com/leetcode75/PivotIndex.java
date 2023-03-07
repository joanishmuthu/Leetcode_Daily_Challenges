package com.leetcode75;

public class PivotIndex {
	public static int pivot(int[] nums) {

		int c = 0;
		int change=0;
		for (int i = 0; i < nums.length; i++) {
			int left = 0;
			int right = 0;
			for (int j = 0; j < i; j++) {
				left = left + nums[j];
			}
			for (int k = i + 1; k < nums.length; k++) {
				right = right + nums[k];
			}
			if (left == right) {
				c = i;
				change++;
				break;
			}
		}
		if (change != 0) {
			return c;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] a = {1,7,3,6,5,6};
		int c = pivot(a);
		System.out.println(c);
	}
}
