package com.leetcode75;

public class BeautifulSubsets {
	public static int beautifulSubsets(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if (i != j) {
					int diff = nums[i] - nums[j];
					diff = Math.abs(diff);
					if (diff != k) {
						count++;
					}
				}
			}
		}
		if (nums.length == 1) {
			count = 1;
		} else {
			for (int i = 0; i < nums.length; i++) {
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 4,2,5,9,10,3 };
		System.out.println(beautifulSubsets(nums, 1));
	}
}
