package com.leetcode75;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<List<String>>();
		List<String> val= new ArrayList<String>();
		int c=0;
		for (int i = 0; i < strs.length; i++) {
			List<String> unique= new ArrayList<String>();
			List<String> val1= new ArrayList<String>();
			String a = strs[i];
			int sum = 0;
			if(val.contains(a)) {
				continue;
			}
			for (int j = 0; j < a.length(); j++) {
				char o = a.charAt(j);
				sum = sum + (int) o;
			}
			for (int k = i + 1; k < strs.length; k++) {
				int sum1 = 0;
				String a1 = strs[k];
				for (int y = 0; y < a1.length(); y++) {
					char o1 = a1.charAt(y);
					sum1 = sum1 + (int) o1;
				}
				if(sum==sum1) {
					c++;
					if(!val.contains(strs[i])) {
						val.add(strs[i]);
						val1.add(strs[i]);
					}
					if(!val.contains(strs[k])){
						val.add(strs[k]);
						val1.add(strs[k]);
					}
					
				}
			}
			if(c==0) {
				unique.add(a);
				res.add(unique);
				break;
			}
			List<String> temp=new ArrayList<String>(val1);
			res.add(temp);
			val1.clear();
			c=0;
		}
		
		return res;
	}

	public static void main(String[] args) {
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> val=groupAnagrams(strs);
		System.out.println();
		System.out.println();
	}
}
