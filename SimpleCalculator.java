//Submitted by Dan Do 
//Problem 7:  Simple Calculator

/* Pseudocode:

*/

import java.util.Scanner;

public class SimpleCalculator
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Declaring variables
			int num1 = input.nextInt();
			String operator = input.next();
			int num2 = input.nextInt();
			int result = 0;
			
			//Making a case for each operator
			switch (operator)
			{
				case "+":
					result += num1 + num2;
					break;
				case "-":
					result += num1 - num2;
					break;
				case "*":
					result += num1 * num2;
					break;
				case "/":
					result += num1 / num2;
					break;
				case "%":
					result += num1 % num2;
					break;
				case "**":
					result += (int) Math.pow(num1, num2);
					break;
				default:
					System.out.println("Invalid input");
			} //end switch
			
			System.out.println(result);
			
		} //end for loop
	} //end main method
} //end class