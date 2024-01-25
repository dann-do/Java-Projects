//Submitted by Dan Do 
//Problem 6: ASCII encodings

/* Pseudocode:

*/

import java.util.Scanner;

public class ASCIIEncodings
{
	public static void main(String args[])
	{
		//Declare variables that holds ASCII code
		int code1;  
		int code2;
		int code3;
		int code4;
		int code5;
		int code6;
		
		//Prompt user for inputs
		Scanner input = new Scanner(System.in);
		
		code1 = input.nextInt();  //taking inputs as ASCII code to convert to char later
		code2 = input.nextInt();
		code3 = input.nextInt();
		code4 = input.nextInt();
		code5 = input.nextInt();
		code6 = input.nextInt();
		
		//Declare variables that holds alphanumeric characters corresponding
		char char1;
		char char2;
		char char3;
		char char4;
		char char5;
		char char6;
		
		//Convert ASCII code to alphanumeric numbers
		char1 = (char)code1;
		char2 = (char)code2;
		char3 = (char)code3;
		char4 = (char)code4;
		char5 = (char)code5;
		char6 = (char)code6;
		
		//Display the six-lettered english message as a single string with no spaces between the characters
		System.out.print(char1);
		System.out.print(char2);
		System.out.print(char3);
		System.out.print(char4);
		System.out.print(char5);
		System.out.println(char6);
		
	}	
}