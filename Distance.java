//Submitted by Dan Do 
//Problem 3: Distance

import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Taking in input for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();  //Creating a new line after taking test cases
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//The first two double values represent the first point's coordinates as (x1,y1)
			//The second set of double values represent the second point's coordinates as (x2,y2)
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			//Calling distance() method
			distance2(x1, y1, x2, y2);
	
		} //end for loop
		
	} //end main method
	
	
	public static void distance2(double x1, double y1, double x2, double y2)
	{
		//Coding the distance formula using Math class sqrt() and pow() methods
		//
		double distance = Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
		
		System.out.println(distance);
		
	} //end distance() method
	
} //end class