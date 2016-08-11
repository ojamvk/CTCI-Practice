package queue;
import stack.Node;
public class Queue {

	private Node first, last;

	public void enqueue(Node n) {
		if (last == null) {
			first = n;
			last = n;
			first.setNext(null);
			last.setNext(null);
		} else {
			n.setNext(null);
			last.setNext(n);
			last = n;
		}
	}

	public Node dequeue() {
		if (first != null) {
			Node f = first;
			first = first.getNext();
			return f;
		}
		return null;
	}

	public static void main(String[] args) {
		Node a = new Node("a");
		Node b  = new Node("b");
		Node c = new Node("c");
		Queue queue = new Queue();
		
		queue.enqueue(a);
		queue.enqueue(b);
		queue.enqueue(c);
		System.out.println(queue.dequeue().getNodeName());
		System.out.println(queue.dequeue().getNodeName());
		System.out.println(queue.dequeue().getNodeName());
		}

}
