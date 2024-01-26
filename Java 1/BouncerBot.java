//Submitted by Dan Do 
//Problem 4: Bouncer Bot

/* Pseudocode:
		- Declaring int variables and Prompt user inputs:
			1) current month
			2) current day
			3) current year
			4) birth month
			5) birth day
			6) birth year
		- Checking conditions: (age 21 and birthday)
			- Check if age >= 21 using current year - birth year
			- If birth month > current month OR birth month < current month
				--> age - 1
			- If birth month = current month
				- If birth day > current day OR birth day < current day
					--> age - 1
			- If age >= 21 AND birth month = current month AND birth day = current day
				--> true
			- Else
				--> false
		- Print the boolean result whether the patron can enter or not.
*/

import java.util.Scanner;

public class BouncerBot
{
	public static void main(String args[])
	{
		// Declaring variables
		int currentMonth;
		int currentDay;
		int currentYear;
		int birthMonth;
		int birthDay;
		int birthYear;
		
		//Prompt user inputs
		Scanner input = new Scanner(System.in);

		//current date
		currentMonth = input.nextInt();
		currentDay = input.nextInt();
		currentYear = input.nextInt();
		//birth date
		birthMonth = input.nextInt();
		birthDay = input.nextInt();
		birthYear = input.nextInt();
		
		//Checking if they're 21 years old
		int age = currentYear - birthYear;
		
		//Checking if today is their birthday
		if ((age >= 21) && (currentMonth == birthMonth) && (currentDay == birthDay))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
