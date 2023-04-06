package com.leetcode75;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        searching(nums,target,0);
        return index;
    }
    static int index=-1;
	private static void searching(int[] nums, int target, int i) {
		// TODO Auto-generated method stub
		if(nums.length-1==i) {
			return;
		}
		else {
			if(target==nums[i]) {
				index=i;
			}
			else {
				searching(nums, target, i+=1);
			}
		}
	}
	public static void main(String[] args) {
		int[] nums= {-1,0,3,5,9,12};
		System.out.println(search(nums, 9));
	}
}
