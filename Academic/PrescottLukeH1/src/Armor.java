//Luke R. Prescott
//Armor class
//H1.1

public class Armor extends Item
{
	//Properties
	private int defense; //The defense of the armor.
	
	//Constructor(s)
	public Armor(String name, int weight, int defense) //Constructor of armor with name, weight, defense.
	{
		super(name, weight); //Inherits name and weight from item class.
		this.defense = defense;
	}

	//Method(s)

	//getter(s) and setter(s)
	public int getDefense() //returns the defense of an item
	{
		return this.defense;
	}
	
	public void setDefense(int defense) //sets the defense of an item
	{
		this.defense = defense;
	}
}
