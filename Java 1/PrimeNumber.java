//Submitted by Dan Do 
//Problem 1: Prime Number

/* Pseudocode:

*/

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		boolean isPrime = true;
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Delaring variables
			int num = input.nextInt();
			
			//Checking if num is 1 or less. 1 is not prime number
			if (num <= 1)
			{
				isPrime = false;
			}
			
			//Checking if num can divide any smaller numbers than itself
			for (int smallerNumber = 2; smallerNumber < num; smallerNumber++)  //Starting from 2 because any number can divide by 1)
			{
				if (num % smallerNumber == 0)
				{
					isPrime = false;
					break;
				}
			} //end for loop
			System.out.printf("%s%n", isPrime);
			
		} //end for loop
		
	} //end main method
} //end class