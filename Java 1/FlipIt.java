//Submitted by Dan Do 
//Problem 7: Flip It

import java.util.Scanner;

public class FlipIt
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Taking in input for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();  //Creating a new line after taking test cases
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//Taking each text input in seperate lines
			String text = input.nextLine();
			
			//Calling reverse() method and storing result from that method
			String reversedText = reverse(text);
			
			//Printing reversedText
			System.out.println(reversedText);
			
		} //end for loop	
		
	} //end main method
	
	
	public static String reverse(String text)
	{
		/*text: Hello World
		  output: dlroW olleH */
		  
		//Parsing through the string text
		Scanner reader = new Scanner(text);
		
		reader.useDelimiter(""); //it will parse throug each character of your reader object/string data
		
		//Initialize reversedText variable as empty string to add value later
		String reversedText = "";
		
		//Reversing text
		while (reader.hasNext())
		{
			//Prepend the new letter in front of the existing text using concatenation
			reversedText = reader.next() + reversedText;
			
		} //end while loop
		
		return (reversedText);
		
	} //end String reverse() method
	
} //end class