import org.junit.*; 	// Makes JUnit (annotations etc.) work
import static org.junit.Assert.*; 	// Makes asserts work. Note, Assert methods are static

public class TestOperations {
	// Instance variables
	private int result;
	private int maxValue = Integer.MAX_VALUE;	//  2,147,483,647
	private int minValue = Integer.MIN_VALUE;	// -2,147,483,648
	
	@Before		// Annotation @Before means the method will be run before every unit test
	public void setUp() {		// Initialize the instance variable for the common objects
		result = 0;
	}
	
	@Test	// Annotation @Test labels a method as a tester method (unit test)
	public void testAdd() {
		System.out.println("Result testAdd: " + result);
		
		result = Operations.add(5, 3);	//Calling add() method from Operation class with arguments 5 and 3, and store it in result
		
		assertTrue(result == 8);	//Use assertion assertTrue() to test that result is equal 8. If so, then the add() method works fine 
		
		result = Operations.add(maxValue, 1); //Testing edge case with arguments Integer.MAX_VALUE and Integer.MAX_VALUE using Operation.add() method

		assertEquals(result, minValue); //Assertion assertEquals() takes two arguments and tests them for equality
		
		assertFalse((Operations.add(maxValue, 1)) > 0);	//Assertion assertFalse() tests a logical expression to see if it is false
		
		System.out.println("Result testAdd: " + result);
		
		// All the assertions inside a tester method must be valid for the test to pass.
		
	} //end testAdd() tester method
	
	
	// #TODO : Tester method for subtract()
	// Name it testSubtract()
	@Test
	public void testSubtract() {
		
		// First line should be System.out.println("Result testSubtract: " + result);
		System.out.println("Result testSubtract: " + result);
		
		//Do 5 minus 3 using the subtract() method and store the result in variable result
		result = Operations.subtract(5, 3);
		
		//Assert that it is true that result equals 2
		assertTrue(result == 2);
	
		//Do minValue minus 1 using the subtract() method and store the result in variable result
		result = Operations.subtract(minValue, 1);
	
		//Using this value (that is stored in result), write an assertEquals() statement
		//that will cause the test to pass (ie, a valid assertEquals statement)
		assertEquals(result, maxValue);
	
		//IN ONE LINE subtract 1 from minValue using the subtract method and assert 
		//that it is false that this value is less than 0
		assertFalse((Operations.subtract(minValue, 1) < 0 ));
		
		//Last line should be System.out.println("Result testSubtract: " + result);
		System.out.println("Result testSubtract: " + result);
		
	} //end testSubtract() tester method
	
	
	// #TODO : Tester method for multiply()
	// Name it testMultiply()
	@Test
	public void testMultiply() {
		
		//First line should be System.out.println("Result testMultiply: " + result);
		System.out.println("Result testMultiply: " + result);
		
		//Do 5 times 3 using the multiply() method and store the result in variable result
		result = Operations.multiply(5, 3);
		
		//Assert that it is true that result equals 15
		assertTrue(result == 15);
	
		//Do 1073741824 times 2 using the multiply() method and store the result in variable result
		result = Operations.multiply(1073741824, 2);
		
		//Using this value (that is stored in result), write an assertEquals() statement
		//that will cause the test to pass (ie, a valid assertEquals statement)
		assertEquals(result, -2147483648L);
	
		//IN ONE LINE multiply 1073741824 by 2 using the multiply method and assert 
		//that it is false that this value is greater than 0
		assertFalse((Operations.multiply(1073741824, 2) > 0));
	
		//Last line should be System.out.println("Result testMultiply: " + result);
		System.out.println("Result testMultiply: " + result);
	
	} //end testMultiply() tester method
	
	
	@Test
	public void testDivide(){
		
		result = Operations.divide(5, 3);
		
		assertTrue(result == 1);
		
		String errorMessage = "";
		
		try {
			Operations.divide(3, 0);
		} catch (ArithmeticException e) {
			errorMessage = e.getMessage();
		}
		
		System.out.println(errorMessage);
		assertTrue(errorMessage.equals("Divide by 0!"));
		
	} //end testDivide() tester method

} // end class
