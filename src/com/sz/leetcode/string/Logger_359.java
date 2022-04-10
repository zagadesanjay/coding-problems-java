package com.sz.leetcode.string;

import java.util.*;

public class Logger_359{
	
	
	public static void main(String[] args) {
		Logger logger = new Logger();
		
//		logger.shouldPrintMessage(1, "foo");  // return true, next allowed timestamp for "foo" is 1 + 10 = 11
//		logger.shouldPrintMessage(2, "bar");  // return true, next allowed timestamp for "bar" is 2 + 10 = 12
//		logger.shouldPrintMessage(3, "foo");  // 3 < 11, return false
//		logger.shouldPrintMessage(8, "bar");  // 8 < 12, return false
//		logger.shouldPrintMessage(10, "foo"); // 10 < 11, return false
//		logger.shouldPrintMessage(11, "foo"); // 11 >= 11, return true, next allowed timestamp for "foo" is 11 + 10 = 21
		
		System.out.println(logger.shouldPrintMessage(1, "foo"));
		System.out.println(logger.shouldPrintMessage(2, "bar"));
		System.out.println(logger.shouldPrintMessage(3, "foo"));
		System.out.println(logger.shouldPrintMessage(8, "bar"));
		System.out.println(logger.shouldPrintMessage(10, "foo"));
		System.out.println(logger.shouldPrintMessage(11, "foo"));
	}
}


class Pair<U, V> {
	public U first;
	public V second;

	public Pair(U first, V second) {
		this.first = first;
		this.second = second;
	}
}

class Logger {
	private LinkedList<Pair<String, Integer>> msgQueue;
	private HashSet<String> msgSet;

	/** Initialize your data structure here. */
	public Logger() {
		msgQueue = new LinkedList<Pair<String, Integer>>();
		msgSet = new HashSet<String>();
	}

	/**
	 * Returns true if the message should be printed in the given timestamp,
	 * otherwise returns false.
	 */
	public boolean shouldPrintMessage(int timestamp, String message) {

		// clean up.
		while (msgQueue.size() > 0) {
			Pair<String, Integer> head = msgQueue.getFirst();
			if (timestamp - head.second >= 10) {
				msgQueue.removeFirst();
				msgSet.remove(head.first);
			} else
				break;
		}

		if (!msgSet.contains(message)) {
			Pair<String, Integer> newEntry = new Pair<String, Integer>(message, timestamp);
			msgQueue.addLast(newEntry);
			msgSet.add(message);
			return true;
		} else
			return false;

	}
}
