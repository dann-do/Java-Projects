//Submitted by Dan Do 
//Problem 8: Factorials

/* Pseudocode:

*/

import java.util.Scanner;

public class Factorials
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Declaring variable
			int num = input.nextInt();
			long factorial = 1;
			
			//Checking if num is non-negative number
			if (num < 0)
			{
				System.out.println("Invalid input");
			}
	
			//Calculating factorials by taking factorial * each smaller number from num 
			for (int smallerNumber = 1; smallerNumber <= num; smallerNumber++)
			{
				factorial *= smallerNumber;
			} //end for loop
			
			System.out.printf("%s%n", factorial);
		
		} //end for loop
	} //end main method
} //end class