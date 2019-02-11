package com.rms.graph;

public class Edge {
	private int weight=1;
	private Vertex destinationVertex;
	public Edge(int weight, Vertex destinationVertex) {
		super();
		this.weight = weight;
		this.destinationVertex = destinationVertex;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Vertex getDestinationVertex() {
		return destinationVertex;
	}
	public void setDestinationVertex(Vertex destinationVertex) {
		this.destinationVertex = destinationVertex;
	}
}
