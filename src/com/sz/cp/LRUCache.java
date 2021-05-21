package com.sz.cp;

import java.util.HashMap;

public class LRUCache {

	private int capacity;
	private HashMap<Integer, Node> map;
	
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<Integer, LRUCache.Node>();
		
	}

	class Node{
		
		int val;
		Node next, pre;
		public Node(int val) {
			super();
			this.val = val;
		}
	}
	
	public void deleteNode(Node node) {
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}
	
	public void moveToHead() {
		
	}
	
	
	public int get(int key) {
		return 1;
	}
	
	
	public void set(int key, int val) {
		if(map.get(key) != null) {
			Node node = map.get(key);
			node.val = val;
			deleteNode(node);
		}
	}
	
	
	
	

}
