//Submitted by Dan Do 
//Homework 2: A Number Guessing Game

/* Pseudocode

*/

import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame
{
	public static void main(String[] args) {
		System.out.println("Welcome to the Number Guessing Game!\n");
		
		// Create an instance of Random
        Random random = new Random();
        
        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1;
		
		//Prompt player to enter their guess
		Scanner input = new Scanner(System.in);

		int guess = 0;
		
		//Checking player's guess
		int counter = 0;
		
		do
		{
			counter += 1;
		    
		    System.out.print("Guess a number between 1 and 10 (-1 to quit): ");
		    guess = input.nextInt();
		
    		if (guess > randomNumber)
    		{
    		    System.out.println("Too high!\n");
    		}
    		else if (guess < randomNumber)
    		{
    		    System.out.println("Too low!\n");
    		}
    		else if (guess == randomNumber)
    		{
    		    System.out.printf("Congratulations! You guessed the correct number in %d attempt.", counter);
    		    break;
    		    
    		}
		} while (guess != -1);
		
		
		//OR Testing with WHILE loop
		
		/* while (guess != -1)  //Checking if player quits the
		{
		    counter += 1;
		    
		    System.out.print("Guess a number between 1 and 10 (-1 to quit): ");
		    guess = input.nextInt();
		
    		if (guess > randomNumber)
    		{
    		    System.out.println("Too high!\n");
    		}
    		else if (guess < randomNumber)
    		{
    		    System.out.println("Too low!\n");
    		}
    		else if (guess == randomNumber)
    		{
    		    System.out.printf("Congratulations! You guessed the correct number in %d attempt.", counter);
    		    break;
    		    
    		}
    		
		} */
	}
}
