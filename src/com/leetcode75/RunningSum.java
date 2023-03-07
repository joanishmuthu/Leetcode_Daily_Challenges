package com.leetcode75;

public class RunningSum {
	public static int[] runningSum(int[] nums) {
		int[] result=new int[nums.length];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum=sum+nums[i];
			result[i]=sum;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] res=runningSum(a);
		for(int i:res) {
			System.out.println(i);
		}
	}
}
