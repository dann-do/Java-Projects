//Submitted by Dan Do 
//Problem 3: DNA

public class DNA
{
	// Declaring instance variable
	private char[] sequence;		//this.sequence
	
	// Constructor: Creates a new DNA object with the supplied sequence array.
	public DNA(char[] sequence)
	{
		this.sequence = sequence;
		
	} //end constructor
	
	public char[] getSequence()
	{
		// Returns this DNA object's sequence
		return this.sequence;
		
	} //end getSequence() method
	
	public DNA swap(DNA other, int swapPoint)
	{
		// Returns a new DNA object with this DNA object’s sequence before the swap point 
		// and the other DNA object’s sequence from the swap point onward.
		
		// Our swap will take this DNA object and the other DNA object and create a new
		// DNA object with part of the sequence from this (the indexes up until the swap
		// point) and part of the sequence from the other (the indexes at and following
		// from the swap point). We are assuming both DNA object’s sequences are of the
		// same length.
		
		
		/* d1 = {d1[0], d1[1], d1[2], d1[3]} = {‘a’, ‘t’, ‘c’, ‘g’}
		   d2 = {d2[0], d2[1], d2[2], d2[3]} = {‘t’, ‘c’, ‘a’, ‘a’}
		   swapPoint = 2  --> Output = {d1[0], d1[1], d2[2], d2[3]} = {‘a’, ‘t’, ‘a’, ‘a’}     */
		
		//static String valueOf(char[] data, int offset, int count)
		
		String thisSeq = String.valueOf(this.sequence, 0, swapPoint);							
		String otherSeq = String.valueOf(other.sequence, swapPoint, other.sequence.length - swapPoint);		
		
		String newSeq = thisSeq + otherSeq;
		
		return new DNA(newSeq.toCharArray());
		
	} //end swap() method
	
	public boolean equals(DNA other)
	{
		// Returns true if this and the other DNA object’s sequences match.
		if (String.valueOf(this.sequence).equals(String.valueOf(other.sequence)))
		{
			// Returns true if this and the other DNA object’s sequences match.
			return true;
			
		} //end equals() method
		
		return false;
		
	} //end equals() method
	
	public String toString()
	{
		// Returns the sequence as a line of characters.
		
		return String.valueOf(this.sequence);
		
	} //end toString();
	
} //end class