//Submitted by Dan Do 
//Problem 7: FahrenheitToCelsius

/* Pseudocode to convert Fahrenheit to Celsius:
		- Import scanner class to get user input first.
		- Create a double "fahrenheit" variable using Scanner for input;
		- Use nextDouble() to store the user input in "fahrenheit" variable;
		- Create a double "celsius" variable that is equal to (fahrenheit-32) * (5.0/9.0);
		- Print "celsius";
*/
import java.util.Scanner;

public class FahrenheitToCelsius
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (fahrenheit - 32) * (5.0/9.0);
		
		System.out.println("Temperature in celsius: " + celsius);
	}
}