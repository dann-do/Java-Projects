//Submitted by Dan Do 
//Problem 5: AreaOfATriangle

/* Pseudocode to calculate Area of a Triangle:
		- Import scanner class to get user input first.
		- Create a double "base" variable using Scanner for input;
		- Use nextDouble() to store the first user input in "base" variable;
		- Create a souble "height" variable using Scanner for input;
		- Use nextInt() to store the second user input in "height" variable;
		- Create a double "area" variable that is equal to 0.5 * base * height;
		- Print "sum";
*/
import java.util.Scanner;

public class  AreaOfATriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of base: ");
		double base = input.nextDouble();
		
		System.out.print("Enter number of height: ");
		double height = input.nextDouble();
		
		double area = 0.5 * base * height;
		
		System.out.println("Total area of the triangle: " + area);
	}
}