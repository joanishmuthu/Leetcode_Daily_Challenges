package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        ArrayList<Integer> res=new ArrayList<>();
    	for(int i=0;i<prices.length;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		int k=prices[j]-prices[i];
        		res.add(k);
        	}
        }
    	Collections.sort(res);
    	if(res.size()==0) {
    		return 0;
    	}
    	else if(res.get(res.size()-1)<0) {
    		return 0;
    	}
    	else if(res.size()==1) {
    		return res.get(0);
    	}
    	else {
    		return res.get(res.size()-1);
    	}
    }
	public static void main(String[] args) {
		int[] prices= {2,1};
		System.out.println(maxProfit(prices));
	}
}
