package com.sz.strings;

import java.util.Arrays;

public class PangramCheck {

	public static void main(String[] args) {
			
		String str = "The quick brown fox jumps over the lazy dog";

		boolean mark[] = new boolean[26];
		
//		System.out.println(mark[0]);
		
//		Arrays.fill(mark, true);
		
//		System.out.println(mark[0]);
//		
//		System.out.println('y' - 'a');
		
		int index;
		
		for(int i=0; i<str.length(); i++) {
			
			if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				index = str.charAt(i) - 'A';
			} else if('a' <= str.charAt(i) && 'z' >= str.charAt(i)) {
				index = str.charAt(i) - 'a';
			}else {
				continue;
			}
			
			mark[index] = true;
			
		}
		
		for(boolean bool : mark) {
			if(bool == false) {
				System.out.println("Not Pangram");
			}
		}
		
		System.out.println("Is Panagram");
	}

}
