/** class Recursion - practice recursive methods
    @author Dan Do
*/
import java.util.*;

public class Recursion {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hola";
		String s3 = "hello";
		System.out.println(compare(s1, s2));
		System.out.println(compare(s2, s1));
		System.out.println(compare(s1, s3));
		System.out.println(compare(s3, s1));
		
		String s4 = "abc";
		String s5 = "acb";
		ArrayList<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s4);
		list.add(s5);
		System.out.println(findMinimum(list));
	}
	
	/** Compare two Strings using alphabetical order as the natural order.
	  @param  s1  	The first string  
	  @param  s2  	The second string
      @return 		Returns an integer
    */
	public static int compare(final String s1, final String s2) {
		
		// Base case: If any String is empty
		if (s1.equals("") || s2.equals("")) {
			// if both Strings are empty, return 0
			if (s1.equals("") && s2.equals("")) {
				return 0;
			}
			
			// if only String s1 is empty, then s1 comes before s2 -> returns negative int
			else if (s1.equals("") && !(s2.equals(""))) {
				return -1;
			}
			
			// if only String s2 is empty, then s2 comes before s1 -> returns positive int
			else {
				return 1;
			}
		} 
		// General case: If Strings are not empty
		else {
			// if first char of s1 comes before char of s2 -> returns negative int
			if (s1.charAt(0) < s2.charAt(0)) {
				return -1;
			}
			// if first char of s1 comes after char of s2 -> returns positive int
			else if (s1.charAt(0) > s2.charAt(0)) {
				return 1;
			}
			// if first char of s1 same as char of s2
			else {
				return compare(s1.substring(1), s2.substring(1));
			}
		}	
	} //end compare() method
	
	/** Private, helper method that is recursive
	  @param  stringArray  	The array list of Strings
	  @param  min			The current minimum String
      @return 			 	Returns the recursive call to find the minimum String 
    */
	private static String findMinimumHelper(final ArrayList<String> stringArray, String min) {
		// Base case: If there's only 1 thing in the ArrayList, then it's the minimum
		if (stringArray.size() == 1) {
			// Set min as that 1 element and return it
			min = stringArray.get(0);
			return min;
		}
		// General case: If there's multiple Strings in the List, compare each String until it reaches the end of the list
		else {
			// Assume first String in the List is the minimum
			min = stringArray.get(0);
			
			// Compare the first String to the next String
			int compareResult = compare(min, stringArray.get(1));
			
			// If the compareResult is a positive number, then second String comes first/is the new minimum
			if (compareResult > 0) {
				min = stringArray.get(1);	// update the min to be the second String
				return min;
			}
			
			// Recursive call: starting from the current min String to the rest of the list of Strings
			stringArray.remove(0);	// remove the first element in the list because we already compared it
			return findMinimumHelper(stringArray, min);
		}
	}
	
	/** Find the minimum String in an array of Strings.
	  @param  stringArray  	The array list of Strings 
      @return 			 	Returns the minimum String in the list 
    */
	public static String findMinimum(final ArrayList<String> stringArray) {
		String minimum = findMinimumHelper(stringArray, stringArray.get(0));
		return minimum;
	}
	
} // end class Recursion