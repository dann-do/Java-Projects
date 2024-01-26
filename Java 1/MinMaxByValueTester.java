import java.util.Arrays;

public class MinMaxByValueTester
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		int[] arr1 = {1,2,3,3,2,1};
 		int min1 = ArrayUtil.findMinValue(arr1);
 		int max1 = ArrayUtil.findMaxValue(arr1);


		//Sample output from lab documentation
		System.out.println("Test 1 min: " + min1);
		System.out.println("Test 1 max: " + max1);

		//Check to expected answer and print result
		String result1 = (min1 == 1 && max1 == 3) ? "Correct!": "Wrong!";
		System.out.println(result1);
		
		System.out.println();
		
		//Sample input from lab documentation
		int[] arr2 = {-1,-2,-3,-3,-2,-1};
 		int min2 = ArrayUtil.findMinValue(arr2);
 		int max2 = ArrayUtil.findMaxValue(arr2);


		//Sample output from lab documentation
		System.out.println("Test 2 min: " + min2);
		System.out.println("Test 2 max: " + max2);

		//Check to expected answer and print result
		String result2 = (min2 == -3 && max2 == -1) ? "Correct!": "Wrong!";
		System.out.println(result2);

	}
}