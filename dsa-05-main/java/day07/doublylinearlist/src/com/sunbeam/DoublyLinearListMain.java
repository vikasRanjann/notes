package com.sunbeam;

import java.util.Scanner;

class List {
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}
		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}

	private Node head;
	public List() {
		head = null;
	}
	
	public void displayFwd() {
		System.out.print("Fwd List: ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();
	}
	public void displayRev() {
		System.out.print("Rev List: ");
		if(head != null) {
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			// visit each node and go to its prev node
			while(trav != null) {
				System.out.print(trav.data + ", ");
				trav = trav.prev;
			}
		}
		System.out.println();
	}

	public void addLast(int val) {
		Node newnode = new Node(val);
		if(head == null)
			head = newnode;
		else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newnode;
			newnode.prev = trav;
		}
	}
	
	public void delAll() {
		head = null;
	}
}

public class DoublyLinearListMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List list = new List();
		int choice, val, pos;
		do {
			System.out.print("\n\n1. Display\n2. Add First\n3. Add Last\n4. Add at Pos\n5. Del First\n6. Del Last\n7. Del at Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.displayFwd();
				list.displayRev();
				break;
			/*
			case 2: // AddFirst
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			*/
			case 3: // AddLast
				System.out.print("Enter element: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			/*
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
			*/
			case 8: // DelAll
				list.delAll();
				break;
			}
		}while(choice != 0);
	}
}
