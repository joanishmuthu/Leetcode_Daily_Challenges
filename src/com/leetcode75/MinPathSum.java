package com.leetcode75;

public class MinPathSum {
    public static int minPathSum(int[][] grid) {
        int[][] newgrid=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++) {
        	for(int j=0;j<grid[0].length;j++) {
        		if(i==0) {
        			if(j==0) {
        				newgrid[i][j]=grid[i][j];
        			}
        			else {
        				newgrid[i][j]=newgrid[i][j-1]+grid[i][j];
        			}
        			
        		}
        		else {
        			if(j>0) {
        				int val=Math.min(newgrid[i][j-1], newgrid[i-1][j]);
        				val=val+grid[i][j];
        				newgrid[i][j]=val;
        			}
        			else {
        				int val=newgrid[i-1][j]+grid[i][j];
        				newgrid[i][j]=val;
        			}
        		}
        	}
        }
        return newgrid[grid.length-1][grid[0].length-1];
    }
	public static void main(String[] args) {
		int[][] grid= {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPathSum(grid));
	}
}
