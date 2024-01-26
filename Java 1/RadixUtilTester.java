public class RadixUtilTester
{

	public static void main(String[] args)
	{
		int resultInt;
		String resultText;

		resultInt = RadixUtil.base2("111");
		System.out.println(resultInt);
		resultText = RadixUtil.base2(7);
		System.out.println(resultText);

		resultInt = RadixUtil.base8("10");
		System.out.println(resultInt);
		resultText = RadixUtil.base8(8);
		System.out.println(resultText);

		resultInt = RadixUtil.base16("f");
		System.out.println(resultInt);
		resultText = RadixUtil.base16(15);
		System.out.println(resultText);


	}

}