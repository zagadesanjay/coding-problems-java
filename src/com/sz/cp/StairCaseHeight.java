package com.sz.cp;

public class StairCaseHeight {

	public static void main(String[] args) {
		System.out.println("Height = " + height(14));
		
	}

	public static int height(int blocks) {
		int num = 0;
		int i = 1;
		int cnt = 0;

		while (num <= blocks) {
			num = num + i;
			System.out.println(num);
			i++;
			cnt++;

		}
		cnt--;
		return cnt;
	}

}
