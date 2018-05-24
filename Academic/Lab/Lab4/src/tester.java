import java.util.Scanner;

//Luke Prescott
//CSI 213 Lab #4

public class tester 
{


	public static void main(String [] args)
	{
		
		Scanner console = new Scanner(System.in);
		
		double length;
		double breadth;
		String userInput;	
		areaOfARectangle userRectangle = new areaOfARectangle(0,0);
		boolean keepRunning = true;
		
		while(keepRunning == true)
		{
			
			
			System.out.println("What is the length? "); 
			length = console.nextDouble();
			
			System.out.println("What is the breadth? "); 
			breadth = console.nextDouble();
			
			//use sets for the new length and bread here
			userRectangle.setBreadth(breadth);
			userRectangle.setLength(length);
			userRectangle.getArea();

			console.nextLine();
			
			System.out.println("\nDo you want to keep running? "); 
			userInput = console.nextLine();

			
			if(userInput.equals("Exit") || userInput.equals("No") || Integer.parseInt(userInput) == 0)
			{
				keepRunning = false;
			}
			
			else
			{
				keepRunning = true;
			}
			
		}
		console.close();
	}
}