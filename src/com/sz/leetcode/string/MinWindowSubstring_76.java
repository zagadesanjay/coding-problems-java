package com.sz.leetcode.string;

public class MinWindowSubstring_76 {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC", t = "ABC";
		System.out.println(minWindow(s, t));
		
		

	}
	
	
	public static String minWindow(String s, String t) {
        int left = 0, right =0;
        
        int ansStart=0, ansEnd=0, ansLength=Integer.MAX_VALUE;
        
        
        while(right < s.length()) {
        	boolean found = false;
        	for(int i = 0; i< t.length(); i++) {
        		found = false;
        		for(int j = left; j<= right; j++) {
        			if(t.charAt(i) == s.charAt(j)) {
        				found = true;
        				break;
        			}
        		}
        		if(!found) break;
        	}
        	
        	if(found) {
//        		ansLength = Math.min(ansLength, (right - left + 1));
        		
        		if((right - left + 1) < ansLength) {
        			ansLength = (right - left + 1);
        			ansStart = left;
        			ansEnd = right;
        		}
        		
        		left++;
        		right = left;
        	}else {
        		right++;
        	}
        }
        return s.substring(ansStart, ansEnd+1);
    }

}
