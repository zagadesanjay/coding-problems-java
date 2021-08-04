package com.sz.cp.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();
		stack.push('m');
		stack.push('a');
		stack.push('d');
		stack.push('a');
		stack.push('x');

		System.out.println(isPalindrome(stack, stack.size()));
	}

	private static boolean isPalindrome(Stack<Character> stack, int size) {

		boolean isOdd = true;
		if (size % 2 == 0) {
			isOdd = false;
		}

		int mid = size / 2;

		List<Character> list = new ArrayList();

		for (int i = 0; i <= mid; i++) {
			char c = stack.pop();
			if (isOdd && i == mid) {
				stack.pop();
				break;
			}
			list.add(c);
		}

		int i = 0;
		while (!stack.isEmpty()) {

			if (list.get(i) != stack.pop())
				return false;
			
			i++;

		}
		return true;

	}

}
