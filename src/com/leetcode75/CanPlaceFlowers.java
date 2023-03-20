package com.leetcode75;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=0;
        int count=0;
    	while(l<flowerbed.length) {
    		if(l-1>0 && l+1<flowerbed.length) {
    			if(flowerbed[l]==0 && flowerbed[l-1]!=1 && flowerbed[l+1]!=1) {
        			count++;
        			l=l+2;
        		}
    			else {
    				l+=1;
    			}
    			
    		}
    		else if(l==0) {
    			if(flowerbed.length==1 && flowerbed[l]==0) {
    				count++;
    			}
    			else if(flowerbed[l]==0 && flowerbed[l+1]!=1) {
    				count++;
    				l+=2;
    			}
    			else {
    				l+=1;
    			}
    		}
    		else if(l==flowerbed.length-1) {
    			if(flowerbed[l-1]!=1 && flowerbed[l]==0) {
    				count++;
    				l+=1;
    			}
    			else {
    				l+=1;
    			}
    		}
    		else {
    			l++;
    		}
    	}
    	if(count==n) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	public static void main(String[] args) {
		int[] flowerbed= {1,0,0,0,1};
		int n=1;
		System.out.println(canPlaceFlowers(flowerbed, n));
	}
}
