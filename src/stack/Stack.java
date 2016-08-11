package stack;

public class Stack {

	Node top;

	public Node pop() {
		if (top != null) {
			Node topNode = top;
			top = top.getNext();
			return topNode;
		}
		return null;
	}

	public void push(Node n) {
		n.setNext(top);
		top = n;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		Node a = new Node("a");
		Node b = new Node("b");
		stack.push(a);
		stack.push(b);
		System.out.println(stack.pop().getNodeName());
	}

}
