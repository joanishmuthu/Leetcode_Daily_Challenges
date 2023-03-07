package com.leetcode75;

public class ContinousSum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum=0;
        int c=0;
    	for(int i=0;i<nums.length;i++) {
    		sum=nums[i];
        	for(int j=i+1;j<nums.length;j++) {
        		sum=sum+nums[j];
        		if(sum%k==0) {
        			c++;
        		}
        	}
        }
    	if(c>0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		int[] nums= {23,2,4,6,6};
		int k=7;
		System.out.println(checkSubarraySum(nums, k));
	}
}
