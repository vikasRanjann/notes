package com.sunbeam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// Non-weighted Non-directed Graph
class Graph {
	private List<Integer>[] adjlist;
	private int vertCount, edgeCount;
	public Graph(int vCount) {
		vertCount = vCount;
		adjlist = new List[vertCount];
		for (int v = 0; v < vertCount; v++)
			adjlist[v] = new ArrayList<Integer>();
	}
	public void accept(Scanner sc) {
		System.out.print("Enter number of Edges: ");
		edgeCount = sc.nextInt();
		for (int i = 1; i <= edgeCount; i++) {
			System.out.print("Enter Edge " + i + " : src dest : ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src);	// comment this for directed graph
		}
		System.out.println();
	}
	public void display() {
		for (int v = 0; v < adjlist.length; v++) {
			System.out.print("Vertex " + v + " : ");
			for (Integer x : adjlist[v])
				System.out.print(x + ", ");
			System.out.println();
		}
	}
	public void dfsTraversal(int start) {
		// assignment
	}
	
	public void bfsTraversal(int start) {
		// assignment
	}

}

public class Graph3Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph(6);
		g.accept(sc);
		g.display();
	}
	
}

/*
7
0	1
0	2
0	3
1	2
1	4
3	4
3	5
*/
