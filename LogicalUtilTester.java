public class LogicalUtilTester
{
	public static void main(String[] args)
	{
		boolean result;

		result = LogicalUtil.thereExists(false, false, true);
		System.out.println(result);

		result = LogicalUtil.forAll(true, true, true);
		System.out.println(result);

		result = LogicalUtil.majority(true, true, false);
		System.out.println(result);

		result = LogicalUtil.minority(false, false, false);
		System.out.println(result);

		result = LogicalUtil.implies(true, false);
		System.out.println(result);

		result = LogicalUtil.implies(true, true, false);
		System.out.println(result);
	}
}