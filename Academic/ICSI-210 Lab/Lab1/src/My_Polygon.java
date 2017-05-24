/*
Child Class

Your Code Goes Here

Hints: 1)inherit all the other properties from the above parent class other than “Height”
 	 2)volume of the regular polygon prism = (0.5 * Radius * Sides * SideLength * Height)
   	 3)area of the faces = Height * Sides * SideLength


Main Class

Your Code Goes Here
Create the object for the necessary class! Recall the concept of inheritance and implement it here.

Good Luck */

public class My_Polygon extends Regular_Polygon
{
	int height = 5;

    public double volume() //volume method
    {
        double volume=0.5*getRadius()*getSides()*getSideLength()*height;
        return volume;
    }
    
    public double areaOfFaces() //area of faces method
    {
		double areaOfFaces = height * getSides() * getSideLength();
    	return areaOfFaces;
    }
    
}
