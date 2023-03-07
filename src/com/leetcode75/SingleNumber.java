package com.leetcode75;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
    	int count;
    	int val=0;
        for(int i=0;i<nums.length;i++) {
        	count=0;
        	for(int j=0;j<nums.length;j++) {
        		if(i==j) {
        			continue;
        		}
        		else if(nums[i]==nums[j]) {
        			count++;
        		}
        	}
        	if(count==0) {
        		val=nums[i];
        		break;
        	}
        }
        return val;
    }
	public static void main(String[] args) {
		int[] nums= {2,2,1};
		System.out.println(singleNumber(nums));
	}
}
