//Submitted by Dan Do 
//Problem 2: Radix Util

//Java Integer class contains toString and parseInt methods that uses: number and radix

public class RadixUtil
{
	public static int base2(String binary)
	{
		/*static int: 
			base2(String binary)
			Returns decimal integer value given a String with a binary representation */
			
		return (Integer.parseInt(binary, 2));
		
	} //end int base2() method
	
	
	public static String base2(int decimal)
	{
		/*static String: 
			base2(int decimal)
			Returns a String with binary representation given a decimal integer value */
			
		return (Integer.toString(decimal, 2));
		
	} //end String base2() method
	
	
	public static int base8(String octal)
	{
		/*static int: 
			base8(String octal)
			Returns decimal integer value given a String with a octal representation */
			
		return (Integer.parseInt(octal, 8));
		
	} //end int base8() method
	
	
	public static String base8(int decimal)
	{
		/*static String: 
			base8(int decimal)
			Returns a String with octal representation given a decimal integer value */
			
		return (Integer.toString(decimal, 8));
		
	} //end String base8() method
	
	
	public static int base16(String hexadecimal)
	{
		/*static int: 
			base16(String hexadecimal)
			Returns decimal integer value given a String with a hexadecimal representation */
			
		return (Integer.parseInt(hexadecimal, 16));
		
	} //end int base16() method
	
	
	public static String base16(int decimal)
	{
		/*static String: 
			base16(int decimal)
			Returns a String with hexadecimal representation given a decimal integer value */
			
		return (Integer.toString(decimal, 16));
		
	} //end String base16() method
	
	
} //end class