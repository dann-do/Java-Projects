//Submitted by Dan Do 
//Problem 4: SimpleAddition

/* Pseudocode to calculate Simple Addition:
		- Import scanner class to get user input first.
		- Create an int "number1" variable using Scanner for input;
		- Use nextInt() to store the first user input in "number1" variable;
		- Create an int "number2" variable using Scanner for input;
		- Use nextInt() to store the second user input in "number2" variable;
		- Create an int "sum" variable that is equal to number1 + number2;
		- Print "sum";
*/
import java.util.Scanner;

public class SimpleAddition
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		
		System.out.println("Total of the two number added together: " + sum);
		/* Or can be written as:
		System.out.println(number1 + number2); */
	}
}	