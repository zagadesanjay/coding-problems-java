package com.sz.leetcode;


import java.util.*;

public class GenerateParentheses {

	public static void main(String[] args) {
		
		GenerateParentheses obj = new GenerateParentheses();
		obj.generateParenthesis(2);
	}
	
	
	private List<String> generateParenthesis(int n){

		List<String> list = new ArrayList<>();
		
		char temp[] = new char [n * 2];
		
		
		generateAll(0, temp, list);
		
		
		System.out.println(list);
		return list;
		
			
		
	}
	
	
	private void generateAll(int pos, char [] temp, List<String> list) {
		
		if(temp.length == pos) {
			// check for valid parenthesis
			// add to the list
			
			String str = new String(temp);
			System.out.println(str);
			
			if(isValid(temp)) list.add(str);
			
			return;
		}
		
		temp[pos] = '(';
		generateAll(pos +1, temp, list);
		temp[pos] = ')';
		generateAll(pos + 1, temp, list);
		
	}
	
	
	public boolean isValid(char []temp) {
		
		int cnt = 0;
		
		for(char c : temp) {
			if(c=='(') cnt ++;
			else cnt --;
			
			if(cnt< 0) return false;
		}
		
		return (cnt==0);
	}
	
	

}
