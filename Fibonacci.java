//Submitted by Dan Do 
//Problem 9: Fibonacci

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String args[])
	{
		//fibonacci series: 0 1 1 2 3 5 8 13 21 .......
		
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt(); //taking test cases
		
		for (int i = 1; i <= cases; i++)
		{
			int position = input.nextInt();  //fibonacci position for the output
			
			int num1 = 0; //the first fibonacci num
			int num2 = 1; //the second fibonacci num
			int result = position;  //initializing the result variable
			
			if (position <= 1)
			{
				result = position;
			}
			else
			{
				for (int j = 2; j <= position; j++)
				{
					result = num1 + num2;  //addition of 2 previous fibonacci numbers
					
					num1 = num2;   // now we are updating the num1 with num2
					num2 = result; // again updating num2 with result
				}
			}
			
			System.out.println(result);
		}
	}
}
