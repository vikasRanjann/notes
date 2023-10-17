package com.sunbeam;

import java.util.Scanner;

class List {
	static class Node {
		private int data;
		private Node next;
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	public List() {
		head = null;
		tail = null;
	}
	// O(1)
	public void addLast(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	// O(1)
	public void addFirst(int val) {
		Node newnode = new Node(val);
		if(head == null) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}
	// O(n)
	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	// O(1)
	public int delFirst() {
		int val = 0;
		if(head != null) {
			val = head.data;
			head = head.next;
		}
		if(head == null)
			tail = null;
		return val;
	}
	
	public void delAll() {
		head = null;
	}
	
	// O(n) // not required for stack/queue implementation
	public void delLast() {
		// if list is empty, do nothing
		if(head == null)
			return;
		// if list has single node, delete it
		if(head.next == null) {
			head = null;
			tail = null;
		} 
		else {
			// traverse (trav) till last node and run an additional pointer behind it (prev)
			Node prev = null, trav = head;
			while(trav.next != null) {
				prev = trav;
				trav = trav.next;
			}
			// add null to prev node's next
			prev.next = null;
			// update the tail
			tail = prev;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public int first() {
		if(head == null)
			return 0;
		return head.data;
	}
}

class Stack {
	private List list;
	public Stack() {
		list = new List();
	}
	public void push(int val) {
		list.addFirst(val);
	}
	public int pop() {
		return list.delFirst();
	}
	public int peek() {
		return list.first();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}

class Queue {
	private List list;
	public Queue() {
		list = new List();
	}
	public void push(int val) {
		list.addLast(val);
	}
	public int pop() {
		return list.delFirst();
	}
	public int peek() {
		return list.first();
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
}


public class StackQueueMain {
	public static void main(String[] args) {
		System.out.println("---------- Stack Operations ------------");
		Stack s = new Stack();
		s.push(10);
		System.out.println("Pushed: 10");
		s.push(20);
		System.out.println("Pushed: 20");
		s.push(30);
		System.out.println("Pushed: 30");
		s.push(40);
		System.out.println("Pushed: 40");
		while(!s.isEmpty()) {
			System.out.println("Popped: " + s.pop());
		}

	
		System.out.println("\n---------- Queue Operations ------------");
		Queue q = new Queue();
		q.push(10);
		System.out.println("Pushed: 10");
		q.push(20);
		System.out.println("Pushed: 20");
		q.push(30);
		System.out.println("Pushed: 30");
		q.push(40);
		System.out.println("Pushed: 40");
		while(!q.isEmpty()) {
			System.out.println("Popped: " + q.pop());
		}

	}
}
