package com.leetcode75;

public class KnightTour {
	public static boolean checkValidGrid(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int mat = row * col;
		int xpos = 0;
		int ypos = 0;
		int c=0;
		int gx=0;
		int gy=0;
		for (int i = 0; i < mat; i++) {
			int count = 0;
			while (count <= 8) {
				if (xpos < row && xpos>=0 && ypos < col && ypos>=0) {
					int s=grid[xpos][ypos];
					if (grid[xpos][ypos] == i) {
						gx=xpos;
						gy=ypos;
						c++;
						break;
					}
				}
				if(count==8) {
					break;
				}
				switch (count) {
				case 0: {
					xpos=gx+1;
					ypos=gy+2;
					count++;
					break;
				}
				case 1:{
					xpos=gx-1;
					ypos=gy+2;
					count++;
					break;
				}
				case 2: {
					xpos=gx+1;
					ypos=gy-2;
					count++;
					break;
				}
				case 3:{
					xpos=gx-1;
					ypos=gy-2;
					count++;
					break;
				}
				case 4: {
					xpos=gx-2;
					ypos=gy+1;
					count++;
					break;
				}
				case 5:{
					xpos=gx+2;
					ypos=gy+1;
					count++;
					break;
				}
				case 6: {
					xpos=gx+2;
					ypos=gy-1;
					count++;
					break;
				}
				case 7:{
					xpos=gx-2;
					ypos=gy-1;
					count++;
					break;
				}
				case 8:{
					break;
				}
				}
			}
		}
		if(c==mat) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
//		int[][] grid = { { 0, 11, 16, 5, 20 }, { 17, 4, 19, 10, 15 }, { 12, 1, 8, 21, 6 }, { 3, 18, 23, 14, 9 },
//				{ 24, 13, 2, 7, 22 } };
		int[][] grid= {{0,3,6},{5,8,1},{2,7,4}};
		System.out.println(checkValidGrid(grid));
	}
}
