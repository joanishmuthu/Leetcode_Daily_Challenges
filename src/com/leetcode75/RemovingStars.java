package com.leetcode75;

public class RemovingStars {
    public static String removeStars(String s) {
        int i=0;
    	while(i<s.length()) {
        	if(s.charAt(i)=='*') {
        		s=s.substring(0, i-1)+s.substring(i+1,s.length());
        		i=0;
        		String[] r=s.split("");
        		boolean flag=false;
        		for(int j=0;j<r.length;j++) {
        			if(r[j].equals("*")) {
        				flag=true;
        			}
        			
        		}
        		if(flag) {
        			continue;
        		}
        		else {
        			break;
        		}
        		
        	}
        	i++;
        }
    	return s;
    }
	public static void main(String[] args) {
		String s="leet**cod*e";
		System.out.println(removeStars(s));
		
	}
}
