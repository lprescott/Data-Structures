//Luke Prescott
//CSI 213 Lab #4

public class areaOfARectangle 
{
	private double length;
	private double breadth;
	
	//Constructor(s)
	public areaOfARectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	//getter(s) and setter(s)
	public double getLength()
	{
		return this.length;
	}

	public double getBreadth() 
	{
		return this.breadth;
	}
	
	public void setLength(double length) 
	{
		this.length = length;
	}
	
	public void setBreadth(double breadth)
	{
		this.breadth = breadth;
	}
	
	//methods
	public void getArea() 
	{
		System.out.println("\nThe area is: " + length * breadth);
	}
}
