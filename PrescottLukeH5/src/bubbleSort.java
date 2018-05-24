//Luke R. Prescott
//H5 Sorting

public class bubbleSort //Singly linked list type
{
	private class Node //private inner Node class
	{
		//variables
		int value; //Value of the list element (int)
		Node next; //Next Node in the list
		
		//constructor
		public Node() //takes no parameters
		{
			value = 0; //sets val to 0
			next = null; //sets next to null
		}
		
		//overloaded constructor
		public Node(int value) //only takes int val
		{
			this.value = value; //sets parameter
			next = null; //sets next to null
		}
		
		//overloaded constructor 2
		public Node(int value, Node next) //takes int val and next Node
		{
			this.value = value; //sets parameter
            this.next = next; //sets parameter
            
		}
		
		//getters and setters
		public int getValue() //returns the value of the node
		{
			return this.value; //returns this val
		}

		public void setValue(int value) //sets the value of the node
		{
			this.value = value; //sets this val
		}
		
		public Node getNext() //returns the next Node
		{
			return this.next; //returns this next
		}

		public void setNext(Node next) //sets the next Node
		{
			this.next = next; //sets this next
		}
		
	}
	
	// Initializing variables
	private Node first; //head of the list
	private Node last; //last element of the list
	
	//constructor
	public bubbleSort() //takes no arguments
	{
		first = null; //sets head Node = null
		last = null; //sets last Node = null
	}
	
	// getters and setters
	public Node getFirst() //returns the first Node of the linked list
	{
		return this.first;
	}

	public void setFirst(Node first) //sets the first Node
	{
		this.first = first;
	}
	
	public Node getLast() //returns the last Node of the linked list
	{
		return this.last;
	}

	public void setLast(Node last) //sets the last Node
	{
		this.last = last;
	}
	
	//methods
	public boolean isEmpty() //returns true if Node is empty
	{
		return first == null; //if Node is == null then it is empty
	}
	
	public int size() //returns the number of Nodes in the linkedList
	{
		int count = 0; //sets count = 0
		Node countingNode = first; //creates new Node with data of first Node as to not change data
		
		while(countingNode != null) //while there are more Nodes
		{
			count ++; //increment count
			countingNode = countingNode.next; //set first to the next Node
		}
		
		return count; //returns count
	}
	
	public void add(int data) //adds a Node to the list
	{
		if(isEmpty()) //if the list is empty
		{
			last = new Node(data); //creates a new Node with int data, sets to last
			first = last; //sets first = last
		}
		
		else
		{
			last.next = new Node(data, null); //sets last.next to new Node with Node(data, last, null);
			last = last.next; //sets last = last.next
		}
	}
	
	public void traverseForwardAndPrint() //prints list in order
	{
		Node printingNode = first; //creates new Node with data of first Node as to not change data
		
		while(printingNode != null) //while there are more Nodes
		{
			System.out.println(printingNode.value); //prints Nodes values
			printingNode = printingNode.next; //set first to the next Node
		}
	}
	
	public void addRandomInts(int numberOfRandomNodes) //void method addRandomInts takes numberOfRandomNodes as a paramter
	{
		int minimum = 0; //min value for random int
		int maximum = 99; //max value for random int
		
		for (int i = 0; i < numberOfRandomNodes; i++) //loops through amount of numberOfRandomNodes and adds random ints to list
		{
			int randomInt = minimum + (int)(Math.random() * maximum); //generates random in
			Node newNode = new Node(randomInt); //set newNode to a Node with value randomInt
			
			if(isEmpty()) //if the list is empty
			{
				this.first = newNode; //newNode is first
				this.last = newNode; //newNode is last
			}
			
			else
			{
				newNode.next = first; //sets the node after newNode to first
				this.first = newNode; //sets first to newNode
			}
		}
	}

	public void Sort() // void method bubbleSort takes nothing as a paramter
	{
		Node current;  //initializes a Node called current
		
		if(isEmpty()) //if the list is empty print this
		{
			System.out.println("The list is empty.");
		}
		
		else if(first.getNext() == null) //if the list has only one node print this
		{
			System.out.println("The list has one Node.");
		}
	
		else 
		{
			current = first; //sets current to first Node in list
			
			boolean swapping = true; //sets sentinal boolean to true
			while(swapping) //while sentinal is true
			{
				swapping = false; //initially set the boolean to false (needed to exit loop)
				
				while(current != null) //traverses theough list
				{
					//if the value of the Node after current is not null and is greater than current
					if(current.getNext() != null && current.getValue() > current.getNext().getValue()) 
					{
						int temp = current.getValue(); //initialize a temp int to currents value 
						current.setValue(current.getNext().getValue()); //set current to the Node after currents value
						current.getNext().setValue(temp); //set the Node after current to the temp value
						swapping = true; //set sentinal boolean back to true
					}
					current = current.getNext(); //set current to the next Node
				
				}
				current = first; //set current to first
				
			}
		}
	}
	
	public static void main(String [] args)
	{
		//creates a new list with 8 random un-ordered Nodes and prints it
		System.out.println("Created new list testBubbleSort.");
		System.out.println("Added 8 random ints to list: \n");
		bubbleSort testBubbleSort = new bubbleSort();
		testBubbleSort.addRandomInts(8);
		System.out.print("Un-sorted list:\n");
		testBubbleSort.traverseForwardAndPrint();
		
		//sorts un-ordered list with 8 random int valued Nodes and prints it
		System.out.println("\nSorted list:");
	    testBubbleSort.Sort();
	    testBubbleSort.traverseForwardAndPrint();
	}
}
	