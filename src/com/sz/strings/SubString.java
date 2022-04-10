package com.sz.strings;

public class SubString {

	public static void main(String[] args) {
		String str = "sanjay";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}

		}

		printAllPossibleSubstrings("welcometojava", 3);

		printSubstring("welcometojava", 3);

	}

	private static void printAllPossibleSubstrings(String str, int k) {

		for (int i = 0; i < str.length() - (k - 1); i++) {
			StringBuffer sb = new StringBuffer();

			for (int j = 0; j < k; j++) {
				sb.append(str.charAt(i + j));
			}

			System.out.println(sb.toString());

		}

	}

	
	
	private static void printSubstring(String str, int k) {
		for (int i = 0; i < str.length() - (k - 1); i++) {
			System.out.println(str.substring(i, i + k));
		}
	}

}
