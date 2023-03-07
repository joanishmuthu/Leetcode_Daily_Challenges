package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Triplets {
	static public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			for (int j = 0; j < nums.length - 1; j++) {
				if (i != j && i!=j+1) {
					sum = sum + nums[j] + nums[j + 1];
					if (sum == 0) {
						List<Integer> a = new ArrayList<>();
						a.add(nums[i]);
						a.add(nums[j]);
						a.add(nums[j + 1]);
						if (result.isEmpty()) {
							result.add(a);
						} else {
							int count = 0;
							for (int l = 0; l < result.size(); l++) {
								List<Integer> op = result.get(l);
								List<Integer> lr = a;
								Collections.sort(op);
								Collections.sort(lr);
								if (op.equals(a)) {
									count++;
								}
							}
							if (count == 0) {
								result.add(a);
							}
						}
						sum = nums[i];
					} else {
						sum = nums[i];
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { -1,0,1,2,-1,-4};
		List<List<Integer>> output = threeSum(nums);
		System.out.println(output);
	}
}
