package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		ArrayList<Integer> a=new ArrayList<>();
        
		for(int i=0;i<nums1.length;i++) {
			a.add(nums1[i]);
		}
		for(int j=0;j<nums2.length;j++) {
			a.add(nums2[j]);
		}
		Collections.sort(a);
		Double l;
		if(a.size()%2==0) {
			int g=a.get((a.size()/2)-2);
			int p=a.get((a.size()/2)-1);
			int h=a.get(g)+a.get(p);
			if(h/2<0) {
				l=0.0;
			}
			else {
				l=(double) (h)/2;
			}
			
		}
		else {
			int y=a.size()+1;
			int p=y/2;
			l=(double) (a.get(p-1));
		}
		return l;
	}

	public static void main(String[] args) {
		int[] nums1= {0,0,0,0,0};
		int[] nums2= {-1,0,0,0,0,0,1};
		Double d=findMedianSortedArrays(nums1, nums2);
		System.out.println(d);
	}
}
