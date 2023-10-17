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
	public void display() {
		System.out.print("List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void selectionSort() {
		Node i, j;
		for(i=head; i!=null; i=i.next) {
			for(j=i.next; j!=null; j=j.next) {
				if(i.data > j.data) {
					int t = i.data;
					i.data = j.data;
					j.data = t;
				}
			}
		}
	}
	
	public void bubbleSort1() {
		Node i, j;
		for(i=head; i.next!=null; i=i.next) {
			for(j=head; j.next!=null; j=j.next) {
				Node j1 = j.next;
				if(j.data > j1.data) {
					int t = j.data;
					j.data = j1.data;
					j1.data = t;
				}
			}
		}
	}
	
	public void bubbleSort2() {
		Node i, j, pj;
		if(head == null)
			return;
		for(i=head; i.next!=null; i=i.next) {
			pj = null;
			for(j=head; j.next!=null; j=j.next) {
				Node j1 = j.next;
				if(j.data > j1.data) {
					if(pj == null)
						head = j1;
					else
						pj.next = j1;
					j.next = j1.next;
					j1.next = j;
					j = j1;
				}
				pj = j;
			}
		}
	}
	
	private void displayRev(Node trav) {
		if(trav == null)
			return;
		displayRev(trav.next);
		System.out.print(trav.data + ", ");
	}
	
	public void displayRev() {
		System.out.print("Rev : ");
		displayRev(head);
		System.out.println();
	}

	/*
	public Node reverse(Node trav) {
		if(trav.next == null) {
			head = trav;
			return trav;
		}
		Node last = reverse(trav.next);
		last.next = trav;
		trav.next = null;
		return trav;
	}
	*/
	
	public Node reverse(Node trav) {
		if(trav.next == null) {
			head = trav;
			return trav;
		}
		reverse(trav.next).next = trav;
		trav.next = null;
		return trav;
	}
	
	public void reverse() {
		if(head != null)
			reverse(head);
	}
	
	private int max;
	public void printMid(Node trav, int pos) {
		if(trav == null) {
			max = pos;
			return;
		}
		printMid(trav.next, pos + 1);
		if(pos == max/2)
			System.out.println("Mid : " + trav.data);
	}
	
	public void printMid() {
		printMid(head, 1);
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
		//list.bubbleSort2();
		//list.display();
		//list.displayRev();
		//list.reverse();
		//list.display();
		list.printMid();
	}
}








