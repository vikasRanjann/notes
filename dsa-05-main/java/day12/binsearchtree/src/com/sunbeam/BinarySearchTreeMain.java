package com.sunbeam;

import java.util.Stack;

class Tree {
	static class Node {
		private int data;
		private Node left, right;
		private boolean visited;
		public Node() {
			data = 0;
			left = null;
			right = null;
			visited = false;
		}
		public Node(int val) {
			data = val;
			left = null;
			right = null;
			visited = false;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	public Tree() {
		root = null;
	}
	
	public void nonRecAdd(int val) {
		Node newnode = new Node(val);
		if(root == null)
			root = newnode;
		else {
			Node trav = root;
			while(true) {
				if(val < trav.data) {
					if(trav.left == null) {
						trav.left = newnode;
						break;
					}
					else
						trav = trav.left;
				}
				else {
					if(trav.right == null) {
						trav.right = newnode;
						break;
					}
					else
						trav = trav.right;
				}
			}
		}
	}
	
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(trav.data + ", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder() {
		System.out.print("PRE : ");
		preorder(root);
		System.out.println();
	}
	
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);
		System.out.print(trav.data + ", ");
		inorder(trav.right);
	}
	public void inorder() {
		System.out.print("IN  : ");
		inorder(root);
		System.out.println();
	}
	
	public void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);
		postorder(trav.right);
		System.out.print(trav.data + ", ");
	}
	public void postorder() {
		System.out.print("POST: ");
		postorder(root);
		System.out.println();
	}

	public int height(Node trav) {
		if(trav == null)
			return -1;
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = hl > hr ? hl : hr;
		return max + 1;
	}
	public int height() {
		return height(root);
	}

	public void add(Node trav, int val) {
		if(val < trav.data) {
			if(trav.left == null)
				trav.left = new Node(val);
			else
				add(trav.left, val);
		}
		else {
			if(trav.right == null)
				trav.right = new Node(val);
			else
				add(trav.right, val);
		}
	}
	public void add(int val) {
		if(root == null)
			root = new Node(val);
		else
			add(root, val);
	}

	public void delAll() {
		root = null;
	}

	public Node find(Node trav, int val) {
		if(trav == null)
			return null;
		if(val == trav.data)
			return trav;
		if(val < trav.data)
			return find(trav.left, val);
		else
			return find(trav.right, val);
	}
	public Node find(int val) {
		return find(root, val);
	}

	public Node[] nonRecFind(int val) {
		Node trav = root, parent = null;
		while(trav != null) {
			if(val == trav.data)
				return new Node[] { trav, parent };
			parent = trav;
			if(val < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		parent = null;
		return new Node[] { null, null };
	}

	public void nonRecPreorder() {
		System.out.print("PRE : ");
		Node trav = root;
		Stack<Node> s = new Stack<>();
		while(trav != null || !s.isEmpty()) {
			while(trav != null) {
				System.out.print(trav.data + ", ");
				if(trav.right != null)
					s.push(trav.right);
				trav = trav.left;
			}
			if(!s.isEmpty())
				trav = s.pop();
		}
		System.out.println();
	}
	
	public void nonRecInorder() {
		System.out.print("IN  : ");
		Node trav = root;
		Stack<Node> s = new Stack<>();
		while(trav != null || !s.isEmpty()) {
			while(trav != null) {
				s.push(trav);
				trav = trav.left;
			}
			if(!s.isEmpty()) {
				trav = s.pop();
				System.out.print(trav.data + ", ");
				trav = trav.right;
			}
		}
		System.out.println();
	}
	public void nonRecPostorder() {
		System.out.print("POST: ");
		Node trav = root;
		Stack<Node> s = new Stack<>();
		while(trav != null || !s.isEmpty()) {
			while(trav != null) {
				s.push(trav);
				trav = trav.left;
			}
			if(!s.isEmpty()) {
				trav = s.pop();
				if(trav.right == null || trav.right.visited) {
					System.out.print(trav.data + ", ");
					trav.visited = true;
					trav = null;
				}
				else {
					s.push(trav);
					trav = trav.right;
				}
			}
		}
		System.out.println();
	}
}

public class BinarySearchTreeMain {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.add(50);
		t.add(30);
		t.add(90);
		t.add(10);
		t.add(40);
		t.add(70);
		t.add(100);
		t.add(20);
		t.add(60);
		t.add(80);
		t.preorder();
		t.nonRecPreorder();
		t.inorder();
		t.nonRecInorder();
		t.postorder();
		t.nonRecPostorder();
		
		int h = t.height();
		System.out.println("Height: " + h);
		
		/*
		Tree.Node temp = t.find(35);
		if(temp == null)
			System.out.println("Node Not Found.");
		else
			System.out.println("Node Found: " + temp.getData());
		*/
		Tree.Node[] nodes = t.nonRecFind(35);
		if(nodes[0] == null)
			System.out.println("Node Not Found.");
		else {
			System.out.println("Node Found: " + nodes[0].getData());
			if(nodes[1] != null)
				System.out.println("Node Parent: " + nodes[1].getData());
		}
	}
}








