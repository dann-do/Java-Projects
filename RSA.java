//Submitted by Dan Do 
//Problem 6: RSA

public class RSA
{
	// Declaring instance variables
	private BigInteger n;
	private BigInteger e;
	private BigInteger d;
	
	// Constructor 1
	public RSA(String p, String q)
	{
		// Converts p and q into Big Integers and sets the following attributes:
		// n = p * q
		// e = generate E (p, q) 
		// d = generate D (e, totient)
		
		BigInteger s1 = new BigInteger(p);
		BigInteger s2 = new BigInteger(q);
		n = p * q;
		e = generateE(p,q);
		d = generateD(e, totient);
	
	} //end constructor 1
	
	// Constructor 2
	public RSA(String p, String q, String e)
	{
		// Converts p,q,e into Big Integers and sets the following attributes:
		// n = p * q
		// d = generate D (e, totient)
		
		BigInteger s1 = new BigInteger(p);
		BigInteger s2 = new BigInteger(q);
		BigInteger s3 = new BigInteger(e);

		n = p * q;
		d = generateD(e, totient);
		
	} //end constructor 2
	
	public BigInteger totient(BigInteger p, BigInteger q)
	{ 
		// Returns the totient which is calculated as: (p-1) * (q - 1), The totient represents
		// the approximate number of primes that occur before the composite n = p * q
		
		
		
		
	} //end totient() method
	
	
	
	
	
	
	
	

	
} //end class