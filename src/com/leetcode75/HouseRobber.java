package com.leetcode75;

public class HouseRobber {
    public static int rob(int[] nums) {
    	if(nums.length==1) {
    		return nums[0];
    	} 
    	else if(nums.length==2) {
    		return Math.max(nums[0], nums[1]);
    	}
    	int[] res=new int[nums.length];
    	res[0]=nums[0];
    	res[1]=Math.max(nums[0], nums[1]);
    	for(int i=2;i<nums.length;i++) {
    		int m=nums[i]+res[i-2];
    		int n=res[i-1];
    		res[i]=Math.max(m, n);
    	}
    	return res[res.length-1];
    }
	public static void main(String[] args) {
		int[] nums= {2,1,1,2};
		System.out.println(rob(nums));
	}
}
