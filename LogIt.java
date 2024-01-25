//Submitted by Dan Do 
//Problem 2: Log It

import java.util.Scanner;

public class LogIt
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Taking in input for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();  //Creating a new line after taking test cases
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Taking positive integer number that represents the maximum numbered value in the High-Low game
			int num = input.nextInt();
			
			log2(num);
			
		} //end for loop
		
	} //end main method
	
	
	public static void log2(int num)
	{
		//Use log() method to calculate guesses
		double guesses = Math.log(num) / Math.log(2);
		
		//Rounding up a double number to the nearest integer using ceil() method
		//Creating result varible to hold that integer
		int result = (int) (Math.ceil(guesses));
		
		System.out.println(result);
		
	} //end log2() method
	
} //end class