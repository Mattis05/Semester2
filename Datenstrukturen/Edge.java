package Datenstrukturen;

public class Edge {
	private int v;
	private int w;
	
	private int weight = 1;
	
	Edge(int v, int w) {
		this.v = v;
		this.w = w;
	}

	public int getV() {
		return v;
	}


	public int getW() {
		return w;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
