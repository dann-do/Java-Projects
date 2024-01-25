//Submitted by Dan Do 
//Problem 6: Chair Scavenging

/* Pseudocode:

*/

import java.util.Scanner;

public class ChairScavenging
{
	public static void main(String args[])
	{
		//Asking for number of test cases 
		Scanner input = new Scanner(System  .in);
		int numCase = input.nextInt();
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Asking for number of people and number of chairs
			int numberOfPeople = input.nextInt();
			int numberOfChair = input.nextInt();
			
			//Declaring variable for additional chair
			int additionalChair = 0; 
			
			//Checking 1 condition if there's enough chairs
			if (numberOfPeople > numberOfChair)  //if more people than chairs --> need more chairs
			{
				additionalChair = numberOfPeople - numberOfChair;
			}
			
			System.out.println(additionalChair);
			
		} //end for loop
	} //end main method
} //end class
