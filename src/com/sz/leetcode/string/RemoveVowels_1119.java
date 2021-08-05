package com.sz.leetcode.string;

import java.util.Arrays;

import java.util.*;

public class RemoveVowels_1119 {

	public static void main(String[] args) {

		Character vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		
		List<Character> list = Arrays.asList(vowels);
		
		StringBuffer sb = new StringBuffer("Sanjay Zagade");
		
		for(int i=0 ; i<sb.length(); i++) {
			if(list.contains(sb.charAt(i))) {
				sb.replace(i, i+1, "");
				i--;
			}
		}
		
		
		System.out.println(sb.toString());
		
	}

}
