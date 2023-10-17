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
	public List() {
		head = null;
	}
	// O(n)
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
	// O(1)
	public void addFirst(int val) {
		// create new node
		Node newnode = new Node(val);
		// newnode's next to head
		newnode.next = head;
		// head to newnode
		head = newnode;
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
	
	// avg case - O(pos); worst case - O(n); best case - O(1)
	public void addAtPos(int val, int pos) {
		// if list empty or add at pos <= 1, add node at the start
		if(head == null || pos <= 1)
			addFirst(val);
		else {
			// create a new node
			Node newnode = new Node(val);
			// traverse till pos-1
			Node trav = head;
			for(int i=1; i<pos-1; i++) {
				// if reached to last node, break; so that it can add newnode after it.
				if(trav.next == null)
					break;
				trav = trav.next;
			}
			// add node after that pos
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	// O(1)
	public void delFirst() {
		if(head != null)
			head = head.next;
	}
	
	public void delAll() {
		// C++: O(n)
		//while(head != null)
		//	delFirst();
		// O(1)
		head = null;
	}
	
	public void delAtPos(int pos) {
		if(pos < 1)
			return; // do nothing
		if(head == null || pos == 1) // if list empty or del at first pos, call delFirst()
			delFirst();
		else {
			// traverse till pos-1
			Node trav = head;
			for(int i=1; i<pos-1; i++) {
				if(trav.next == null)
					return; // do nothing
				trav = trav.next;
			}
			// get address of next node (temp)
			Node temp = trav.next;
			// make trav next point to temp's next
			trav.next = temp.next;
		}
	}
	
	// O(n)
	public void delLast() {
		// if list is empty, do nothing
		if(head == null)
			return;
		// if list has single node, delete it
		if(head.next == null)
			head = null;
		else {
			// traverse (trav) till last node and run an additional pointer behind it (prev)
			Node prev = null, trav = head;
			while(trav.next != null) {
				prev = trav;
				trav = trav.next;
			}
			// add null to prev node's next
			prev.next = null;
		}
	}
}

public class SinglyLinearListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		int choice, val, pos;
		do {
			System.out.print("\n\n1. Display\n2. Add First\n3. Add Last\n4. Add at Pos\n5. Del First\n6. Del Last\n7. Del at Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.display();
				break;
			case 2: // AddFirst
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3: // AddLast
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4: // AddAtPos
				System.out.print("Enter element: ");
				val = sc.nextInt();
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				list.addAtPos(val, pos);
				break;
			case 5: // DelFirst
				list.delFirst();
				break;
			case 6: // DelLast
				list.delLast();
				break;
			case 7: // DelAtPos
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				list.delAtPos(pos);
				break;
			case 8: // DelAll
				list.delAll();
				break;
			}
		}while(choice != 0);
	}

}
