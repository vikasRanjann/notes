package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	private Queue<Integer> q;
	public StackUsingQueue() {
		q = new LinkedList<Integer>();
	}
	// time complexity: O(n), aux space: O(1)
	public void push(int val) {
		int size = q.size();
		q.offer(val);
		for (int i = 1; i <= size; i++) {
			int temp = q.poll();
			q.offer(temp);
		}
	}
	// time complexity: O(1), aux space: O(1)
	public int pop() {
		return q.poll();
	}
	// time complexity: O(1), aux space: O(1)
	public int peek() {
		return q.peek();
	}
	// time complexity: O(1), aux space: O(1)
	public boolean isEmpty() {
		return q.isEmpty();
	}
}

// Assignment: Implement stack using queue; but push() operation time should be O(1).
//		Hint: pop() operation can be O(n).
