package chap3q4;

import stack.Node;

public class MyQueue {
	private Stack stack1;
	private Stack stack2;

	public MyQueue() {
		stack1 = new Stack();
		stack2 = new Stack();
	}

	public void enqueue(String nodeName) {
		if (stack2.size == 0) {
			stack2.push(nodeName);
		} else {
			stack1.push(nodeName);
		}
	}

	public Node dequeue() {
		if (stack2.size > 0) {
			return (stack2.pop());
		} else {
			while (stack1.size > 0) {
				Node n = stack1.pop();
				stack2.push(n.getNodeName());
			}
			if (stack2.size > 0) {
				return (stack2.pop());
			}
		}
		return null;
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.enqueue("1");
		myQueue.enqueue("2");
		myQueue.enqueue("3");
		myQueue.enqueue("4");
		myQueue.enqueue("5");

		System.out.println(myQueue.dequeue().getNodeName());
		System.out.println(myQueue.dequeue().getNodeName());
		System.out.println(myQueue.dequeue().getNodeName());
		System.out.println(myQueue.dequeue().getNodeName());
	}
}
