package chap3q2;

import java.util.*;

//Return min of stack

public class MinValue {


	private Node top;
	private Node min;
	
	
	public void push(double nodeName)	{
		if(top == null)	{
			min = new Node(nodeName);
		}
		else	{
			min = new Node(Math.min(min.getNodeName(), nodeName));
		}
		Node node = new Node(nodeName);
		node.setNext(top);
		top = node;
	}
	public Node pop()	{
		if(top != null)	{
			Node node = top;
			top = top.getNext();
			return node;
		}
		return null;
	}
	public Node getMin()	{
		return min;
	}
	public static void main(String[] args) {

		MinValue stack = new MinValue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.getMin().getNodeName());
		stack.push(0);
		System.out.println(stack.getMin().getNodeName());
		System.out.println(stack.pop().getNodeName());
		System.out.println(stack.pop().getNodeName());
	}

}
