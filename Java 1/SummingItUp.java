//Submitted by Dan Do 
//Problem 1: SummingItUp

import java.util.Scanner;

public class SummingItUp
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int numCase = input.nextInt();  //numCase is taking the test case numbers
	
		for (int testCase = 1; testCase <= numCase; testCase++)  //iterate the loop for numCase times
		{
			int num1 = input.nextInt();  //number 1
			int num2 = input.nextInt();  //number 2
			
			int begin = num1;  //assigned num1 to the "begin" variable
			int end = num2;    //assigned num2 to the "end" variable
			int sum = 0;
			
			if (num1 > num2)
			{
				begin = num2;
				end = num1;
			}
			
			for (int current = begin; current <= end; current++)
			{
				sum += current;
			}
			System.out.println(sum);
		}
	}
}