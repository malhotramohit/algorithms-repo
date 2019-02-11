package com.rms.graph;

import java.util.LinkedList;

public class Vertex {
	private String name;
	private LinkedList<Edge> list;
	public Vertex(String name, LinkedList<Edge> list) {
		super();
		this.name = name;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Edge> getList() {
		return list;
	}
	public void setList(LinkedList<Edge> list) {
		this.list = list;
	}
	
}
