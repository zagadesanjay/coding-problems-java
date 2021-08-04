package com.sz.cp;

import java.util.HashMap;

public class LRUCache {

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);
		cache.put(1, 11);
		cache.put(2, 22);
		cache.put(3, 33);
		cache.put(4, 44);

		System.out.println(cache.get(2));

	}

	private int capacity;
	private HashMap<Integer, Node> map;

	private Node head = new Node(0, 0), tail = new Node(0, 0);

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<Integer, LRUCache.Node>();

		head.next = tail;
		tail.pre = head;
	}

	class Node {
		int val, key;
		Node next, pre;

		public Node(int key, int val) {
			super();
			this.val = val;
			this.key = key;
		}
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node temp = map.get(key);
			remove(temp);
			insert(temp);
			return temp.val;
		}
		return -1;
	}

	public void put(int key, int val) {

		if (map.containsKey(key)) {
			remove(map.get(key));
		}

		if (map.size() == capacity) {
			remove(tail.pre);
		}

		insert(new Node(key, val));
	}

	private void insert(Node node) {

		map.put(node.key, node);
		node.next = head.next;
		node.next.pre = node;
		head.next = node;
		node.pre = head;

	}

	public void remove(Node node) {
		map.remove(node.key);
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}

}
