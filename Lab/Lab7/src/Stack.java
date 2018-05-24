public class Stack 
{
	int maxsize=11; //set maxsize to be 11 instead of 10
	int[] stackarray=new int[maxsize];
	//int top = -1;
	int top = 0; //set top = 0 instead of -1
	
	public boolean empty() 
	{ 
		return top == 0; 
	}
	
	void push(int a)
	{
		//if(top+1>=maxsize)
		//{
			//Your Code goes here
		//}
		
		if(top  == stackarray.length)
		{
			System.out.println("StackOverFlow");
		}
		
		else
		{
			stackarray[top] = a;
			top ++;
		}	
		
	}

	void pop()
	{
		//if(top<0)
		//{
			//Your code goes here
			
		//}
		
		if(empty())
		{
			System.out.println("EmptyStack");
		}
		
		else
		{
			top --;
			System.out.println(stackarray[top]);
		}
	}
	
	void top()
	{
		//Your code goes here
		//System.out.println(stackarray[top - 1]); //This is the code for top if it were required
	}

	void print()
	{
		//Your code goes here
		for(int i = 0; i < stackarray.length; i++)
		{
			System.out.println(stackarray[i]);
		}

	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(3);
		s.push(34);
		s.push(33);
		s.push(93);
		s.push(34);
		s.push(33);
		s.push(93);
		s.push(34);
		s.push(33);
		s.push(93);
		s.push(93);
		s.top(); 
		s.pop();
		s.top();
		s.push(67);
		s.print();
	}
}
