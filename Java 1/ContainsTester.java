import java.util.Arrays;

public class ContainsTester
{
	public static void main(String[] args)
	{
		//Sample input from lab documentation
		String[] arr1 = {"a","b","c"};
		boolean hasB = ArrayUtil.contains("b", arr1);
		boolean hasD = ArrayUtil.contains("d", arr1);

		//Sample output from lab documentation
		System.out.println(hasB);
		System.out.println(hasD);

		//Check to expected answer and print result
		String result1 =  (hasB && !hasD) ? "Correct!": "Wrong!";
		System.out.println(result1);
		
		System.out.println();
		
		//Sample input from lab documentation
		String[] arr2 = {};
		boolean hasA = ArrayUtil.contains("0", arr2);
		boolean hasC = ArrayUtil.contains(null, arr2);

		//Sample output from lab documentation
		System.out.println(hasA);
		System.out.println(hasC);

		//Check to expected answer and print result
		String result2 =  (hasA && !hasC) ? "Correct!": "Wrong!";
		System.out.println(result2);

	}
}