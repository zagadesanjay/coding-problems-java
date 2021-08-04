package com.sz.strings;

public class LenghtOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord(" "));
	}

	
	public static int lengthOfLastWord(final String A) {

		String 	b = A.trim();
		 if (b == null || b.isEmpty())
		        return 0;
	       String arr[] = b.split(" ");

	       return arr[arr.length-1].length();
	    }
}
