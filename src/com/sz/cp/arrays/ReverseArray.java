package com.sz.cp.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		reverseArrayIterative(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}

		int arr2[] = { 1, 2, 3, 4, 5, 6 };
		int start = 0;
		int end = arr2.length - 1;

		reverseArrayRecursive(arr2, start, end);

		System.out.println();
		
		for (int i : arr2) {
			System.out.print(i + " ");
		}

	}

	private static void reverseArrayIterative(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	private static void reverseArrayRecursive(int[] arr, int start, int end) {

		if (start >= end)
			return;

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverseArrayRecursive(arr, start + 1, end - 1);
	}
}
