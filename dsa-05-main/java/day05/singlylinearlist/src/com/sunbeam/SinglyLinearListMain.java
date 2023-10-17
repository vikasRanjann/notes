package com.sunbeam;

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
	public List() {
		head = null;
	}
	public void addLast(int val) {
		// create a new node and init it
		Node newnode = new Node(val);
		// if list is empty, the newnode it self is first (head) node
		if(head == null)
			head = newnode;
		else {
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			// add newnode to the next of last node
			trav.next = newnode;
		}
	}
	public void addFirst(int val) {
		// assignment
	}
	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
}

public class SinglyLinearListMain {

	public static void main(String[] args) {
		List list = new List();
		list.addLast(11);
		list.addLast(22);
		list.addLast(33);
		list.addLast(44);
		list.addLast(55);
		list.display();
	}

}
