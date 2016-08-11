package stack;

public class Node {
	private String nodeName;
	private Node next;

	public Node(String nodeName)	{
		setNodeName(nodeName);
	}
	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
