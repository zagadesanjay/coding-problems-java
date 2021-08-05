package com.sz.strings;

import java.util.*;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "abcbba";
		System.out.println(findNonRepeatingChar3(str));
	}

	/*
	 * Brute force O(N^2)
	 */
	public static char findNonRepeatingChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			boolean seenDuplicate = false;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					seenDuplicate = true;
					break;
				}
			}

			if (!seenDuplicate) {
				return str.charAt(i);
			}
		}

		return '_';
	}

	/*
	 * O(2N) => O(N) HashMap doesnt maintain insertion order so need to iterate all
	 * characters and find first char whose count is 1 in map
	 */
	public static char findNonRepeatingChar2(String str) {
		HashMap<Character, Integer> chars_count = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (chars_count.containsKey(c)) {
				chars_count.put(c, chars_count.get(c) + 1);
			} else {
				chars_count.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (chars_count.get(c) == 1) {
				return c;
			}
		}

		return '_';

	}

	/*
	 * 
	 */
	public static char findNonRepeatingChar3(String str) {

		int count[] = new int[26];

		for (char c : str.toCharArray())
			count[c - 'a']++;

		for (char c : str.toCharArray()) {
			if (count[c - 'a'] == 1)
				return c;
		}

		return '_';

	}

}
