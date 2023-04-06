package com.leetcode75;

public class NoOfClosedIslands {
	public static int closedIsland(int[][] grid) {
		int i = 0;
		int j = 0;
		int closed = 0;
		while (i < grid.length) {
			while (j < grid[0].length) {
				if (grid[i][j] == 0) {
					if (isClosedIsland(grid, i, j, grid.length-1, grid[0].length-1)) {
						++closed;
					}
				}
				j++;
			}
			i++;
		}
		return closed;
	}

	private static boolean isClosedIsland(int[][] grid, int i, int j, int length, int length2) {
		// TODO Auto-generated method stub
		if (grid[i][j] == -1 || grid[i][j] == 1) {
			return true;
		}
		if (isPerimeter(grid, i, j)) {
			return false;
		}
		grid[i][j] = -1;
		boolean left = isClosedIsland(grid, i, j - 1, length, length2);
		boolean right = isClosedIsland(grid, i, j + 1, length, length2);
		boolean top = isClosedIsland(grid, i - 1, j, length, length2);
		boolean bottom = isClosedIsland(grid, i + 1, j, length, length2);
		return left && right && top && bottom;
	}

	private static boolean isPerimeter(int[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[][] grid = {{0,0,1,0,0},{0,1,0,1,0},{0,1,1,1,0}};
		System.out.println(closedIsland(grid));
	}
}
