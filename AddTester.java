import java.util.Arrays;

public class AddTester
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr1 = {"a","b","c"};
		arr1 = ArrayUtil.add("d", arr1);

		//Sample output from lab documentation
		String arrString1 = Arrays.toString(arr1);
		System.out.println("Test 1: " + arrString1);

		//Check to expected answer and print result
		String result1 =  arrString1.equals("[a, b, c, d, null, null]") ? "Correct!": "Wrong!";
		System.out.println(result1);
		
		System.out.println();
		
		//Sample input from lab documentation
		String[] arr2 = {"a","b",null};
		arr2 = ArrayUtil.add("d", arr2);

		//Sample output from lab documentation
		String arrString2 = Arrays.toString(arr2);
		System.out.println("Test 2: " + arrString2);

		//Check to expected answer and print result
		String result2 =  arrString2.equals("[a, b, d]") ? "Correct!": "Wrong!";
		System.out.println(result2);

	}
}