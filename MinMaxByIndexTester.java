import java.util.Arrays;

public class MinMaxByIndexTester
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		int[] arr1 = {1,2,3,3,2,1};
 		int[] min1 = ArrayUtil.findMinIndex(arr1);
 		int[] max1 = ArrayUtil.findMaxIndex(arr1);


		//Sample output from lab documentation
		String minString1 = Arrays.toString(min1);
		String maxString1 = Arrays.toString(max1);
		System.out.println("Test 1 min: " + minString1);
		System.out.println("Test 1 max: " + maxString1);

		//Check to expected answer and print result
		String result1 =  (minString1.equals("[0, 5]") && maxString1.equals("[2, 3]")) ? "Correct!": "Wrong!";
		System.out.println(result1);
		
		System.out.println();
		
		//Sample input from lab documentation
		int[] arr2 = {-1,-2,-3};
 		int[] min2 = ArrayUtil.findMinIndex(arr2);
 		int[] max2 = ArrayUtil.findMaxIndex(arr2);


		//Sample output from lab documentation
		String minString2 = Arrays.toString(min2);
		String maxString2 = Arrays.toString(max2);
		System.out.println("Test 2 min: " + minString2);
		System.out.println("Test 2 max: " + maxString2);

		//Check to expected answer and print result
		String result2 =  (minString2.equals("[2]") && maxString2.equals("[0]")) ? "Correct!": "Wrong!";
		System.out.println(result2);

	}
}