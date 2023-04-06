package com.leetcode75;

public class SuccessfulPairsOfSpell {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res=new int[spells.length];
    	for(int i=0;i<spells.length;i++) {
    		int count=0;
        	for(int j=0;j<potions.length;j++ ) {
        		int a=spells[i]*potions[j];
        		if(a>=success) {
        			count++;
        		}
        	}
        	res[i]=count;
        }
    	return res;
    }
	public static void main(String[] args) {
		int[] spells= {3,1,2};
		int[] potions= {8,5,8};
		int success=16;
		System.out.println(successfulPairs(spells, potions, success));
	}
}
