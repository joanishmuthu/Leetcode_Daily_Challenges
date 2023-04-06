package com.leetcode75;

import java.util.HashSet;

public class OptimalPartition {
	public static int partitionString(String s) {
		HashSet<String> hs=new HashSet<>();
		String[] st=s.split("");
		int res=0;
		int j=0;
		for(int i=0;i<st.length;i++) {
			if(!hs.contains(st[i])) {
				hs.add(s.substring(j,i+1));
			}
			else if(hs.contains(st[i])) {
				res++;
				j=i;
				hs.clear();
				
			}
		}
		return res;
	}
	public static void main(String[] args) {
		String s="abacaba";
		System.out.println(partitionString(s));
	}
}
