//Submitted by Dan Do 
//Problem 6: SecondsToMinutes

/* Pseudocode to convert Seconds to Minutes:
		- Import scanner class to get user input first.
		- Create a double "seconds" variable using Scanner for input;
		- Use nextDouble() to store the user input in "seconds" variable;
		- Create a double "minutes" variable that is equal to seconds / 60; (1 minute = 60 seconds)
		- Print "minutes";
*/
import java.util.Scanner;

public class SecondsToMinutes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of seconds: ");
		double seconds = input.nextDouble();
		
		double minutes = seconds / 60;
		
		System.out.println("Number of minutes: " + minutes);
	}
}