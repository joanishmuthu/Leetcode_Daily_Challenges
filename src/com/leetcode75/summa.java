package com.leetcode75;

public class summa {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		System.out.println(count(a));
	}

	private static int count(int[] a) {
		// TODO Auto-generated method stub
		int res=counter(a,0,0);
		return res;
	}

	private static int  counter(int[] a, int i,int count) {
		// TODO Auto-generated method stub
		int count1=count;
		if(a[i]==a.length) {
			return count1;
		}
		else {
			count1=counter(a, i+1, ++count);
			return count1;
		}
	}
}
