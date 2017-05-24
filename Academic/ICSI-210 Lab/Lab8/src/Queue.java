public class Queue 
{
	int maxsize=10;
	int[] queuearray=new int[maxsize];
	int front=0;
	int rear=0;
	int size=0;

	void enqueue(int value)     //inserting an element into the queue
	{
		if(size<maxsize)
		{
			// Your Code goes here
			size++; //increments size
			queuearray[front] = value; //sets queuearray at front to value
			front++; //increments front
		}
		else
		{
			System.out.println("The queue is Full!");
		}
	}
	
	void dequeue()                   //deleting an element from the queue
	{
		if(size<1)
			System.out.println("Queue is Empty!");
		else
		{	
			int current = rear; //set int current to rear
			
			while(current < front -1) //while current is less than front -1 
			{
				queuearray[current] = queuearray[current + 1]; //queue array at current equals the next
				current ++; //increment current
			}
			
			front--; //decrement front
			size--; //decrement size
			
		}
	}
	
	void print()                       //printing the elements of the queue
	{
		// Your Code goes here
		
		for(int x = 0; x < queuearray.length -1 ; x++) //for loop that traverses the array length
		{
			System.out.println(queuearray[x]); //prints the value of the array at x
		}
	}
	
	void size()
	{
		System.out.print("The size of Queue:"+size);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Queue q= new Queue();
		q.dequeue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.dequeue();
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.dequeue();
		q.enqueue(10);
		q.enqueue(11);
		q.print();
	}
}
