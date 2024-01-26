//Submitted by Dan Do 
//Problem 1: Fraction

public class Fraction
{
	//Declaring instance variable
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		/* numerator = 1, denominator = 2 or numerator = -1, denominator = -2
		   numerator = -1, denominator = 2 or numerator = 1, denominator = -2  */
		
		this.numerator = Math.abs(numerator);
		int sign = (numerator * denominator >= 0) ? 1 : -1 ;  //first checking the sign of each variable
		this.numerator *= sign; //now carrying the sign to numerator
		
		this.denominator = Math.abs(denominator);
		
	} //end Fraction() constructor
	
	
	public int getDominator()
	{
		//Returns the denominator
		return this.denominator;
		
	} //end getNumerator() method
	
	
	public int getNumerator()
	{
		// Returns the numerator
		return this.numerator;
		
	} //end getDominator() method
	
	
	public Fraction simplify(int numerator, int denominator)
	{
		// Returns a fraction of simplified form using the given integer arguments
		
		/* Simplifying fraction
				20/4 = 5/1
		*/
		
		for (int i = denominator; i > 0; i--)
		{
			if ((numerator % i == 0) && (denominator % i == 0))
			{
				numerator = numerator / i;
				denominator = denominator / i;
			}
		}
		
		return new Fraction(numerator, denominator); //returning the simplified version of fraction as an object
		
	} //end simplify() method
	
	
	public Fraction add(Fraction other)
	{
		//Returns new fraction object based on this fraction added to other fraction
		
		/* Adding 2 fractions
			numerator = numerator1 * denominator2 + numerator2 * denominator1
			denominator = denominator1 * denominator2
			Ex: 1/2 + 3/4 = (1*4) + (3*2) / (2*4) = 10/8
		*/
		
		int numerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
		int denominator = this.denominator * other.denominator;
		
		return simplify(numerator, denominator);
		
	} //end add() method
	
	
	public Fraction subtract(Fraction other)
	{
		//Returns new fraction object based on this fraction subtracted from other fraction
		
		/* Subtract 2 fractions
			numerator = numerator1 * denominator2 - numerator2 * denominator1
			denominator = denominator1 * denominator2
			Ex: 1/2 - 3/4 = (1*4) - (3*2) / (2*4) = -2/8 = -1/4
		*/
		
		int numerator = (this.numerator * other.denominator) - (other.numerator * this.denominator);
		int denominator = this.denominator * other.denominator;
		
		return simplify(numerator, denominator);
		
	} //end subtract() method
	
	
	public Fraction multiply(Fraction other)
	{
		//Returns new fraction object based on this fraction multiplied by other fraction
		
		/* Multiply 2 fractions
			numerator = numerator1 * numerator2
			denominator = denominator1 * denominator2
			Ex: 1/2 * 3/4 = (1*3) / (2*4) = 3/4
		*/
		
		int numerator = this.numerator * other.numerator;
		int denominator = this.denominator * other.denominator;
		
		return simplify(numerator, denominator);
		
	} //end multiply() method
	
	
	public Fraction divide(Fraction other)
	{
		//Returns new fraction object based on this fraction divided by other fraction
		
		/* Divide 2 fractions
			numerator = numerator1 * denominator2
			denominator = denominator1 * numerator2
			Ex: (1/2) / (3/4) = (1*3) / (2*4) = 3/4
		*/
		
		int numerator = this.numerator * other.denominator;
		int denominator = this.denominator * other.numerator;
		
		return simplify(numerator, denominator);
		
	} //end divide() method
	
	
	public String toString()
	{
		//Returns a text representation of fraction in form of: "(numerator/denominator)"
		
		return String.format("(%d/%d)", this.numerator, this.denominator);
		
	} //end toString() method
	
	
} //end class 