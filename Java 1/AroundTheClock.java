//Submitted by Dan Do 
//Problem 8: Around the Clock

/* Pseudocode:

*/

import java.util.Scanner;

public class AroundTheClock
{
	public static void main(String args[])
	{
		//Declare variables
		int departureTime;
		int travelHours;
		int arrivalTime;
		
		//Take inputs
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter departure time: ");
		departureTime = input.nextInt();
		
		//System.out.print("Enter travel time in hours: ");
		travelHours = input.nextInt();
		
		arrivalTime = (departureTime + travelHours) % 12;
		System.out.println(arrivalTime);
	}
}