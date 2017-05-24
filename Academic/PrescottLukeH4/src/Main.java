//Luke R. Prescott
//H4 Stacks & Queues

public class Main 
{
	/* 
	 * Move the contents of a stack to a queue. Maintain order so that if you were to pop and print
	 * all of the items from the stack and dequeue and print all the items from the queue it would
     * print the same thing.
	 */
    
	public static Queue moveStackToQueue(Stack inputStack) //public method moveStackToQueue takes a Stack inputStack enqueues to a Queue then returns
	{
		Queue newQueue = new Queue(); //initialization of newQueue
		
		Stack.Node queueingNode = inputStack.top; //creates new Node with data of first Node as to not change data
		
		while(queueingNode != null) //while there are more Nodes
		{
			newQueue.enqueue(queueingNode.value); //enQueues queueingNode value to new Queue
			queueingNode = queueingNode.next; //set first to the next Node
		}
		
		return newQueue; //returns newQueue
	}
	
	/* 
	 * Move all the contents of a queue to a stack. Maintain order so that if you were to pop and
	 * print of the items from the stack and dequeue and print all the items from the queue it would
     * print the same thing.
	 */
	
	public static Stack moveQueueToStack(Queue inputQueue) //public method moveQueueToStack takes Queue inputQueue and then pushes values to Stack newStack
	{
		Stack newStack = new Stack(); //initialization of newStack
		String [] stringArray = new String [inputQueue.getLength()]; //initializes new string array with length of inputQueue
		
		Queue.Node pushingNode = inputQueue.front; //creates new Node with data of first Node as to not change data
		
		int arrayLocation = 0; //initializes arrayLocation to 0
		while(pushingNode != null) //while there are more Nodes
		{
			stringArray[arrayLocation] = pushingNode.value; //sets the stringArray at location arrayLocation to pushingNode's val
			arrayLocation++; //increments arrayLocation
			pushingNode = pushingNode.next; //set first to the next Node
		}
		
		for (int x = stringArray.length - 1; x >= 0; x--) //loops through stringArray backwards
		{
			newStack.push(stringArray[x]); //adds the value in stringArray at x to newStack by pushing
		}
		
		return newStack; //returns newStack
	}
	
	/* 
	 * Move the contents of a stack to another stack. Maintain order so that if you were to pop and
	 * print the items of both stacks, they would print the same thing.
	 */
	
	public static Stack moveStackToStack(Stack inputStack) //public method moveStackToStack takes Stack inputStack and then pushes values to Stack duplicateStack
	{
		Stack duplicateStack = new Stack(); //initialiation of duplicateStack
		String [] stringArray = new String [inputStack.getLength()]; //initializes new string array with length of inputStack
		
		Stack.Node pushingNode2 = inputStack.top; //creates new Node with data of first Node as to not change data
		
		int arrayLocation = 0; //initializes arrayLocation to 0
		while(pushingNode2 != null) //while there are more Nodes
		{
			stringArray[arrayLocation] = pushingNode2.value; //sets the stringArray at location arrayLocation to pushingNode's val
			arrayLocation++; //increments arrayLocation
			pushingNode2 = pushingNode2.next; //set first to the next Node
		}
		
		for (int x = stringArray.length - 1; x >= 0 ; x--) //loops through stringArray backwards
		{
			duplicateStack.push(stringArray[x]); //adds the value in stringArray at x to duplicateStack by pushing
		}
		
		return duplicateStack; //returns duplicateStack
	}
	
	public static void main(String [] args)
	{
		Stack testStack = new Stack(); //initializes testStack as new Stack
		Queue testQueue = new Queue(); //initializes testQueue as new Queue
	
		//testing Stack Class
		System.out.println("The testStack, " + testStack + ", includes: ");
		testStack.push("One");
		testStack.push("Two");
		testStack.push("Three");
		testStack.push("Four");
		testStack.push("Five");
		testStack.traverseForwardAndPrint();
		
		String data = testStack.pop();
	    System.out.println("\nPopped: " + data);
	    System.out.println("The testStack, " + testStack + ", includes: ");
	    testStack.traverseForwardAndPrint();
		
	    System.out.println("\nPeeked: " + testStack);
		System.out.println(testStack.peek());
		
		//testing Queue Class
		System.out.println("\nThe testQueue, " + testQueue + ", includes: ");
		testQueue.enqueue("One");
		testQueue.enqueue("Two");
		testQueue.enqueue("Three");
		testQueue.enqueue("Four");
		testQueue.enqueue("Five");
		testQueue.traverseForwardAndPrint();
		
		String data2 = testQueue.dequeue();
	    System.out.println("\nDequeued: " + data2);
	    System.out.println("The testQueue, " + testQueue + ", includes: ");
	    testQueue.traverseForwardAndPrint();
	    
	    System.out.println("\nPeeked: " + testQueue);
		System.out.println(testQueue.peek());
		
		//Second test-lists initialized here
		Stack testStack2 = new Stack(); //initializes testStack as new Stack
		Queue testQueue2 = new Queue(); //initializes testQueue as new Queue
		
		System.out.println("\nThe second testStack, " + testStack2 + ", includes: ");
		testStack2.push("One");
		testStack2.push("Two");
		testStack2.push("Three");
		testStack2.push("Four");
		testStack2.push("Five");
		testStack2.push("Six");
		testStack2.push("Seven");
		testStack2.push("Eight");
		testStack2.push("Nine");
		testStack2.traverseForwardAndPrint();
		
		System.out.println("\nThe second testQueue, " + testQueue2 + ", includes: ");
		testQueue2.enqueue("One");
		testQueue2.enqueue("Two");
		testQueue2.enqueue("Three");
		testQueue2.enqueue("Four");
		testQueue2.enqueue("Five");
		testQueue2.enqueue("Six");
		testQueue2.enqueue("Seven");
		testQueue2.enqueue("Eight");
		testQueue2.enqueue("Nine");
		testQueue2.traverseForwardAndPrint();
		
		System.out.println();
		
		//testing moveStackToQueue method
		System.out.println("Testing moveStackToQueue method: ");
		Queue testQueue3 = new Queue();
		
		testQueue3 = moveStackToQueue(testStack2);
		System.out.println("The Stack: ");
		testStack2.traverseForwardAndPrint();
		System.out.println("\nThe Queue: ");
		testQueue3.traverseForwardAndPrint();
		
		System.out.println();
		
		//testing moveQueueToStack method
		System.out.println("Testing moveQueueToStack method: ");
		Stack testStack3 = new Stack();
		
		testStack3 = moveQueueToStack(testQueue2);
		System.out.println("The Queue: ");
		testQueue2.traverseForwardAndPrint();
		System.out.println("\nThe Stack: ");
		testStack3.traverseForwardAndPrint();
		
		System.out.println();
		
		//testing moveStackToStack method
		System.out.println("Testing moveStackToStack method: ");
		Stack testStack4 = new Stack();
		
		testStack4 = moveStackToStack(testStack2);
		System.out.println("The Stack: ");
		testStack2.traverseForwardAndPrint();
		System.out.println("\nThe second Stack: ");
		testStack4.traverseForwardAndPrint();
		
	}
}
