package com.leetcode75;

public class MinimizeMaxArray {
    public static int minimizeArrayValue(int[] nums) {
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++) {
        	sum+=nums[i];
        	res=Math.max(res, (sum+i)/(i+1));
        }
        return res;
    }
	public static void main(String[] args) {
		int[] nums= {3,7,1,6};
		System.out.println(minimizeArrayValue(nums));
	}
}
