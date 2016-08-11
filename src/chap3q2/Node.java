package chap3q2;

public class Node {
	private double nodeName;
	private Node next;
	private String stackName;

	public Node(double nodeName)	{
		setNodeName(nodeName);
	}
	public double getNodeName() {
		return nodeName;
	}

	public void setNodeName(double nodeName) {
		this.nodeName = nodeName;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	public String getStackName() {
		return stackName;
	}
	public void setStackName(String stackName) {
		this.stackName = stackName;
	}
}
