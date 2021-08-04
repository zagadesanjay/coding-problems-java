package com.sz.cp.arrays;

public class RightRotateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };

		for (int i = 0; i < 2; i++) {
			rotateRight(arr);
		}

		for (int a : arr) {
			System.out.print(a + "  ");
		}

		int out[] = { 4, 1, 2, 3 };

	}

	private static void rotateRight(int arr[]) {

		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arr[0] = temp;
			} else {
				int temp2 = arr[i + 1];
				arr[i + 1] = temp;
				temp = temp2;
			}
		}

	}

}
