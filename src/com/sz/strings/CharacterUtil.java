package com.sz.strings;

public class CharacterUtil {

	public static void main(String[] args) {
		String str = "abcabcbb";
		
		int chars[] = new int [128];
		
		
		for(int i = 0 ; i< str.length(); i++) {
			chars[str.charAt(i)]++;
		}
		
		System.out.println(chars['a']);
		System.out.println(chars['b']);
		System.out.println(chars['c']);
		
		
		String temp = "as f3.";
		System.out.println("=========================>>>>");
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isDigit('1'));
		
		
		
		

	}

}
