//Submitted by Dan Do 
//Homework 3: Two Sum

public class TwoSum
{
	public static void main(String[] args)
	{
		twoSum(new int[] {3, 2, 4}, 6);
		
	} //end main method
	
	public static void twoSum(int[] nums, int target)
	{
		//Looping through the array list to find the first number 
		for (int i = 0; i < nums.length; i++)
		{
			//Looping though the array again to find the second number that adds up to first number to make the target number
			//Can't use the same number as the first number, so j = i + 1
			for (int j = i + 1; j < nums.length; j++)
			{	
				//Checking if the first number + second number = target
				//nums[i] or nums[j] returns the value at i or j index
				if (nums[i] + nums[j] == target)
				{
					//Returning the two indices of the two number that add up to the target
					//i and j are considered as counters or indices in arrays
					int firstIndex = i;
					int secondIndex = j;
					
					System.out.printf("The indices of the two numbers that add up to the target are: %d and %d", firstIndex, secondIndex);
					
				}
			}
		}
		
	} //end TwoSum method
	
} //end class