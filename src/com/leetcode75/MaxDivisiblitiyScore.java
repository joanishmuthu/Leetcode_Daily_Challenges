package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDivisiblitiyScore {
    public static int maxDivScore(int[] nums, int[] divisors) {
        int[][] dp=new int[divisors.length][nums.length];
        ArrayList<Integer> arr=new ArrayList<>();
        int count;
        for(int i=0;i<dp.length;i++) {
        	count=0;
        	for(int j=0;j<dp[0].length;j++) {
        		if(nums[j]%divisors[i]==0 || nums[j]==1) {
        			count++;
        			dp[i][j]=1;
        		}
        		else {
        			dp[i][j]=0;
        		}
        	}
         	arr.add(count);
        }
        int y=Collections.max(arr);
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<arr.size();i++) {
        	if(arr.get(i)==y) {
        		a1.add(divisors[i]);
        	}
        }
        return Collections.min(a1);
    }
	public static void main(String[] args) {
		int[] nums= {20,14,21,10};
		int[] divisors= {5,7,5};
		System.out.println(maxDivScore(nums, divisors));
	}
}
