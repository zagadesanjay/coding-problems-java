package com.sz.strings;

public class Anagram {

	public static void main(String[] args) {

	}

	static int makeAnagram(String a, String b) {

		int min_deletions = 0;

		int a_frequencies[] = new int[26];
		int b_frequencies[] = new int[26];

		char aChars[] = a.toCharArray();
		char bChars[] = b.toCharArray();

		for (char c : aChars) {
			int char_to_int = (int) c;
			int position = char_to_int - (int) 'a';
			a_frequencies[position]++;
		}

		for (char c : bChars) {
			int char_to_int = (int) c;
			int position = char_to_int - (int) 'a';
			b_frequencies[position]++;
		}

		for (int i = 0; i < 26; i++) {
			int difference = Math.abs(a_frequencies[i] - b_frequencies[i]);
			min_deletions += difference;
		}

		return min_deletions;

	}

}
