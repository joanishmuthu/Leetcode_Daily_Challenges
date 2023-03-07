package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;

public class LongestSubstring {
	public static int lengthOfLongestSubstring(String s) {
		String[] str = s.split("");
		String k = "";
		String q = "";
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			k = "";
			for (int p = 0; p <= i; p++) {
				k = k + str[p];
			}
			q = "";
			for (int j = i + 1; j < str.length; j++) {
				q = q + str[j];
				String[] h = q.split("");
				if (!q.equals(h[j - 1])) {
					if (k.equals(q)) {
						arr.add(k.length());
					}
				}
			}
		}
		Collections.sort(arr);
		return arr.get(arr.size() - 1);
	}

	public static void main(String[] args) {
		String s = "bbbbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
