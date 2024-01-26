//Submitted by Dan Do 
//Problem 2: MinutesToSeconds

/* Pseudocode to convert Minutes to Seconds:
		- Import scanner class to get user input first.
		- Create an int "minutes" variable using Scanner for input;
		- Use nextInt() to store user input in "minutes" variable;
		- Create an int "seconds" variable that is equal to minutes * 60;
		- Print "minutes";
*/
import java.util.*;

public class MinutesToSeconds
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of minutes: ");
		int minutes = input.nextInt();
		
		int seconds = minutes * 60;
		
		System.out.println("Number of seconds: " + seconds);
	}
}
