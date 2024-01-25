//Submitted by Dan Do 
//Problem 2: Point of Sale System

import java.util.Scanner;

public class PointOfSaleSystem
{
	public static void main(String args[])
	{	
		//Asking for number of test cases 
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();
		
		
		for (int i = 0; i < numCase; i++)  //looping through each number of cases
		{
			//Declaring total price and tax variables
			double tax = 0.065;
			double totalBeforeTax = 0.0;
			double totalAfterTax = 0.0;
			
			//Declaring orders variables
			int order1 = input.nextInt();
			int order2 = input.nextInt();
			int order3 = input.nextInt();
			int order4 = input.nextInt();
			int order5 = input.nextInt();
			int order6 = input.nextInt();
			
			//Declaring price of each order
			double priceOrder1 = 0.0;
			double priceOrder2 = 0.0;
			double priceOrder3 = 0.0;
			double priceOrder4 = 0.0;
			double priceOrder5 = 0.0;
			double priceOrder6 = 0.0;
			
			//If the first order is one of the following, then calculate the price
			if (order1 == 1)   
			{
				priceOrder1 = 1.50;
			}
			else if (order1 == 2)
			{
				priceOrder1 = 1.75;
			}
			else if (order1 == 3)
			{
				priceOrder1 = 2.50;
			}
			else if (order1 == 4)
			{
				priceOrder1 = 2.75;
			}
			else if (order1 == 5)  
			{
				priceOrder1 = 0.99;
			}
			else if (order1 == 6)
			{
				priceOrder1 = 1.25;
			}
			
			//If the second order is one of the following, then calculate the price
			if (order2 == 1)   
			{
				priceOrder2 = 1.50;
			}
			else if (order2 == 2)
			{
				priceOrder2 = 1.75;
			}
			else if (order2 == 3)
			{
				priceOrder2 = 2.50;
			}
			else if (order2 == 4)
			{
				priceOrder2 = 2.75;
			}
			else if (order2 == 5)  
			{
				priceOrder2 = 0.99;
			}
			else if (order2 == 6)
			{
				priceOrder2 = 1.25;
			}
			
			//If the third order is one of the following, then calculate the price
			if (order3 == 1)   
			{
				priceOrder3 = 1.50;
			}
			else if (order3 == 2)
			{
				priceOrder3 = 1.75;
			}
			else if (order3 == 3)
			{
				priceOrder3 = 2.50;
			}
			else if (order3 == 4)
			{
				priceOrder3 = 2.75;
			}
			else if (order3 == 5)  
			{
				priceOrder3 = 0.99;
			}
			else if (order3 == 6)
			{
				priceOrder3 = 1.25;
			}
			
			//If the fourth order is one of the following, then calculate the price
			if (order4 == 1)   
			{
				priceOrder4 = 1.50;
			}
			else if (order4 == 2)
			{
				priceOrder4 = 1.75;
			}
			else if (order4 == 3)
			{
				priceOrder4 = 2.50;
			}
			else if (order4 == 4)
			{
				priceOrder4 = 2.75;
			}
			else if (order4 == 5)  
			{
				priceOrder4 = 0.99;
			}
			else if (order4 == 6)
			{
				priceOrder4= 1.25;
			}
			
			//If the fifth order is one of the following, then calculate the price
			if (order5 == 1)   
			{
				priceOrder5 = 1.50;
			}
			else if (order5 == 2)
			{
				priceOrder5 = 1.75;
			}
			else if (order5 == 3)
			{
				priceOrder5 = 2.50;
			}
			else if (order5 == 4)
			{
				priceOrder5 = 2.75;
			}
			else if (order5 == 5)  
			{
				priceOrder5 = 0.99;
			}
			else if (order5 == 6)
			{
				priceOrder5 = 1.25;
			}
			
			//If the sixth order is one of the following, then calculate the price
			if (order6 == 1)   
			{
				priceOrder6 = 1.50;
			}
			else if (order6 == 2)
			{
				priceOrder6 = 1.75;
			}
			else if (order6 == 3)
			{
				priceOrder6 = 2.50;
			}
			else if (order6 == 4)
			{
				priceOrder6 = 2.75;
			}
			else if (order6 == 5)  
			{
				priceOrder6 = 0.99;
			}
			else if (order6 == 6)
			{
				priceOrder6 = 1.25;
			}
			
			//Calculating the total price before and after tax
			totalBeforeTax = priceOrder1 + priceOrder2 + priceOrder3 + priceOrder4 + priceOrder5 + priceOrder6;
			totalAfterTax = totalBeforeTax + (totalBeforeTax * tax);
			
			//Display the output
			System.out.printf("Please pay $%.2f%n", totalAfterTax);
			System.out.println("Thank you for eating at McDowell's!");
		
		
	
		
		} //end for loop
	} //end main maethod
} //end class