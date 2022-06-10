package Datenstrukturen;

import java.util.List;

public class Node {
	private int id;
	private Node pi;
	private Color color;
	private int d; //distance to root Node(BFS); first time accessed (made GRAY) (DFS)
	private int f; //finished access (made BLACK) (DFS)
	private List<Node> adjlist;
	
	public Node(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Node getPi() {
		return pi;
	}

	public void setPi(Node pi) {
		this.pi = pi;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public List<Node> getAdjlist() {
		return adjlist;
	}

	public void setAdjlist(List<Node> adjlist) {
		this.adjlist = adjlist;
	}
}
