package com.sz.cp;

import java.util.ArrayList;
import java.util.List;

public class StringSearchMain {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		list.add("Sanjay");
		list.add("Sanjeev");
		list.add("Sana");
		list.add("Akshay");
		
		
		for(String str : list) {
			if(str.startsWith("San")) {
				System.out.println(str);
			}
		}
				
		
		String name = "Sanjay";
		
		System.out.println(name.substring(1));
		
	}

}
