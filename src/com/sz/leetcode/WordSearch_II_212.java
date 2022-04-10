package com.sz.leetcode;

import java.util.*;

public class WordSearch_II_212 {

	List<String> list = new ArrayList<>();

	char[][] board = null;

	public static void main(String[] args) {

		char[][] b = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' }, { 'i', 'f', 'l', 'v' }

		};

		WordSearch_II_212 obj = new WordSearch_II_212();

		System.out.println(obj.findWords(b, new String[] { "oath", "pea", "eat", "rain" }));
	}

	public List<String> findWords(char[][] board, String[] words) {
		// Construct Trie

		TrieNode root = new TrieNode();

		for (String word : words) {

			TrieNode node = root;
			for (char c : word.toCharArray()) {
				if (node.child.containsKey(c)) {
					node = node.child.get(c);
				} else {

					TrieNode newNode = new TrieNode();
					node.child.put(c, newNode);
					node = newNode;
				}
			}

			node.word = word;
		}

		this.board = board;
		
		//  Iterate through board 
		
		for(int row = 0; row< board.length; row++) {
			for(int col=0; col<board[0].length; col++) {
				dfs(row, col, root);
			}
		}
		
		
		return list;
	}

	public void dfs(int row, int col, TrieNode parent) {
		
		char c = this.board[row][col];
	    TrieNode currNode = parent.child.get(c);
	    
	    if(currNode == null) return;
	    if(currNode.word != null) {
	    	list.add(currNode.word);
	    	currNode.word = null;
	    }
	    
	    this.board[row][col] = '#';
	    
	    int rowOffsets[] = {0, 1,0,-1};
	    int colOffsets[] = {1,0,-1,0};
	    
	    for(int i=0;i<4;i++) {
	    	int newRow = row + rowOffsets[i];
	    	int newCol = col + colOffsets[i];
	    	
	    	if(newRow < 0 || newRow >= board.length || newCol < 0 || newCol >= board[0].length) continue;
	    	
	    	if(currNode.child.containsKey(board[newRow][newCol])) {
	    		dfs(newRow, newCol, currNode);
	    	}
	    	
	    }
	  
	    this.board[row][col] = c;
	}

	class TrieNode {

		String word = null;
		HashMap<Character, TrieNode> child = new HashMap<>();

		public TrieNode() {

		}

	}

}
