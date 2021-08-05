package com.sz.leetcode;

public class ReverseInteger_7 {

	public static void main(String[] args) {

		System.out.println(reverseInteger(123));

	}

	private static int reverseInteger(int x) {

		int out = 0;

		while (x != 0) {
			
			int mod = x % 10;

			out = out * 10 + mod;

			x /= 10;

		}
		return out;

	}

}
