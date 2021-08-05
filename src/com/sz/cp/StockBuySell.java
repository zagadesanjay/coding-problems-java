package com.sz.cp;

public class StockBuySell {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 4, 8, 7, 2, 5 };
		System.out.println(maxProfit(arr));
	}

	/*
	 * 
	 */
	private static int maxProfit(int arr[]) {

		int minSoFar = arr[0];

		int maxProfit = 0;

		for (int i = 1; i < arr.length; i++) {

			if (maxProfit < (arr[i] - minSoFar)) {
				maxProfit = (arr[i] - minSoFar);
			}

			minSoFar = Math.min(arr[i], minSoFar);

		}
		return maxProfit;

	}

}
