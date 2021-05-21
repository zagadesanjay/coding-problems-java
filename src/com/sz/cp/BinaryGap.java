package com.sz.cp;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binStr = "1000100001000000";

		int arr[] = new int[binStr.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(String.valueOf(binStr.charAt(i)));
		}

		int max = 0;
		boolean flag = false;

		int cnt = 0;

		for (int i : arr) {

			if (i == 1) {
				if (flag) {
					if (cnt > max)
						max = cnt;
					cnt = 0;
				}
				flag = true;
			}else {
				if(flag)
				cnt++;
			}
		}

		System.out.println(max);
		
	}

}
