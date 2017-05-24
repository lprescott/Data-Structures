//Luke R. Prescott
//Tester class
//H1.1

public class ItemTester 
{
	public static void main(String [] args) //main method for testing
	{
		//Item testing
		Item PickAxe = new Item("Pick-Axe", 7); //Creates a new item Pick-Axe
		PickAxe.examine();
		PickAxe.getName();
		PickAxe.getWeight();
		PickAxe.setName("Notched Pick-Axe."); //Changes item Pick-Axe
		PickAxe.setWeight(10);
		
		//Armor testing
		Armor ChestPlate = new Armor("Chest Plate", 35, 10); //Creates a new item Chest Plate
		ChestPlate.examine();
		ChestPlate.getName();
		ChestPlate.getWeight();
		ChestPlate.setName("Kings Chest Plate"); //Changes item Chest Plate
		ChestPlate.setWeight(40);
		ChestPlate.getDefense();
		ChestPlate.setDefense(15);
		
		//Weapon testing
		Weapon Sword = new Weapon("Sword", 10, 10); //Creates a new item Sword
		Sword.examine();
		Sword.getName();
		Sword.getWeight();
		Sword.setName("Excalibur"); //Changes item Sword
		
		//Food testing
		Food Cake = new Food("Cake", 1, 5, 1); //Creates a new item Cake
		Cake.examine();
		Cake.getName();
		Cake.getWeight();
		Cake.setName("Pie"); //Changes item Cake
		Cake.setWeight(2);
		Cake.getNutrition();
		Cake.getQuantity();
		Cake.setNutrition(2);
		Cake.setQuantity(2);
		
		//Re-examine
		System.out.println("\nChanged items: \n");
		
		PickAxe.examine();
		ChestPlate.examine();
		Sword.examine();
		Cake.examine();
		
	}
}
