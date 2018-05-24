//Luke R. Prescott
//Item class
//H1.1

public class Item 
{
	//Properties
	private String name; //The name of the item.
	private int weight; //The weight of the item.
	
	//Constructor(s)
	public Item(String name, int weight) //Item constructor with name and weight variables
	{
		this.name = name;
		this.weight = weight;
	}
	
	
	//Method(s)
	public void examine() //Method that prints name (and weight) of the object.
	{
		System.out.println("It is a " + name + " and it weighs " + weight + " pounds.");
	}
	
	//getter(s) and setter(s)
	public String getName() //returns the name of an item
	{
		return this.name;
	}

	public int getWeight() //returns the weight of an item
	{
		return this.weight;
	}
	
	public void setName(String name) //sets the name of an item
	{
		this.name = name;
	}
	
	public void setWeight(int weight) //sets the name of an item
	{
		this.weight = weight;
	}
}
