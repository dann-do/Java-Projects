//Submitted by Dan Do 
//Problem 4: Min/Max Search by Value

/* Pseudocode:

*/

import java.util.Scanner;

public class MinMaxSearchByValue
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Set initial input to be min and max
			int max = input.nextInt();
			int min = input.nextInt();
			
			int count = 0;
			while (input.hasNext())
			{
				String sequence  = input.nextLine();
				System.out.print(sequence);
				
/* 				if (value > max)  //Checking for max value
				{
					max = value;

				}
				else if (value < min)  //Checking for min value
				{
					min = value;
				}
				count++; */
			}
			//System.out.println(min);
			//System.out.println(max);
		}
		input.close();
	}
}
