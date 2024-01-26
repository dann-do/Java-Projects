//Submitted by Dan Do 
//Problem 4: Relational Util


public class RelationalUtil
{
	public static boolean isIncreasing(int x, int y, int z)
	{
		/*static boolean: 
			isIncreasing(int x, int y, int z)
			Returns true if x is smaller than y and y is smaller than z, exclusive */

		return (x < y && y < z);
		
	} //end boolean isIncreasing() method
	
	
	public static boolean isDecreasing(int x, int y, int z)
	{
		/*static boolean: 
			isDecreasing(int x, int y, int z)
			Returns true if x is larger than y and y is larger than z, exclusive */

		return (x > y && y > z);
		
	} //end boolean isDecreasing() method
	
	
	public static boolean isBetween(int x, int y, int z)
	{
		/*static boolean: 
			isBetween(int x, int y, int z)
			Returns true if y is between x and z, inclusive */

		return (y >= x && y <= z);
		
	} //end boolean isBetween() method
	
	
	public static boolean isPositive(int x)
	{
		/*static boolean: 
			isPositive(int x)
			Returns true if the number is positive */

		return (x > 0);
		
	} //end boolean isPositive() method
	
	
	public static boolean isNegative(int x)
	{
		/*static boolean: 
			isNegative(int x)
			Returns true if the number is negative */

		return (x < 0);
		//return isPositive(-1 * x);         //another way to return negative number using another method 
		
	} //end boolean isNegative() method
	
	
	public static boolean overlaps(int min1, int max1, int min2, int max2)
	{
		/*static boolean: 
			overlaps(int min1, int max1, int min2, int max2)
			Returns true if two line segments, min to max, overlap with one another */

		/* Visualize
		min1 ---------------------------- max1   line 1
		min2 ---------------------------- max2   line 2   ==> Overlaps
		
		min1 ---------- max1   line 1
		                    min2 ----------------max2   line 2    ==> Not overlap  */
		
		return (min2 <= max1 && min1 <= max2);
		
	} //end boolean overlaps() method
	
} //end class