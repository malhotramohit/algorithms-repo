package com.rms.graphs.dijPQ;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DijkstraPQ {

	public static void main(String[] args) {
		// create a graph using adj list
	/*	Test case 1
	 * Graph graph = new Graph(6);
		graph.addEdge(0, 1, 4);
		graph.addEdge(0, 2, 3);
		graph.addEdge(1, 2, 2);
		graph.addEdge(1, 3, 2);
		graph.addEdge(2, 3, 4);
		graph.addEdge(3, 4, 2);
		graph.addEdge(4, 5, 6);
		graph.printGraph();
		int sourceVertex = 0;*/
		Graph graph = new Graph(5);
		graph.addEdge(0, 1, -1);
		graph.addEdge(0, 2, 4);
		graph.addEdge(1, 2, 3);
		graph.addEdge(1, 4, 2);
		graph.addEdge(1, 3, 2);
		graph.addEdge(3, 1, 1);
		graph.addEdge(3, 2, 5);
		graph.addEdge(4, 3, -3);
		graph.printGraph();
		int sourceVertex = 0;
		graph.findShortestPathToAllNodesFrom(sourceVertex);

	}
}

class Edge {
	// <0,1,4>
	int source;
	int dest;
	int weight;

	public Edge(int source, int dest, int weight) {
		super();
		this.source = source;
		this.dest = dest;
		this.weight = weight;
	}

}

class HeapNode {
	int parent;
	int key;

	public HeapNode(int parent, int key) {
		super();
		this.parent = parent;
		this.key = key;
	}

}

class Graph {
	int vertices; // 6
	LinkedList<Edge>[] adjacencylistArray; // 2 : 3->4->5

	@SuppressWarnings("unchecked")
	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencylistArray = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjacencylistArray[i] = new LinkedList<Edge>();
		}
	}

	public void printGraph() {
		int numberOfvertices = adjacencylistArray.length;
		for (int i = 0; i < numberOfvertices; i++) {
			for (Edge edge : adjacencylistArray[i]) {
				System.out.println(
						"distance from source " + edge.source + " to destination " + edge.dest + " is " + edge.weight);
			}
		}
	}

	void addEdge(int source, int dest, int weight) {
		// create an object of edge
		Edge edge = new Edge(source, dest, weight);

		adjacencylistArray[source].addFirst(edge);

	}

	public void findShortestPathToAllNodesFrom(int sourceVertex) {
		int[] keyArray = new int[vertices];
		int[] parent = new int[vertices];

		for (int i = 0; i < vertices; i++) {
			keyArray[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < vertices; i++) {
			parent[i] = -1;
		}

		keyArray[sourceVertex] = 0;
		parent[sourceVertex] = sourceVertex;

		PriorityQueue<HeapNode> pq = new PriorityQueue<>(vertices, new Comparator<HeapNode>() {

			@Override
			public int compare(HeapNode o1, HeapNode o2) {
				// TODO Auto-generated method stub
				return o1.key - o2.key;
			}

		});

		HeapNode startingNode = new HeapNode(sourceVertex, 0);
		pq.offer(startingNode);

		while (!pq.isEmpty()) {
			HeapNode nextMinNode = pq.poll();

			LinkedList<Edge> adajenctVertexList = adjacencylistArray[nextMinNode.parent];

			for (Edge edge : adajenctVertexList) {
				int startingVertex = edge.source;
				int destinationVertex = edge.dest;
				int weight = edge.weight;

				if (parent[destinationVertex] == -1
						&& keyArray[destinationVertex] > keyArray[startingVertex] + weight) {
					keyArray[destinationVertex] = keyArray[startingVertex] + weight;
					parent[destinationVertex] = destinationVertex;
					HeapNode node = new HeapNode(destinationVertex, weight);
					pq.offer(node);
				}
			}
		}
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] == Integer.MAX_VALUE) {
				System.out.println("No path from source vertex " + sourceVertex + " to destination vertex " + i);
			} else {
				System.out.println("Shortest distance from source vertex " + sourceVertex + " to destination vertex "
						+ i + " is " + keyArray[i]);
			}
		}

		for (int i = 0; i < keyArray.length; i++) {
			System.out.println(parent[i]);
		}
	}

}