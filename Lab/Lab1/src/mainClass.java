
public class mainClass 
{
	public static void main(String [] args)
	{	
		//testing regular polygon
		Regular_Polygon testingPolygon = new Regular_Polygon();
		testingPolygon.setRadius(5);
		testingPolygon.setSideLength(2);
		testingPolygon.setSides(6);
		System.out.println("The testing polygon's area is: " +testingPolygon.area());
		
		//testing my polygon
		My_Polygon testingPolygon2 = new My_Polygon();
		testingPolygon2.setRadius(10);
		testingPolygon2.setSideLength(6);
		testingPolygon2.setSides(4);
		System.out.println("The testing polygon's (2) area is : " + testingPolygon2.area());
		System.out.println("The testing polygon's (2) area of faces is : " + testingPolygon2.areaOfFaces());
		System.out.println("The testing polygon's (2) volume is : " + testingPolygon2.volume());
		
	}
}
