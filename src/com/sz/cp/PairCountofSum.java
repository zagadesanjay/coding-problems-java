package com.sz.cp;

import java.util.HashMap;

public class PairCountofSum {

	public static void main(String[] args) {

		int arr[] = {1,5,7,-1};
		int sum = 6;
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0;i<arr.length;i++) {
			map.put(arr[i], 0);
		}
		int cnt =0;
		
		for(int i = 0;i<arr.length;i++) {
			if(map.get(sum-arr[i]) != null) {
				cnt++;
			}
		}
		cnt = cnt/2;
		System.out.println(cnt);
		
	}

}
