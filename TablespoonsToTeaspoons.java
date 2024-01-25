//Submitted by Dan Do 
//Problem 3: TablespoonsToTeaspoons

/* Pseudocode to convert Tablespoons to Teaspoons:
		- Import scanner class to get user input first.
		- Create an int "tablespoons" variable using Scanner for input;
		- Use nextInt() to store user input in "tablespoons" variable;
		- Create an int "teaspoons" variable that is equal to tablespoons * 3; (3 teaspoons = 1 tablespoons)
		- Print "teaspoons";
*/
import java.util.Scanner;

public class TablespoonsToTeaspoons
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter number of tablespoons: ");
		int tablespoons = input.nextInt();
		
		int teaspoons = tablespoons * 3;
		
		System.out.println("Number of teaspoons: " + teaspoons);
	}
}