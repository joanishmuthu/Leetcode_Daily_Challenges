package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        String[] str=s.split("");
        HashMap<String, Integer> k=new HashMap<>();
        for(int i=0;i<str.length;i++) {
        	int c=1;
        	for(int j=i+1;j<str.length;j++) {
        		if(str[i].equals(str[j])) {
        			c++;
        		}
        	}
        	if(!k.containsKey(str[i])) {
        		k.put(str[i], c);
        	}
        }
        List<Integer> uj=new ArrayList<Integer>(k.values());
        Collections.sort(uj);
        int u=1;
        String res="";
        for(int i=0;i<(uj.get(uj.size()-1));i++) {
        	for(Entry<String, Integer> entry:k.entrySet()) {
        		if(u==entry.getValue()) {
        			res=res+entry.getKey()+res;
        			u++;
        			break;
        		}
        	}
        }
        System.out.println();
        return 0;
    }
    public static void main(String[] args) {
		String s="jooaanish";
		longestPalindrome(s);
	}
}
