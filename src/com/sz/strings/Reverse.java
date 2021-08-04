package com.sz.strings;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverseRecursively("Sanjay"));
	}
	
	public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

}
