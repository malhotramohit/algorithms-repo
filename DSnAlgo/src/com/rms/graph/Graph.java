package com.rms.graph;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
	public static void main(String[] args) {
		int nodes = 5;
		HashSet<Vertex> graph = new HashSet<>(nodes);
		System.out.println("---creating first node entry in set----");
		LinkedList<Edge> list0 = new LinkedList<>();
		LinkedList<Edge> list1 = new LinkedList<>();
		LinkedList<Edge> list2 = new LinkedList<>();
		LinkedList<Edge> list3 = new LinkedList<>();
		LinkedList<Edge> list4 = new LinkedList<>();

		Vertex v0 = new Vertex("0", list0);
		Vertex v1 = new Vertex("1", list1);
		Vertex v2 = new Vertex("2", list2);
		Vertex v3 = new Vertex("3", list3);
		Vertex v4 = new Vertex("4", list4);

		list0.add(new Edge(1, v1));
		list0.add(new Edge(1, v4));

		list1.add(new Edge(1, v0));
		list1.add(new Edge(1, v4));
		list1.add(new Edge(1, v2));
		list1.add(new Edge(1, v3));

		list2.add(new Edge(1, v1));
		list2.add(new Edge(1, v3));

		list3.add(new Edge(1, v1));
		list3.add(new Edge(1, v4));
		list3.add(new Edge(1, v2));

		list4.add(new Edge(1, v3));
		list4.add(new Edge(1, v0));
		list4.add(new Edge(1, v1));

		graph.add(v0);
		graph.add(v1);
		graph.add(v2);
		graph.add(v3);
		graph.add(v4);

		displayGraph(graph);
		
		int[] array= {23,5,34,8};
		Arrays.sort(array);
		Collections.sort(list0,Collections.reverseOrder());
		
	}

	private static void displayGraph(HashSet<Vertex> graph) {
		for (Vertex v : graph) {
			System.out.print(v.getName());
			LinkedList<Edge> list = v.getList();
			for (Edge e : list) {
				System.out.print("-->" + e.getDestinationVertex().getName());
			}
			System.out.println();
		}

	}
}
