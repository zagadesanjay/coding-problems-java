package com.sz.leetcode;


import java.util.*;

public class TwoSum_1 {

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int[] out = twoSum2(nums, 18);
		for (int a : out) {
			System.out.print(a + "  ");
		}

	}

	/*
	 * brute force - O(N^2)
	 */
	public static int[] twoSum(int num[], int target) {

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No match found");
	}

	
	
	/*
	 *  O(N)
	 */

	public static int[] twoSum2(int nums[], int target) {
		
		HashMap<Integer, Integer> num_index = new HashMap<>();
		
		for(int i = 0 ; i< nums.length; i++) {
			int complement = target - nums[i];
			if(num_index.containsKey(complement)) {
				return new int [] {num_index.get(complement), i};
			}
			
			num_index.put(nums[i], i);
			
		}
		
		throw new IllegalArgumentException("No match found");

	}

}
