package com.sz.strings;

public class IntegerPalindrom {

	public static void main(String[] args) {

		
		String str = String.valueOf(-121);
		System.out.println(isPalindrome(str));
		
		
	}
	
	
	private static boolean isPalindrome(String str) {
		
		int i = 0;
		int j = str.length()-1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		
		return true;
	}

}
