//Submitted by Dan Do 
//Problem 9: Duck Duck Goose

/* Pseudocode:

*/

import java.util.Scanner;

public class DuckDuckGoose
{
	public static void main(String args[])
	{
		//Declare variables
		int n; //number of children
		int numDucks;
		int selectedChild;
		
		//Take inputs
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		numDucks = input.nextInt();
		
		/* If number of children is bigger or equal than number of ducks called, then the child selected 
		is equal to total children - number of ducks called. */
		if (n >= numDucks)    
		{
			selectedChild = n - numDucks;
		}
		/* If number of children is smaller than number of ducks called, then the child selected
		is the remainder
		*/
		else
		{
			selectedChild = numDucks % n;
		}
		System.out.println(selectedChild);
	}
}