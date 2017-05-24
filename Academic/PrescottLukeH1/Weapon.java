//Luke R. Prescott
//Weapon class
//H1.1

public class Weapon extends Item
{
	//Properties
	private int damage; //The damage of the armor.
	
	//Constructor(s)
	public Weapon(String name, int weight, int damage) //Constructor of armor with name, weight, damage.
	{
		super(name, weight); //Inherits name and weight from item class.
		this.damage = damage;
	}

	//Method(s)

	//getter(s) and setter(s)
	public int getDamage() //returns the damage of an item
	{
		return this.damage;
	}
	
	public void setDamage(int damage) //sets the damage of an item
	{
		this.damage = damage;
	}
}

