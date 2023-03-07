package com.leetcode75;

import java.util.HashMap;
import java.util.Map;

public class majority {
	public static void main(String[] args) {
		int[] a= {3,3,4,2,4,4,2,4,4};
		int c=a.length/2;
		Map<Integer, Integer> map=new HashMap<>();
		int count=1;
		int contains=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(!map.containsKey(a[i])) {
					contains=1;
					if(a[i]==a[j]) {
						count++;
					}
				}
			}
			if(contains==1) {
				map.put(a[i], count);
				contains=0;
			}
			
			count=1;
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>c) {
				System.out.println(entry.getKey());
			}
		}
	}
}
