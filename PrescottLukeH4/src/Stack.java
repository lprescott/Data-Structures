//Luke R. Prescott
//H4 Stacks & Queues

public class Stack 
{
	class Node //private inner Node class
	{
		//variables
		String value; //Value of the list element (String)
		Node next; //Next Node in the list
		
		//constructor
		Node(String val, Node n) //takes string val, previous and next Node
		{
            value = val;
            next = n;
		}
		
		//overloaded constructor
		Node(String val) //only takes string val
		{
			this(val, null); //calls previous constructor with null for Nodes
		}	
	}
	
	Node top = null; //initializes Node top to null
	
	public boolean isEmpty() //boolean method isEmpty
	{
		return top == null; //returns true if top == null
	}
	
	//gets length of stack
	public int getLength() //int method getLength
	{
		int size = 0; //initialize size to 0
		Node lengthNode = top; //creates new Node with data of first Node as to not change data
		
		while(lengthNode != null) //while there are more Nodes
		{
			size++; //increment size
			lengthNode = lengthNode.next; //set first to the next Node
		}
	
		return size; //return size
	}
	
	//add item to top of stack
	public void push(String data) //void method push takes String data
	{
		top = new Node(data, top); //sets top to be a new Node with String data
	}
	
	//remove item from top of stack
	public String pop() //String method pop takes nothing
	{
		if(isEmpty()) //if the stack is empty
		{
			System.out.println("The Stack is empty."); //print the stack is empty
			return null; //return null
		}
		
		else
		{
			String poppedValue = top.value; //set String poppedValue to top.value
			top = top.next; //set top to the next Node
			return poppedValue; //return poppedValue
		}
	}
	
	//use top item in stack without removing it
	public String peek() //String method peek takes nothing 
	{
		if(isEmpty()) //if the stack is empty
		{
			System.out.println("The Stack is empty."); //print the stack is empty
			return null; //return null
		}
		
		else
		{
			return top.value; //returns value at top Node
		}
	}
	
	public void traverseForwardAndPrint() //prints stack in order
	{
		Node printingNode = top; //creates new Node with data of first Node as to not change data
		
		while(printingNode != null) //while there are more Nodes
		{
			System.out.println(printingNode.value); //prints Nodes values
			printingNode = printingNode.next; //set first to the next Node
		}
	}
}
