package com.leetcode75;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String res = null;
		if(strs.length==1) {
			res= strs[0];
		}
		for (int i = 0; i < strs.length - 1; i++) {
			String str1 = strs[i];
			String str2 = strs[i + 1];
			int k = 0;
			int s1 = str1.length();
			int s2 = str2.length();
			int l = 1;
			for (int j = 0; j < str1.length(); j++) {
				if (l > s1 || l > s2) {
					break;
				}
				if (str1.substring(k, j + 1).equals(str2.substring(k, j + 1))) {
					res = str1.substring(k, j + 1);

				}
				l++;

			}
		}
		if (res==null) {
			res="";
			return res;
		} else {

			return res;
		}

	}

	public static void main(String[] args) {
		String[] str = { "a"};
		String res = longestCommonPrefix(str);
		System.out.println(res);
	}
}
