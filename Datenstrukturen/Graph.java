package Datenstrukturen;

import java.util.List;

public interface Graph {

	int numOfV(); //Anzahl von Knoten

	int numOfE(); //Anzahl von Kanten

	boolean directed(); //Graph gerichtet oder nicht

	void insert(Edge e); //Kante einfuegen
	
	void remove(Edge e); //Kante löschen
	
	boolean edge(int v, int w); //true falls eine Kante zwischen Knoten v und w
	
	List<Node> getAdjList(int v); //Adjazenzliste von Knoten v
	
	List<Node> getNodes(); // Liste von Knoten
	
	void dfs(int s);  //Tiefensuche-Algorithmus: Verlauf mit printlns sinnvoll zeigen

	void bfs(int s); //Tiefensuche-Algorithmus: Verlauf mit printlns sinnvoll zeigen
	
}
