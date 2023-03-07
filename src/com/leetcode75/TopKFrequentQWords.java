package com.leetcode75;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class TopKFrequentQWords {
	public static List<String> topKFrequent(String[] words, int k) {
		Hashtable<String, Integer> hm = new Hashtable<>();

		for (int i = 0; i < words.length; i++) {
			int c = 1;
			int init = 0;
			for (int j = i + 1; j < words.length; j++) {
				if (hm.containsKey(words[i])) {
					break;
				}

				else if (words[i].equals(words[j])) {
					init++;
					c++;
				} else if (!hm.containsKey(words[i])) {
					init++;
				}
			}
			if (i == (words.length - 1)) {
				if (!hm.containsKey(words[i])) {
					hm.put(words[i], 1);
				}
			}
			if (init > 0) {
				hm.put(words[i], c);
			}

		}
		Enumeration<String> jj = hm.keys();
		for (int s : hm.values()) {
			if (s == k) {

			}
		}
		return null;
	}

	public static void main(String[] args) {
		String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
		topKFrequent(words, 0);
	}
}
