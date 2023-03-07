package com.leetcode75;

import java.util.Scanner;

public class Roman_to_integer {
	public static int[] roman(char before, char after) {
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 1;
		if (before == 'I' && after == 'V') {
			res[0] = 4;
			res[1] = 2;
			return res;
		} else if (before == 'X' && after == 'L') {
			res[0] = 40;
			res[1] = 2;
			return res;
		} else if (before == 'I' && after == 'X') {
			res[0] = 9;
			res[1] = 2;
			return res;
		} else if (before == 'X' && after == 'C') {
			res[0] = 90;
			res[1] = 2;
			return res;
		} else if (before == 'C' && after == 'D') {
			res[0] = 400;
			res[1] = 2;
			return res;
		} else if (before == 'C' && after == 'M') {
			res[0] = 900;
			res[1] = 2;
			return res;
		} else if (before == 'I') {
			res[0] = 1;
			return res;
		} else if (before == 'V') {
			res[0] = 5;
			return res;
		} else if (before == 'X') {
			res[0] = 10;
			return res;
		} else if (before == 'L') {
			res[0] = 50;
			return res;
		} else if (before == 'C') {
			res[0] = 100;
			return res;
		}

		else if (before == 'D') {
			res[0] = 500;
			return res;
		} else if (before == 'M') {
			res[0] = 1000;
			return res;
		} else {
			return res;
		}

	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String s=scanner.next();
		int sum = 0;
		int j = 0;
		for (int i = 0; i < s.length() ; i++) {
			if (j == s.length()) {
				break;
			} else {
				int[] n =new int[2];
				if (j == s.length() - 1) {
					n = roman(s.charAt(j), s.charAt(j));
				} else {
					n = roman(s.charAt(j), s.charAt(j + 1));

				}
				int val = n[0];
				int inc = n[1];
				sum = sum + val;
				j = j + inc;
			}
		}
		System.out.println(sum);
	}
}
