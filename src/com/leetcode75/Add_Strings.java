package com.leetcode75;

public class Add_Strings {
    static public String addStrings(String num1, String num2) {
        Integer res=Integer.parseInt(num1)+Integer.parseInt(num2);
        return res.toString();
    }
	public static void main(String[] args) {
		String s1="6913259244";
		String s2="6913259244";
		System.out.println(addStrings(s1, s2));
	}
}
