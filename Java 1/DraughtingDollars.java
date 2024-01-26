//Submitted by Dan Do 
//Problem 1: DraughtingDollars

/* Pseudocode:
		- Step 0: Promp user input: beer left in keg in percentage and price per pint
		- Step 1: Convert kegs into ounces and pints into ounces 	 
        - Step 2: Determine how many ounces are left in the keg, given the percentage
		- Step 3: Determine how many pints are left in keg, i.e. beer servings
		- Step 4: Determine price for beer left
		- Step 5: Print the result as specified
*/

import java.util.Scanner;

public class DraughtingDollars
{
	public static void main (String[] args)
	{
		//Data Model: keg ratio, price by pint, keg in gallons, gallon in ounces, pint in ounces, price by keg
		double kegInGallons = 15.5;  //full-sized keg is 15.5 gallons
		int gallonInOunces = 128;    // 1 gallon = 128 ounces
		int pintInOunces = 16; 		// 1 pint = 16 ounces
		double kegRatio;            // first user input
		double priceOfPint;			// second user input
		double priceOfKeg;          // result of our problem
		
		//Step 0: Promp user input: beer left in keg in percentage and price per pint
		Scanner input = new Scanner(System.in);
		kegRatio = input.nextDouble();
		priceOfPint = input.nextDouble();
		
		//Step 1: Convert kegs into ounces and pints into ounces
		double kegInOunces = kegInGallons * gallonInOunces;    // [1 keg = 15.5 gallons] ; [1 gallon = 128 ounces] 
		//int pintInOunces = 16;
		
		//Step 2: Determine how many ounces are left in the keg, given the percentage
		double ouncesLeft = kegInOunces * kegRatio;
		
		// Step 3: Determine how many pints are left in keg, i.e. beer servings
		int pintsLeft = (int) (ouncesLeft / pintInOunces);
		
		// Step 4: Determine price for beer left
		priceOfKeg = priceOfPint * pintsLeft;
		
		// Step 5: Print the result as specified
		System.out.printf("There is $%.2f of beer left in keg\n", priceOfKeg);
		
	}
}