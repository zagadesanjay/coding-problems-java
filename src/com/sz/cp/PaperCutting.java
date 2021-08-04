package com.sz.cp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PaperCutting {

	public static void main(String[] args) {

//		List<Integer> starting = Arrays.asList(1, 1, 6, 7);
//		List<Integer> ending = Arrays.asList(5, 3, 8, 10);
		
		
//		List<Integer> starting = Arrays.asList(3,4,5,6,8);
//		List<Integer> ending = Arrays.asList(4,5,6,7,8);
		
		List<Integer> starting = Arrays.asList(3,1,2,8,8);
		List<Integer> ending = Arrays.asList(5,3,7,10,10);

		System.out.println(paperCutting(0, starting, ending));

	}

	public static long paperCutting(int textLenght, List<Integer> starting, List<Integer> ending) {

		long ret = 0;

		Map<Integer, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
 		for(int i = 0; i < starting.size(); i++) {
 			for (int j = i + 1; j < starting.size(); j++) {
 				if(starting.get(i) == starting.get(j) && ending.get(i) == ending.get(j)) {
 					set.add(j);
 				}
 			}
		}
		
 		
 		for(int i : set) {
 			starting.remove(i);
 			ending.remove(i);
 		}
		
		
		for (int i = 0; i < starting.size(); i++) {
			
			for (int j = i + 1; j < starting.size(); j++) {

				if (starting.get(j) > ending.get(i)) {
					ret++;
				}
			}

		}

		return ret;

	}
}
