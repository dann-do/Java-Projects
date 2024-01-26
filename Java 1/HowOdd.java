//Submitted by Dan Do 
//Problem 7: How odd!

/* Pseudocode:

*/

import java.util.Scanner;

public class HowOdd
{
	public static void main(String args[])
	{
		//Declare variable
		int n;  //n: is any integer
		
		//Prompt user for input
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter an integer: ");
		n = input.nextInt();
		
		if (n % 2 == 0)  //Checking if n is even
		{
			System.out.println("false");  //print "false" if even
		}
		else
		{
			System.out.println("true");  //print "true" if odd
		}
	}
}
