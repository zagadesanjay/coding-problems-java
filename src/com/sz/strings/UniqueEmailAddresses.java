package com.sz.strings;

import java.util.*;

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };

		// OUTPUT : "testemail@leetcode.com" and "testemail@lee.tcode.com" actually
		// receive mails.

		HashSet<String> set = new HashSet<>();

		for (String email : emails) {
			set.add(correctedEmail(email));
		}

		for (String email : set) {
			System.out.println(email);
		}

	}

	private static String correctedEmail(String email) {

		String[] arr = email.split("@");

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < arr[0].length(); i++) {
			if (arr[0].charAt(i) == '+')
				break;
			if (arr[0].charAt(i) == '.')
				continue;
			sb.append(arr[0].charAt(i));
		}

		return sb.toString() + "@" + arr[1];

	}

}
