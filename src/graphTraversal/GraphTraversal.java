package graphTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {

	public static void main(String[] args) {

		Graph g = new Graph();
		Node n1 = new Node("a");
		g.addNode(n1);
		Node n2 = new Node("b");
		g.addNode(n2);
		Node n3 = new Node("c");
		g.addNode(n3);
		Node n = new Node("d");
		g.addNode(n);
		n = new Node("e");
		g.addNode(n);
		n = new Node("f");
		g.addNode(n);

		g.addEdge(n1, n2);
		g.addEdge(n1, n3);
		g.addEdge(n2, n);

		System.out.println(search(g, n2, n3));
	}

	public static boolean search(Graph g, Node start, Node end) {
		//boolean isPresent = false;
		ArrayList<Node> visitedList = new ArrayList<Node>();
		LinkedList<Node> queue = new LinkedList<Node>();
		if (start == end)
			return true;
		queue.add(start);
		while (!queue.isEmpty()) {
			Node current = queue.removeFirst();
			if(current == end)	{
				return true;
			}
			for (Node sink : g.getAdjacentNodes(current)) {
				if(!visitedList.contains(sink))	{
					queue.add(sink);
				}
			}
			visitedList.add(current);
		}
		return false;
	}
}
