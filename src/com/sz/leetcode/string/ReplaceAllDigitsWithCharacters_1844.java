package com.sz.leetcode.string;

public class ReplaceAllDigitsWithCharacters_1844 {

	public static void main(String[] args) {
//		System.out.println(shift('d', 4));
//		System.out.println((int)'0');
//		System.out.println(Integer.valueOf('1'));
//		int n = Character.getNumericValue('1');
//		System.out.println(n);
		
		String str = "a1b2c3d4e";
		
		char []arr = str.toCharArray();
		
		for (int i =1 ; i < arr.length; i += 2) {
//			arr[i] = shift(arr[i-1], arr[i]-'0');
			arr[i] = shift(arr[i-1], Character.getNumericValue(arr[i]));
		}
		
		System.out.println(String.valueOf(arr));
		
	}
	
	
	private static char shift(char c, int n) {
		int temp = c - 'a';
		temp += n;
		return (char)(temp + 'a');
	}

}
