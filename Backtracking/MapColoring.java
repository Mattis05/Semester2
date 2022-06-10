package Backtracking;

public class MapColoring {
	int V;//die Anzahl von Knoten in dem Graphen ist,
	int[] color;
	int[][] graph;//ist die Darstellung des Graphen als Adjazenzmatrix.
	              // Ein Wert graph[i][j] ist 1 falls e seine direkte Kante zwischen i und j gibt, sonst ist graph[i][j] gleich 0.

	public MapColoring(int[][] graph) {
		V = graph.length;
		color = new int[V];
		this.graph = graph;
	}

	boolean isSafe(int v, int c) {
		for(int x: graph[v])//geht durch alle angrenzenden Knoten
			{
			if(color[x]==c){
				return false;//Ist die angrenzende Farbe die gleiche Farbe wo ich gerade versuche reinzumachen, returnt es false.
			}
		}
		return true;//Wenn es geht, return true.

	}

	boolean graphColoringRec(int m,int v) 	{

		if(v==graph.length){
			return true; // wenn alle v knoten Gefärbt wurden, return true.
		}
		for(int i=1;i<=m;i++){

			if(isSafe(v,c)){
				color[v]=i;
				if(isSafe(v+1,0)==true){
					return true;
				}
				c++;
				color[v]=0;


			}
		}
		return false;
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
							/*v1*//*v2*//*v3*//*v4*//*v5*/
				/*v1*/		{{0, 0, 1, 1, 0},
				/*v2*/		{0, 0, 1, 0, 1},
				/*v3*/		{1, 1, 0, 1, 1},
				/*v4*/		{1, 0, 1, 0, 1},
				/*v5*/		{0, 1, 1, 1, 0} 	};

		MapColoring coloring = new MapColoring(graph);
		int m = 3;
		coloring.graphColoring(m);
	}
}
