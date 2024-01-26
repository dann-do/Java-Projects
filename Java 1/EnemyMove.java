//Submitted by Dan Do 
//Problem 4: Enemy Move

import java.util.Scanner;

public class EnemyMove
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Taking in input for number of test cases 
		int numCase = input.nextInt();
		input.nextLine();  //Creating a new line after taking test cases
		
		for (int i = 0; i < numCase; i++)  //looping through each test case
		{
			//The first two inputs represents the enemy (x1,y1) position (start)
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();
			
			//The third number represents the enemy's speed
			double speed = input.nextDouble();
			
			//The last two inputs represent the player (x2,y2) position (end)
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();
			
			//Calling distance() method
			double distance = distance2(x1, y1, x2, y2);
			
			// If the enemy speed > distance from the player, then the enemy moves to the player's coordinates and attacks. 
			// If the enemy speed < the distance to the player, then the enemy moves in shortest path toward the player.
			double new_x = 0; 
			double new_y = 0;
			
			if (speed > distance)  //enemy reaches player --> new enemy's position is player's position
			{
				new_x = x2;
				new_y = y2;
			}
			else if (speed < distance)  //enemy cannot reach player
			{
				new_x = x1 + (speed / distance) * (x2 - x1);
				new_y = y1 + (speed / distance) * (y2 - y1);
			}
			
			System.out.printf("x=%.1f, y=%.1f%n", new_x, new_y);
		
		} //end for loop
		
	} //end main method
	
	
	public static double distance2(double x1, double y1, double x2, double y2)
	{
		//Calculating the distance using Math class sqrt() and pow() methods
		double distance = Math.sqrt( (Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)) );
		
		return distance;
		
	} //end distance() method
	
} //end class