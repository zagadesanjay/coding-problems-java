package com.sz.cp;

public class FindSumOfConsecutiveNumbers {

	public static void main(String[] args) {
		System.out.println("Sum of consecutive numbers from 3 to 7 is : " + findSum(3, 7));
	}

	//(n / 2)(first number + last number) = sum
	
	private static int findSum (int from, int to) {
		int ans = 0;
		int n = to - from + 1;
		ans = (n * (from + to))/2;
		return ans;
	}
}
