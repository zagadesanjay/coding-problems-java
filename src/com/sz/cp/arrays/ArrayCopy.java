package com.sz.cp.arrays;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {

		int []arr = {1,2,3,4,5,6,7,8};
		
		int arrCopy[] = Arrays.copyOf(arr, 2);
		
		for(int a : arrCopy) System.out.print(a + " ");
		
		
		someMethod(new int[0]);
		

	}
	
	
	private static void someMethod(int a[]) {
		if(a == null) System.out.println("Array is NULL");
		
		if(a.length ==0) System.out.println("Its zero length Array");
		
	}

}
