package graphTraversal;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

	private Node node;
	private HashMap<Node, ArrayList<Node>> adjacencyList;

	public Graph()	{
		adjacencyList = new HashMap<Node, ArrayList<Node>>();
	}
	public void addEdge(Node source, Node sink) {
		ArrayList<Node> edges;
		if (adjacencyList.containsKey(source)) {
			edges = adjacencyList.get(source);
		} else {
			edges = new ArrayList<Node>();
		}
		edges.add(sink);
		adjacencyList.put(source, edges);
	}
	
	public void addNode(Node node)	{
		adjacencyList.put(node, new ArrayList<Node>());
	}

	public ArrayList<Node> getAdjacentNodes(Node n) {
		return (adjacencyList.get(n));
	}
}
