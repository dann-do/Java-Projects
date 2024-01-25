//Submitted by Dan Do 
//Problem 1: Array Util 

public class ArrayUtil
{
	// Part 1: Reverse Array
	public static void reverse(String[] arr)
	{
		/* static String[] 
		       reverse(String[] array)
			   Reverses the elements within a String array  */
			
		//input:  {"a", "b", "c", "d", "e"}
		//output: {"e", "d", "c", "b", "a"}
		
		int lenArr = arr.length;  //storing arr length
		
		for (int i = 0; i < lenArr/2; i++)    //lenArr/2 so that when it reaches "c" in input it will terminate
		{
			//swapping part
			/* pos1   pos2
			   pos1 = pos2
			   pos2 = pos1  */
			String temp = arr[i];
			arr[i] = arr[lenArr - i - 1];  //(lenArr - i - 1) : dynamically populate the swapping pairs
			arr[lenArr - i - 1] = temp;
		}
	} //end reverse() method
	
	
	// Part 2: Array Resize
	public static String[] resize(String[] array)
	{
		/* static String[] 
		       resize(String[] array)
			   Returns new array with the same elements as original but that's twice the length  */
		
		// Create a variable that holds the length of arr (old array)
		int lenArr = array.length;
		
		//Create a new array with double the length of old array
		String[] copyArr =  new String[lenArr * 2];
		
		//Copy the elements from the old array to a new array
		for (int i = 0; i < array.length; i++)
		{
			copyArr[i] = array[i];
		}
		
		/* Testing: Looping through the copyArr to test
		for (int j = 0; j < copyArr.length; j++)
		    System.out.println(copyArr[j]);               */
		
		//Return new array
		return copyArr;
		
	} //end String[] resize() method
	
	
	// Part 3: Add Item
	public static String[] add(String element, String[] array)
	{
		/* static String[] 
		       add(String element, String[] array)
			   Returns an array with new element inserted at end, resize array if too small  */
			
		//Create a new array called returnArr to hold values of either if array or else array, so that only returnArr can be returned at the end of method
		String[] returnArr = new String[array.length]; 	
			
		//Check if the given array is big enough to hold added elements
		for (int i = 0; i < array.length; i++)
		{
			//If yes (there's null elements), append the element to the array
			if (array[i] == null)
			{
				array[i] = element;
				returnArr = array;
			}
			// If not, call resize() method
			else
			{
				// If resize() method is called, then the added element will be appended to the new array
				// Creating a new array that will hold the return array from resize() method 
				String[] resizeArr = resize(array);
				
				//Check if the new array is big enough to hold added elements
				for (int j = 0; j < resizeArr.length; j++)
				{
					if (resizeArr[j] == null)
					{
						resizeArr[j] = element;
						returnArr = resizeArr;
						break;
					}
				} //end for loop loops through resizeArr[]
			}
		} //end for loop loops through array[]
			
		return returnArr;
		
	} //end String add() method
	

	// Part 4: Array Contains
	public static boolean contains(String element, String[] array)
	{
		/* static boolean
		       contains(String element, String[] array)
			   Returns true if the array contains the given String, otherwise false  */
		
		// Checking if the array contains element
		for (int i = 0; i < array.length; i++)
		{
			//If array contains element and array is not null, returns true
			if (array[i].equals(element) && array != null)
			{
				return true;
			}
		}	
		
		//If array doesn't contain element, returns false
		return false;
		
	} //end boolean contains() method
	
	
	// Part 5: MinMax By Value
	public static int findMinValue(int[] array)
	{
		/* static int
		       findMinValue(int[] array)
			   Returns the min value from the array */
			
		//Assuming the first element of array is min
		int min = array[0];
		
		//Looping through the array
		for (int i = 0; i < array.length; i++)
		{
			//If any element, i, is less than min --> that element is the new min 
			if (array[i] <= min)
			{
				min = array[i];
			}
		}
		
		return min;
		
	} //end int findMinValue() method
	
	
	public static int findMaxValue(int[] array)
	{
		/* static int
		       findMaxValue(int[] array)
			   Returns the max value from the array */
		
		//Assuming the first element of array is max
		int max = array[0];
		
		//Initializing index variable to 0
		int index = 0; 
		
		//Looping through the array
		for (int i = 0; i < array.length; i++)
		{
			//If any element, i, is more than max --> that element is the new max 
			if (array[i] >= max)
			{
				max = array[i];
			}
		}
		
		return max;
		
	} //end int findMaxValue() method


	// Part 6: MinMax By Index
	public static int[] findMinIndex(int[] array)
	{
		/* static int[]
		       findMinIndex(int[] array)
			   Prints the min value in the array */
			
		//Assuming the first element of array is min
		int min = array[0];
		
		//Creating a variable to keep track of the number of min shows up in array[].
		int minCount = 0;
		
		//Looping through the array to find min
		for (int i = 0; i < array.length; i++)
		{
			//If any element, i, is less than min --> that element is the new min 
			if (array[i] < min)
			{
				min = array[i];
			}
			
		} //end for loop loops through array[]
		
		//Looping through array again to find the minCount
		for (int i = 0; i < array.length; i++)
		{
			//After determining the min, if array[i] is equal to min again, then minCount increases
			if (array[i] == min)
			{
				minCount++;
			}
			
		} 
		
		// Creating a new array that will hold the indices where the min values are
		// Use minCount to determine the size 
		int[] minIndex = new int[minCount];
		
		//Creating a variable to keep track of the position in minIndex
		int index = 0;
		
		//Looping through the array again to find the repetition of min
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == min)
			{	
				minIndex[index] = i;
				index++; //move on to next index in minIndex
			}
			
		} //end for loop loops through array[]
			
		return minIndex;
		
	} //end int findMinValue() method
	
	
	public static int[] findMaxIndex(int[] array)
	{
		/* static int[]
		       findMaxIndex(int[] array)
			   Prints the max value in the array */
			
		//Assuming the first element of array is max
		int max = array[0];
		
		//Creating a variable to keep track of the number of max shows up in array[].
		int maxCount = 0; 
		
		//Looping through the array to find max
		for (int i = 0; i < array.length; i++)
		{
			//If any element, i, is more than max --> that element is the new max 
			if (array[i] > max)
			{
				max = array[i];
			}
			
		} //end for loop loops through array[]
		
		//Looping through array again to find the maxCount
		for (int i = 0; i < array.length; i++)
		{
			//After determining the max, if array[i] is equal to max again, then maxCount increases
			if (array[i] == max)
			{
				maxCount++;
			}
			
		} 
		
		// Creating a new array that will hold the indices where the max values are
		// Use maxCount to determine the size 
		int[] maxIndex = new int[maxCount];
		
		//Creating a variable to keep track of the position in maxIndex
		int index = 0;
		
		//Looping through the array again to add the index where max is to maxIndex array
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == max)
			{	
				maxIndex[index] = i;
				index++; //move on to next index in maxIndex
			}
		} //end for loop loops through array[]
			
		return maxIndex;
		
	} //end int findMaxValue() method

	
} //end class
