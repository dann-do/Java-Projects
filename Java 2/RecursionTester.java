/** class RecursionTester - testing the Recursion class  
    @author Dan Do
	@see Recursion
*/

//JUnit 5 imports
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class RecursionTester {
	
	/** Testing compare() method */
	@Test 
	public void testCompare() {
		assertEquals(0, Recursion.compare("", ""));
		assertEquals(-1, Recursion.compare("", "hola"));
		assertEquals(1, Recursion.compare("hello", ""));
		assertEquals(0, Recursion.compare("hello", "hello"));
		assertEquals(-1, Recursion.compare("abc", "acb"));
		assertEquals(1, Recursion.compare("acb", "abc"));
	}
	
	/** Testing findMinimum() method */
	@Test 
	public void testFindMinimum() {
		String[] array1 = {"recursion is hard", "abc", "acb"};
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array1));
		assertEquals("abc", Recursion.findMinimum(list1));
		
		String[] array2 = {"hello", "hola", "xin chao", "bonjour"};
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(array2));
        assertEquals("bonjour", Recursion.findMinimum(list2));
	}
}	
