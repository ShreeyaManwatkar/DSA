package DSAJava;

import java.util.*;

public class GraphAdjList {
	
	private Map<String, List<String>> adjList = new HashMap<>();
	
	public void addVertex(String v) {
		adjList.putIfAbsent(v, new ArrayList<String>());
    }

	public void addEdge(String v1, String v2) {
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	
	public void printGraph() {
		for (String vertex : adjList.keySet()) {
			System.out.println(vertex + " -> " + adjList.get(vertex));
		}
	
	}
	public static void main(String[] args) {
		GraphAdjList g = new GraphAdjList();
		g.addVertex("Pune");
		g.addVertex("Mum");
		g.addVertex("Delhi");
		
		g.addEdge("Pune", "Mumbai");
		g.addEdge("Mumbai", "Delhi");
		
		g.printGraph();
	}
}
