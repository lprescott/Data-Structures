import java.util.Scanner;
//Luke R. Prescott
//H2.1 Recursion (Complete)

public class babylonianSquareRoot 
{
	//main method
	public static void main(String [] args)
	{
		Scanner console = new Scanner(System.in); //creates new scanner object
		
		System.out.println("Please enter a valid integer to square root: "); //print statement
		
		double number = console.nextDouble(); //gets number from user using scanner and calculates first guess
		double guess = number / 2.0;
		
		System.out.println("\nThe first guess will be " + number + "/2.0: " + number / 2); //print statement
		
		System.out.println("\nPlease enter the number of decimal places the answer will be accurate to (ex: 0.1, 0.01): "); //print statement
		
		double error = console.nextDouble(); //gets error from user using scanner
		
		console.close(); //closes scanner object
		
		getSqrtRec(number, guess, error); //calls getSqrtRec method
		
	}
	
	//recursive square root method
	public static void getSqrtRec(double number, double guess, double error) //inputs number, guess and error from user
	{

		if (((guess * guess) - number) <= error) //base case determines if the last guess is accurate enough using error argument
		{
			System.out.print("\n"); //prints new line
			System.out.println("The square root of " + number + " accurate to the " + error + "'s place is: " + guess + "."); //prints answer and arguments used
		}
		
		else //else statement
		{	
			double newGuess = (1.0/2.0) * (guess + (number/guess)); //creates a newGuess variable and calculates one digit closer to real answer
			
	        getSqrtRec(number, newGuess, error); //calls getSqrtRec method recursively using newly calculated guess as newGuess
		}
		
	}
}
