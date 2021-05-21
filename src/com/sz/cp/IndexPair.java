package com.sz.cp;

public class IndexPair {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,6,8,4,5,4,5};
		int k =3;
		int i=0;
		int j= i+k;
		
		while(j < arr.length) {
			System.out.println("Pair: (" + i +","+ j + ")" );
			i++;
			j=i+k;
		}
	}
}
