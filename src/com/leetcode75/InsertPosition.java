package com.leetcode75;

public class InsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int count=0;
        int result=0;
    	for(int i=0;i<nums.length;i++) {
        	if(nums[i]==target) {
        		count++;
        		result=i;
        	}
        }
        if(count==0) {
        	for(int i=0;i<nums.length;i++) {
        		if(nums[i]>target) {
        			result=i;
        			break;
        		}
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int target=7;
		System.out.println(searchInsert(nums, target));
	}
}
