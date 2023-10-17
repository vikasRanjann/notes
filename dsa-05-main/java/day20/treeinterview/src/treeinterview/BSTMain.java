package treeinterview;

import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BinSearchTree {
	static class Node {
		int data;
		Node left, right;
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
		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

	private Node root;
	public BinSearchTree() {
		root = null;
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void add(int val) {
		Node newNode = new Node(val);
		if(isEmpty())
			root = newNode;
		else {
			Node trav = root;
			while(true) {	
				if(val < trav.data) { // if less, goto left
					if(trav.left == null) {
						trav.left = newNode;
						break;
					}
					trav = trav.left;
				}
				else { // if greater or equal, goto right
					if(trav.right == null) {
						trav.right = newNode;
						break;
					}
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
	public boolean find(Node trav, int v) {
		while(trav != null) {
			if(v == trav.data)
				return true;
			if(v < trav.data)
				trav = trav.left;
			else
				trav = trav.right;
		}
		return false;
	}
	public int nearestCommonAncestor(int v1, int v2) {
		Node trav = root;
		while(trav != null) {
			if(v1 < trav.data && v2 < trav.data)
				trav = trav.left;
			else if(v1 > trav.data && v2 > trav.data)
				trav = trav.right;
			else
				break;
		}
		if(!find(trav, v1) || !find(trav, v2))
			throw new RuntimeException("Node Not Found, So Ancestor Not Found.");
		return trav.data;
	}
	public int largestCommonAncestor(int v1, int v2) {
		Stack<Integer> s = new Stack<>();
		Node trav = root;
		while(trav != null) {
			s.push(trav.data);
			if(v1 < trav.data && v2 < trav.data)
				trav = trav.left;
			else if(v1 > trav.data && v2 > trav.data)
				trav = trav.right;
			else
				break;
		}
		if(!find(trav, v1) || !find(trav, v2))
			throw new RuntimeException("Node Not Found, So Ancestor Not Found.");
		int max = s.pop();
		while(!s.isEmpty()) {
			int val = s.pop();
			if(val > max)
				max = val;
		}
		return max;
	}
	
	public void spiral() {
		System.out.println("Spiral: ");
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		int level = 0;
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			System.out.print("Level " + level + ": ");
			while(!s1.isEmpty()) {
				Node trav = s1.pop();
				System.out.print(trav.data + ", ");
				if(trav.right != null)
					s2.push(trav.right);
				if(trav.left != null)
					s2.push(trav.left);
			}
			System.out.println();
			level++;
			System.out.print("Level " + level + ": ");
			while(!s2.isEmpty()) {
				Node trav = s2.pop();
				System.out.print(trav.data + ", ");
				if(trav.left != null)
					s1.push(trav.left);
				if(trav.right != null)
					s1.push(trav.right);
			}
			System.out.println();
			level++;
		}
	}
	
	public void levelwiseTraversal() {
		System.out.println("Levelwise Traversal: ");
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		int level = 0;
		q1.offer(root);
		while(!q1.isEmpty() || !q2.isEmpty()) {
			System.out.print("Level " + level + ": ");
			while(!q1.isEmpty()) {
				Node trav = q1.poll();
				System.out.print(trav.data + ", ");
				if(trav.left != null)
					q2.offer(trav.left);
				if(trav.right != null)
					q2.offer(trav.right);
			}
			System.out.println();
			level++;
			System.out.print("Level " + level + ": ");
			while(!q2.isEmpty()) {
				Node trav = q2.poll();
				System.out.print(trav.data + ", ");
				if(trav.left != null)
					q1.offer(trav.left);
				if(trav.right != null)
					q1.offer(trav.right);
			}
			System.out.println();
			level++;
		}
	}
	
	// check if all leaf nodes are at same level or not (using single queue).
	boolean isComplete() {
		//SimpleEntry<Node, Integer>
		class NodeDesc {
			private Node node;
			private int level;
			public NodeDesc(Node node, int level) {
				this.node = node;
				this.level = level;
			}
			public boolean isLeaf() {
				return node.left == null && node.right == null;
			}
		}
		
		int leafLevel = -1;
		Queue<NodeDesc> q = new LinkedList<>();
		q.offer(new NodeDesc(root, 0));
		while(!q.isEmpty()) {
			NodeDesc trav = q.poll();
			if(trav.isLeaf()) {
				if(leafLevel == -1)
					leafLevel = trav.level;
				else // leaf is found earlier and its level is recorded
					if(trav.level != leafLevel)
						return false;
			}
			if(trav.node.left != null)
				q.offer(new NodeDesc(trav.node.left, trav.level+1));
			if(trav.node.right!= null)
				q.offer(new NodeDesc(trav.node.right, trav.level+1));
		}
		return true;
	}
	
	public boolean isStrict() {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		while(!q.isEmpty()) {
			Node trav = q.poll();
			// if( (trav.left == null) != (trav.right == null) )
			if((trav.left != null && trav.right == null) || (trav.left == null && trav.right != null))
				return false;
			if(trav.left != null)
				q.offer(trav.left);
			if(trav.right!= null)
				q.offer(trav.right);
		}
		return true;
	}
}

public class BSTMain {

	public static void main(String[] args) {
		BinSearchTree t = new BinSearchTree();
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
		t.inorder();
		
		int result;
		result = t.nearestCommonAncestor(10, 40);
		System.out.println("Nearest Ancestor: " + result);
		result = t.largestCommonAncestor(10, 40);
		System.out.println("Largest Ancestor: " + result);
	
		t.spiral();
		t.levelwiseTraversal();
		
		//t.add(35);
		//t.add(95);
		System.out.println("Is Complete: " + t.isComplete());
		
		//t.add(5);
		System.out.println("Is Strict: " + t.isStrict());
	}

}

