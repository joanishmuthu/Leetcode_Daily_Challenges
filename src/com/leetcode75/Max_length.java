package com.leetcode75;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Max_length {
	public static int maxLength(List<String> arr) {
		ArrayList<String> res = new ArrayList<>();
		if (arr.size() == 1) {
			return arr.get(0).length();
		}
		for (int i = 0; i < arr.size(); i++) {
			String s = arr.get(i);
			for (int j = i + 1; j < arr.size(); j++) {
				String[] k = arr.get(j).split("");
				int c = 0;
				for (int l = 0; l < k.length; l++) {
					if (s.contains(k[l])) {
						c++;
					}
				}
				if (c == 0) {
					res.add(arr.get(i) + arr.get(j));
				}
			}
		}
		List<Integer> a= res.stream().map(x->x.length()).toList();

		return Collections.max(a);
	}

	public static void main(String[] args) {
		List<String> arr = new ArrayList<>();
		arr.add("abcdefghijklmnopqrstuvwxyz");
//		arr.add("r");
//		arr.add("act");
//		arr.add("ers");
		System.out.println(maxLength(arr));
	}
}
