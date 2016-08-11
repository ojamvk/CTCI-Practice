package chap3q3;

import stack.Node;

public class Stack {

	private String stackName;
	private Node top;
	public int size;
	
	public Stack(String stackName)	{
		this.stackName = stackName;
		this.size = 0;
	}
	
	public int getSize()	{
		return size;
	}
	public void setSize(int size)	{
		this.size = size;
	}
	public Node pop() {
		if (top != null) {
			Node topNode = top;
			top = top.getNext();
			return topNode;
		}
		return null;
	}

	public void push(String nodeName) {
		Node n = new Node(nodeName);
		n.setNext(top);
		top = n;
	}
}
