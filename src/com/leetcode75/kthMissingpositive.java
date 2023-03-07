package com.leetcode75;

import java.util.ArrayList;

public class kthMissingpositive {
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        int m=1;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==m) {
        		m++;
        	}
        	else {
        		while(arr[i]!=m) {
        			a.add(m);
        			m++;
        		}
        		m++;
        	}
        }
        if(a.isEmpty()) {
        	int o=arr[arr.length-1];
        	for(int i=o+1;i<1000;i++) {
            	a.add(i);
            }
        }
        else {
        	int o=a.get(a.size()-1);
            for(int i=o+1;i<1000;i++) {
            	a.add(i);
            }
        }
        
        return a.get(k-1);
    }
	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9};
		int k=9;
		System.out.println(findKthPositive(arr, k));
	}
}
