public class Queue2 
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
			// Your Code goes here
		}
	}

	void print()                       //printing the elements of the queue
	{

		// Your Code goes here
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
