//Luke R. Prescott
//H3 Linked List

public class linkedList 
{

	private class Node //private inner Node class
	{
		//variables
		String value; //Value of the list element (String)
		Node next; //Next Node in the list
		Node previous; //Previous Node in the list
		
		//constructor
		Node(String val, Node n, Node p) //takes string val, previous and next Node
		{
            value = val;
            next = n;
            previous = p;
		}
		
		//overloaded constructor
		Node(String val) //only takes string val
		{
			this(val, null, null); //calls previous constructor with null for Nodes
		}
		
	}
	
	private Node first; //head of the list
	private Node last; //last element of the list
	
	//constructor
	public linkedList() //takes no arguments
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
	
	public void add(String data) //adds a Node to the list
	{
		if(isEmpty()) //if the list is empty
		{
			last = new Node(data); //creates a new Node with String data, sets to last
			first = last; //sets first = last
		}
		
		else
		{
			last.next = new Node(data, null, last); //sets last.next to new Node with Node(data, last, null);
			last = last.next; //sets last = last.next
		}
	}
	
	public void add(int index, String data) //inserts a Node into the list at an index with data
	{
        if (index < 0  || index > size())  //if the index is out of bounds
        {
            System.out.println("ERR: The index is out of bounds."); //prints error
            return; //returns out of method
        }
        
        if (index == 0) //if index is exactly 0
        {
        	Node oldFirst = first; //creates oldFirst = first
        	
        	//Node(String val, Node p, Node n)
        	first = new Node(data, oldFirst, null); //sets first = a new Node with value data, previous Node null, next Node oldFirst
            
        	if (oldFirst != null) //if oldFirst doesn't =  null
                oldFirst.previous = first; //sets first = to the Node before oldFirst          
            
        	if (last == null) //if last = null
                last = first; //sets last = first
           
            return; //returns out of method
        }
        
        //if index is not zero or out of bounds
        Node predecessor  = first; //sets Node predecessor = first
        for (int x = 1; x <= index -1; x++) //for loop for length of index
        {
        	predecessor = predecessor.next; //sets predecessor to next Node
        }
        
        Node successor = predecessor.next; //sets Node successor = Node after predecessor
        Node middle = new Node(data, successor, predecessor ); //sets Node middle to new Node with Node(data, predecessor, successor)
        predecessor.next = middle;  //sets predecessor.next = to middle Node
       
        if (successor == null) //if successor == null        
            last = middle; //Node last = Node middle
        else            
        	successor.previous = middle; //else Node before successor = Node middle
	}

	public void insertInAlphabeticalOrder(String data) //inserts a Node into the list in alphabetical order
	{
		if (isEmpty()) //if the list is empty 
		{
			last = new Node(data); //inserts data into first Node
			first = last; //sets first Node = last Node
		}
		
		else //if the list is not empty
		{
			int index = 0; //initialize index to 0
			
			Node comparingNode = first; //creates new Node with data of first Node 
			
			while(comparingNode.value.compareTo(data) < 0) //while the value of comparingNode compared to data is < 0  (snaller} 
			{
				index ++; //increment index
				comparingNode = comparingNode.next; //set comparingNode to the next Node
			}
			
			
			this.add(index, data); //add Node to linkedList using add method using String data
		}
	}
	
	public Node findNode(String data)  //finds a Node matching data or returns null
	{
	    Node findingNode = first; //creates new Node with data of first Node as to not change data
	    
	    while(findingNode!=null) //while there are more Nodes
	    {
	         if(findingNode.value.equals(data)) //if there is a Node with the same data
	         {
	        	 return findingNode; //return findingNode
	         }
	         
	         else
	         {
	        	 findingNode = findingNode.next; //set findingNode to the next Node 
	         }
	    }
	    
	    return null; //returns null if no accurate data is found 
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
	
	public void traverseBackwardAndPrint() //prints list in backwards order
	{
		Node printingNode = last; //creates new Node with data of last Node as to not change data
		
		while(printingNode != null) //while there are more Nodes before
		{
			System.out.println(printingNode.value); //prints Nodes values
			printingNode = printingNode.previous; //set first to the previous Node
		}
	}
	
	public void deleteNodeFromList(String data) //deletes Node with String data from list
	{
		if (isEmpty()) //if the list is empty 
		{
			System.out.println("The list is empty."); //prints ERR
		}
		
		Node deletingNode = first; //creates new Node with data of first Node as to not change data
		while(deletingNode != null && !deletingNode.value.equals(data)) //while there are more Nodes and you haven't found the Node to delete
		{
			deletingNode = deletingNode.next; //go to the next Node
		}
		
		if(deletingNode == null) //if the Node to delete is empty 
		{
			System.out.println("There is no Node to delete."); //prints ERR
		}
		
		Node predeccessor = deletingNode.previous; // Node before the deletingNode
	    Node successor = deletingNode.next; // Node after the deletingNode
	    
	    if (predeccessor == null)  //if the predeccessor is null
	    {
	        first = successor; //set first == successor
	    }
	    
	    else
	    {
	    	predeccessor.next = successor; //set the Node after predecessor to be successor
	    } 
	    	
	    if (successor == null) //if successor is null
	    {
	        last = predeccessor; //set last == predeccessor
	    }
	    
	    else
	    {
	        successor.previous = predeccessor; //set the Node before successor to be predeccessor
	    }
	}
	
    public void destroyList() //destroys list by settings nodes equal to null
    {
    	this.first = null; //sets first node to be null
    	this.last = null; //sets last node to be null
    }
}
