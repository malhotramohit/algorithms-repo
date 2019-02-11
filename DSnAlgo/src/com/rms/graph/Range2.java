package com.rms.graph;

import java.util.Arrays;
import java.util.List;

public class Range2 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 12, 13, 14, 19);
	StringBuilder sb = new StringBuilder();
	int previous = list.get(0), start = previous;
	for(int next: list.subList(1, list.size())) {
	    if(previous+1 != next) {
	        appendRange(sb, start, previous).append(", ");
	        start = next;
	    }
	    previous = next;
	}
	String result = appendRange(sb, start, previous).toString();
	System.out.println(result);
}
private static StringBuilder appendRange(StringBuilder sb, int start, int previous) {
    sb.append(start);
    if(start!=previous) sb.append(previous-start>1? " - ": ", ").append(previous);
    return sb;
}
}
