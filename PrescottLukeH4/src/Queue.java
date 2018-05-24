//Luke R. Prescott
//H4 Stacks & Queues

public class Queue 
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
	
    Node front = null; //initializes Node front to null
    Node rear = null; //initializes Node rear to null
    
    public boolean isEmpty() //boolean method isEmpty
    {
    	return front == null; //returns true if front == nullS
    }
    
    //gets length of queue
	public int getLength() //int method getLength
	{
		int size = 0; //initialize size to 0
		Node lengthNode = front; //creates new Node with data of first Node as to not change data
		
		while(lengthNode != null) //while there are more Nodes
		{
			size++; //increment size
			lengthNode = lengthNode.next; //set first to the next Node
		}
	
		return size; //return size
	}
    
    //add item to the front of the list
    public void enqueue(String data) //void method enqueue takes String data
    {
    	if(rear != null) //if rear does not = null
    	{
    		rear.next = new Node(data, null); //set rear.next to a new Node with value data and next Node null
    		rear = rear.next; //set rear to rear.next
    	}
    	
    	else
    	{
    		rear = new Node(data, null); //set rear to a new Node with value data and next Node null
    		front = rear; //set front Node = rear Node
    	}
    }
    
    //remove item from the end of the queue
    public String dequeue() //String method dequeue take nothing
    {
    	if(isEmpty()) //if the queue is empty
		{
			System.out.println("The Queue is empty."); //print the queue is empty
			return null; //return null
		}
    	
    	else
    	{
    		String dequeuedValue = front.value; //sets String dequeuedValue to front.value
    		front = front.next; //sets front to front.next
    		
    		if (front == null) //if front is null
    		{
    			rear = null; //rear is null
    		}
    		
    		return dequeuedValue; //return dequeuedValue
    	}
    }
    
    //use item from end of the queue without removing it
    public String peek() //String method peek takes nothing
    {
    	if(isEmpty()) //if the queue is empty
		{
			System.out.println("The Queue is empty."); //print the queue is empty
			return null; //return null
		}
    	
    	else
    	{
    		return front.value; //return fronts value
    	}
    }

	public void traverseForwardAndPrint() //prints stack in order
	{
		Node printingNode = front; //creates new Node with data of first Node as to not change data
		
		while(printingNode != null) //while there are more Nodes
		{
			System.out.println(printingNode.value); //prints Nodes values
			printingNode = printingNode.next; //set first to the next Node
		}
	}
}
