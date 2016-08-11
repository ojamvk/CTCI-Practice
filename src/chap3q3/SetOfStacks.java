package chap3q3;

import java.util.*;
import stack.Node;

public class SetOfStacks {
	static int MAXSIZE = 5;
	private ArrayList<Stack> stackList;
	private Stack currentStack;
	
	public SetOfStacks()	{
		currentStack = new Stack("0");
		stackList = new ArrayList<Stack>();
	}
	public void push(String nodeName)	{
		if(currentStack.getSize() == MAXSIZE)	{
			stackList.add(currentStack);
			currentStack = new Stack(Integer.toString(stackList.size()+1));
			}
		currentStack.push(nodeName);
		currentStack.size++;
		//System.out.println(currentStack.size);
	}
	
	public Node pop()	{
		if(currentStack.size == 0)	{
			currentStack = stackList.get(stackList.size()-1);
			stackList.remove(stackList.size()-1);
		}
		currentStack.size--;
		//System.out.println(currentStack.size);
		return currentStack.pop();
		
	}
	
	public static void main(String[] args)	{
		SetOfStacks s = new SetOfStacks();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		s.push("f");
		s.push("g");
		s.push("h");
		s.push("i");
		s.push("j");
		
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		System.out.println(s.pop().getNodeName());
		
	}
}
