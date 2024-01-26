//Submitted by Dan Do 
//Problem 1: AreaOfASquare

/* Pseudocode to find Area of a Square:
		- Import scanner class to get user input first.
		- Create an int "length" variable using Scanner for input;
		- Use nextInt() to store user input in "length" variable;
		- Create an int "area" variable that is equal to length * length;
		- Print "area";
*/
import java.util.*;

public class AreaOfASquare
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		
		int area = length * length;
		
		System.out.println(area);
	}
}
