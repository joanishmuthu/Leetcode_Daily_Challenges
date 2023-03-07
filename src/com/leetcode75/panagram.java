package com.leetcode75;

import java.util.ArrayList;
import java.util.Arrays;

public class panagram {
	public static void main(String[] args) {
		String[] l= {"abcd","efghijklmno","pqrstuvwxyz"};
		ArrayList<String> alpha=new ArrayList<>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
		for(int i=0;i<l.length;i++) {
			String[] sub=l[i].split("");
			for(int j=0;j<sub.length;j++) {
				if(alpha.contains(sub[j])) {
					alpha.remove(sub[j]);
				}
			}
		}
		if(alpha.isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("no");
		}
	}
}
