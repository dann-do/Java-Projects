public class DatatypeUtilTester
{
	public static void main(String[] args)
	{
		String result = "";
		
		result = DatatypeUtil.getType(1.0);
		System.out.println(result);

		result = DatatypeUtil.getType(1.0f);
		System.out.println(result);

		result = DatatypeUtil.getType(1);
		System.out.println(result);

		result = DatatypeUtil.getType(1L);
		System.out.println(result);

		result = DatatypeUtil.getType('1');
		System.out.println(result);

		result = DatatypeUtil.getType(true);
		System.out.println(result);

		result = DatatypeUtil.getType("Hello");
		System.out.println(result);
	}

}