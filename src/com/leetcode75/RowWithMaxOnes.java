package com.leetcode75;

public class RowWithMaxOnes {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int index=0;
    	for(int i=0;i<mat.length;i++) {
        	int count=0;
        	for(int j=0;j<mat[0].length;j++) {
        		if(mat[i][j]==1) {
        			count++;
        		}
        	}
        	if(max<count) {
        		max=count;
        		index=i;
        	}
        }
    	int[] n= {index,max};
    	return n;
    }
	public static void main(String[] args) {
		int [][] mat= {{0,0,0},{0,1,1}};
		System.out.println(rowAndMaximumOnes(mat));
	}
}
