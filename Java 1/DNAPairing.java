//Submitted by Dan Do 
//Problem 8: DNA Pairing

/* Pseudocode:

*/

import java.util.Scanner;

public class DNAPairing
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		//Asking for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();   //Go to the next line
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Declaring DNA sequence variable
			String sequenceOfDNA = input.nextLine();
			
			//Display the original sequence of DNA
			System.out.printf("%s%n",sequenceOfDNA);
			
			//Creating another String to use Scanner useDelimiter()
			//Use useDelimiter() method to read one letter at a time
			Scanner stringSequence = new Scanner(sequenceOfDNA).useDelimiter("");  
			
			//Looping through each character
			while (stringSequence.hasNext())
			{
				String character = stringSequence.next();
				
				if (character.equals("A"))
				{
					System.out.print("T");
				}
				if (character.equals("C"))
				{
					System.out.print("G");
				}
				if (character.equals("G"))
				{
					System.out.print("C");
				}
				if (character.equals("T"))
				{
					System.out.print("A");
				}
				
			} //end while loop */
			
			System.out.println("\n");  //Going to new line and Skipping a line after printing result
		} //end for loop
	} //end main method
} //end class
