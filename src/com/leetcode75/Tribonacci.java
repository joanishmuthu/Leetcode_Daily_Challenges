package com.leetcode75;

import java.util.ArrayList;

public class Tribonacci {
	
    public static int tribonacci(int n) {
       ArrayList<Integer> arr=new ArrayList<>();
       arr.add(0);
       arr.add(1);
       arr.add(1);
       for(int i=arr.size();i<=n;i++) {
    	   arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2)+arr.get(arr.size()-3));
       }
       return arr.get(n);
    }
	public static void main(String[] args) {
		int n=25;
		System.out.println(tribonacci(n));
	}
}
