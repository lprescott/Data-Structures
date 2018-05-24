import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Luke R. Prescott
//H6 Trees

public class binarySearchTree extends binaryTree
{
    private class deletionResult
    {
        Node node;    // Removed node
        Node tree;    // Remaining tree

        deletionResult(Node node, Node tree)
        {
            this.node = node;
            this.tree = tree;
        }
    }
    
	/*
	search—finds and returns the node that matches a search key (if it exists; otherwise return
	null)
	*/
	
	public Node search(String key)
	{
		return search(key, root);
	}
	
	private Node search(String key, Node treeToSearch)
	{
		//if the tree is empty
		if(treeToSearch == null)
		{
			return null;
		}
		
		//if the key does not very from the trees node value
		if(key.compareTo(treeToSearch.value) == 0)
		{
			return treeToSearch;
		}
		
		//if the key is smaller than the trees node value
		if(key.compareTo(treeToSearch.value) < 0)
		{
			return search(key, treeToSearch.left);
		}
		
		//else the key is larger
		else 
		{
			return search(key, treeToSearch.right);
		}
		
	}
	
	//insert—inserts a node into the tree
	
	public void insert(String input)
	{
		root = insert(input, root);
	}
	
	private Node insert(String input, Node treeToInsert)
	{
		//if the tree is empty
		if(treeToInsert == null)
		{
			new Node(input);
		}
		
		//if the input is smaller than the trees node value
		if(input.compareTo(treeToInsert.value) < 0)
		{
			treeToInsert.left = insert(input, treeToInsert.left);
		}

		//else the input is larger
		else 
		{
			treeToInsert.right = insert(input, treeToInsert.right);
		}
		
		//return the tree
		return treeToInsert;
	}

	//delete—deletes a node from the tree
	
	public boolean delete(String input)
	{
		//create new object deletionResult called result that = deletion of from the root of input
		deletionResult result = delete(root, input);
		
		//if the tree is empty
		if(result == null)
		{
			return false;
		}
		
		//else set the new tree 
		else 
		{
			root = result.tree;
			return true;
			
		}
	}
	
	private deletionResult delete(Node binarySearchTree, String input)
	{
		//if the tree is empty
        if (binarySearchTree == null)
        {
            return null;
        }
        
        //if the comparable is greater than input
        if ((input.compareTo(binarySearchTree.value)) < 0)
        {
        	//create new deletionResult object that equals that equals the left of the tree
            deletionResult result = delete(binarySearchTree.left, input);
            if (result == null)
            {
                return null;
            }
            
            //removes input from the left subtree
            binarySearchTree.left = result.tree;
            result.tree = binarySearchTree;
            return result;
        }
        
        //if the comparable is less than input
        if ((input.compareTo(binarySearchTree.value)) > 0)
        {
        	//create new deletionResult object that equals that equals the right of the tree
            deletionResult result = delete(binarySearchTree.right, input);
            if (result == null)
            {
                return null;
            }
            
          //removes input from the right subtree
            binarySearchTree.right = result.tree;
            result.tree = binarySearchTree;
            return result;
        }
        
        //if the node is a leaf(has no left or right)
        if (binarySearchTree.right == null && binarySearchTree.left == null)
        {
            return new deletionResult(binarySearchTree, null);
        }
        
        //if the node has two children
        if (binarySearchTree.right != null && binarySearchTree.left != null)
        {
        	//removes the largest node in left tree 
            deletionResult deletionResult = deleteLargest(binarySearchTree.left);
            Node newRoot = deletionResult.node;
            newRoot.left = deletionResult.tree;
            newRoot.right = binarySearchTree.right;

            //return result
            binarySearchTree.left = null;
            binarySearchTree.right = null;
            return new deletionResult(binarySearchTree, newRoot);
        }
        
        //if the node has ones child
        Node node = binarySearchTree;
        Node tree;
        if (binarySearchTree.left != null)
        {
            tree = binarySearchTree.left;
        } else
        {
            tree = binarySearchTree.right;
        }
        
        //return result
        node.left = null;
        node.right = null;
        return new deletionResult(node, tree);
	}
	
	private deletionResult deleteLargest(Node binarySearchTree)
	{
		//if the tree is empty
		if (binarySearchTree == null)
		{
			return null;
		}
	    
		//if the right node is null
		if (binarySearchTree.right == null)
		{
			//set the root to the largest node
			Node tree = binarySearchTree.left;
			binarySearchTree.left = null;
			return new deletionResult(binarySearchTree, tree);
	    } 
	        
	    else
	    {
	    	//removes the largest node from the right tree
	    	deletionResult deletionResult = deleteLargest(binarySearchTree.right);
	        binarySearchTree.right = deletionResult.tree;
	        deletionResult.tree = binarySearchTree;
	        return deletionResult;
	    }
	}
	
	//print—traverse (inorder) and print each node
	
	private void print(Node binarySearchTree)
	{
		//if the tree is empty
		if (binarySearchTree == null)
		{
			return;
		}
		
		//recursively call the left subtree
		print(binarySearchTree.left);
		
		//print the nodes value
		System.out.print( "Node data: " + binarySearchTree.value);
		
		//recursively call the right subtree
	    print(binarySearchTree.right);
	     
	}
	
	/*
	any methods you need to solve the problem of using a tree to make a word frequency histogram.
	You should be able to read a file and add a word if it isn’t in the tree yet and update
	a counter associated with it if it is in the tree.
	*/
	private int count(Node rootOfTree)
	{
		if (rootOfTree == null)
		{
			return 0;
		}
	}
	private void wordFrequency()
	{
		//initialize a scanner
		Scanner sc1 = null;
		
		try
		{
			//create a scanner in the new file
			sc1= new Scanner(new File("wordFrequency.txt"));
		}
		
		//catch if the file is empty
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//while there is a next line
		while (sc1.hasNextLine())
		{
			Scanner sc2 = new Scanner(sc1.nextLine());
			
			//while there is a next word
			while(sc2.hasNext())
			{
				//add the word to the binary search tree
				String wordToAdd = sc2.next();
				this.insert(wordToAdd);
			}
		}
		
		if (this.root.value == null)
		{
			System.out.println("This file is empty");
		}
		
		print (this.root);
		System.out.println(count(this.root));
	}
}
