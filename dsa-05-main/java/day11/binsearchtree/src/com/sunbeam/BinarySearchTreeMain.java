package com.sunbeam;

class Tree {
	static class Node {
		private int data;
		private Node left, right;
		public Node() {
			data = 0;
			left = null;
			right = null;
		}
		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}
	}
	
	private Node root;
	public Tree() {
		root = null;
	}
	
	public void add(int val) {
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
}

public class BinarySearchTreeMain {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.add(50);
		t.add(25);
		t.add(10);
		t.add(75);
		t.add(90);
		t.add(35);
		t.add(60);
		t.add(15);
		t.add(55);
		t.add(65);
		t.add(80);
		t.preorder();
		t.inorder();
		t.postorder();
		
		int h = t.height();
		System.out.println("Height: " + h);
	}
}
