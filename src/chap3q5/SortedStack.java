package chap3q5;

import chap3q2.Node;

public class SortedStack {
	Stack mainStack;
	Stack tempStack;
	public SortedStack()	{
		mainStack = new Stack();
		tempStack = new Stack();
	}
	
	public void push(double nodeName)	{
		Node top = mainStack.peek();
		if(top != null)	{
		while(top != null && top.getNodeName() < nodeName )	{
			tempStack.push(mainStack.pop());
			top = mainStack.peek();
		}
		}
		mainStack.push(new Node(nodeName));
		while(tempStack.size != 0)	{
			mainStack.push(tempStack.pop());
		}
		System.out.println(mainStack.top.getNodeName());
	}
	public static void main(String[] args)	{
		SortedStack sortedStack = new SortedStack();
		sortedStack.push(3.4);
		sortedStack.push(3.5);
		sortedStack.push(4.4);
		sortedStack.push(1.4);
		sortedStack.push(3.4);
	}
}
