/**
Name: Dan Do
Question: Question #1
**/

public class DateFormatConverter {
	// Instance variables
	private static String[] monthName = {"January", "February", "March" , "April", "May", "June", "July", "August",
								"September", "October", "November", "December" };
	
	// Returns a String in the format month day, year (April 25, 1955) from the
	// passed in date String in the format month/day/year (04/25/1955)
	public static String numbersToWords(String date) {
		String[] arrOfDate = date.split("/");  // => ["04", "25, "1995"]
		
		// Parsing string to int 
		int month = Integer.parseInt(arrOfDate[0]);
		int day = Integer.parseInt(arrOfDate[1]);
		int year = Integer.parseInt(arrOfDate[2]);
		
		// Convert month int to String
		String monthStr = monthName[month - 1];	//monthName[4-1] = monthName[3] = "April"
		
		// Format date
		String returnDate = monthStr + String.format(" %d, ",day) + year;
		
		return returnDate;
		
	} //end numbersToWords()
	
	// Returns a String in the format month/day/year (04/25/1955) from the passed
	// in date String in the format month day, year (April 25, 1955)
	public static String wordsToNumbers(String date) {
		String[] arrOfDate = date.split("[ ,]");  // => ["April", "25, "1995"]
		
		// Parsing string to int
		String month = arrOfDate[0];
		int day = Integer.parseInt(arrOfDate[1]);
		int year = Integer.parseInt(arrOfDate[3]);
		
		// Convert month int to String
		int monthIndex = -1;
		for (int i = 0; i < monthName.length; i++) {
		    if (monthName[i].equals(month)) {
				monthIndex = i + 1;
		    }
		}
		
		// Format date
		String returnDate = String.format("%02d/", monthIndex) + String.format("%02d/", day) + year;
		
		return returnDate;
		
	} //end wordsToNumbers()
	
} //end class