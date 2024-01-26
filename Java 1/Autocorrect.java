//Submitted by Dan Do 
//Problem 1: Autocorrect

/* Pseudocode:

*/

import java.util.Scanner;

public class Autocorrect
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Taking in input for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();  //Creating a new line after taking test cases
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			String text = input.nextLine();  //Taking the mistyped text string
			String replacements = input.nextLine();  //Taking the suggested replacements seq of words
			translate(text, replacements);  //Calling method passing 2 arguments
		} //end for loop
	} //end main method
	
	public static void translate(String text, String replacements)
	{
		/*Example:
			helo wordl : text
			helo hello wordl world : replacements */
		
		Scanner reader = new Scanner(replacements);  //Parsing the string replacements
		while (reader.hasNext() == true)  //Checking if the parsing has finished or not; i.e if the string contains some value
		{
			String oldWord = reader.next();  //Parsed previous word
			String newWord = reader.next();  //Parsed next word
			
			text = text.replace(oldWord, newWord);  //Replacing prev word with the next word by using java replace() API
		} //end while loop
		
		System.out.println(text);
		
	} //end translate method
} //end class