package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Weighted Non-directed Graph
class Graph {
	static class Edge {
		private int src;
		private int dest;
		private int weight;
		public Edge() {
		}
		public Edge(int src, int dest, int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
		@Override
		public String toString() {
			return "Edge [src=" + src + ", dest=" + dest + ", weight=" + weight + "]";
		}
	}
	public static final int INF = 9999; //Integer.MAX_INT
	private int[][] adjmat;
	private int vertCount, edgeCount;
	private List<Edge> edgeList;
	public Graph(int vCount) {
		edgeList = new ArrayList<>();
		vertCount = vCount;
		adjmat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				adjmat[i][j] = INF;
		}
	}
	public void accept(Scanner sc) {
		edgeList.clear();
		System.out.print("Enter number of Edges: ");
		edgeCount = sc.nextInt();
		for (int i = 1; i <= edgeCount; i++) {
			System.out.print("Enter Edge " + i + " : src dest weight: ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			adjmat[src][dest] = weight;
			adjmat[dest][src] = weight;	// comment this for directed graph
			edgeList.add(new Edge(src, dest, weight));
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
	// find root
	public int find(int v, int[] parent) {
		while(parent[v] != -1)
			v = parent[v];
		return v;
	} 
	// merge sets
	public void union(int srcRoot, int destRoot, int[] parent) {
		parent[srcRoot] = destRoot;
	}
	public boolean unionFind(List<Edge> edgeList) {
		int[] parent = new int[vertCount];
		for (int v = 0; v < vertCount; v++)
			parent[v] = -1;
		for (Edge e : edgeList) {
			int srcRoot = find(e.src, parent);
			int destRoot = find(e.dest, parent);
			if(srcRoot == destRoot) // src & dest both are in same set.
				return true; // cycle detected
			union(srcRoot, destRoot, parent);
		}
		return false; // cycle not detected
	} 
	public void kruskalMst() {
		List<Edge> mst = new ArrayList<>();
		edgeList.sort((e1,e2) -> e1.weight - e2.weight); // O(E log E)
		int i = 0;
		while(mst.size() < vertCount-1) {
			Edge e = edgeList.get(i); // each time pick edge of min weight -- greedy approach
			mst.add(e);
			if(unionFind(mst))	
				mst.remove(mst.size()-1);
			i++;
		} 
		
		System.out.println("Min Weight Spanning Tree: ");
		int totalWeight = 0;
		for (Edge e : mst) {
			System.out.println(e);
			totalWeight += e.weight;
		}
		System.out.println("MST Weight: " + totalWeight);
	}
}

public class KruskalMstMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		Graph g = new Graph(vCount);
		g.accept(sc);
		g.display();
		g.kruskalMst();
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






