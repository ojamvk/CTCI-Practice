package chap3q6;


public class Node {
	private String nodeName;
	private Node next;
	private boolean isDog;

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
	public boolean isDog() {
		return isDog;
	}
	public void setDog(boolean isDog) {
		this.isDog = isDog;
	}
	
}
