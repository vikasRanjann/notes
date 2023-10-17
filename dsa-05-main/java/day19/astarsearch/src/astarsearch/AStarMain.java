package astarsearch;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

public class AStarMain {
	static class Point {
		int row, col;
		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
		@Override
		public String toString() {
			return String.format("Point [row=%s, col=%s]", row, col);
		}
		@Override
		public int hashCode() {
			return Objects.hash(col, row);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Point))
				return false;
			Point other = (Point) obj;
			return col == other.col && row == other.row;
		}
	}
	
	static class Cell {
		int row, col;
		double f, g, h;
		Point parent;
		public Cell(int row, int col) {
			this(row, col, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE);
		}
		public Cell(int row, int col, double f, double g, double h) {
			this.row = row;
			this.col = col;
			this.f = f;
			this.g = g;
			this.h = h;
			this.parent = new Point(-1, -1);
		}
		@Override
		public String toString() {
			return String.format("Cell [row=%s, col=%s, f=%s, g=%s, h=%s]", row, col, f, g, h);
		}
		@Override
		public int hashCode() {
			return Objects.hash(col, row);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Cell))
				return false;
			Cell other = (Cell) obj;
			return col == other.col && row == other.row;
		}
	}
	
	private int [][]mat; // maze -- 1 open & 0 blocked
	private int vertCount; // maze dimension

	public AStarMain(int[][] grid) {
		vertCount = grid.length;
		mat = new int[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				mat[i][j] = grid[i][j];
		}
	}

	public boolean isValid(int r, int c) {
		return (r >= 0 && r < vertCount) && (c >= 0 && c < vertCount);
	}
	
	public boolean isBlocked(int r, int c) {
		return mat[r][c] == 0;
	}
	
	public boolean isDest(int r, int c, Point dest) {
		return r == dest.row && c == dest.col;
	}
	
	public List<Point> buildPath(Cell [][]cells, Point dest) {
		List<Point> path = new ArrayList<>();
		Cell pt = cells[dest.row][dest.col];
		path.add(dest);
		while (pt.parent.row != -1 && pt.parent.col != -1) {
			path.add(0, pt.parent);
			pt = cells[pt.parent.row][pt.parent.col];
		}
		return path;
	}
	
	public double calcHeuristic(int row, int col, Point dest) {
		// euclidean
		int dx = row-dest.row, dy = col-dest.col;
		return Math.sqrt(dx*dx + dy*dy);

		// manhatten
//		int dx = Math.abs(row-dest.row), dy = Math.abs(col-dest.col);
//		return dx + dy;
		
		// diagonal
//		int dx = Math.abs(row-dest.row), dy = Math.abs(col-dest.col);
//		return Math.max(dx, dy);
	}

	public List<Point> aStarSearch(Point src, Point dest) {
		if(!isValid(src.row, src.col) || !isValid(dest.row, dest.col))
			throw new RuntimeException("Source or Destination is not valid.");
		if(isBlocked(src.row, src.col) || isBlocked(dest.row, dest.col))
			throw new RuntimeException("Source or Destination is blocked.");
		
		// track if vertex is in path
		boolean onPath[][] = new boolean[vertCount][vertCount];
		
		// initialize cell details
		Cell [][]cells = new Cell[vertCount][vertCount];
		for (int i = 0; i < vertCount; i++) {
			for (int j = 0; j < vertCount; j++)
				cells[i][j] = new Cell(i, j);
		}
		
		// start node f, g & h = 0.0
		Cell startCell = cells[src.row][src.col];
		startCell.f = startCell.g = startCell.h = 0.0;
		
		// check if src is dest
		if(isDest(src.row, src.col, dest))
			return buildPath(cells, dest);

		// queue for traversal
		PriorityQueue<Cell> q = new PriorityQueue<AStarMain.Cell>((c1,c2)->(int)Math.signum(c1.f-c2.f));
		// push start point in queue
		q.offer(startCell);
		// repeat while q is not empty
		while(!q.isEmpty()) {
			// pop a point from queue
			Cell pt = q.poll();
			// add point into path
			onPath[pt.row][pt.col] = true;
			// list all neighbors points
			Point[] neighbors = {
				new Point(pt.row-1, pt.col),	// UP
				new Point(pt.row+1, pt.col),	// DOWN
				new Point(pt.row, pt.col-1),	// LEFT
				new Point(pt.row, pt.col+1),	// RIGHT
				new Point(pt.row-1, pt.col-1),	// UP-LEFT
				new Point(pt.row-1, pt.col+1),	// UP-RIGHT
				new Point(pt.row+1, pt.col-1),	// DOWN-LEFT
				new Point(pt.row+1, pt.col+1)	// DOWN-RIGHT
			};
			// add possible neighbors in queue
			for (Point adj : neighbors) {
				// check if neighbor is valid
				if(isValid(adj.row, adj.col)) {
					// check if neighbor is dest
					if(isDest(adj.row, adj.col, dest)) {
						// set parent as current point
						cells[adj.row][adj.col].parent = new Point(pt.row, pt.col);
						return buildPath(cells, dest);
					}
					// check if not on path & not blocked
					else if(!onPath[adj.row][adj.col] && !isBlocked(adj.row, adj.col)) {
						// get current & adjacent cell
						Cell adjCell = cells[adj.row][adj.col];
						// calculate new values of f, g & h
						double newg = pt.g + 1.0;
						double newh = calcHeuristic(adj.row, adj.col, dest);
						double newf = newg + newh;
						// if new f is less than current f of adjacent cell
						if(adjCell.f > newf) {
							// update f, g & h of adjacent
							adjCell.g = newg;
							adjCell.h = newh;
							adjCell.f = newf;
							// add adjacent into q
							if(q.contains(adjCell))
								q.remove(adjCell);
							q.offer(adjCell);
							// update parent as current
							adjCell.parent = new Point(pt.row, pt.col);
						}
					}
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int [][] grid = new int[][] { 
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1 }, 
			{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
			{ 0, 0, 1, 0, 1, 0, 0, 0, 0, 1 }, 
			{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, 
			{ 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, 
			{ 1, 0, 0, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
			{ 1, 1, 1, 0, 0, 0, 1, 0, 0, 1 },
			{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 1 }
		};
		AStarMain g = new AStarMain(grid);
		Point src = new Point(0, 0);
		Point dest = new Point(9, 9);
		List<Point> path = g.aStarSearch(src, dest);
		if(path==null)
			System.out.println("No path exists.");
		else {
			path.forEach(System.out::println);
			printPath(grid, path);
		}
	}

	public static void printPath(int[][] grid, List<Point> path) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				Point pt = new Point(i, j);
				if(path.contains(pt))
					System.out.print("* ");
				else
					System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}


