public class StringUtilTester
{
	public static void main(String[] args)
	{
		String result;

		result = StringUtil.toString(1.0);
		System.out.println(result);

		result = StringUtil.toString(1.0f);
		System.out.println(result);

		result = StringUtil.toString(1);
		System.out.println(result);

		result = StringUtil.toString(1L);
		System.out.println(result);

		result = StringUtil.toString('1');
		System.out.println(result);

		result = StringUtil.toString(true);
		System.out.println(result);
	}

}