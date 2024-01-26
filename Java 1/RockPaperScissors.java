//Submitted by Dan Do 
//Problem 7: Rock Paper Scissors

/* Pseudocode:

*/

import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		int numCase = input.nextInt();
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			String player1 = input.next();  // Taking input of player 1
			String player2 = input.next();  // Taking input of player 2
			
			if (player1.equals(player2))
			{
				System.out.println("Tie!");
			}
			else if ((player1.equals("rock")) && (player2.equals("scissors")))
			{
				System.out.println("Player 1 wins!");
			}
			else if ((player2.equals("rock")) && (player1.equals("scissors")))
			{
				System.out.println("Player 2 wins!");
			}
			else if ((player1.equals("scissors")) && (player2.equals("paper")))
			{
				System.out.println("Player 1 wins!");
			}
			else if ((player2.equals("scissors")) && (player1.equals("paper")))
			{
				System.out.println("Player 2 wins!");
			}
			else if ((player1.equals("paper")) && (player2.equals("rock")))
			{
				System.out.println("Player 1 wins!");
			}
			else if ((player2.equals("paper")) && (player1.equals("rock")))
			{
				System.out.println("Player 2 wins!");
			}
			

			
		} //end for loop
	} //end main method
} //end class

