package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// Non-weighted Non-directed Graph
class Graph {
	private int[][] adjmat;
	private int vertCount, edgeCount;
	public Graph(int vCount) {
		vertCount = vCount;
		adjmat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				adjmat[i][j] = 0;
		}
	}
	public void accept(Scanner sc) {
		System.out.print("Enter number of Edges: ");
		edgeCount = sc.nextInt();
		for (int i = 1; i <= edgeCount; i++) {
			System.out.print("Enter Edge " + i + " : src dest : ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] = 1;
			adjmat[dest][src] = 1;	// comment this for directed graph
		}
		System.out.println();
	}
	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				System.out.print("\t" + adjmat[i][j]);
			System.out.println();
		}
	}
	public void dfsTraversal(int start) {
		System.out.print("DFS : ");
		boolean marked[] = new boolean[vertCount];
		Stack<Integer> s = new Stack<>();
		marked[start] = true;
		s.push(start);
		while(!s.isEmpty()) {
			int trav = s.pop();
			System.out.print(trav + ", ");
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.push(v);
				}
			}
		}
		System.out.println();
	}
	
	public void bfsTraversal(int start) {
		System.out.print("BFS : ");
		boolean marked[] = new boolean[vertCount];
		Queue<Integer> s = new LinkedList<>();
		marked[start] = true;
		s.offer(start);
		while(!s.isEmpty()) {
			int trav = s.poll();
			System.out.print(trav + ", ");
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.offer(v);
				}
			}
		}
		System.out.println();
	}
	
	public boolean isConnected() {
		int start = 0, count = 0;
		boolean marked[] = new boolean[vertCount];
		Stack<Integer> s = new Stack<>();
		marked[start] = true;
		s.push(start);
		count++;
		while(!s.isEmpty()) {
			int trav = s.pop();
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.push(v);
					count++;
					if(count == vertCount)
						return true; // all vertices reached from the given vertex -- so graph is connected.
				}
			}
		}
		return false; // graph is not connected
	}
	
	public void dfsSpanningTree(int start) {
		System.out.println("DFS Spanning Tree Edges: ");
		boolean marked[] = new boolean[vertCount];
		Stack<Integer> s = new Stack<>();
		marked[start] = true;
		s.push(start);
		while(!s.isEmpty()) {
			int trav = s.pop();
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.push(v);
					System.out.println(trav + " -- " + v);
				}
			}
		}
		System.out.println();
	}

	public void bfsSpanningTree(int start) {
		System.out.println("BFS Spanning Tree Edges: ");
		boolean marked[] = new boolean[vertCount];
		Queue<Integer> s = new LinkedList<>();
		marked[start] = true;
		s.offer(start);
		while(!s.isEmpty()) {
			int trav = s.poll();
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.offer(v);
					System.out.println(trav + " --- " + v);
				}
			}
		}
		System.out.println();
	}
	
	public int[] singleSourcePathLengths(int start) {
		int dist[] = new int[vertCount];
		boolean marked[] = new boolean[vertCount];
		Queue<Integer> s = new LinkedList<>();
		marked[start] = true;
		s.offer(start);
		dist[start] = 0;
		while(!s.isEmpty()) {
			int trav = s.poll();
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1 && !marked[v]) {
					marked[v] = true;
					s.offer(v);
					dist[v] = dist[trav] + 1;
				}
			}
		}
		return dist;
	}
	
	public boolean isBipartite() {
		final int NOCOLOR = 0, RED = -1, GREEN = 1;
		int marked[] = new int[vertCount];
		for (int v = 0; v < vertCount; v++)
			marked[v] = NOCOLOR;
		Queue<Integer> q = new LinkedList<>();
		int start = 0;
		q.offer(start);
		marked[start] = GREEN;
		while(!q.isEmpty()) {
			int trav = q.poll();
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[trav][v] == 1) {
					if(marked[v] == NOCOLOR) {
						marked[v] = -1 * marked[trav];
						q.offer(v);
					}
					else if(marked[v] == marked[trav]) // both neighbors are in same color i.e. not bi-partite
						return false;
				}
			}
		}
		return true; // all vertices are colored in two different colors i.e. bi-partite
	}
}

public class Graph1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph(6);
		g.accept(sc);
		g.display();
		//g.dfsTraversal(0); // start from vertex 0
		//g.bfsTraversal(2); // start from vertex 0
		//System.out.println("Graph Is Connected: " + g.isConnected());
		//g.dfsSpanningTree(0);
		//g.bfsSpanningTree(0);
		/*
		int start = 0;
		int[] dist = g.singleSourcePathLengths(start);
		for (int v = 0; v < dist.length; v++) {
			System.out.println("dist between " + start + " to " + v + " is " + dist[v]);
		}
		*/
		System.out.println("Graph Is BiPartite: " + g.isBipartite());
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
