//Submitted by Dan Do 
//Problem 5: Student Grader 

import java.util.Scanner;

public class StudentGrader
{
	public static void main(String args[])
	{
		//Declare variables
		float testsAvg;
		float homeworkAvg;
		float labAvg;
		float finalAvg;
		
		//Promp user for inputs
		Scanner input = new Scanner(System.in);
		
		//System.out.print("Enter tests average: ");
		testsAvg = input.nextFloat();
		
		//System.out.print("Enter homework average: ");
		homeworkAvg = input.nextFloat();
		
		//System.out.print("Enter lab average: ");
		labAvg = input.nextFloat();
		
		//Calculate final average
		finalAvg = (0.40f * testsAvg) + (0.10f * labAvg) + (0.50f * homeworkAvg); //0.40f meaning float 0.40
		
		//Display the student's final average as a numerical score (floating point)
		System.out.println(finalAvg);	
	}
}	