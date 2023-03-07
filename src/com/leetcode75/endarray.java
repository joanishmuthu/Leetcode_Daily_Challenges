package com.leetcode75;

public class endarray {
	public static int count=1;
	public static void checker(char[][] a) {
		int i=0;
		int j=0;
		recursive(a,i,j);
	}
	
	private static int recursive(char[][] a, int i, int j) {
		// TODO Auto-generated method stub
		if(i==a[0].length-1 && j==a.length-1) {
			return 1;
		}
		else if(i<a[0].length && j<a[0].length) {
			if(a[i][j]==a[i][j+1]) {
				count++;
				return recursive(a,i,j+1);
			}
			else if(a[i][j]==a[i+1][j]) {
				count++;
				return recursive(a,i+1,j);
			}
			else {
				count=0;
				return 1;
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		char[][] a= {{'*','*','#'},{'#','*','#'},{'#','#','*'}};
		checker(a);
		System.out.println(count);
	}
}
