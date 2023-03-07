package com.leetcode75;

import java.util.ArrayList;

public class SetMismatch {
	public static int[] findErrorNums(int[] nums) {
		ArrayList<Integer> arr=new ArrayList<>();
		/*missing*/
		for(int i=1;i<=nums.length;i++) {
			int c=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[j]==i) {
					c++;
				}
			}
			if(c==0 || c>1) {
				arr.add(i);
			}
		}
		int[] res=new int[arr.size()];
		for(int i=0;i<arr.size();i++) {
			res[i]=arr.get(i);
		}
		return res;

	}
	
	public static void main(String[] args) {
		int[] nums= {1,1};
		int[] res=findErrorNums(nums);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}
