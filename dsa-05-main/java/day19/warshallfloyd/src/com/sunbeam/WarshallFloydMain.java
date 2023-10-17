package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Weighted Directed Graph
class Graph {	
	public static final int INF = 999;
	private int [][] mat;
	private int vertCount, edgeCount;
	
	public Graph(int vCount) {
		vertCount = vCount;
		mat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++)
			for (int j = 0; j < vertCount; j++)
				mat[i][j] = INF;
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
	
	public int[][] warshallFloyd() {
		// initial state = adj matrix
		int[][] dist = new int[vertCount][vertCount];
		for (int s = 0; s < vertCount; s++) {
			for (int d = 0; d < vertCount; d++)
				dist[s][d] = mat[s][d];
			dist[s][s] = 0; 
		}
		
		// calculate shortest path between each vertex to every other vertex
		for (int i = 0; i < vertCount; i++) {
			for (int s = 0; s < vertCount; s++) {
				for (int d = 0; d < vertCount; d++) {
					if(dist[s][i] != INF && dist[i][d] != INF && dist[s][i] + dist[i][d] < dist[s][d])
						dist[s][d] = dist[s][i] + dist[i][d]; 
				}
			}
		}
		
		return dist;
	}

}

public class WarshallFloydMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		Graph g = new Graph(vCount);
		g.accept(sc);
		g.display();
		
		int[][] dist = g.warshallFloyd();
		// display dist matrix
		for (int i = 0; i < vCount; i++) {
			System.out.print("distance from vertex " + i + " : ");
			for (int j = 0; j < vCount; j++) {
				if(dist[i][j] == Graph.INF)
					System.out.print("\t##");
				else
					System.out.print("\t" + dist[i][j]);
			}
			System.out.println();
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