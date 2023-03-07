package com.leetcode75;

import java.util.Arrays;

public class Distict {
	public static void main(String[] args) {
		int[] n= {1,2,3,4,1};
		System.out.println(ContainsDuplicate(n));
	}

	private static boolean ContainsDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		return false;
	}
}
