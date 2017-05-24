import java.util.Scanner;

//Luke R. Prescott
//Lab 3

public class recursiveFibonacciSequence 
{
	public static int Fibo_Recursion(int n)
	{
		if (n <= 1)
		{
			return n;
		}
		
		else 
		{
			return Fibo_Recursion(n-1) + Fibo_Recursion(n-2);
		}
	}
	
	public static void main(String [] args)
	{
		System.out.println("Enter the ammount of Fibonacci numbers you want: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Here are " + n + " Fibonacci numbers: ");
		for(int i = 1; i <= n; i++)
		{
			System.out.println(Fibo_Recursion(i));
		}
		
		sc.close();
	}
}
