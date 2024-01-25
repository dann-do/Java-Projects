public class RelationalUtilTester
{
	public static void main(String[] args)
	{
		boolean result;

		result = RelationalUtil.isIncreasing(1,2,3);
		System.out.println(result);

		result = RelationalUtil.isDecreasing(3,2,1);
		System.out.println(result);

		result = RelationalUtil.isBetween(-1,0,1);
		System.out.println(result);

		result = RelationalUtil.isPositive(1);
		System.out.println(result);

		result = RelationalUtil.isNegative(-1);
		System.out.println(result);

		result = RelationalUtil.overlaps(0,1,-1,2);
		System.out.println(result);

		result = RelationalUtil.overlaps(0,1,2,3);
		System.out.println(result);
	}
}