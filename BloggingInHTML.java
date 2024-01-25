//Submitted by Dan Do 
//Problem 2: Blogging in HTML

/* Pseudocode:
		- Declaring variables:
			- Prompt user "header" input.
			- Prompt user "imageFilePath" input.
			- Prompt user "text" input.
			- Prompt user "author" input.
			- Prompt user "date" input.
		- Print the appropriate HTML text for the blog post.
*/

import java.util.Scanner;

public class BloggingInHTML
{
	public static void main(String args[])
	{
		//Declaring variables
		String header; 
		String imageFilePath;
		String text;
		String author;
		String date;
		
		//Prompt user for inputs
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter blog's header: "); 
		header = input.nextLine();
		
		//System.out.print("Enter image's file path: "); 
		imageFilePath = input.nextLine();
		
		//System.out.print("Enter post's text: "); 
		text = input.nextLine();
		
		//System.out.print("Enter blog's author: "); 
		author = input.nextLine();
		
		//System.out.print("Enter post's date formatted as mm/dd/yyyy: "); 
		date = input.nextLine();
		
		//Print the appropriate HTML text for the blog post.
		System.out.printf("<html><body><h1>%s</h1><img src='%s' /><p>%s</p><small>By %s, %s</small></body></html>", header, imageFilePath, text, author, date);
	}
}