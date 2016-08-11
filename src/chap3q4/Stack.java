package chap3q4;

import stack.Node;

public class Stack {

	Node top;
	int size;

	public Stack() {
		size = 0;
		top = null;
	}

	public Node pop() {
		if (top != null) {
			Node topNode = top;
			top = top.getNext();
			size--;
			return topNode;
		}
		return null;
	}

	public void push(String nodeName) {
		Node n = new Node(nodeName);
		n.setNext(top);
		top = n;
		size++;
	}

}
