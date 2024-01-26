//Submitted by Dan Do 
//Problem 5: Date Util

// Java String class contains format methods that allows formatted Strings similar to printf

public class DateUtil
{
	public static String format(int month, int day, int year)
	{
		/*static String: 
			format(int month, int day, int year)
			Returns String of date, formatted as mm/dd/yyyy */
			
		return String.format("%02d/%02d/%d", month, day, year);
		
	} //end String format() method
	
	
	public static String format(String date, int year)
	{
		/*static String: 
			format(String date, int year)
			Returns String of date */
			
		return (date + ", " + year);
		
	} //end String format() method
	
	
	public static String format(String month, int day, int year)
	{
		/*static String: 
			format(String month, int day, int year)
			Returns String of date, formatted as month dd yyyy */
			
		return (month + String.format(" %02d, ", day) + year);
		
	} //end String format() method
	
	
	public static String format(String month, String day, String year)
	{
		/*static String: 
			format(String month, String day, String year)
			Returns String of date, formatted as month day year */
			
		return (month + " " + day + ", " + year);
		
	} //end String format() method
	
} //end class