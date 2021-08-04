package com.sz.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.*;

public class WordCount {

	public static void main(String[] args) {

		
		String arr[] = { "word1", "word2", "word1", "word3", "word4","word4", "word3", "word5" };
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String a : arr) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		System.out.println(list);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		list = list.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		
		
		
		
		
	}

}
