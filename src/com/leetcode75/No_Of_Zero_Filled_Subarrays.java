package com.leetcode75;

public class No_Of_Zero_Filled_Subarrays {
	public static long zeroFilledSubarray(int[] nums) {
		long cnt = 0L;
        long local = 0L;
        for (int n : nums) {
            if (n == 0) {
                cnt += ++local;
            } else {
                local = 0;
            }
        }
        return cnt;
	}

	public static void main(String[] args) {
		int[] nums = {0,0,0,2,0,0};
		System.out.println(zeroFilledSubarray(nums));
	}
}
