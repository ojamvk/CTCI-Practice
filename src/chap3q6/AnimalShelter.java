package chap3q6;

import java.util.*;
import queue.Queue;

public class AnimalShelter {

	LinkedList<Node> mainQueue;
	
	public AnimalShelter()	{
		mainQueue = new LinkedList<Node>();
	}
	
	public void enqueue(String nodeName, String type)	{
		Node node = new Node(nodeName);
		if(type.equalsIgnoreCase("dog"))	{
			node.setDog(true);
		}
		else	{
			node.setDog(false);
		}
		mainQueue.add(node);
	}
	public Node dequeueAny()	{
		return(mainQueue.remove());
	}
	
	public Node dequeueDog()	{
		int i = 0;
		for(Node n : mainQueue)	{
			if(n.isDog())	{
				return mainQueue.remove(i);
			}
			i++;
		}
		return null;
	}
	public Node dequeueCat()	{
		int i = 0;
		for(Node n: mainQueue)	{
			if(!n.isDog())	{
				return mainQueue.remove(i);
			}
			i++;
			
		}
		return null;
	}
	
	public static void main(String[] args)	{
		AnimalShelter animalShelter = new AnimalShelter();
		
		animalShelter.enqueue("a", "cat");
		animalShelter.enqueue("b", "dog");
		animalShelter.enqueue("c", "dog");
		animalShelter.enqueue("d", "dog");
		animalShelter.enqueue("e", "cat");
		animalShelter.enqueue("f", "dog");
		
		System.out.println(animalShelter.dequeueAny().getNodeName());
		System.out.println(animalShelter.dequeueCat().getNodeName());
		System.out.println(animalShelter.dequeueDog().getNodeName());
		System.out.println(animalShelter.dequeueAny().getNodeName());
		System.out.println(animalShelter.dequeueAny().getNodeName());
		
		
	}
}
