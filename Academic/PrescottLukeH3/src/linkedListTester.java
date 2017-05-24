//Luke R. Prescott
//H3 Linked List

public class linkedListTester 
{
	public static void main(String [] args)
	{
		//new list
		linkedList testList = new linkedList();
		
		//testing isEmpty method
		System.out.println("The " + testList +  " is empty: " + testList.isEmpty() + "\n");
		
		System.out.println("Added Apple, Bear, Cat, Lion and Zoo to the list in order. \n");
		
		//testing add methods
		testList.add("Apple"); //0
		testList.add("Bear"); //1
		testList.add("Cat"); //2
		testList.add("Lion"); //3
		testList.add("Zoo"); //4
		
		System.out.println("The " + testList +  " is empty: " + testList.isEmpty() + "\n");

		//testing printForward method
		System.out.println("The " + testList +  " printed forwards is: ");
		testList.traverseForwardAndPrint();
		
		//testing printBackward method
		System.out.println();
		System.out.println("The " + testList +  " printed backwards is: ");
		testList.traverseBackwardAndPrint();
		
		//testing size method
		System.out.println();
		System.out.println("The " + testList +  "'s size is: " + testList.size());
		
		//testing second add method
		System.out.println();
		System.out.println("Added \"Purse\" to " + testList +  " at position 4.");
		System.out.println();
		testList.add(4, "Purse");
		System.out.println("The " + testList +  " printed forwards is: ");
		testList.traverseForwardAndPrint();
		
		//testing insertinABCOrder method
		System.out.println();
		System.out.println("Added \"Yawn\" to " + testList +  " in alphabetical order.");
		testList.insertInAlphabeticalOrder("Yawn");
		System.out.println();
		System.out.println("The " + testList +  " printed forwards is: ");
		testList.traverseForwardAndPrint();
		
		//testing findNode method
		System.out.println();
		System.out.println("The node in " + testList +  " with data \"Lion\" using findNode method is: " );
		System.out.println(testList.findNode("Lion"));
		
		//testing deleteNode method
		System.out.println();
		System.out.println("The node in " + testList + " with data \"Cat\" using deleteNodeFromList method was deleted.");
		testList.deleteNodeFromList("Cat");
		System.out.println();
		System.out.println("The " + testList +  " printed forwards is: ");
		testList.traverseForwardAndPrint();
		
		//testing destroyList method
		System.out.println();
		System.out.println("The " + testList + " has been destroyed: ");
		testList.destroyList();
		System.out.println(testList.isEmpty());
	
	}
}
