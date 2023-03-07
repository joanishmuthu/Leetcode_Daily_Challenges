package com.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class romoveElement {
	public static int removelements(int[] nums,int val) {
		List<Integer> res=new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) {
				res.add(nums[i]);
		}
		}
		int c=res.size();
		return c;
		
	}
	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val=3;
		System.out.println(removelements(nums, val));
	}
}
