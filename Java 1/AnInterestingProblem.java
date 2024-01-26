//Submitted by Dan Do 
//Problem 3: An Interesting Problem

/* Pseudocode:

*/

import java.util.Scanner;

public class AnInterestingProblem
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		
		for (int i = 0; i <= numCase; i++)  //looping through each number of cases
		{
			double depositAmount = input.nextDouble();
			double interestRate = input.nextDouble();
			
			int year = 0;
			
			/* do {
				year++;
				depositAmount += (depositAmount * interestRate) / 100;
				//System.out.printf(" depositAmount: %s . Year: %s%n", depositAmount, year);
			} while (depositAmount < 1000000); */
			
			
			while (depositAmount < 1000000)
			{
				year++;
				depositAmount += (depositAmount * interestRate) / 100; 			
			}
			System.out.println(year + " years");
		}
		
	}
}
