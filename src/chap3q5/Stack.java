package chap3q5;

import chap3q2.Node;

public class Stack {

	Node top;
	int size;

	public Node pop() {
		if (top != null) {
			Node topNode = top;
			top = top.getNext();
			size--;
			return topNode;
		}
		return null;
	}

	public void push(Node n) {
		n.setNext(top);
		top = n;
		size++;
	}
	
	public Node peek()	{
		return top;
	}

	
}
