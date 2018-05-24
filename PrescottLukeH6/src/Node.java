//Luke R. Prescott
//H6 Trees

public class Node
{
    String value;
    Node left, right;

    // Constructor
    Node(String val)
    {
        value = val;
        left = null;
        right = null;
    }

    // Overloaded Constructor
    Node(String val, Node leftChild, Node rightChild)
    {
        value = val;
        left = leftChild;
        right = rightChild;
    }
    
    //getters and setters

 	public String getValue() 
 	{
 		return this.value;
 	}

 	public void setValue(String input) 
 	{
 		this.value = input;
 	}
 	
 	public Node getLeft() 
 	{
 		return this.left;
 	}

 	public void setLeft(Node left) 
 	{
 		this.left = left;
 	}

 	public Node getRight() 
 	{
 		return this.right;
 	}

 	public void setRight(Node right) 
 	{
 		this.right = right;
 	}
}
