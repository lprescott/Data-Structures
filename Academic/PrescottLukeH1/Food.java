//Luke R. Prescott
//Food class
//H1.1

public class Food extends Item
{
	//Properties
	private int nutrition; //The nutrition of the food.
	private int quantity; //The quantity of the food.
	
	//Constructor(s)
	public Food(String name, int weight, int nutrition, int quantity) //Constructor of food with name, weight, nutrition and quantity.
	{
		super(name, weight); //Inherits name and weight from item class.
		this.nutrition = nutrition;
		this.quantity = quantity;
	}

	//Method(s)
	
	//Getter(s) and setter(s)
	public int getNutrition() //returns nutrition
	{
		return this.nutrition;
	}
	
	public int getQuantity() //returns quantity
	{
		return this.quantity;
	}
	
	public void setNutrition(int nutrition) //sets nutrition
	{
		this.nutrition = nutrition;
	}
	
	public void setQuantity(int quantity) //sets quantity
	{
		this.quantity = quantity;
	}
}
