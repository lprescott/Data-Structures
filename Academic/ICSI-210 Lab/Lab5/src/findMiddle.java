
public class findMiddle 
{
	public static void main(String [] args)
	{
        LinkedList1 listTest = new LinkedList1();
        listTest.add("First");
        listTest.add("Second");
        listTest.add("Middle");
        listTest.add("Fourth");
        listTest.add("Fifth");
        System.out.println("The members of the list are: ");
        System.out.print(listTest);
		
        System.out.println("The middle string of the list is: ");
        middleStringOfList(listTest);
        
	}
	
	public static String middleStringOfList(LinkedList1 list)
	{
		return null;
		/*
		int length = 0;
		
		LinkedList1.Node fast = head;
       
        LinkedList1.Node slow = head;

        while(fast.next() != null)
        {
        	fast = fast.next();
        	slow = slow.next();
        	if(fast.next() != null)
        	{
        		fast = fast.next();
        	}
        }

        if(length%2 == 1)
        {
            slow = slow.next();
        }
        */
	}
}
