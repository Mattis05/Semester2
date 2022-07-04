package NochmalBacktracking;

public class MapColoring {
	int V;
	int[] color;
	int[][] graph;

	public MapColoring(int[][] graph) {
		V = graph.length;
		color = new int[V];
		this.graph = graph;
	}

	boolean isSafe(int v, int c) {
		//geht durch alle angrenzenden nodes
		for (int x : graph[v]){
			//Hat die angrenzende node die gleiche Farbe, wie von der , die wo ich gerade verusche ?
			//return false;
			if(color[x]==c){
				return false;
			}
		}
		return true;
	}

	boolean graphColoringRec(int m, int v) 	{

		for(int i = 1 ; i<=m;i++) {
			if (isSafe(v,i)) {
				color[v] = i;

				if (graphColoringRec(m, v+1)) {
					return true;
				}
				else{
					color[v] = 0;
				}
				return false;
			}

		}
		return true;
	}


	void graphColoring(int m) {
		if (!graphColoringRec(m, 0)) {
			System.out.println("Solution does not exist");
			return ;
		}
		printSolution(color);
	}

	void printSolution(int color[]) 	{
		System.out.println("Färbung existiert: Folgende" +
				" Farben wurden zugewiesen");
		for (int i = 0; i < V; i++)
			System.out.print(" " + color[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) 	{
		int[][] graph =
				{{0, 0, 1, 1, 0},
				{0, 0, 1, 0, 1},
				{1, 1, 0, 1, 1},
				{1, 0, 1, 0, 1},
				{0, 1, 1, 1, 0} 	};

		MapColoring coloring = new MapColoring(graph);
		int m = 3;
		coloring.graphColoring(m);
	}
}


