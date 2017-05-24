//Created by GokulNath on 9/12/16. CSI213 Lab 2

import java.util.*;

// Parent Class Regular_Polygon
class Regular_Polygon
{
    private int sides;           //initializing the properties
    private int radius;
    private int sideLength;      // just for simplification added another property "sideLength so that we don't have to use any complex formula

    //Method to get SideLength
    public int getSideLength() {
        return sideLength;
    }

    //Method that sets SideLength
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    //Method to get the number of Sides
    public int getSides()
    {
        return sides;
    }

    //Method that sets the number of sides
    public void setSides(int no_of_sides)
    {
        this.sides=no_of_sides;
    }

    //Method to get Radius or Apothem
    public int getRadius()
    {
        return radius;
    }

    //Method that sets the Radius or Apothem
    public void setRadius(int Radius)
    {
        this.radius=Radius;
    }

    //Method that calculates the area of the regular polygon
    public double area()
    {
        double area=0.5*radius*(sideLength*sides);
        return area;
    }


}

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
