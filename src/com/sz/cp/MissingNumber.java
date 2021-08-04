package com.sz.cp;

public class MissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,3,7,8};
		
		findMissingNumber(arr, 8);
		
	}
	
	
	private static void findMissingNumber(int arr[], int n) {
		
		int sum = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			
			sum += arr[i];
			
		}
		
		int total = n*(n+1)/2;
		
		System.out.println(total - sum );
		
		
	}

}
