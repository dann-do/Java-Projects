//Submitted by Dan Do 
//Problem 6: FizzBuzz

/* Pseudocode:

*/

import java.util.Scanner;

public class FizzBuzz
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		boolean isPrime = true;
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Declaring variable
			int num = input.nextInt();
			
			//Checking if num is multiplier of both 3 and 5
			//Checking this first because if..else statements check from top to bottom 
			if ((num % 3 == 0) && (num % 5 == 0))
			{
				System.out.println("fizzbuzz");
			}
			else if (num % 5 == 0)  //Checking if num is multiplier of 3
			{
				System.out.println("buzz");
			}
			else if (num % 3 == 0)  //Checking if num is multiplier of 5
			{
				System.out.println("fizz");
			}
			else  //If num is not a multiplier of 3 or 5, print num
			{
				System.out.println(num);
			}
			
		} //end for looping
	} //end main method
} //end class