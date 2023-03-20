package com.leetcode75;

import java.util.LinkedList;

public class DesignBrowserHistory {
	String homepage;
	int index;
	LinkedList<String> visited=new LinkedList<>();
    public DesignBrowserHistory(String homepage) {
        this.homepage=homepage;
        visited.add(homepage);
        index=0;
    }
    
    public void visit(String url) {
    	if(index<visited.size() &&  index!=visited.size()-1) {
    		for(int i=index;i<visited.size();i++) {
    			visited.removeLast();
    		}
    	}
        visited.add(url);
        index=visited.size()-1;
    }
    
    public String back(int steps) {
    	int i=index-steps;
        int size=visited.size();
        if(i<size && i>0) {
        	int count=0;
        	while(count!=steps) {
        		count++;
        		index--;
        	}
        	return visited.get(index);
        }
        else {
        	return null;
        }
        
    }
    
    public String forward(int steps) {
        int i=steps+index;
        int size=visited.size();
        if(i<size) {
        	int count=0;
        	while(count!=steps) {
        		count++;
        		index++;
        	}
        	return visited.get(index);
        }
        else {
        	return null;
        }
    }
	public static void main(String[] args) {
		DesignBrowserHistory db=new DesignBrowserHistory("leetcode.com");
		db.visit("Google");
		db.visit("facebook");
		db.visit("Youtube");
		System.out.println(db.back(1));
		System.out.println(db.back(1));
		System.out.println(db.forward(1));
		db.visit("linkedin");
		System.out.println(db.forward(2));
		System.out.println(db.back(2));
	}
}
