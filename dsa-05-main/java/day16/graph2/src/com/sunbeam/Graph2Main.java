package com.sunbeam;

import java.util.Scanner;

// Weighted Non-directed Graph
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
}

public class Graph2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Graph g = new Graph(6);
		g.accept(sc);
		g.display();
	}
	
}

/*
7
0	1	7
0	2	4
0	3	8
1	2	9
1	4	5
3	4	6
3	5	2
*/
