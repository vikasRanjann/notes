package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Weighted Directed Graph
class Graph {
	static class Edge {
		private int src;
		private int dest;
		private int weight;
		public Edge() {
			src = 0;
			dest = 0;
			weight = 0;
		}
		public Edge(int s, int d, int w) {
			src = s;
			dest = d;
			weight = w;
		}
		public int getWeight() {
			return weight;
		}
		@Override
		public String toString() {
			return "Edge [src=" + src + ", dest=" + dest + ", weight=" + weight + "]";
		}
	}
	
	
	public static final int INF = 999;
	private int [][] mat;
	private int vertCount, edgeCount;
	
	private List<Edge> edgeList;
	
	public Graph(int vCount) {
		vertCount = vCount;
		mat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++)
			for (int j = 0; j < vertCount; j++)
				mat[i][j] = INF;
		edgeList = new ArrayList<>();
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();
		for(int i=0; i < edgeCount; i++) {
			System.out.print("Enter egde (src dest weight): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			mat[src][dest] = wt;
			//mat[dest][src] = wt; // here we are implementing directed graph
			edgeList.add(new Edge(src, dest, wt));
		}
	}
	
	public void display() {
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++) {
				if(mat[i][j] == INF)
					System.out.print("\t##");
				else
					System.out.print("\t" + mat[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[] bellmanFord(int start) {
		// mark dist of all vertices as INF and dist of start vertex as 0
		int[] dist = new int[vertCount];
		for (int v = 0; v < mat.length; v++)
			dist[v] = INF;
		dist[start] = 0;
		
		// for V-1 passes process all edges
		for(int i=1; i<vertCount; i++) {
			for (Edge e : edgeList) {
				int u = e.src, v = e.dest, wt = e.weight;
				if(dist[u] != INF && dist[u] + wt < dist[v])
					dist[v] = dist[u] + wt; 
			} // itr = E
		} // itr = V-1
		// check if -ve weight cycle exists
		for (Edge e : edgeList) {
			int u = e.src, v = e.dest, wt = e.weight;
			if(dist[u] != INF && dist[u] + wt < dist[v])
				return null; // throw new RuntimeException("Graph has -ve weight cycle.");
		}
		return dist;
	}

}

public class BellmanFordMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		Graph g = new Graph(vCount);
		g.accept(sc);
		g.display();
		
		int start = 0;
		int[] dist = g.bellmanFord(start);
		if(dist == null)
			System.out.println("Graph has -ve weight cycle.");
		else {
			for (int i = 0; i < dist.length; i++)
				System.out.println("Distance of " + i + " from " + start + " = " + dist[i]);
		}
	}
}

/*
5
7
3 4 3
2 4 3
2 3 4
2 1 -2
1 3 -1
0 2 5
0 1 6
*/