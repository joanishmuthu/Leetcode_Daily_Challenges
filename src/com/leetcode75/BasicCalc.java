package com.leetcode75;

import java.util.ArrayDeque;
import java.util.Deque;

public class BasicCalc {
    public static int calculate(String s) {
        char[] arr=s.toCharArray();
        Deque<Integer> nums=new ArrayDeque<>();
        Deque<Character> chars=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++) {
        	if(Character.isDigit(arr[i])) {
        		int a=arr[i]-'0';
        		nums.add(a);
        	}
        	else {
        		chars.add(arr[i]);
        	}
        }
        while(!chars.isEmpty()) {
        	Character c=chars.pop();
        	int a=nums.pop();
        	int b=nums.pop();
        	int d=0;
        	if(c=='+') {
        		d=a+b;
        		nums.push(d);
        	}
        	else if(c=='-') {
        		d=a-b;
        		nums.push(d);
        	}
        	else if(c=='*') {
        		d=a*b;
        		nums.push(d);
        	}
        	else if(c=='/') {
        		d=a/b;
        		nums.push(d);
        	}
        }
        return nums.pop();
    }
    public static void main(String[] args) {
		String s="3+5/2";
		System.out.println(calculate(s));
	}
}
