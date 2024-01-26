public class DateUtilTester
{
	public static void main(String[] args)
	{
		String result;

		result = DateUtil.format(1,1,2000);
		System.out.println(result);

		result = DateUtil.format("Sept 30", 1999);
		System.out.println(result);

		result = DateUtil.format("October", 31, 2018);
		System.out.println(result);

		result = DateUtil.format("Oct", "31st", "twenty-18");
		System.out.println(result);
	}
}