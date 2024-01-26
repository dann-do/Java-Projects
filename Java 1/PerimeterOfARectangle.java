//Submitted by Dan Do 
//Problem 8: PerimeterOfARectangle

/* Pseudocode to calculate Perimeter af a Rectangle:
		- Import scanner class to get user input first.
		- Create a double "length" variable using Scanner for input;
		- Use nextDouble() to store the first user input in "length" variable;
		- Create a double "width" variable using Scanner for input;
		- Use nextDouble() to store the second user input in "width" variable;
		- Create a double "perimeter" variable that is equal to 2.0 * (length + width);
		- Print "perimeter";
*/
import java.util.Scanner;

public class PerimeterOfARectangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length: ");
		double length = input.nextDouble();
		
		System.out.print("Enter width: ");
		double width = input.nextDouble();
		
		double perimeter = 2.0 * (length + width);
		
		System.out.println("Perimeter of the rectangle: " + perimeter);
	}
}