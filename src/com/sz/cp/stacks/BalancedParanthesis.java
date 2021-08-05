package com.sz.cp.stacks;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		System.out.println(isValid("[[])"));
	}

	private static boolean isValid(String str) {

		if (str.length() % 2 != 0)
			return false;

		Stack<Character> stack = new Stack<>();

		for (char c : str.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}

		}

		return stack.isEmpty();
	}

}
