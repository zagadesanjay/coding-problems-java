package com.sz.leetcode.string;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters_3 {

	public static void main(String[] args) {

		/*
		 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
		 * length of 3.
		 * 
		 * 
		 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
		 * of 1.
		 */

		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	/*
	 * Sliding Window approach
	 */
	public static int lengthOfLongestSubstring(String s) {
		int max = 0, a = 0, b = 0;
		HashSet<Character> set = new HashSet<>();
		while (b < s.length()) {
			if (!set.contains(s.charAt(b))) {
				set.add(s.charAt(b));
				max = Math.max(max, set.size());
				b++;
			} else {
				set.remove(s.charAt(a));
				a++;
			}
		}
		return max;
	}

}
