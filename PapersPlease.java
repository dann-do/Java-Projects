//Submitted by Dan Do 
//Problem 3: Papers Please

/* Pseudocode:
		- Declaring boolean variables and Prompt user inputs:
			- The first input, "passport", represents whether they have a passport or not.
			- The second input, "driverLicense", represents whether they have a driver's license or not.
			- The third input, "birthCert", represents whether they have a birth certificate or not.
		- Checking conditions:
			- If yes passport --> result: can board (can board)
			- If no passport --> If yes driver's licence --> If yes birth certificate --> result: can board (true)
			- If no passport --> If yes driver's licence --> If no birth certificate --> result: no boarding (false)
			- If no passport --> If no driver's licence --> If yes birth certificate --> result: no boarding (false)
			- If no passport --> If no driver's licence --> If no birth certificate --> result: no boarding (false)
		- Print the boolean result.
*/

import java.util.Scanner;

public class PapersPlease
{
	public static void main(String args[])
	{
		//Declare boolean variables
		boolean passport;
		boolean driverLicense;
		boolean birthCert;
		
		//Prompt user inputs (true = yes, false = no)
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Passport: ");
		passport = input.nextBoolean();
		
		//System.out.print("Driver's License: ");
		driverLicense = input.nextBoolean();
		
		//System.out.print("Birth Certificate: ");
		birthCert = input.nextBoolean();
	
		//Checking conditions
		if (passport == false) // if no passport
		{
			if (driverLicense == true) // if yes driver's license
			{
				if (birthCert == true) // if yes birth certificate
				{
					System.out.println("true");
				}
				else // if no birth certificate
				{
					System.out.println("false");
				}
			}
			else // if no driver's license
			{
				System.out.println("false");
			}
		}
		else // if yes passport
		{
			System.out.println("true");
		}
	}
}