package topologicalorder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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

	public List<Integer> topologicalOrder() {
		List<Integer> order = new ArrayList<>();
		// maintain a queue of vertices (whose in-degree is zero).
		Queue<Integer> q = new LinkedList<>();
		// count in-degree of each vertex
		int[] indeg = new int[vertCount];
		for (int v = 0; v < vertCount; v++) {
			for (int u = 0; u < vertCount; u++) {
				if(mat[u][v] != INF) // source=row=u, destination=col=v
					indeg[v]++;
			}
			//if in-degree=0, then push it into queue
			if(indeg[v] == 0)
				q.offer(v);
		}
		
		while(!q.isEmpty()) {
			// pop a vertex and add into topological order
			int trav = q.poll();
			order.add(trav);
			// decrement in-degree of all its neighbors
			for (int v = 0; v < vertCount; v++) {
				if(mat[trav][v] != INF) {
					indeg[v]--;
					// if in-degree of neighbor is zero, push to queue
					if(indeg[v] == 0)
						q.offer(v);
				}
			}
		} // repeat until queue is empty
		
		// if vertex count in order is not same as vertex count of graph, then topological order is not possible
		if(order.size() != vertCount)
			throw new RuntimeException("Topological Order is Not possible.");
		return order;
	}
}

public class TopologicalOrderMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of vertices: ");
		int vCount = sc.nextInt();
		Graph g = new Graph(vCount);
		g.accept(sc);
		g.display();
		
		List<Integer> order = g.topologicalOrder();
		System.out.println("Topological Order: " + order);
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
