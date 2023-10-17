package com.sunbeam;

import java.util.Iterator;
import java.util.Scanner;

//Weighted Non-directed Graph
class Graph {
	public static final int INF = 9999; //Integer.MAX_INT
	private int[][] adjmat;
	private int vertCount, edgeCount;
	public Graph(int vCount) {
		vertCount = vCount;
		adjmat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				adjmat[i][j] = INF;
		}
	}
	public void accept(Scanner sc) {
		System.out.print("Enter number of Edges: ");
		edgeCount = sc.nextInt();
		for (int i = 1; i <= edgeCount; i++) {
			System.out.print("Enter Edge " + i + " : src dest weight: ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			adjmat[src][dest] = weight;
			adjmat[dest][src] = weight;	// comment this for directed graph
		}
		System.out.println();
	}
	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				if(adjmat[i][j] == INF)
					System.out.print("\t" + (char)'#'); // 236
				else
					System.out.print("\t" + adjmat[i][j]);
			}
			System.out.println();
		}
	}
	public void primMst(int start) {
		int[] parent = new int[vertCount];
		for (int v = 0; v < parent.length; v++)
			parent[v] = -1;
		
		int[] key = new int[vertCount];
		for (int v = 0; v < parent.length; v++)
			key[v] = INF;
		
		boolean[] mst = new boolean[vertCount];
		
		key[start] = 0;
		int vCount = 0;
		while(vCount < vertCount) {
			// find the min key vertex
			int mv = findMin(key, mst);
			// add it into mst
			mst[mv] = true;
			vCount++;
			// update the keys & parent of all adjacent vertices (if connecting edge weight < current key of adjacent vertex)
			for (int v = 0; v < vertCount; v++) {
				if(adjmat[mv][v] != INF && !mst[v] && adjmat[mv][v] < key[v]) {
					key[v] = adjmat[mv][v];
					parent[v] = mv;
				}
			}
		}
		
		// print MST
		int totalWeight = 0;
		for(int v=0; v < vertCount; v++) {
			int src = parent[v];
			int dest = v;
			int weight = src == -1 ? 0 : adjmat[src][dest];
			System.out.println(src + " -- " + dest + " (" + weight + ")");
			totalWeight += weight;
		}
		System.out.println("MST Weight: " + totalWeight);
	}
	private int findMin(int[] key, boolean[] mst) {
		int v, minKey = INF, mv = -1;
		for(v = 0; v < vertCount; v++) {
			if(!mst[v] && key[v] < minKey) {
				minKey = key[v];
				mv = v;
			}
		}
		return mv;
	}
}

public class PrimMstMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		Graph g = new Graph(vCount);
		g.accept(sc);
		g.display();
		int start = 0;
		g.primMst(start);
	}
	
}

/*
9
14
7 6 1
8 2 2
6 5 2
0 1 4
2 5 4
8 6 6
2 3 7
7 8 7
0 7 8
1 2 8
3 4 9
5 4 10
1 7 11
3 5 14
*/
